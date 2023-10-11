//EJERCICIO 17// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos
package a17;
import java.util.Scanner;
public class A17
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner (System.in);
        
        int numero,suma=0;
        // Primero designamos variables
        //Hacemos un do while para que se ejecute siempre una vez y ya despues, si se cumple la condición, siga ejecutando.
        
        do{ 
            System.out.println("Introduzca un números para sumarlos, al pulsar 0 obtendrá el resultado: ");
            numero=leer.nextInt();
            suma+=numero; //+= Es una asignación
            //El programa lee hacia abajo, así que para introducir todos los números en la suma, desde el primero, se designa la suma en el do.
        }
        
            while (numero!=0);
            //Mientras número sea distinto de 0, seguirá pidiendo números, cuando sea 0 mostrará la suma.
            System.out.println("El resultado de la suma de todos los números es: " +suma);
            
//         V E R S I O N     C O N       W H I L E (El primer numero se queda fuera de la suma)  

//        while (numero != 0) {
//            System.out.println("Introduzca un números para sumarlos, al pulsar 0 obtendrá el resultado: ");
//            numero = leer.nextInt();
//            suma += numero; //+= Es una asignación
//            //El programa lee hacia abajo, así que para introducir todos los números en la suma, desde el primero, se designa la suma en el do.
//
//        }
//        System.out.println(suma);


//                   C O N      F O R (El primer numero se queda fuera de la suma)  

//                int numero = 0, suma = 0;
//        System.out.println("Introduce numero");
//        numero = leer.nextInt();
//        for (int i = numero; i != 0; i++) {
//            System.out.println("Introduce numero");
//            numero = leer.nextInt();
//            suma += numero;
//            if (numero == 0) {
//                System.out.println(suma);
//            }
//        }
    }
}
