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
//4) ¿Qué devuelve este código? 
public class Ejercicio4 {
//Es una matriz 3x4 y seria así:
//    1
//    12
//    1234
// El resto de casillas o posiciones no tienen valor
    public static void main(String[] args) {
        int[][] matriz = {{1}, {1, 2}, {1, 2, 3, 4}};

        //Voy a pintar la matriz para enterarme...
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        cambiar(matriz);

        System.out.println(matriz[matriz.length - 1][matriz.length]);
        
      //Esto es para ver que hace la función...
        System.out.println("");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                matriz[i][j] = i + j;
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }


    }


    public static void cambiar(int[][] matriz) {
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                matriz[i][j] = i + j;
            }
        }
    }
}
        
