//Modifica la actividad de aplicacion 5.12 para que la funcion no modifique la tabla que se pasa como parametro y en su lugar
//cree y devuelva una copia de la tabla donde se han desordenado los valores de los elementos.
package arrays;

import java.util.Arrays;
import java.util.Random;

public class EJERCICIO513PAG158 {

    public static void main(String[] args) {
        int lista[] = {1, 2, 3, 4, 5};
        lista = desordenar(lista);
        System.out.println(Arrays.toString(lista));
    }

    static int[] desordenar(int lista[]) {
//        int copia[] = new int[lista.length]; //Iniciamos un nuevo array de la copia con la longitud de lista, 
//en vez de que sea un array vacio, ya esta relleno con copia de lista y su longitud
        int copia[] = Arrays.copyOf(lista, lista.length); //Iniciamos un nuevo array de la copia con la longitud de lista
        Random miRandom = new Random(); //Metodo para realizar un random. Es un objeto.
        for (int i = 0; i < copia.length; i++) { //Recorre el array copia
            int posAleatorio = miRandom.nextInt(copia.length); //Usamos el método nextInt del objeto miRandom para generar el numero aleatorio
            System.out.println(posAleatorio); //Simplemente lo muestro para ver como voy y que el aleatorio efectivamente lo es.(lo vertical)

            int numero1 = copia[i]; //Tenemos el numero1 con el valor inicial para intercambiar en la posicion que indica el bucle (i)
            int numero2 = copia[posAleatorio]; //tenemos el valor (numero2) por el que vamos a intercambiar en la posicion aleatoria.
            copia[i]=numero2;
            copia[posAleatorio]=numero1;

//            lista[i] = numero2; //queremos meter en la posicion en la que estamos el valor de la posición aleatoria.
//            lista[posAleatorio] = numero1; //Ahora queremos accede a la posición aleatoria lista[posAleatorio], y guardar el numero inicial (numero1).
        }
        return copia;
    }
}
