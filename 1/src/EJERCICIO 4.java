// EJERCICIO 4 //Se da por teclado el precio de una revista, el numero de años de antigüedad de un suscriptor y si es estudiante o no. 
// Visualizar el precio a pagar por el suscriptor sabiendo que:
// • Los suscriptores con más de 5 años tienen un descuento del 20% si son estudiantes y un 15% si no lo son
// • A los suscriptores con una antigüedad entre 3 y 5 años se les aplica un 10% si son estudiantes y un 5% si no lo son
// • A los estudiantes no suscriptores se les aplica un 2% y a los no suscriptores y no estudiantes no se les aplica descuento
package pkg4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double precio, descuento;
        int años;
        String estudiante;
        //Se hacen las variables, tenemos que hacer la del precio, descuento, años y un string para detectar si es estudiante o no.

        System.out.println("Introduzca el precio de la revista: ");
        precio = leer.nextInt();

        System.out.println("¿Cuantos años llevas suscrito?: ");
        años = leer.nextInt();

        System.out.println("¿Eres estudiante? (si/no):");
        estudiante = leer.next();
        // Primero hacemos un system.out para que el usuario introduzca el precio con scanner
        // Lo mismo para que nos pregunte los años suscrito y si eres estudiante o no.

        if ((años >= 5) && (estudiante.equals("si"))) {
            descuento = (precio * 0.20);
            precio = precio - descuento;
            System.out.println("El precio de la revista será: " + precio);
        } //Ahora vamos con las condiciones: Si estás suscrito mas o igual a 5 años y eres estudiante (con metodo equals)
        //Al cumplirse esta condicion el descuento es del 0,20 sobre el total del precio por lo que el precio es precio - descuento.
        //Se hacen el resto de condicionales.
        else if ((años >= 5) && (estudiante.equals("no"))) {
            descuento = (precio * 0.15);
            precio = precio - descuento;
            System.out.println("El precio de la revista será: " + precio);
        }
        if ((años >= 3 && (años < 5)) && (estudiante.equals("si"))) {
            descuento = (precio * 0.10);
            precio = precio - descuento;
            System.out.println("El precio de la revista será: " + precio);
        } else if ((años >= 3 && (años < 5)) && (estudiante.equals("no"))) {
            descuento = (precio * 0.05);
            precio = precio - descuento;
            System.out.println("El precio de la revista será: " + precio);
        }
        if ((años >= 0) && (años < 3) && (estudiante.equals("si"))) {
            descuento = (precio * 0.02);
            precio = precio - descuento;
            System.out.println("El precio de la revista será: " + precio);
        } else if ((años == 0) && (estudiante.equals("no"))) {
            System.out.println("El precio de la revista será: " + precio);
        } 

//        C O N      E S T U D I A N T E      C H A R A T     (POR SI PULSA S SOLO)        
         // AL SER CHAR UN TIPO PRIMITIVO Y NO UN OBJETO SI PUEDO IGUALAR ==
//
//        if ((años >= 5) && (estudiante.length()>0 && estudiante.charAt(0)=='s')) {
//            descuento = (precio * 0.20);
//            precio = precio - descuento;
//            System.out.println("El precio de la revista será: " + precio);
//        } //Ahora vamos con las condiciones: Si estás suscrito mas o igual a 5 años y eres estudiante (con metodo equals)
//        //Al cumplirse esta condicion el descuento es del 0,20 sobre el total del precio por lo que el precio es precio - descuento.
//        //Se hacen el resto de condicionales.
//        else if ((años >= 5) && (estudiante.length()>0 && estudiante.charAt(0)=='n')) {
//            descuento = (precio * 0.15);
//            precio = precio - descuento;
//            System.out.println("El precio de la revista será: " + precio);



//        C O N        B O O L E A N

//       Scanner leer = new Scanner(System.in);
//
//        double precio, descuento;
//        int años;
//        boolean estudiante;
//
//        System.out.println("¿Eres estudiante? (true/false):");
//        estudiante = leer.nextBoolean(); 
//        //CON BOOLEAN NO PUEDES ESCRIBIR LO QUE QUIERAS, NO ES UN STRING, TIENE QUE SER TRUE O FALSE
//        System.out.println("Introduzca el precio de la revista: ");
//        precio = leer.nextInt();
//
//        System.out.println("¿Cuantos años llevas suscrito?: ");
//        años = leer.nextInt();
//
//        if (estudiante) {
//            if (años >= 5) {
//                System.out.println("El precio de la revista será: " + precio * 0.80);
//            } else if (años >= 3 && años < 5) {
//                System.out.println("El precio de la revista será: " + precio * 0.90);
//            } else {
//                System.out.println("El precio de la revista será: " + precio * 0.98);
//            }
//
//        } else {
//            if (años >= 5) {
//                System.out.println("El precio de la revista será: " + precio * 0.85);
//            } else if (años >= 3 && años < 5) {
//                System.out.println("El precio de la revista será: " + precio * 0.95);
//            } else {
//                System.out.println("El precio de la revista será: " + precio);
//            }
//        }

    }
}
