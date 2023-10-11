
//Crear un array de String, con 4 colores que introduzca el usuario por teclado y
//mostrar el contenido del array después por pantalla (utilizar JOptionPane par
//introducir los valores)
package arrays;
import java.util.Scanner;
public class Colores {
    
//        miArray[0] = "verde";
//        miArray[1] = "rojo";
//        miArray[2] = "azul";
//        miArray[3] = "negro";
//
//        System.out.println("El contenido del array en la posición 0 es: " + miArray[0]);
//        System.out.println("El contenido del array en la posición 1 es: " + miArray[1]);
//        System.out.println("El contenido del array en la posición 2 es: " + miArray[2]);
//        System.out.println("El contenido del array en la posición 3 es: " + miArray[3]);

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
          
        String[] miArray = new String[4]; //Declaración de que es un array y el new es la inicialización.
        
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Dime colores: ");
            miArray[i]=leer.next();
            
        }
        
        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Mi array es: " +miArray[i]);
        }
        
    }

}


//
//import java.util.Scanner;
//
//import javax.swing.*;
//
//public class AAAAA {
//
//    public static void main(String[] args) {
//Scanner leer=new Scanner (System.in);
//
//String[] miArray=new String[2];
//
//              for (int i = 0; i < miArray.length; i++) {
//                  System.out.println("Dime colores");
//                  miArray[i]=leer.next();
//    
//        }
//        
//        for (int i = 0; i < miArray.length; i++) {
//              System.out.println("Mi array es: " +miArray[i]);
//            
//        }
//        
//    }
//}
