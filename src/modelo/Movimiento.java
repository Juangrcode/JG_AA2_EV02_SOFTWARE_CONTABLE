package modelo;

public class Movimiento {
    private static int contador = 1;
    private int id;
    private String tipo;
    private double monto;
    private String descripcion;
    private String fecha;

    public Movimiento(String tipo, double monto, String descripcion, String fecha) {
        this.id = contador++;
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public String getTipo() { return tipo; }
    public double getMonto() { return monto; }
    public String getDescripcion() { return descripcion; }
    public String getFecha() { return fecha; }

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setMonto(double monto) { this.monto = monto; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setFecha(String fecha) { this.fecha = fecha; }
}
