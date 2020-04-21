package tarea.ejercicio_2;

import java.util.Scanner;

public class execEx2 {

    public static Scanner scan = new Scanner(System.in);

    public static Empleado a() {
        System.out.println("Carlos inicializado ");
        return new Empleado(23456345, "Carlos", "Gutierrez", 25000);
    }

    public static Empleado b() {
        System.out.println("Ana inicializada ");
        return new Empleado(34234123, "Ana", "Sanchez", 27500);
    }

    public static void c(Empleado a, Empleado b) {
        System.out.println(a.toString() + "\n" + b.toString());
    }

    public static void d(Empleado e) {
        e.aumentarSalario(15);
        System.out.println("Carlos gana "+e.calcAnual()+" anualmente");
    }

}