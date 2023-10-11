/*
3-Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los
números están ordenados de forma creciente, decreciente, o si están desordenados.
 */
package arrays;


import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Jorge
 */
public class Practicas_3 {
    
    public static void tuArray(boolean array[]){
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        boolean creciente = false, decreciente = false; //Inicializamos las variables en false
       
        for (int i = 0; i < array.length; i++) { // For para introducir valores
            System.out.println("Dime los valores del Array para la posición: " + i);
            array[i] = sc.nextInt();
        }
        //For para mostrar los arrays

        for (int i = 0; i < array.length-1; i++) { //Pongo -1 porque si no se pasa, ya que los array se inician en 0.

            if (array[i] < array[i + 1]) { //Ese +1 se refiere a que si el array [i] > que array [i]+1 es mayor que la siguente posicion del array, es una posicion mas
                creciente = true;
            } 
            if (array[i] > array[i+1] ) {
            decreciente = true;
				}
        }

        if (creciente == true && decreciente == false) {
            System.out.println("Están ordenados de forma creciente");
        } else if (creciente == false && decreciente == true) {
            System.out.println("Están ordenados de forma decreciente");
        } else if (creciente == false && decreciente == false) {
            System.out.println("Todos son iguales");
            //Si ambos son FALSE, significa en en algunos momentos está creciente y en otros decreciente
        } else {
            System.out.println("Todos están desordenados");
            //Son iguales, porque no son ni crecientes ni decrecientes.
        }    
        
        //Por practicar, si lo quieres ver y ordenar lo muestras y haces arrays.sort importando la libreria de arrays
        System.out.println("Mi array-------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
          Arrays.sort(array);
        }
        
        
    }
}
