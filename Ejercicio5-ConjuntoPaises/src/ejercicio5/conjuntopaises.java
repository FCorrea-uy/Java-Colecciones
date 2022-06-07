/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario. */
package ejercicio5;

import Servicios.ServiciosPais;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class conjuntopaises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPais servP = new ServiciosPais();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        
        do {
            servP.crearYAgregarPais();
            System.out.println("¿Desea ingresar otro pais? (Si/No)");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("si"));
        servP.ordenarPaises();
        System.out.println("------------------");
        servP.eliminarPais();
        System.out.println("------------------");
        servP.ordenarPaises();
    }
    
}
