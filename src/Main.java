public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Paquete paquete1 = new Paquete("COD-01", 3, "Madrid");
        Paquete paquete2 = new Paquete("COD-02", 36, "Barcelona");
        Paquete paquete3 = new Paquete("COD-03", 37, "Madrid");

        almacen.recepcionarPaquete(paquete1, 2, 2);
        almacen.recepcionarPaquete(paquete2, 0, 2);
        almacen.recepcionarPaquete(paquete3, 1, 2);

        almacen.enviarACamion(0,2);
        almacen.enviarACamion(1,2);
        almacen.enviarACamion(2,2);
    }
}