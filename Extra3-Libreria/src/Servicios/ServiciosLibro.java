/*• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
El método se incrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que
se realice un préstamo del libro. No se podrán prestar libros de los que no queden
ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no
tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y
false en caso contrario.*/
package Servicios;


import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class ServiciosLibro {
    HashSet<Libro> biblioteca;
    private final Scanner leer;
    
    public ServiciosLibro(){
        this.biblioteca = new HashSet();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearLibro(){
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        String autor = leer.next();
        System.out.println("Ingrese el numero de ejemplares: ");
        int totalEjemplares = leer.nextInt();
        System.out.println("Ingrese el numero de ejemplares prestados: ");
        int prestados = leer.nextInt();
        
        biblioteca.add(new Libro(titulo, autor, totalEjemplares, prestados));
    }
    
    public void prestamo(){
        System.out.println("Ingrese el titulo del libro que desea prestar: ");
        String libro = leer.next();
    }
}
