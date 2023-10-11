//EJERCICIO 18// Pedir números hasta que se introduzca uno negativo, y calcular la media
package a18;

import java.util.Scanner;

public class A18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero, cantidad = 0, suma = 0;
        double media=0;
//*Número guarda los números introducidos por usuario
//*Por si hay decimales
//*Cantidad es el contador de los números introducidos, desde el 0 y luego lo incrementamos en 1 dentro del bucle

        System.out.println("Introduzca un número, por favor: ");
        numero = leer.nextInt();

        while (numero >= 0) {
            suma += numero;
            System.out.println("Introduzca otro número por favor: ");
            numero = leer.nextInt();

            cantidad++;
            media = suma / cantidad;

        }
        if (numero < 0) {
            System.out.println("Un número negativo da finalización al programa");
            System.out.println("La media de todos los números introducidos hasta ahora es: " + media);
        }
        
        
//              C O N       D O       W H I L E      


//        do {
//            System.out.println("Numero: ");
//            numero=leer.nextInt();
//            suma+=numero;
//            cantidad++;
//        } while (numero>=0);
//        media=suma/cantidad;
//        System.out.println(media);
        
//          V E R S I O N     C O N     W H I L E

//        while (numero >= 0) {
//            System.out.println("Introduce numero: ");
//            numero = leer.nextInt();
//            
//            cantidad++;
//            suma+=numero;
//            media=suma/cantidad;
//        }

//        C O N        F O R
//
//        int numero, suma = 0;
//        double media;
//        System.out.println("Introduce numero: ");
//        numero = leer.nextInt();
//        for (int i = numero; i >= 0; i++) {
//            System.out.println("Introduce numero: ");
//            numero = leer.nextInt();
//            suma += numero;
//            media = suma + i;
//            if(numero<0){
//                System.out.println(media);
//            }          
//        }
    }
}
