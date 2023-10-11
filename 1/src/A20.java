//EJERCICIO 20 // Pedir 5 números y escribir la suma total. En el código sólo puede estar escrita una vez la sentencia System.out.print("Introduzca número: ")
package a20;

import java.util.Scanner;

public class A20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        //Inicializamos la variable y le asignamos un valor.

        for (int i = 0; i < 5; i++) {
            // Hacemos un bucle for para que introduzcan 5 numeros por consola, indicamos que suma es = suma + los numeros introducidos 
            // Cuando deje de cumplirse la condición, a los 5 números introducidos, se saldrá del bucle e imprimirá la suma.

            System.out.println("Introduzca número: ");
            int numero = leer.nextInt();
            suma = suma + numero;
        }
        System.out.println("la suma de los números es: " + suma);
        
//      C O N        W H I L E
//
//        int suma = 0;
//        int numero;
//        int contador = 0;
//        while (contador < 5) {
//            contador++;
//            System.out.println("Introduce numero: ");
//            numero = leer.nextInt();
//
//            suma += numero;
//        }
//        System.out.println(suma);


//      C O N      D O       W H I L E

//        do {
//            contador++;
//            System.out.println("Introduce número: ");
//            numero=leer.nextInt();
//            suma+=numero; 
//        } while (contador<5);
//
//        System.out.println("La suma de los 5 números es: " + suma);
    }
}
