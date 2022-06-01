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
    
    public Raza crearRaza(){
        System.out.println("Ingrese una raza:");
        String nombreRaza = leer.next();
        
        return new Raza(nombreRaza);
    }
    /**
     * Se agrega la raza pasada por parametro a la lista de razas
     * @param r es una raza
     */
    public void agregarALista(Raza r){
        razas.add(r);
        System.out.println("La raza ha sido agregada");
    }
    
    public void mostrarLista(){
        System.out.println("Las razas de la lista son: ");
        for (Raza aux : razas){
            System.out.println(aux.toString());
        }
    }
    
    public void cantidadEnLista(){
        System.out.println("La cantidad de razas en la lista es: "+razas.size());
    }
    
    public void mostrarMenu(){
        System.out.println("Ingrese una opcion:");
        System.out.println("1- Crear raza");
        System.out.println("2- Agregar raza a lista de razas");
        System.out.println("3- Mostrar lista");
        System.out.println("4- Cantidad de elementos de la lista");
        System.out.println("5- Salir");
    }
}
