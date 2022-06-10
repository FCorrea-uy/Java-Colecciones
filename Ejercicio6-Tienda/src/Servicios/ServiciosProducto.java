/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author fatic
 */
public class ServiciosProducto {
    HashMap<String, Float> mapaProductos;
    private final Scanner leer;
    
    public ServiciosProducto(){
        this.mapaProductos = new HashMap();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearProducto(){
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = leer.next();
        System.out.println("Ingrese el precio del producto: ");
        Float precio = leer.nextFloat();
        
        Producto p = new Producto(nombre, precio);
        mapaProductos.put(p.getNombre(), p.getPrecio());
    }
    
    public void cambiarPrecio(String producto){
        System.out.println("Ingrese el nuevo precio: ");
        Float nuevo = leer.nextFloat();
        mapaProductos.replace(producto, nuevo);
    }
    
    public void eliminarProducto(String producto){
        if (mapaProductos.containsKey(producto)){
            mapaProductos.remove(producto);
            System.out.println("El producto "+producto+" ha sido eliminado.");
        } else {
            System.out.println("El producto "+producto+" no se encuentra en el inventario.");
        }
    }
    //TODO ORDENAR PRODUCTOS
    public void mostrarProductos(){
        System.out.println("Los productos ingresados son: ");
        for (Map.Entry<String, Float> entry : mapaProductos.entrySet()) {
            System.out.println("Nombre: "+entry.getKey()+"   Precio: "+entry.getValue());
        }
    }
    
    public void mostrarMenu(){
        System.out.println("MENU: ");
        System.out.println("1-Ingresar productos");
        System.out.println("2-Mostrar productos");
        System.out.println("3-Cambiar el precio de un producto");
        System.out.println("4-Eliminar un producto");
        System.out.println("5-Salir");
        System.out.println("Ingrese una opcion: ");
    }
}
