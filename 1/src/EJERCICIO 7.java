//EJERCICIO 7 // Comparar 3 numeros introducidos por pantalla y mostrarlos ordenados de mayor a menor
package pkg7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Se hace el Scanner para que el usuario introduzca por pantalla n1, n2 y n3.
        //SE HACE IF Y ELSE IF DE TODAS LAS OPCIONES POSIBLES PARA QUE NOS DIGA DE MAYOR A MENOR.
        int n1, n2, n3;

        System.out.println("Introduce el primer número: ");
        n1 = leer.nextInt();
        System.out.println("Introduce el segundo número: ");
        n2 = leer.nextInt();
        System.out.println("Introduce el tercer número: ");
        n3 = leer.nextInt();

        System.out.println("Los números de mayor a menor son: ");

        if ((n1 >= n2) && (n2 >= n3)) {
            System.out.println("El orden es: " + n1 + " " + n2 + " " + n3);
        } else if ((n1 >= n3) && (n3 >= n2)) {
            System.out.println("El orden es: " + n1 + " " + n3 + " " + n2);
        } else if ((n2 >= n1) && (n1 >= n3)) {
            System.out.println("El orden es: " + n2 + " " + n1 + " " + n3);
        } else if ((n2 >= n3) && (n3 >= n1)) {
            System.out.println("El orden es: " + n2 + " " + n3 + " " + n1);
        } else if ((n3 >= 1) && (n1 >= n2)) {
            System.out.println("El orden es: " + n3 + " " + n1 + " " + n2);
        } else if ((n3 >= n2) && (n2 >= n1)) {
            System.out.println("El orden es: " + n3 + " " + n2 + " " + n1);
        }
    }
}
