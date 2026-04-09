import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

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

    public void recepcionarPaquete(Paquete p, int fila, int col){};
    public void enviarACamion(int fila, int col){};
    public void mantenimientoSeguridad(double pesoMaximoc){};
}
