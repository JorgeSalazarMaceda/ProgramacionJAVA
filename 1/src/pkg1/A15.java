// EJERCICIO 15 // LEER UN NÚMERO Y MOSTRAR SU CUADRADO, REPETIR EL PROCESO HASTA QUE SE INTRODUZCA UN Nº NEGATIVO
package pkg1;

import java.util.Scanner;

public class A15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero, cuadrado;
        System.out.println("Introduzca un número: ");
        numero = leer.nextInt();

        while (numero >= 0) { //*Mientras que el número sea 0 o positivo y se usa el metodo pow que es para cuadrados
            cuadrado = (int) Math.pow(numero, 2);
            // Ese 2 es que elevas el nÚmero al cuadrado con el metodo pow.
            // Este método devuelve un double y cuadrado es entero,
            // por lo que o cambias las variables de int a double o haces la refundicion o casting poniento (int) antes de Math

            System.out.println("El cuadrado de: " + numero + " es " + cuadrado);
            //Imprimes por pantalla que el cuadrado del número es...

            System.out.println("Introduzca otro número (Número negativo = Fin de programa): ");
            numero = leer.nextInt();
            //Damos la instrucción nuevamente para que pregunte dentro del bucle por otro número

            if (numero < 0) {
                System.out.println("Fin de programa");
                //Si introduces números negativos, fin del programa.
            }
        }


////      C O N      W H I L E     S I N     U S A R     MATH POW
//
//     int numero=1;
//     
//     int resultado;
//     while (numero>0){
//     
//        System.out.println("Introduce numero: ");
//        numero=leer.nextInt();
//        resultado=numero*numero;
//        System.out.println("El resultado de: " + numero + " elevado al cuadrado es: " +resultado);
//    }
//        System.out.println("Fin de programa");
//       

//              C O N       F O R 

//        System.out.println("Introduce un número: ");
//        numero = leer.nextInt();
//        for (int i = numero; i > 0; i++) {
//            System.out.println("Introduce un número: ");
//            numero = leer.nextInt();
//            cuadrado = (int) Math.pow(numero, 2);
//            System.out.println(cuadrado);
//        }

//                C O N     D O     W H I L E
//        
//           do {
//              System.out.println("Introduce numero: ");
//        numero=leer.nextInt();
//        cuadrado=(int) Math.pow(numero,2);
//           System.out.println(cuadrado);
//        
//        } while (numero>=0);
    }
}
