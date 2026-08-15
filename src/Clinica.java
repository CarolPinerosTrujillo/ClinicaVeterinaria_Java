public class Clinica implements Asegurable {
    private String nombre;
    private String direccion;

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 2500000.0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POLIZA NO. 1 ";
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}