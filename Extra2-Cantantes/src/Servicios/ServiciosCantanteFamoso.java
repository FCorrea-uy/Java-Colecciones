/*crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa.*/
package Servicios;

import Entidades.CantanteFamoso;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class ServiciosCantanteFamoso {
    private final Scanner leer;
    
    public ServiciosCantanteFamoso(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public CantanteFamoso crearCantanteFamoso(){
        System.out.println("Ingrese el nombre del cantante: ");
        String nombre = leer.next();
        System.out.println("Ingrese el titulo del disco con mas ventas: ");
        String titulo = leer.next();
        return new CantanteFamoso(nombre, titulo);
    }
    
    public void mostrarMenu(){
        System.out.println("MENU:");
        System.out.println("1-Agregar un cantante");
        System.out.println("2-Mostrar todos los cantantes");
        System.out.println("3-Eliminar un cantante");
        System.out.println("4-Salir");
        System.out.println("Ingrese una opcion");
    }
}
