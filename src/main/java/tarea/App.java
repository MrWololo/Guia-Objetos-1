package tarea;

import java.util.Scanner;

import tarea.ejercicio_1.Rectangulo;
import tarea.ejercicio_1.execEx1;
import tarea.ejercicio_2.Empleado;
import tarea.ejercicio_2.execEx2;

/**
 * Hello world!
 */
public final class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        char repeat = 's';

        Rectangulo r = new Rectangulo();

        Empleado c = new Empleado();
        Empleado a = new Empleado();

        while (repeat == 's') {
            VisualMenu.principal();
            final int ejercicio = scan.nextInt();
            final int punto;
            switch (ejercicio) {
                case 1:
                    VisualMenu.ej1();
                    punto = scan.nextInt();
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
                    }
                    break;

                case 2:
                    VisualMenu.ej2();
                    punto = scan.nextInt();
                    switch (punto) {
                        case 1:
                            c = execEx2.a();
                            break;
                        case 2:
                            a = execEx2.b();
                            break;
                        case 3:
                            execEx2.c(c, a);
                            break;
                        case 4:
                            execEx2.d(c);
                            break;
                    }
            }
        }

    }
}