/*Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.*/
package Entidades;

/**
 *
 * @author fatic
 */
public class CantanteFamoso {
    private String nombre;
    private String discoConMasVentas;
    
    //CONSTRUCTORES
    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }
    
    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre= " + nombre + ", discoConMasVentas= " + discoConMasVentas + '}';
    }
    
    
    
}
