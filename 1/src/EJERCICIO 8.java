//EJERCICIO 8//Hay 2 bombillas apagadas(b1 y b2). Introducir por teclado valores válidos para el día del mes y el mes.
//Si día del mes y el mes es par encender b1. Si día o el mes es impar encender b2
package pkg8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner leer = new Scanner(System.in);
//
//        int dia, mes;
//        
//        System.out.println("Introduce que dia es: ");
//        dia=leer.nextInt();
//        System.out.println("Introduce que mes es: ");
//        mes=leer.nextInt();
//        
//        
//        while ((dia<1 || dia> 31) || (mes<1 || mes> 12)){
//        System.out.println("Te has equivocado, introduce que dia es (El rango posible es de 1 a 31): ");
//        dia=leer.nextInt();
//        System.out.println("Te has equivocado, introduce que mes es (El rango posible es de 1 a 12): ");
//        mes=leer.nextInt();
//        }
//         
//        if (dia%2==0 && mes%2==0){
//            System.out.println("El dia y el mes es par y se debe de encender b1");
//        }
//        else{
//            System.out.println("El dia y el mes es impar y se debe de encender b2");
//        }
        
//        C O N          B O O L E A N        
        
          Scanner leer = new Scanner(System.in);

        int dia, mes;

        System.out.println("Introduce que dia es: ");
        dia = leer.nextInt();
        System.out.println("Introduce que mes es: ");
        mes = leer.nextInt();
        
        while ((dia < 1 || dia > 31) || (mes < 1 || mes > 12)) {
            System.out.println("Te has equivocado, introduce que dia es (El rango posible es de 1 a 31): ");
            dia = leer.nextInt();
            System.out.println("Te has equivocado, introduce que mes es (El rango posible es de 1 a 12): ");
            mes = leer.nextInt();
        }
        
            boolean bombilla1=(dia%2==0 && mes%2==0);
            boolean bombilla2=(dia%2!=0 || mes%2!=0);
            
            System.out.println("La bombilla 1: " + bombilla1);
            System.out.println("La bombilla 2: " + bombilla2);
        
        
//                            V E R S I O N                                 A N T I G U A


//        // Hacemos el scanner y declarammos variables b1, b2 (bombilla 1 y 2), dia y mes para que lo introduzca el usuario.
//        
//        System.out.println("Escribe que dia es:");
//        dia = leer.nextInt();
//        if (dia >= 1 && dia <= 31) {
//        } else {
//            System.out.println("Está fuera del rango, debe de ser de 1 a 31 días");
//        }
//
//        System.out.println("Escribe que mes es:");
//        mes = leer.nextInt();
//        if (mes >= 1 && mes <= 12) {
//        } else {
//            System.out.println("Está fuera del ranngo, los meses son de 1 a 12");
//        }
//        
//        //Hacemos el if y else para dejar claros los rangos de días (1 a 31 días) y meses (1 a 12).
//        //Si el usuario mete un dato fuera de rango, se le avisará.
//        
//        
//        if (mes == 2 && (dia >=1 && dia <= 28)) {
//            System.out.println("El mes tiene 28 dias");
//        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >=1 && dia <= 30)) {
//            System.out.println("El mes tiene 30 dias");
//        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia>=1 && dia <= 31)) {
//            System.out.println("El mes tiene 31 dias");
//        }
//        // Programamos los meses que tienen 28 días, 30 y 31 para que quede constancia y marcar las diferencias entre meses
//        if ((dia % 2 == 0) && (mes % 2 == 0)) {
//            System.out.println("Se debe de encender b1");
//        } else {
//            System.out.println("Se debe de encender b2");
//        }
//        // Se programa que se encienda b1 si es par(dia y mes) y b2 si es impar (dia y mes)
//        // Si el resto del día dividido entre dos es 0, es que el día es par, y el mes.
//        // Para impar la operación es igual pero el resto debe dar distinto de 0.
    }
}
