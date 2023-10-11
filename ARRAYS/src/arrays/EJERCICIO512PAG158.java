//Escribe la funcion void desordenar (int t[]), que cambia de forma aleatoria los elementos contenidos en la tabla t.
//Si la tabla estuviera ordenada, dejaria de estarlo.
package arrays;

import java.util.Arrays;
import java.util.Random;

public class EJERCICIO512PAG158 {
    public static void main(String[] args) {
       int lista[] = {1,2,3,4,5};
        desordenar(lista); //Como es void, no devuelve nada, luego no necesitamos return, los cambios se hacen directamente en la funcion sobre la variable lista.
        System.out.println(Arrays.toString(lista)); 
    }
    static void desordenar(int lista[]){
          Random miRandom = new Random(); //Metodo para realizar un random. Es un objeto.
       for (int i = 0; i < lista.length; i++) { //Recorre el array
            int posAleatorio= miRandom.nextInt(lista.length); //Usamos el método nextInt del objeto miRandom para generar el numero aleatorio
            System.out.println(posAleatorio); //Simplemente lo muestro para ver como voy y que el aleatorio efectivamente lo es.(lo vertical)
            
           
            int numero1 = lista[i]; //Tenemos el numero1 con el valor inicial para intercambiar en la posicion que indica el bucle (i)
            int numero2 = lista[posAleatorio]; //tenemos el valor (numero2) por el que vamos a intercambiar en la posicion aleatoria.
            lista[i]=numero2; //queremos meter en la posicion en la que estamos el valor de la posición aleatoria.
            lista[posAleatorio]=numero1; //Ahora queremos accede a la posición aleatoria lista[posAleatorio], y guardar el numero inicial (numero1).
       }
       
    }
}

//       for (int numero : lista) { es el for each, es lo mismo que el for normal pero aqui en vez de indices es el valor llamado numero.
//           System.out.println(numero);
//       }

// int num1 = 19, num2 = 22; para realizar un intercambio de valores, entre dos variables abrimos un auxiliar para guardar el primer valor.
//            int aux = 0;
//            aux = num1;
//            num1 = num2;
//            num2 = aux;