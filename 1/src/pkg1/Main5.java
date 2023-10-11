// EJERCICIO 5 //Introducir edad y si <18 mostrar "eres muy joven",si es <40 "eres joven"<65"eres viejoven" y si no "cuidate" con if y else
package pkg1;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Primero hacemos el Scanner para que el usuario introduzca su edad

        int edad;
        //Para ello abrimos la variable edad y le preguntamos
        //Hacemos los condicionales con sus instrucciones
        // Si tienes menos de 18, que salga por pantalla la descripción, y así sucesivamente

        System.out.println("Digame su edad");
        edad = leer.nextInt();

        if (edad < 18) {
            System.out.println("Eres muy jóven");
        } else if ((edad >= 18) && (edad < 40)) {
            System.out.println("Eres jóven");
        } else if ((edad >= 40) && (edad < 65)) {
            System.out.println("Eres viejoven");
        } else {
            System.out.println("Cuidate");
        }
    }
}
