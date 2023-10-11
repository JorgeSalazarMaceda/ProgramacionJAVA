/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class JavaApplication30 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      
        Scanner leer = new Scanner(System.in);
        int num, numerocifras;
        char esPar;
        boolean mitad1, mitad2;
        String multiplo;

        System.out.println("Escriba un número dentro del rango 1 hasta 100:");
        num = leer.nextInt();
        
        if ((num>=1) && (num<=100)){
            System.out.println("Esta dentro del rango 1 a 100");}       
        else {System.out.println("Está fuera del ranngo");}
    }
    
}
