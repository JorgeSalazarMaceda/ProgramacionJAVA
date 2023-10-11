//EJERCICIO 2 //Dado un número introducido por pantalla, decir si es par o impar;
package pkg2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int a;

        System.out.println("Introducir un valor para a");
        a = leer.nextInt();
        // Se abre la variable a como numero a introducir por el usuario por consola.
        //Se hace la operación para saber si es par o impar mediante condicionales.
        //Si el módulo o resto de a dividido por 2 es = a 0, será impar, si no es que es impar.
        //Se muestra por pantalla.
        if (a % 2 == 0) {
            System.out.println("a es un número par.");
        } else {
            System.out.println("a es un número impar.");
        }
    }
}
