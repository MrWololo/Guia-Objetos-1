package tarea;

import java.util.Scanner;

import tarea.ejercicio_1.Rectangulo;
import tarea.ejercicio_1.VisualMenu;
import tarea.ejercicio_1.execEx1;

/**
 * Hello world!
 */
public final class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        char repeat = 's';

        Rectangulo r = new Rectangulo();

        while (repeat == 's') {
            VisualMenu.principal();
        final int ejercicio = scan.nextInt();
        switch (ejercicio) {
            case 1:
                VisualMenu.ej1();
                final int punto = scan.nextInt();
                switch (punto) {
                    case 1:
                        r = execEx1.a();
                        break;
                    case 2:
                        execEx1.b(r);
                        break;
                    case 3:
                        execEx1.c(r);
                        break;
                    case 4:
                        execEx1.d(r);
                        break;
                    case 5:
                        execEx1.e(r);
                        break;
                    case 6:
                        execEx1.f();
                        break;
                    default:
                        System.out.println("\n\nNo pienso programar esto\n\n");
                        break;
                }
                break;

            default:
                break;
        }
        }
        
    }
}

