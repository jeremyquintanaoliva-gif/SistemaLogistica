import java.util.*;

public class Almacen {

    private Paquete[][] muelleFisico;
    private HashSet<String> registroSeguridad;
    private ArrayList<Paquete> colaSalida;
    private HashMap<String, Integer> estadisticas;

    public Almacen() {
        this.muelleFisico = new Paquete[3][3];
        this.registroSeguridad = new HashSet<>();
        this.colaSalida = new ArrayList<>();
        this.estadisticas = new HashMap<>();
    }

    public void recepcionarPaquete(Paquete p, int fila, int col) {

        if (registroSeguridad.contains(p.getCodigo())) {

            System.out.println("Error: el código" + p.getCodigo() + "ya existe");
            return;

        }
        //Si no existe y la posicion esta libre, almacena el paquete y registra su codigo
        if (muelleFisico[fila][col] == null) {
            muelleFisico[fila][col] = p;
            registroSeguridad.add(p.getCodigo());
            System.out.println("El paqeute se ha almacenado en la posicion " + fila + "," + col);
        } else {
            System.out.println("Error. La posicion " + fila + "," + col + " ya está ocupada");
        }
    }

    public void enviarACamion(int fila, int col) {
        int contador = 0;
        Paquete p = muelleFisico[fila][col];
        muelleFisico[fila][col] = null;
        colaSalida.add(p);

        //Actualizamos las estadisticas
        contador = estadisticas.getOrDefault(p.getDestino(), 0);
        estadisticas.put(p.getDestino(), contador + 1);
    }

    public void mantenimientoSeguridad(double pesoMaximo) {
        Iterator<Paquete> it = colaSalida.iterator();

        while (it.hasNext()){
            Paquete elemento = it.next();

            if (elemento.getPeso() > pesoMaximo) {
                System.out.println("Eliminando el paquete " +elemento.getCodigo() + " por exceso de peso");
                it.remove();
            }
        }
    }

    public void mostrarInformeFinal() {
        System.out.println("---- INFORME FINAL ----");
        for (Map.Entry<String, Integer> entrada : estadisticas.entrySet()){
            System.out.println("Destino: " + entrada.getKey() + "| Envíos: " + entrada.getValue());
        }
    }
}
