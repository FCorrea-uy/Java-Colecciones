
import Entidades.Raza;
import Servicios.ServiciosRaza;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosRaza servR = new ServiciosRaza();
        Raza r = new Raza();
        int opcion;

        servR.mostrarMenu();
        opcion = leer.nextInt();
        while (opcion < 5) {
            switch (opcion) {
                case 1:
                    r = servR.crearRaza();
                    servR.mostrarMenu();
                    opcion = leer.nextInt();
                    System.out.println(" ");
                    break;
                case 2:
                    servR.agregarALista(r);
                    servR.mostrarMenu();
                    opcion = leer.nextInt();
                    System.out.println(" ");
                    break;
                case 3:
                    servR.mostrarLista();
                    System.out.println(" ");
                    servR.mostrarMenu();
                    opcion = leer.nextInt();
                    System.out.println(" ");
                    break;
                case 4:
                    servR.cantidadEnLista();
                    servR.mostrarMenu();
                    opcion = leer.nextInt();
                    System.out.println(" ");
                    break;
            }
        }
    }
}
