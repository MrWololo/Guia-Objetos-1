package tarea.ejercicio_3;

/**
 * execEx3
 */
public class execEx3 {

    public static Item a() {
        System.out.println("Inicializando Ejemplo itemVenta ");
        return new Item(6, "Hellmann's", 12, 40);
    }
    public static void b(Item ejItem) {
        System.out.println(ejItem.toString());
    }
}