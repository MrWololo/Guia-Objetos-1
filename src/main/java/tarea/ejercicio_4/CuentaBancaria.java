package tarea.ejercicio_4;

/**
 * cuentaBancaria
 */
public class CuentaBancaria {

    int identificador;
    String nombre;
    double balance;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int identificador, String nombre, double balance) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getIdentificador() {
        return this.identificador;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getBalance() {
        return this.balance;
    }

    public double credito(double deposito) {

        this.balance += deposito;

        return getBalance();
    }

    public double debito(double sustraccion) {

        if (this.balance < sustraccion) {
            System.out.println("Error: dinero insuficiente");
        } else {
            this.balance -= sustraccion;
        }

        return getBalance();
    }

    @Override
    public String toString() {
        return " identificador: " + getIdentificador() + ", nombre: " + getNombre() + ", balance: " + getBalance();
    }

}