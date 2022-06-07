/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Raza;
import java.util.Comparator;

/**
 *
 * @author fatic
 */
public class Comparators {
    public static Comparator<Raza> ordenarPorNombre = new Comparator<Raza>(){
        @Override
        public int compare(Raza t, Raza t1) {
            return t.getRaza().compareToIgnoreCase(t1.getRaza());
        }
   };  
 }

