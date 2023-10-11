// EJERCICIO 3 ////Dado un numero en segundos, pasarlo a horas,minutos y segundos
package pkg1;

import java.util.Scanner;
// Se importa Scanner

public class Main3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numerosegundos, segundos, minutos, horas;
        //Abrimos variables de lo que nos pide el ejercicio.
        //Además a =  los segundos que introducirá el usuario por pantalla como se muestra abajo.

        System.out.println("Introduzca el número de segundos");
        numerosegundos = leer.nextInt();
        // La resolución es que una hora son 3600 segundos, por lo que las horas las obtienes dividiendo los segundos introducidos entre una hora
        horas = numerosegundos / 3600;

        minutos = ((numerosegundos % 3600) / 60);
        // Los minutos se obtienen con el resto de a (segundos introducidos) entre 3600 (una hora en seg) y eso dividirlo entre sesenta minutos.

        segundos = numerosegundos- (horas * 3600 + minutos * 60);
        //Los segundos se obtienen restandole a la variable a el resultado de horas y minutos resultante de esa operación.
        // para obtener los datos introduciendo por ejemplo horas en vez de segundos es al reves, multiplicando por 60 o 3600
        System.out.println("El número de horas es: " + horas);
        System.out.println("El número de minutos es: " + minutos);
        System.out.println("El número de segundos es: " + segundos);
    }
}
