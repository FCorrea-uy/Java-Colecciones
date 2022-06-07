/*• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class ServiciosPelicula {

    private ArrayList<Pelicula> listaPeliculas; // Creo la lista
    private Scanner leer; // Creo el Scanner para utilizar en toda mi clase

    //Esta es una muy buena practica
    public ServiciosPelicula() {
        this.listaPeliculas = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void crearYAgregarPelicula(){
        System.out.println("Ingrese el titulo de la pelicula: ");
        String titulo = leer.next();
        System.out.println("Ingrese el nombre del director: ");
        String director = leer.next();
        System.out.println("Ingrese la duracion de la pelicula en horas: ");
        Float duracion = leer.nextFloat();
        listaPeliculas.add(new Pelicula(titulo, director, duracion));
    }
    
    public void mostrarDurMayorA1Hora(){
        System.out.println("Las peliculas con duracion mayor a una hora son: ");
        for (Pelicula aux : listaPeliculas){
            if(aux.getDuracion()>1){
                System.out.println(aux.toString());
            }
        }
    }
    
    public void ordenarPorDuracionDesc(){
        Collections.sort(listaPeliculas, Comparators.ordenDurMayorAMenor);
        System.out.println("La lista ordenada por duracion de mayor a menor es: ");
        for (Pelicula aux : listaPeliculas){
           System.out.println(aux.toString());
       }
    }
    
    public void ordenarPorDuracionAsc(){
        Collections.sort(listaPeliculas, Comparators.ordenDurMenorAMayor);
        System.out.println("La lista ordenada por duracion de menor a mayor es: ");
        for (Pelicula aux : listaPeliculas){
           System.out.println(aux.toString());
       }
    }
    
    public void ordenarPorTitulo(){
        Collections.sort(listaPeliculas, Comparators.ordenTitulo);
        System.out.println("La lista ordenada por titulo es: ");
        for (Pelicula aux : listaPeliculas){
           System.out.println(aux.toString());
       }
    }
    
    public void ordenarPorDirector(){
        Collections.sort(listaPeliculas, Comparators.ordenDirector);
        System.out.println("La lista ordenada por director es: ");
        for (Pelicula aux : listaPeliculas){
           System.out.println(aux.toString());
       }
    }
}
