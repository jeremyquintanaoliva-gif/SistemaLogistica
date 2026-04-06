import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.spi.CalendarDataProvider;

public class Almacen {

    Paquete[][] muelleF = new Paquete[3][3];
    HashSet<String> paquetesSistema = new HashSet<>();
    ArrayList<Paquete> paquetesEst = new ArrayList<>();
    HashMap<String, Integer> ciudadDes = new HashMap<>();

    public void recepcionarPaquete(Paquete p, int fila, int col){};
    public void enviarACamion(int fila, int col){};
    public void mantenimientoSeguridad(double pesoMaximoc)
}
