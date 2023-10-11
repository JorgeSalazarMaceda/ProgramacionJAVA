//EJERCICIO 21//Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos
package a21;
import java.util.Scanner;
public class A21 
{

    public static void main(String[] args) 
    {
        int numero,primos=0;
        //Abrimos las variables numero que es el que introduce el usuario y los primos para descartarlos
        Scanner leer=new Scanner (System.in);
        System.out.println("Introduce un número: ");
        numero=leer.nextInt();
        //Se hace un bucle for, inicializado desde el 1 y la condicion es que revise desde el 1 hasta el número introducido. 
        //El i++ para que vaya incrementando y revisando 1 por 1.
        for (int i = 1; i <=numero; i++) {
            
            //Boolean para ver si true o false si es primo o no. 
            boolean esNumeroPrimo = esPrimo(i);
            
            // Si es un número primo incrementamos el contador primos.
            if (esNumeroPrimo) {
                primos++;
            }
        }
        
        // Mostramos el número de primos.
        System.out.println("Hay " + primos + " primos.");
    }    
    
    // Definición de número primo:
    // Un número primo, sólo se puede dividir entre sí mismo y uno.
    public static boolean esPrimo (int numero){
        
        // Si el número es 0, 1 ó 4 ya sabemos que no son primos 
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        
        // Vamos comprobando que todos los números anteriores al calcular su módulo sea 0, en ese caso
        // sabremos que no es primo.
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        // Si no es 0, 1, 4 o al dividir entre los números anteriores no se ha obtenido
        // el módulo igual a 0, entonces es primo.
        return true;
        
    }
    
}
