//EJERCICIO 1 - //Dados dos números introducidos por pantalla, calcular su suma, resta y promedio

package 1PrimerTrimestre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float a, b, suma, resta;
        float promedio;
        //Creamos 5 variables tipo float para que el usuario introduzca valores decimales.
        // Se crean las variables a (como numero 1) y b (como numero 2), aparte las variables para el resultado suma, resta y promedio.
        
        System.out.println("Introduzca un valor para a");
        a = leer.nextFloat();
        //Se muestra en pantalla al usuario la instrucción y se indica al programa que se va a introducir la variable a por consola por el usuario.
        
        System.out.println("Introduzca un valor para b");
        b = leer.nextFloat();
        // Lo mismo para la variable b.
        //Se indica lo que es la suma y la resta.
        suma = a + b;
        resta = a - b;
        promedio = suma / 2;//la suma de los dos valores entre la el total de valoras
        
        //Se le da a las variables suma y resta los valores de los resultados.
        //Se le da a la variable promedio el valor del promedio y se muestran por pantalla concatenando.
        
        System.out.println("La suma de a + b es: " + suma);
        System.out.println("La resta de a-b es: " + resta);
        System.out.println("El promedio entre los dos valores es: " + promedio);
    }

}
