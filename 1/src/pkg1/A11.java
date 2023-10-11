//EJERCICIO 11 //TABLA DE MULTIPLICAR DEL 1 AL 10 DE UN Nº DADO POR TECLADO
//FORZAR A QUE EL Nº INTRODUCIDO ESTÉ ENTRE EL 1 Y EL 20, SI NO EL PROGRAMA NO AVANZA.
//          SOLUCION DEFENSA
//        int numero=21;
//       
//        Scanner leer=new Scanner(System.in);
//        while (numero>20){
//             
//       System.out.println("Diga el número sobre el cual quiere ver la tabla de multiplicar: ");
//        numero = leer.nextInt();
//        }
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numero + " * " + i + " = " + numero*i);
//        }
        
package pkg1;

import java.util.Scanner;

public class A11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
//                int numero, contador = 0;
//
////        System.out.println("Introduce número que sea inferior a 20 para ver su tabla de multiplicar: ");
////        numero = leer.nextInt();
////        while (contador < 10) {
////            if (numero > 20) { 
////                System.out.println("Introduce número que sea inferior a 20 para ver su tabla de multiplicar: ");
////                numero = leer.nextInt();ystem.out.println("Introduce número que sea in
////            }
////            contador++;
////            System.out.println(numero + " * " + contador + " = " + (numero * contador));
////        }
//     
//        //HACEMOS EL SCANNER Y LA VARIABLE NUMERO PARA QUE EL USUARIO INTRODUZCA EL NÚMERO SOBRE EL CUAL QUIERE VER LA MULTIPLICACIÓN PREGUNTANDO POR PANTALLA
//       
//            System.out.println("Diga el número sobre el cual quiere ver la tabla de multiplicar: ");
//        numero = leer.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numero + " * " + i + " = " + numero*i);
//        }
//      
//
//            //Hacemos un bucle for con la condición de que se realizará el bucle desde 0 hasta <=10 incrementándose de uno en uno
//            //Se indica con un if que numero (el introducido) no puede ser superior a 20
//            //Se muestra por pantalla ese bucle: número(el introducido) "*" i (contador que se va incrementando hasta 10 de uno en uno) = número*i (resultado)
//        }
//            if (numero > 20) {
//            System.out.println("Error, fuera del rango");
//            //Si número supera 20, se muestra el error.
//            }
//              C O N              W H I L E
//
        int numero, contador = 0;

        System.out.println("Introduce número que sea inferior a 20 para ver su tabla de multiplicar: ");
        numero = leer.nextInt();
        while (contador < 10) {
            while (numero > 20 || numero<0) { //CON ESTE OTRO BUCLE HACEMOS QUE SI METES UN NUMERO MAYOR QUE 20 TE VUELVA A PREGUNTAR
                System.out.println("Introduce número que sea inferior a 20 para ver su tabla de multiplicar: ");
                numero = leer.nextInt();
            }
            contador++;
            System.out.println(numero + " * " + contador + " = " + (numero * contador));
        }
    }
}


//               C O N       D O       W H I L E    
//        int numero = 0, contador = 0;
//        System.out.println("Introduce número que sea inferior a 20 para ver su tabla de multiplicar: ");
//        numero = leer.nextInt();
//        do {
//            while (numero > 20) { //CON ESTE OTRO BUCLE HACEMOS QUE SI METES UN NUMERO MAYOR QUE 20 TE VUELVA A PREGUNTAR
//                System.out.println("Introduce número que sea inferior a 20 para ver su tabla de multiplicar: ");
//                numero = leer.nextInt();
//            }
//            contador++;
//            System.out.println(numero + " * " + contador + " = " + (numero * contador));
//
//        } while (contador < 10);
//    }
//}
