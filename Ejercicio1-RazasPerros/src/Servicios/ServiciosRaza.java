/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raza;
import Utilidades.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class ServiciosRaza {
    private ArrayList<Raza> razas = new ArrayList();
    Iterator<Raza> it = razas.iterator();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void crearRazaYAgregar(){
        System.out.println("Ingrese una raza:");
        String nombreRaza = leer.next(); 
        
        razas.add(new Raza(nombreRaza));
    }
    
    public void mostrarLista(){
        Collections.sort(razas, Comparators.ordenarPorNombre);
        System.out.println("Las razas de la lista son: ");
        for (Raza aux : razas){
           System.out.println(aux.toString());
       }
    }
    
    public void borrar(){
        System.out.println("Ingrese una raza para borrarla: ");
        String nombre = leer.next();
        Raza aBorrar = new Raza(nombre);
        while (it.hasNext()) {
            Raza aux = it.next();
            if (aux.getRaza().equalsIgnoreCase(aBorrar.getRaza())) { //Borramos si está la raza ingresada
                it.remove();
            }
        }
    }
     
    public void mostrar2(){
            while (it.hasNext()) {
            System.out.print(it.next());
            System.out.println();
            }
    }
    
}
