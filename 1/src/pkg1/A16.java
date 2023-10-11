//EJERCICIO 16// Leer un nº e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0
package pkg1;

import java.util.Scanner;

public class A16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;

        //Se declara variable de número entero para que introduzca número.
        //Hacemos un bucle do while, puesto que el proceso se puede repetir infinitamente hasta que se introduzca un 0.
        //Ese 0 significará fin del programa.
        do {
            System.out.println("Introduzca un número: ");
            numero = leer.nextInt();

            //Si número mayor de 0 es positivo, si no, negativo.
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " es negativo");
            }

        } while (numero != 0);
        System.out.println("Fin del programa");
        //*Mientras que el número sea diferente de 0 estaremos en el bucle, si no, al pulsar 0 se sale del bucle y fin de proframa

//                 V E R S I O N        W H I L E (El primer numero se queda fuera)
//         int numero = 0;
//        System.out.println("Introduzca numero ");
//        numero = leer.nextInt();
//        while (numero != 0) {
//
//            System.out.println("Introduzca un número");
//            numero = leer.nextInt();
//
//            if (numero > 0) {
//                System.out.println("Es positivo");
//            } else if (numero < 0) {
//                System.out.println("negativo");
//            } else {
//
//                System.out.println("Fin");
//            }
//        }
//            C O N       F O R   
//
//        System.out.println("Introduce numero");
//        numero = leer.nextInt();
//        for (int i = numero; i != 0; i++) {
//            System.out.println("Introduce numero");
//            numero = leer.nextInt();
//            if (numero > 0) {
//                System.out.println("El número " + numero + " es positivo");
//            } else if (numero < 0) {
//                System.out.println("El número " + numero + " es negativo");
//            } else {
//                System.out.println("FIN");
//            }
//        }
    }
}
