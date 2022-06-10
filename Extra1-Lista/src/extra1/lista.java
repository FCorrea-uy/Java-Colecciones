/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/
package extra1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList();
        Integer num;
        float suma=0, prom=0;
        System.out.println("Ingrese numeros enteros, para finalizar ingrese -99: ");
        num = leer.nextInt();
        while (num != -99){
            lista.add(num);
            num = leer.nextInt();
        }
        
        for (Integer aux : lista) {
            suma+= aux;
        }
        prom = suma/lista.size();
        System.out.println("La suma de los elementos es: "+suma);
        System.out.println("El promedio de los elementos es: "+prom);
    }
    
}
