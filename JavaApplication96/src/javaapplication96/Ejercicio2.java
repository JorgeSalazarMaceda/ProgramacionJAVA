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
import java.util.Scanner;

public class Ejercicio2 {

    //2) El código siguiente tiene errores, indica cuales y como resolverlos.  import java.util.Scanner; 
   static Scanner sc = new Scanner(System.in); //Error corregido, el static de clase

    public static void main(String[] args) {
       double valor;
        System.out.println("Introduzca un numero");
        valor = sc.nextDouble(); //Error corregido, La lectura en el main y no en el método
        valor = lectura(valor);
        System.out.println(valor);
    }// fin método main  

    public static double lectura(double valor) {
        
        
        if (valor < 0) {
            valor++;
           
        }
         return valor; //Error corregido, El return fuera del if
    } // fin método 
} // fin clase 

