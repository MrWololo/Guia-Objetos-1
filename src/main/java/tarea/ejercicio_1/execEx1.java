package tarea.ejercicio_1;

import java.util.Scanner;

public class execEx1 {

    public static Scanner scan = new Scanner(System.in);

    public static Rectangulo a() {
        double ancho;
        double alto;

        System.out.println("Ingrese ancho y alto del rectangulo");

        System.out.print("Ancho: ");
        ancho = scan.nextDouble();

        System.out.print("\nAlto: ");
        alto = scan.nextDouble();

        return new Rectangulo(ancho, alto);
    }

    public static void b(Rectangulo r) {
        System.out.println(r.toString());
    }

    public static void c(Rectangulo r) {
        System.out.println("Area: " + r.calcArea(r.getAncho(), r.getAlto()) + " Perimetro: "
                + r.calcPerim(r.getAncho(), r.getAlto()));
    }

    public static Rectangulo d(Rectangulo r) {

        System.out.println("Valores del rectangulo: " + r.toString());

        System.out.print("Ingrese los nuevos valores\nAncho: ");
        r.setAncho(scan.nextDouble());

        System.out.print("\nAlto: ");
        r.setAlto(scan.nextDouble());

        return r;
    }

    public static void e(Rectangulo r) {

        System.out.println(r.toString());
    }

    public static void f() {
        System.out.println("Rectangulo Default: " + new Rectangulo().toString());
    }

}