package tarea.ejercicio_5;

/**
 * Reloj
 */
public class Reloj {

    private int _horas;
    private int _minutos;
    private int _segundos;

    public Reloj() {
    }

    public Reloj(int horas, int minutos, int segundos) {
        this._horas = horas;
        this._minutos = minutos;
        this._segundos = segundos;
    }

    public int getHoras() {
        return this._horas;
    }

    public void setHoras(int horas) {
        this._horas = horas;
    }

    public int getMinutos() {
        return this._minutos;
    }

    public void setMinutos(int minutos) {
        this._minutos = minutos;
    }

    public int getSegundos() {
        return this._segundos;
    }

    public void setSegundos(int segundos) {
        this._segundos = segundos;
    }

    public static void secMas(Reloj reloj) {

        if (reloj.getSegundos() == 59) {

            if (reloj.getMinutos() == 59) {

                if (reloj.getHoras() == 23) {

                    reloj.setHoras(0);
                } else {
                    reloj.setHoras(reloj.getHoras() + 1);
                }

                reloj.setMinutos(0);
            } else {
                reloj.setMinutos(reloj.getMinutos() + 1);
            }

            reloj.setSegundos(0);
        } else {
            reloj.setSegundos(reloj.getSegundos() + 1);
        }

    }

    public static void secMenos(Reloj reloj) {

        if (reloj.getSegundos() == 0) {

            if (reloj.getMinutos() == 0) {

                if (reloj.getHoras() == 0) {

                    reloj.setHoras(23);
                } else {
                    reloj.setHoras(reloj.getHoras() - 1);
                }

                reloj.setMinutos(59);
            } else {
                reloj.setMinutos(reloj.getMinutos() - 1);
            }

            reloj.setSegundos(59);
        } else {
            reloj.setSegundos(reloj.getSegundos() - 1);
        }

    }

    @Override
    public String toString() {

        StringBuffer buffer = new StringBuffer();

        class Local {
            void agregarCeros(int valor) {

                if (valor < 10 && valor >= 0) {
                    buffer.append("0");
                }
            }
        }
        Local funcion = new Local();

        funcion.agregarCeros(getHoras());
        buffer.append(getHoras());
        buffer.append(":");

        funcion.agregarCeros(getMinutos());
        buffer.append(getMinutos());
        buffer.append(":");
        
        funcion.agregarCeros(getSegundos());
        buffer.append(getSegundos());

        return buffer.toString();
    }
}