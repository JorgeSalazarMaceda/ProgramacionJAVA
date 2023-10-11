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
//3) ¿Qué devuelve este código?  
import java.util.Scanner;

public class Ejercicio3 {

    //B vale 5
    //Pues imprime el metodoA que se le pasa por parametro b que es 5, entonces devuelve 5+8= 13
    //Pues imprime el metodoB que se le pasa por parametro b que es 5, entonces devuelve 5+6= 11
    //Termina con un sout de b que es 5
    //No modifica el valor porque es un paso por valor
    
    public static void main(String args[]) {
        int b = 5;
        System.out.println(metodoA(b));
        System.out.println(metodoB(b));
        System.out.println(b);
    }

    static int metodoA(int y) {
        return y + 8;
    }

    static int metodoB(int b) {
        return b + 6;
    }
}
