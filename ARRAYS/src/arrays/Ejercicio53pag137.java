//Escribir una aplicación que solicite al usuario cuantos numeros desea introducir
//A continuación, introducir por tecldo esa cantidad de numeros enteros.
//Por último, mostrar en orden inverso al introducido.
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio53pag137 {

    public static void main(String[] args) {

        //Primero leeremos la cantidad de numeros a introducir. 
        //Con esta información creamos una tabla de la longitud adecuada para albergar todos los datos que se introducirán por teclado.
        //Por último, recorreremos la tabla, pero comenzando en el último elemento y finalizando en el primero,
        //con lo que conseguimos mostrarlos en el orden inverso.
        Scanner leer = new Scanner(System.in);
        
        System.out.println("¿Cuandos números desea introducir?:");
        int cuantosNumeros = leer.nextInt();
        int tabla[] = new int[cuantosNumeros]; //Tabla con la longitud adecuada.  
        
        for (int i = 0; i < tabla.length; i++) { //Recorremos desde 0 hasta tabla.length, el final)   
            System.out.println("Introduzca número: ");     
            tabla[i] =leer.nextInt();  
        } 
        
        System.out.println("Los números en orden inverso son: ");
        
        for (int i = tabla.length-1; i >=0; i--) { //Recorremos en orden inverso        
            System.out.println(tabla[i]);
            
        }      
        //En este caso no podemos utilizar Tabla.toString() para mostrar la tabla
    }
}
