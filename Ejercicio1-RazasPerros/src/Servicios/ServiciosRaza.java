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
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearRazaYAgregar() {
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

    public void borrar() {
        Iterator<Raza> it = razas.iterator();
        int contador = 0;
        
        System.out.println("Ingrese una raza para eliminarla: ");
        String nombre = leer.next();
        while (it.hasNext()) {
            Raza aux = it.next();
            contador++;
            if (aux.getRaza().equalsIgnoreCase(nombre)) {
                it.remove();
            }
            if(contador == razas.size()){
                System.out.println("La raza " + nombre + " no estaba en la lista.");
            }
        }
    }

}
