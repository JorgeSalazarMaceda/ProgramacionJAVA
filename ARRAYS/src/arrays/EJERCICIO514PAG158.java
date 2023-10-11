//El Ayuntamiento de tu localidad te ha encargado una aplicacion que ayude a realizar encuestas estadisticas
//para conocer el nivel adquisitivo de los habitantes del municipio.
//Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori,
//no conoces el numero de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1.
//Una vez terminada la entrada de datos, muestra la siguiente información:
//Todos los sueldos introducidos ordenados de forma decreciente.
//El sueldo maximo y minimo.
//La media de los sueldos.
package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EJERCICIO514PAG158 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int sueldo = 0;

        //La primera dificultad es que no sabemos el tamaño que va a tener el array. Por eso lo iniciamos con 0 posiciónes y luego, se incrementará cada sueldo que metas
        int sueldos[] = new int[0];

        while (sueldo > -1) { //el -1 es para salir del bucle o cualquier número negativo.
            System.out.println("Introduce los sueldos: ");
            sueldo = leer.nextInt();
            if (sueldo > -1) { //Ponemos el if, porque no queremos que nos añada dentro del array el -1
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1); //Creamos una copia del array, la primera posicion es 0, la cual se irá incrementando segun metas sueldos (+1)
                sueldos[sueldos.length - 1] = sueldo; // Ahora guardamos el sueldo en la última posición libre del array que es length -1.
                //sueldos[sueldos.length - 1] = sueldo; aquí, en vez de poner contadorSueldos++, hemos puesto esto anterior para que en vez de sobreescribir 
                //y machacar los valores en posicion de 0, hemos puesto que llo escriba en length - 1 (que es la ultima posicion del array copiado).
            }

        }
        //Ya tenemos el array que nos pide los sueldos y en cada celda los introduce.
        //Ahora con funciones vamos a resolver los tres problemas.
        if (sueldos.length == 0) {//Este if es por si sueldos.length es 0 es que no hay sueldo y no hay necesidad de mostrar nada por lo que no entramos en las funciones
            System.out.println("No hay sueldos");
        } else {
            ordenaSueldosDecreciente(sueldos);
            maxYmin(sueldos);
            media(sueldos);
            System.out.println(Arrays.toString(sueldos));
        }
    }

    static void ordenaSueldosDecreciente(int tabla[]) {
        int tmp; //Usamos el metodo burbuja (cambiando el condicional de j<tabla.length (en vez de j>tabla.length que es creciente) para que nos de decreciente el array de sueldos)
        //Tmp es temporal, el auxiliar para el intercambio de variables.
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - 1; j++) {
                if (tabla[j] < tabla[j + 1]) {
                    tmp = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = tmp;
                }
            }
        }
    }

    static void maxYmin(int tabla[]) {
        int max = 0; //Porque es una premisa inicial, porque el maximo en un principio puede ser 0 y luego se iria incrementando con el bucle
        int min = Integer.MAX_VALUE; //La premisa inicial es que puede ser el numero mayor posible (entero) y con los condicionales los vamos sustituyendo en el array
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > max) { //si tabla en posicion i es mayor que maximo, se sustituye el maximo que habia por el anterior, en la primera vuelta era 0
                max = tabla[i];
            }
            if (tabla[i] < min) { //si tabla en posicion de i es menor que minimo (que es interger.MAX VALUE porque no sabemos el valor que puede tener, entonces metemos el valor maximo) y se va sustituyendo
                min = tabla[i];
            }
        }
        System.out.println("El sueldo máximo es: " + max); //Los mostramos
        System.out.println("El sueldo mínimo es: " + min);
    }

    static void media(int tabla[]) {
        int sumaSueldos = 0;
        for (int i = 0; i < tabla.length; i++) {
            sumaSueldos += tabla[i];
        }

        System.out.println("La media de los sueldos es: " + (sumaSueldos / tabla.length));
    }
}
