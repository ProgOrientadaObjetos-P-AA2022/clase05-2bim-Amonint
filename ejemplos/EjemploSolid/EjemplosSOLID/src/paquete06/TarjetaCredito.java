package paquete06;

public class TarjetaCredito {
    
    private String nombre;
    private String codigo;
    private double cupoMax;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getCupoMax() {
        return cupoMax;
    }
    public void setCupoMax(double cupoMax) {
        this.cupoMax = cupoMax;
    }
    @Override
    public String toString(){
        return String.format("Tarjeta de Credito\n"
                + "%s",
                getNombre(),getCodigo(),getCupoMax()
                );
    }
}
