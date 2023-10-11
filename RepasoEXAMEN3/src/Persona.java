/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Persona implements Comparable<Persona>{
    private String nombre;
    private int edad;
    private String dni;
    
    
    public Persona(String nombre,int edad,String dni){
    this.nombre=nombre;
    this.edad=edad;
    this.dni=dni;
    
}

    public Persona() {
    this.nombre="Dante";
    this.edad=25;
    this.dni="ABCDE";
    }
 
    @Override
    public int compareTo(Persona o){
        return this.nombre.compareTo(o.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + '}';
    }


    
}
