/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
import java.util.*;

public class Practicar extends Persona {

    public static void main(String[] args) {

        Persona personas[] = new Persona[5];

        personas[0] = new Persona("Dante", 25, "XXXX");
        personas[1] = new Persona("Laura", 26, "XXXX");
        personas[2] = new Persona("Wendy", 27, "XXXX");
        personas[3] = new Persona("Yuquita", 20, "XXXX");
        personas[4] = new Persona("Jorge", 33, "XXXX");
   
        
        
        Arrays.sort(personas);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
        
        
        System.out.println("Por edades");
        System.out.println("");
        ComparaEdades a = new ComparaEdades();
        
        
        Arrays.sort(personas,a);
           for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
}
