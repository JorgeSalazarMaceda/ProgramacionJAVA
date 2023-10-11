/*
Diseñar un método que diga el numero más alto que haya introducido el usuario de
una matriz unidimensional y hacer un programa que haga uso de dicho método.
 */
package arrays;

/**
 *
 * @author Jorge
 */
import java.util.Arrays;
import java.util.Scanner;

public class BB {
    
   public static int[] arrayRecorrido(int a, int b) {
        //Inicializamos el array, y como no sabemos el length le restamos el numero inicial+1 al numero final para saber la distancia total del array
        //Como el length se empieza a contar desde el 1 en adelante, la resta que nos da, nos faltaría una posición mas, entonces le sumamos a la variable inicio 1.
        //Le metemos con un for los datos para asignar el valor inicial que es a (i=a) hasta que iguale al valor b (fin), esto es para poder asignar al array los valores.
        //j la creamos inicializada en 0 y queremos que la primera posicion a la que le vamos a asignar el valor sea la 0
        int[] array = new int[b - a + 1];
        int j = 0; //Contador //
        for (int i = a; i <= b; i++) {
            array[j] = i;
            j++;
        }
        return array;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inicio;
        int fin;

        System.out.println("Introduce el inicio del array: ");
        inicio = sc.nextInt();
        System.out.println("Introduce el final del array: ");
        fin = sc.nextInt();
        System.out.println(Arrays.toString(Metodos_2.arrayRecorrido(inicio, fin)));
    }
}
