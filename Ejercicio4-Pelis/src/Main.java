
import Servicios.ServiciosPelicula;
import java.util.Scanner;

/*En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.*/

/**
 *
 * @author fatic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosPelicula servP = new ServiciosPelicula();
        Scanner leer = new Scanner(System.in);
        int cantidad;
        System.out.println("Indique la cantidad de peliculas que desea ingresar: ");
        cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            servP.crearYAgregarPelicula();
        }
        System.out.println("     ");
        
        servP.mostrarDurMayorA1Hora();
        System.out.println("------------------");
        System.out.println("     ");
       
        servP.ordenarPorDuracionDesc();
        System.out.println("------------------");
        System.out.println("     ");
        
        servP.ordenarPorDuracionAsc();
        System.out.println("------------------");
        System.out.println("     ");
        
        servP.ordenarPorTitulo();
        System.out.println("------------------");
        System.out.println("     ");
        
        servP.ordenarPorDirector();
        System.out.println("------------------");
    }
    
}
