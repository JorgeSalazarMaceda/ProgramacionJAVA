package com.mycompany.sporting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Principal {
 
    public static void main (String[] args) throws IOException {
        
        System.out.println("Hola!!");
        System.out.println("Introduce una edad:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final int MAYORIA_EDAD = 18;
        
        int edad = Integer.parseInt(br.readLine());
        
        if (edad < MAYORIA_EDAD) {
      
            System.out.println("Joven");
        } else {
            System.out.println("Viejo!");
        }
        
    }
    
}