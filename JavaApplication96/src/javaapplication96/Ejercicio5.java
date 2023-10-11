/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

/**
 *
 * @author Jorge
 */
//5) ¿Qué devuelve este código?  
public class Ejercicio5 {
//Tenemos dos objetos, uno de clase autor con un constructor de dos parametros, nombre y apellido
//y el otro de clase libro, con un constructor de parametro libro y el otro parametro es el objeto autor
//  Entonces tenemos el sout del objeto libro... Imprimira "La trilogia de Pepe", "Pepe", "Sancho"
    
//Luego yo lo he ampliado, he creado el objeto autor 1
//Le he hecho en clase autor este constructor sin parametros
//     public Autor(){
//         this.nombre = "Paco";
//         this.apellido = "Salazar";
//    }
// Imprime Paco Salazar
    
//Además he creado libro con este constructor:
//      public Libro (Autor autor1){
//        this.titulo = "Paco";
//        this.autor = autor1;
//    }
// Como parametro solo llevará el objeto autor 1 y el otro con el constructor
    public static void main(String[] args) {
        Autor autor = new Autor("Pepe", "Sancho");
        Libro libro = new Libro("La trilogía de Pepe ", autor);
        System.out.println(libro);
        
        
        
        Autor autor1 = new Autor ();
        System.out.println(autor1);
        
        Libro libro1 = new Libro(autor1);
        System.out.println(libro1);
    }
}

class Libro {

    private String titulo;
    private Autor autor;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    public Libro (Autor autor1){
        this.titulo = "Vanessa";
        this.autor = autor1;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString() {
        return titulo + autor;
    }
}

class Autor {

    private String nombre;
    private String apellido;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Autor(){
         this.nombre = "Paco";
         this.apellido = "Salazar";
    }

    public String toString() {
        return nombre + " " + apellido;
    }
}
