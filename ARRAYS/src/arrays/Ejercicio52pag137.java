//Diseñar un programa que solicite al usuario que introduzca por teclado 5 números decimales.
//A continuación, mostrar los números en el mismo orden que se ha introducido
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio52pag137 {
    public static void main(String[] args) {
        
//        Para guardar 5 números es posible utilizar 5 variables escalares, pero es mucho mas comodo una tabla con 5 elementos.
//        Los nimeros pueden tener decimales, por lo tanto declararemos la tabla double.class
//        Tendremos que recorre la tabla para insertar valores

    Scanner leer=new Scanner (System.in);
    double tabla[]=new double[5]; //Declarammos una tabla de longitud 5
    
        for (int i = 0; i < tabla.length; i++) { //Recorremos la tabla para leer sus valores.
            System.out.println("Introduzca numero: ");
            tabla[i]=leer.nextDouble(); //Así le metemos los valores.            
        }
        
        System.out.println(Arrays.toString(tabla)); //Con toString nos muestra la tabla

    }
}
