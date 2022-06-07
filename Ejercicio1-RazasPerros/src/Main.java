
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
        String respuesta = "";
        do {
            servR.crearRazaYAgregar();
            System.out.println("¿Desea ingresar una raza? (S/N)");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s"));
        servR.mostrarLista();
        System.out.println("------------");
        servR.borrar();
        System.out.println("------------");
        servR.mostrarLista();
    }
}
