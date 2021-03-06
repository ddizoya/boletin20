/*
 *Suponer que desde secretaria nos piden un programa para gestionar una lista de alumnos.
 Cada alumno va a ser identificado por un número de registro. Así mismo, cada alumno tiene
 un nombre y una nota. Haz un menú con las siguientes opciones:
 - Dar de alta un alumno.
 - Dar de baja un alumno.
 - Localizar un alumno.
 - Visualizar alumno.
 Debemos tener en cuenta que cada alumno que matriculemos debe llevar el número de registro
 siguiente al último. Este curso comienza con 5500.
 */
package boletin20;

/**
 *
 * @author ddizoya
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colegio cole = new Colegio();
        int op;
        do {
            op = Colegio.menu();
            switch (op) {
                case 1:
                    cole.anhadirAlumno();
                    break;
                case 2:
                    cole.eliminarAlumno();
                    break;
                case 3:
                    cole.buscarAlumno();
                    break;
                case 4:
                    cole.visualizarAlumno();
                    break;
                default:
                    System.exit(0);
            }
        } while (op != 5);
    }
}
