/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapas;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class EmpleadoHashMap {
    //Atributos
    private String nombre;
    private int sueldo;
// Constructor
    public EmpleadoHashMap(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + " y su sueldo=" + sueldo;
    }
    
    
    
    public static void main(String[] args) {
        
        HashMap<String,EmpleadoHashMap> personal = new HashMap<String,EmpleadoHashMap>();
        
        EmpleadoHashMap e1 = new EmpleadoHashMap ("1Dante",1000);
        EmpleadoHashMap e2 = new EmpleadoHashMap ("2Jorge",1800);
        EmpleadoHashMap e3 = new EmpleadoHashMap ("3Wendy",2000);
        EmpleadoHashMap e4 = new EmpleadoHashMap ("4Laura",1500);
        EmpleadoHashMap e5 = new EmpleadoHashMap ("5Remover",1500);
        EmpleadoHashMap e6 = new EmpleadoHashMap ("6Sustituto",800);
        
        personal.put("1", e1);
        personal.put("2", e2);
        personal.put("3", e3);
        personal.put("4", e4);
        personal.put("5", e5);
        personal.put("6", e6);
        
        System.out.println(personal);
        
        personal.remove("5", e5); //Borro un empleado usando su clave
        System.out.println(personal);
        
        personal.put("4", e6); //Sustituimos a laura por sustituto
        System.out.println(personal);
        
        System.out.println("---------------------------------");
        
        for(Map.Entry<String,EmpleadoHashMap> i :personal.entrySet()){
            String clave = i.getKey(); //En una variable metemos la clave para imprimir
            EmpleadoHashMap valor = i.getValue(); //En otra variable metemos el valor para imprimir
            
            System.out.println(clave + " : " + valor); //Con toString imprime
        }
        
        System.out.println("La longitud del mapa es: " + personal.size());
    }
}
