package tarea.ejercicio_1;

/**
 * Rectangulo
 */
public class Rectangulo {

    private double ancho = 1.0;
    private double alto = 1.0;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcArea(double ancho, double alto) {
        return ancho * alto;
    }

    public double calcPerim(double ancho, double alto) {
        return 2 * (alto + ancho);
    }

    @Override
    public String toString() {
        return " Ancho: " + getAncho() + ", Alto: " + getAlto();
    }

}