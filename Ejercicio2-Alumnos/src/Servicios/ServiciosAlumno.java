/*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.*/
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class ServiciosAlumno {
    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAlumno(){
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next();
        System.out.println("Ingrese la primer nota: ");
        int nota1 = leer.nextInt();
        System.out.println("Ingrese la segunda nota: ");
        int nota2 = leer.nextInt();
        System.out.println("Ingrese la tercer nota: ");
        int nota3 = leer.nextInt();
        
        listaAlumnos.add(new Alumno(nombre, nota1, nota2, nota3));
    }
    
    public void notaFinal(String nombreAlumno){
        double nota1 = -1, nota2 = -1, nota3 = -1; 
        for (int i = 0; i <= listaAlumnos.size(); i++){
            if(listaAlumnos.get(i).getNombre().equalsIgnoreCase(nombreAlumno)){
                nota1 = listaAlumnos.get(i).getNota1();
                nota2 = listaAlumnos.get(i).getNota1();
                nota3 = listaAlumnos.get(i).getNota1();
                break;
            }
        }
        double prom = (nota1 + nota2 + nota3)/3;
        if(prom >= 0) {
            System.out.println("La nota final de " +
                    nombreAlumno.toUpperCase() + " es: " + prom);
        } else {
            System.out.println("El alumno " + 
                    nombreAlumno.toUpperCase() + " no se encuentra en la lista.");
        }
    }
    
}
