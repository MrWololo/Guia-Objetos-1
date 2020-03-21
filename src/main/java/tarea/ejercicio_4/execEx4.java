package tarea.ejercicio_4;

/**
 * execEx4
 */
public class execEx4 {

    public static CuentaBancaria a() {
        return new CuentaBancaria(1, "Mauricio", 15000);
    }

    public static CuentaBancaria b(CuentaBancaria cuenta, double deposito) {
        System.out.println("Depositando " + deposito);

        System.out.println("Su balance es de: " + cuenta.credito(deposito));
        return cuenta;
    }

    public static CuentaBancaria cYd(CuentaBancaria cuenta, double debito) {

        System.out.println("Debitando " + debito);

        System.out.println("Su balance es de: " + cuenta.debito(debito));

        return cuenta;
    }

    public static String e(CuentaBancaria cuenta) {
        return cuenta.toString();
    }
}