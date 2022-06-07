/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author fatic
 */
public class Pais implements Comparable<Pais>{
    private String nombrePais;
    
    //CONSTRUCTORES
    public Pais() {
    }

    public Pais(String nombre) {
        this.nombrePais = nombre;
    }
    
    //GETTERS AND SETTERS
    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombre) {
        this.nombrePais = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 12;
        hash = 41 * hash + Objects.hashCode(this.nombrePais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + '}';
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombrePais.compareTo(t.getNombrePais());
    }
    
    
}
