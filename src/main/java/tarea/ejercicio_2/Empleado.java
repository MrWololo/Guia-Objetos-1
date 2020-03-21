package tarea.ejercicio_2;

/**
 * Empleado
 */
public class Empleado {

    double dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado() {
    }

    public Empleado(double dni, String nombre, String apellido, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public double getDni() {
        return this.dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado[DNI: " + getDni() + ", Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Salario: "
                + getSalario() + "]";
    }

    public double calcAnual() {
        return 12 * this.salario;
    }

    public void aumentarSalario(double porcentaje) {
        this.salario += ((porcentaje * this.salario) / 100);
    }

}