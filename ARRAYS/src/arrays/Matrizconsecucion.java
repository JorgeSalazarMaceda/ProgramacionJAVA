//Elaborar un método estático que reciba como entrada una referencia a un array bidimensional de números enteros 
//y lo rellene con todos los enteros consecutivos a partir de 1.
//El relleno se hará por filas empezando por la primera.

package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Matrizconsecucion {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int tamaño;
        
        System.out.println("Introduce el tamaño de la matriz: ");
        tamaño=leer.nextInt();
        
        int t[][] = new int [tamaño][tamaño];
                for (int i = 0; i <t.length; i++) {
            for (int j = 0; j <t.length; j++) {
               
               
            }
             
        }
                
         for (int i = 0; i <t.length; i++) {
             
            for (int j = 0; j <t.length; j++) {
               
                System.out.print(t[i][j]);
            }
             System.out.println("");
        }   
         
    }
    
}
