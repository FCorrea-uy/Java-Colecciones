
import Entidades.CantanteFamoso;
import Servicios.ServiciosCantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*En el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.*/
/**
 *
 * @author fatic
 */
public class MainCantantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();
        ServiciosCantanteFamoso servCF = new ServiciosCantanteFamoso();
        int opcion;

        System.out.println("Intgrese 5 cantantes: ");
        for (int i = 0; i < 5; i++) {
            listaCantantes.add(servCF.crearCantanteFamoso());
        }
        servCF.mostrarMenu();
        opcion = leer.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    listaCantantes.add(servCF.crearCantanteFamoso());
                    servCF.mostrarMenu();
                    opcion = leer.nextInt();
                    break;
                case 2:
                    for (CantanteFamoso aux : listaCantantes) {
                        System.out.println(aux.toString());
                    }
                    servCF.mostrarMenu();
                    opcion = leer.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese el cantante que desea eliminar: ");
                    String aBorrar = leer.next();
                    eliminarCantante(aBorrar, listaCantantes);
                    servCF.mostrarMenu();
                    opcion = leer.nextInt();
                    break;
            }
        }
        System.out.println("La lista final es: ");
        for (CantanteFamoso aux : listaCantantes) {
            System.out.println(aux.toString());
        }
    }

    public static void eliminarCantante(String aBorrar, ArrayList<CantanteFamoso> lista) {
        int contador = 0;
        Iterator<CantanteFamoso> it = lista.iterator();
        while (it.hasNext()) {
            CantanteFamoso aux = it.next();
            contador++;
            if (aux.getNombre().equalsIgnoreCase(aBorrar)) {
                it.remove();
            }
        }
        if (contador == lista.size()) {
            System.out.println("El cantante " + aBorrar + " no estaba en la lista.");
        } else {
            System.out.println("El cantante " + aBorrar + " ha sido eliminado.");
        }
    }
}
