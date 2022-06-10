/*Deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
se le informará al usuario.*/
package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author fatic
 */
public class ServiciosPais {
    private final TreeSet<Pais> conjuntoPaises;
    private final Scanner leer;
    
    public ServiciosPais() {
        this.conjuntoPaises = new TreeSet(); // Creo el espacio en memoria del conjunto
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
    }
    
    public void crearYAgregarPais(){
        System.out.println("Ingrese un pais: ");
        String nombre = leer.next();
        
        conjuntoPaises.add(new Pais(nombre));
    }
    
    public void ordenarPaises(){
        for (Pais aux : conjuntoPaises) {
            System.out.println(aux);
        }
    }
    
    public void eliminarPais(){
        int contador = 0;
        System.out.println("Ingrese el nombre del pais que desea eliminar: ");
        String nombre = leer.next();
        Iterator<Pais> it = conjuntoPaises.iterator();
        while(it.hasNext()){
            Pais aux = it.next();
            contador++;
            if(aux.getNombrePais().equalsIgnoreCase(nombre)){
                it.remove();
            }
        }
        if(contador == conjuntoPaises.size()){
            System.out.println(nombre + " no se encuentra en el conjunto de paises.");
        } else {
            System.out.println("El pais "+ nombre +" ha sido eliminado del conjunto.");
        }
    }
}
