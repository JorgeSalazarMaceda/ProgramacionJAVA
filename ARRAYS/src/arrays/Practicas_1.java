/*
1. Leer 5 números por teclado y mostrarlos en orden inverso al introducido.
 */
package arrays;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
public class Practicas_1 {
    
    static void invertirArray (int inv[]){ 
    //Este método recibirá por parametro el array, desde la ultima posicioon del array hasta que i llegue a 0, ve decreciendo
        for (int i = inv.length-1; i >=0; i--) { //For para invertir los valores introducidos en el main con el Scanner y lo imprimimos
            
            System.out.print(inv[i] + ", ");
        }
}
   
    
     
        public static void main(String[] args) {
        int array [] = new int [5];
        Scanner sc = new Scanner (System.in);
          for (int i = 0; i < array.length; i++) { // For para introducir valores
            System.out.println("Dime los numeros: " + i);
            array[i]=sc.nextInt();
            
            
        }
            System.out.println("------------- INVERTIMOS EL ARRAY----------------");
        invertirArray(array);
    }
}

