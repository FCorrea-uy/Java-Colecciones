/*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.*/
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
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
        
        ArrayList<Double> notas = new ArrayList();
        System.out.println("Ingrese la primer nota: ");
        notas.add(leer.nextDouble());
        System.out.println("Ingrese la segunda nota: ");
        notas.add(leer.nextDouble());
        System.out.println("Ingrese la tercer nota: ");
        notas.add(leer.nextDouble());
        
        listaAlumnos.add(new Alumno(nombre, notas));
    }
    
    public void notaFinal(String nombreAlumno){
        double nota = -1; 
        Iterator<Alumno> it = listaAlumnos.iterator();
        //Se recorre la lista de alumnos  
        while(it.hasNext()){
            Alumno aux = it.next(); //Recorre la lista
            if (aux.getNombre().equalsIgnoreCase(nombreAlumno)){
                Iterator<Double> itNotas = aux.getNotas().iterator(); //Se cra un iterator para las notas
                //Se recorre la lista de notas del alumno pedido
                while (itNotas.hasNext()){
                    nota += itNotas.next(); //Se suman las notas de la lista de notas
                }
            }
        }
        nota++;
        double prom = nota/3;
        if(prom >= 0) {
            System.out.println("La nota final de " +
                    nombreAlumno.toUpperCase() + " es: " + prom);
        } else {
            System.out.println("El alumno " + 
                    nombreAlumno.toUpperCase() + " no se encuentra en la lista.");
        }
    }
    
}
