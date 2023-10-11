//Crear y cargar una matriz con x filas y x columnas. Imprimir la diagonal principal
//Por ejemplo con una 4x4 se vería lo siguiente:
package arrays;

import java.util.Scanner;
import java.util.*;

public class AAA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resultado;
        char dante[][] = new char[5][5];
         for (int i = 0; i < dante.length; i++) {
            for (int j = 0; j < dante.length; j++) {
                if (i == 0 || i == dante.length-1||j == 0 || j == dante.length-1) {
                    dante[i][j] = '*';
                } else {
                    dante[i][j] = 'X';
                }
            }
        }
         dameloTodoDante (dante);
        resultado=sumameloTodoDante(5,5);
        System.out.println(resultado);
    }
    
    static void dameloTodoDante (char dante[][]){
       
            //Vamos a rellenar la matriz
       
        //VAMOS A IMPRIMIR
        for (int i = 0; i < dante.length; i++) {
            for (int j = 0; j < dante.length; j++) {
 System.out.print(dante[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static int sumameloTodoDante(int a,int b){
        int suma;
        
        suma=a+b;
       return suma; 
    }
    
}
