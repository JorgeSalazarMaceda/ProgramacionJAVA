/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CochePracticarCompares;

import java.util.Arrays;

/**
 *
 * @author Jorge
 */
public class prueba {
    public static void main(String[] args) {
        Coche coche []= new Coche[5];
        
        coche[0] = new Coche(5, "Seat", "HJV5555");
        coche[1] = new Coche(3, "Mercedes", "JXV5785");
        coche[2] = new Coche(4, "Alfa Romeo", "HJV5965");
        coche[3] = new Coche(2, "Zafira", "ZJV5555");
        coche[4] = new Coche(9, "Seat", "AJV5555");
        
        System.out.println("Por número PASAJEROS");
        Arrays.sort(coche);
        System.out.println(Arrays.toString(coche));
        
        
        ComparaMarca a = new ComparaMarca();
        ComparaMatricula b = new ComparaMatricula();
        
        System.out.println("");
        System.out.println("Por MARCA");
        Arrays.sort(coche,a);
        System.out.println(Arrays.toString(coche));
        
        
        System.out.println("");
        System.out.println("Por MATRICULA");
        Arrays.sort(coche,b);
        System.out.println(Arrays.toString(coche));
        
        System.out.println("Por MATRICULA Y MARCA");
        ComparaNombreYMarca c = new ComparaNombreYMarca();
        
        Arrays.sort(coche,c);
        System.out.println(Arrays.toString(coche));
    }
    
    
}
