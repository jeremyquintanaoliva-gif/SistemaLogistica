import java.util.Objects;

public class Paquete {
    private String codigo;
    private double peso;
    private String destino;

    public Paquete(String codigo, double peso, String destino) {
        this.codigo = codigo;
        this.peso = peso;
        this.destino = destino;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Double.compare(peso, paquete.peso) == 0 && Objects.equals(codigo, paquete.codigo) && Objects.equals(destino, paquete.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, peso, destino);
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "codigo='" + codigo + '\'' +
                ", peso=" + peso +
                ", destino='" + destino + '\'' +
                '}';
    }
}
