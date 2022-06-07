/*En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.*/
package ejercicio2;

import Entidades.Alumno;
import Servicios.ServiciosAlumno;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class MainAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosAlumno servA = new ServiciosAlumno();
        String respuesta;
        do {
            servA.crearAlumno();
            System.out.println("¿Desea ingresar otro alumno? (Si/No)");
            respuesta = leer.next();
        } while(respuesta.equalsIgnoreCase("si"));
        System.out.println("Ingrese el nombre de un alumno para calcular su nota final: ");
        String nombreAlumno = leer.next();
        servA.notaFinal(nombreAlumno);
        
    }
    
}
