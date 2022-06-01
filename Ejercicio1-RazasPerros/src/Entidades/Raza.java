/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author fatic
 */
public class Raza {
    private String raza;

    //CONSTRUCTORES
    public Raza() {
    }

    public Raza(String raza) {
        this.raza = raza;
    }
    
    //GETTERS AND SETTERS
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return raza;
    }
    
    
}
