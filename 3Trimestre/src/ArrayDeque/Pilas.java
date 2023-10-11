/*
Implementar una clase pila para añadir prendas de ropa para planchar, usando deque y con los siguientes métodos.
-Insertar: inserta un elemento en la pila, no devuelve nada. Como parámetro recibe solo el número a insertar.
-Quitar: quita elemento de la pila, devuelve -1 si está vacía. No recibe parámetros.
-Vacia: informa si la pila está vacía o no. devuelve booleano. No recibe parámetros.
-Tamaño de la pila.
*/
package ArrayDeque;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.util.*;
public class Pilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Deque<String> pila = new ArrayDeque<String>();
        int numero=0;
        String prenda;
        
        do{
            System.out.println("Diganos la opción que desea:");
            System.out.println(" 1. Insertar.");
            System.out.println(" 2. Quitar.");
            System.out.println(" 3. ¿Está vacía?.");
            System.out.println(" 4. Dime su tamaño."); 
            System.out.println(" 0. Salir");
            numero = sc.nextInt();
            switch (numero) {
                case 0:
                    System.out.println("Adiós, esperamos volver a verle.");
                    break;
                case 1:

                    System.out.println("¿Añades prenda?.");
                    prenda = sc.next();
                    pila.addFirst(prenda); //addFirst o push (con excepción) sin excepción offerFirst... (Se añade al principio, no al final)
                    System.out.println("Prenda añadida.");
                    System.out.println("");
                    break;

                case 2:
                    //MAL, mira el enunciado, no devuelve -1
//                    if (!pila.isEmpty()) {//Devuelve true si no tiene elementos
//                        System.out.println("Quitamos la prenda: " + pila.peekFirst()); //peekFirst para eliminar el primer valor
//                        System.out.println("");
//                    } else {
//                        System.out.println("No hay prendas para retirar.");
//                        System.out.println("");
//                    }
                    int vacia = 0;
                    if(pila.isEmpty()){
                        vacia=-1;
                    }else{
                        pila.removeFirst();
                    }
                    break;
                case 3:
                    
                    System.out.println("¿Está vacia? " + pila.isEmpty());
                    break;
                    
                case 4:
                    System.out.println("Tenemos " + pila.size() + " ahora mismo."); //Size para ver el tamaño del Deque
                    System.out.println("");
                    break;
     
            }
        }while (numero!=0);
    }
  
}
