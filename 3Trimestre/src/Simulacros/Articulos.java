/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulacros;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Jorge
 */
//compareTo --> Comparable
//compare --> comparator
public class Articulos implements Comparable <Articulos>{
    //Atributos
    private int id;
    private String descripcion;
    
    //Constructor

    public Articulos(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripción) {
        this.descripcion = descripción;
    }

    @Override
    public String toString() {
        return "\nEl id de los articulos es: " + id + " y su descripción es: " + descripcion;
    }  
 

    @Override
    public int compareTo(Articulos parametro) { //Tiene que ser con int, porque resta enteros.
       return this.id - parametro.getId();
    }

    
    
    
    
}
