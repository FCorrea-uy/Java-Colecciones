/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author fatic
 */
public class Comparators {
    public static Comparator<Pais> ordenDurMayorAMenor = new Comparator<Pais>(){
        @Override
        public int compare(Pais t, Pais t1) {
            return t1.getNombrePais().compareTo(t.getNombrePais());
        }
    };
}
