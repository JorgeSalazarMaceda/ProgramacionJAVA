//EJERCICIO 13 //Se genera un nº secreto aleatorio (entre 1 y 100). El usuario introduce un nº por teclado.
//HAY 10 INTENTOS PARS ADIVINAR EL Nº SECRETO. INDICAR SI EL N SECRETO INTRODUCIDO ES MAYOR O MENOR.
package a13;

import java.util.Scanner;

public class A13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 100);
        
        //Ten cuidado al generar el random, si no lo pones en parentesis siempre te dirá que es 0
        //No cogerá la multiplicación por 100 y con el casting de int dará por bueno 0 porque machaca los decimales.
        
        //Math.random da numeros aleatorios entre 0 y 1. Se declara variable int "aleatorio" con casting(int)(Math.random() y se multiplica *100
        //*con ese (int) estamos haciendo el casting o refundición para que sea entero
        //y al multiplicar por 100 desplazamos la coma
        //Esta variable representa el numero que el programa generará aleatoreamente y que hay que adivinar.

        int numero = 0;
        int intentos = 0;
        
         System.out.println("Adivine el numero");

        while (intentos<10){
            System.out.println("Introduce un numero");
            numero=leer.nextInt();
            
            intentos++;
            System.out.println("Estas en el intento: " +intentos);        
           if (aleatorio < numero) {
                System.out.println("Número aleatorio mas bajo que el introducido");
            } else if (aleatorio > numero) {
                System.out.println("Número aleatorio mas alto que el introducido");
            } else {
                System.out.println("Número correcto, lo has conseguido en: " + intentos + " intentos");
            }
            
        }
          
        System.out.println("Has agotado tus intentos y has fallado");
        
        
        //      C O N         F O R
        
//        System.out.println("Avidine el número, tiene 10 intentos");
//        //Se declara la variable número (para que el usuario introduzca su numero
//        //Se declara la variable intentos como contador de intentos.
//        //Se hace un bucle for, i parte desde 1 y mientras i sea menor que 10 (con incremento para que cada vez que se meta un numero se cuente como intento
//
//        for (int i = 1; i < 11; i++) {
//            intentos++; //* Pongo intentos ++ a modo de contador para que me diga en cuantos aciertos lo conseguí.
//
//            System.out.println("Estás en el intento: " + i);
//
//            System.out.println("Introduzca un número:");
//
//            numero = leer.nextInt();
//
//            if (aleatorio < numero) {
//                System.out.println("Número aleatorio mas bajo que el introducido");
//            } else if (aleatorio > numero) {
//                System.out.println("Número aleatorio mas alto que el introducido");
//            } else {
//                System.out.println("Número correcto, lo has conseguido en: " + intentos + " intentos");
//            }
//            //Si aleatorio es menor que número (introducido) te avisa diciendo que es mas bajo.
//            //Si no, aleatorio es mas alto.
//            //Si no, Aleatorio == número, acertaste en +intentos+
//        }
//
//        //Ya fuera del bucle for, si gastas tus 10 intentos, aleatorio es distinto de numero... No acertaste
//        if (aleatorio != numero) {
//            System.out.println("No lo conseguiste, has agotado todos tus intentos");
//        }

//        C O N       D O      W H I L E


//        int numero, aleatorio, intentos = 0;
//
//        aleatorio = (int) (Math.random() * 100);
//
//        do {
//            System.out.println("Introduce numero: ");
//            numero = leer.nextInt();
//            if (aleatorio < numero) {
//                System.out.println("Aleatorio es menor que numero");
//            } else {
//                System.out.println("Aleatorio es mayor que numero");
//            }
//            intentos++;
//        } while (aleatorio != numero);
//
//        if (aleatorio == numero) {
//            System.out.println("¡Acertaste!");
//        }

    }
}
