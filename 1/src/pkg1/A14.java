// EJERCICIO 14//SUMAR LOS NÚMEROS PARES POR UN LADO Y LOS IMPARES POR OTRO ENTRE 1 Y 99.
//MOSTRAR EL RESULTADO TOTAL DE CADA SUMA.
package pkg1;

public class A14 {

    public static void main(String[] args) {
        int sumapares = 0, sumaimpares = 0;

        for (int i = 1; i <= 99; i++) {
//            // Esta sería la otra forma de calcular
//             if ((i-4)%10==0){
//                System.out.println("Los numeros que terminan 4: " + i);
//                System.out.print(" ");
//                 
//            }

            if (i % 10 == 4) {
                System.out.println("Los numeros que terminan 4: " + i);
                System.out.print(" ");
            }
             
            else if ((i-2)%10==0){
                 System.out.print(" ");
                 System.out.println("");
                 System.out.println("Los numeros que terminan 2: " + i);
            }
        }
        //HEMOS REALIZADO UN BUCLE FOR PARA QUE REVISE TODOS LOS NUMEROS DESDE EL CONTADOR 0 HASTA EL 99.
        //DESPUES HEMOS HECHO LA CONDICIÓN DE QUE SEAN RESTO 0 PARA SACAR LOS PARES.
        //LA VARIABLE SUMAR PARES ES SUMAPARES + I
        //ELSE IMPARES + I.

//          C O N                W H I L E  
//
//
//        int numero = 1;
//
//        while (numero < 100) {
//            numero++;
//
//            if (numero % 2 == 0) {
//                sumapares = sumapares + numero;
//            } else {
//                sumaimpares = sumaimpares + numero;
//            }
//        }
//        System.out.println("La suma de los números pares es: " + sumapares);
//        System.out.println("La suma de los números impares es: " + sumaimpares);


//          C O N       D O       W H I L E    

//        do {
//            contador++;
//            if (contador % 2 == 0) {
//                sumapares = sumapares + contador;
//            } else {
//                sumaimpares = sumaimpares + contador;
//            }
//        } while (contador < 99);
//        System.out.println(sumapares);
//        System.out.println(sumaimpares);

    }
}
