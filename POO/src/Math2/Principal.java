/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math2;

/**
 *
 * @author Jorge
 */

import java.util.Scanner;
public class Principal {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano;
        System.out.println("Indícame el tamaño de tu array: ");
        tamano=sc.nextInt();
        
        double []miArray=new double[tamano];
        
        System.out.println("Rellenamos el array: ");
        for (int i = 0; i < miArray.length; i++) { // For para introducir valores
            System.out.println("Dime los valores: " + i);
            miArray[i]=sc.nextInt();
    }
        
        
         System.out.println ("El máximo de mi Array es: " + Math2.maximo(miArray));
          System.out.println ("El minimo de mi Array es: " + Math2.minimo(miArray));
           System.out.println ("El suma de mi Array es: " + Math2.sumaArray(miArray));
            System.out.println ("El media de mi Array es: " + Math2.media(miArray));
}
}
