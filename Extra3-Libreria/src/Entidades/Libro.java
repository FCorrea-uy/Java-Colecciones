/*Crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar el título del libro,
autor, número de ejemplares y número de ejemplares prestados.
La clase Libro contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método toString para mostrar los datos de los libros.*/
package Entidades;

/**
 *
 * @author fatic
 */
public class Libro {
    private String titulo;
    private String autor;
    private int nroEjemplares;
    private int ejemplaresPrestados;
    
    //CONSTRUCTORES
    public Libro() {
    }

    public Libro(String titulo, String autor, int nroEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }
    
    //GETTERS AND SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(int nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo: " + titulo + ", autor: " + autor 
                + ", nroEjemplares: " + nroEjemplares 
                + ", ejemplaresPrestados: " + ejemplaresPrestados + '}';
    }
    
    
    
}
