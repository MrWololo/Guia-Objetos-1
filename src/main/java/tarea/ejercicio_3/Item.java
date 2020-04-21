package tarea.ejercicio_3;

public class Item {

    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioU;
    
    public Item() {
    }
    
    public Item(int identificador, String descripcion, int cantidad, double precioU) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioU = precioU;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getPrecioU() {
        return this.precioU;
    }

    public double getPrecioTotal() {
        return this.precioU * this.cantidad;
    }

    @Override
    public String toString() {
        return "ItemVenta [identificador: " + getIdentificador() + ", descripcion: " + getDescripcion() + ", cantidad: "
                + getCantidad() + ", precio unitario: " + getPrecioU() + ", precio total: " + getPrecioTotal() + "]";
    }

}