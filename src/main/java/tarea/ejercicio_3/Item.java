package tarea.ejercicio_3;

/**
 * Item
 */
public class Item {

    String identificador;
    String descripcion;
    int cantidad;
    double precioU;

    public Item() {
    }

    public Item(String identificador, String descripcion, int cantidad, double precioU) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioU = precioU;
    }

    public String getIdentificador() {
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