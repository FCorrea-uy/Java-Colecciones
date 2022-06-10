
import Servicios.ServiciosProducto;
import java.util.Scanner;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
/**
 *
 * @author fatic
 */
public class MainTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosProducto servP = new ServiciosProducto();
        Scanner leer = new Scanner(System.in);
        String res;
        int opcion;
        servP.mostrarMenu();
        opcion = leer.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    do {
                        servP.crearProducto();
                        System.out.println("¿Desea ingresar otro producto? (Si/No)");
                        res = leer.next();
                    } while (res.equalsIgnoreCase("si"));
                    System.out.println("-----------------");
                    servP.mostrarMenu();
                    opcion = leer.nextInt();
                    break;
                case 2:
                    servP.mostrarProductos();
                    System.out.println("-----------------");
                    servP.mostrarMenu();
                    opcion = leer.nextInt();
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto para cambiar precio: ");
                    res = leer.next();
                    servP.cambiarPrecio(res);
                    System.out.println("-----------------");
                    servP.mostrarMenu();
                    opcion = leer.nextInt();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del producto para eliminarlo: ");
                    res = leer.next();
                    servP.eliminarProducto(res);
                    System.out.println("-----------------");
                    servP.mostrarMenu();
                    opcion = leer.nextInt();
                    break;
            }
        }

        //TODO Implementar menu
//        servP.crearProducto();
//        servP.crearProducto();
//        System.out.println("-----------------");
//        servP.mostrarProductos();
//        System.out.println("-----------------");
//        System.out.println("Ingrese el nombre del producto para cambiar precio: ");
//        res = leer.next();
//        servP.cambiarPrecio(res);
//        servP.mostrarProductos();
//        System.out.println("-----------------");
//        System.out.println("Ingrese el nombre del producto para eliminarlo: ");
//        res = leer.next();
//        servP.eliminarProducto(res);
//        System.out.println("-----------------");
//        servP.mostrarProductos();
    }

}
