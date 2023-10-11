package Ficheros;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Contacto {
    protected String nombre;
    protected int telefono;


//Constructores
    public Contacto() {
    }

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
//Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //To String
    @Override
    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nContacto\n";
        cadena += "\nNombre: " + nombre;
        cadena += "\nTeléfono: " + telefono;
        cadena += "\n------------------------------------------";
        return  cadena;
    }
}
