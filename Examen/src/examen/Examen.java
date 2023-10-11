/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Jorge
 */
public class Examen {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        b[1] = 8;
        a = metodo(a, b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i]);
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
