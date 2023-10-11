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
//1) ¿Qué devuelve este código?  
public class Ejercicio1 {

    /**
     * a = 1,2,3 b = 1,2,3
     *
     * b pasa a valer 1,8,3
     *
     * Metodo int[1,2,3]x, int[1,8,3]y y[1] = cambia el array y = 1,1,3
     *
     * b {0,0,0}
     *
     * Con el for b[i] es 1,2,3 + 1,1,3 = 2,3,6
     *
     * a (en el main) es 2,3,6 pero no lo imprime.
     *
     * Imprime b[i] que es 1 1 3
     *
     *
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 8;
        a = metodo(a, b); //a = 2 3 6
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
    } // fin método main 

    public static int[] metodo(int[] x, int[] y) {
        y[1] = 1;
        int[] b = {0, 0, 0};
        for (int i = 0; i < x.length; i++) {
            b[i] = x[i] + y[i];
        }
        return b;
    }
}
