/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class ServiciosRaza {
    private ArrayList<Raza> razas = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearRazaYAgregar(){
        System.out.println("Ingrese una raza:");
        String nombreRaza = leer.next(); 
        
        Raza r = new Raza(nombreRaza);
        razas.add(r);
    }
    
    public void mostrarLista(){
        System.out.println("Las razas de la lista son: ");
        for (Raza aux : razas){
           System.out.println(aux.toString());
       }
    }
}
