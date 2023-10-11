//EJERCICIO 16// Leer un nº e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0
package pkg16.practica;

import java.util.Scanner;
public class Practica 
{

    public static void main(String[] args) 
    {

        Scanner leer = new Scanner(System.in);
        int numero;
      
        do{System.out.println("Introduzca un número: ");
            numero = leer.nextInt();
        //Se declara variable de número entero para que introduzca número.
        //Hacemos un bucle while, puesto que el proceso se puede repetir infinitamente hasta que se introduzca un 0.
        
        
        }
        while (numero != 0);  {//*Mientras que el número sea diferente de 0
            
            //Si número mayor de 0 es positivo, si no, negativo.
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo");
            } else {
                System.out.println("El número " + numero + " es negativo");
            }    
        
         }
    }     
}   
