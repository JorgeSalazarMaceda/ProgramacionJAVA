/*
4. Leer 10 enteros ordenados crecientemente. Dar un numero N y buscarlo en la tabla.
Se debe mostrar la posición en la que se encuentra. Si no está, indicarlo con un
mensaje.
 */
package arrays;

/**
 *
 * @author Jorge
 */
//Hacerlo con el for//
import java.util.*;
import java.util.Scanner;

public class Practicas_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int Clave;
        int indice = 0;
        boolean encontrar = false;

        //Introducir los números en el array a
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese los números del array a: ");
            a[i] = sc.nextInt();
        }
        System.out.println("");
        
        //Ordenar el array
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        //Perir número clave para buscar
        System.out.println("Ingrese otro número que será la clave de búsqueda: ");
        Clave = sc.nextInt();

        //Recorremos el array con un for y metemos la condición de si clave == a[i], es decir, está en array, dinos la posicion indice=i y que es true
        for (int i = 0; i < a.length; i++) {
            if (Clave == a[i]) { //Si clave está en alguna posicion del a[i]
                indice = i; //Para que nos diga la ubicacion
                encontrar = true;
                System.out.println("El numero " + Clave + " Se encuentra en la ubicación " + indice);
            }
        }
        System.out.println("");

        if (encontrar = true) {
            System.out.println("El numero " + Clave + " Se encuentra en la ubicación " + indice);
        } else {
            System.out.println("El numero :" + Clave + " No se encuentra en el sistema");
        }
    }
}


//  Otra alternativa
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int array[]=new int[5];
//        int clave;
//        int posicion=0;
//        boolean encontrado = false;
//        
//        //For para introducir los valores del array
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Ingrese los valores del array: ");
//            array[i]=sc.nextInt();
//        }
//        System.out.println("");
//        
//        //Ahora introducimos el valor clave que habrá que buscar
//        System.out.print("Ingrese el valor a buscar: ");
//        clave=sc.nextInt();
//        
//        //Ahora hacemos otro for para recorrer el array y ver si está la clave
//        for (int i = 0; i < array.length; i++) {
//            if(clave==array[i]){
//                posicion=i; //Con esto, en el print posterior sabremos la posicion en la que está del array
//                encontrado=true;
//            }
//            else{
//                
//                encontrado=false;
//            } 
//        }
//        //Mostramos por pantalla
//        if(encontrado=true){
//            System.out.println("El numero " + clave + " Está en la posición " + posicion ); //????? CUANDO NO ESTÁ TE DICE EN LA POSICION 0.......
//        }
//        else{
//            System.out.println("El numero :" + clave + " No está en el array");
//        }
//        System.out.println("");
//System.out.println("------------Lo vemos con BinarySearch--------------");
//System.out.println("La posicion donde esta: " + Arrays.binarySearch(array,clave));   //Esto te devuelve, si está, la posicion donde esta.
//Esta formula es para que nos diga donde iria el que no se encuentra, hemos hecho clave dos para ver la opcion que no esta
//        System.out.println("La posición donde se tiene que insertar es: " + (-(Arrays.binarySearch(array,clave))-1)); 
//        //Ahora lo hacemos con una condicion, si lo encuentra te dice donde esta, si no, te dice donde deberia estar
//        
//        //busqueda=Arrays.binarySearch(array,clave);
//        if(clave>0){
//            System.out.println(clave);
//        }
//        else{
//            System.out.println("No se encuentra en el array");
//            System.out.println("La posición donde debe insertarse es: " + (posicion));
//        }
//    }
//}
//El binary search
// public static void main(String[] args) {
//        int busqueda;
//        int clave;
//        int clave2=8;
//        int array[]={1,2,3,4,5,11,12,13,14,15};
//        Scanner sc = new Scanner (System.in);
//           System.out.println("Dime tu clave de búsqueda: ");
//           clave=sc.nextInt();
//        
//        System.out.println("La posicion donde esta" + Arrays.binarySearch(array,clave));   //Esto te devuelve, si está, la posicion donde esta.
//        //Esta formula es para que nos diga donde iria el que no se encuentra, hemos hecho clave dos para ver la opcion que no esta
//        System.out.println("La posición donde se tiene que insertar es: " + (-(Arrays.binarySearch(array,clave2))-1)); 
//        //Ahora lo hacemos con una condicion, si lo encuentra te dice donde esta, si no, te dice donde deberia estar
//        
//        //busqueda=Arrays.binarySearch(array,clave);
//        
//        if(clave>0){
//            System.out.println(clave);
//        }
//        else{
//            System.out.println("No se encuentra en el array");
//            System.out.println("La posición donde debe insertarse es: " + (-clave-1));
//        }
//    }
//Arrays: Averigua el orden de un array
//Construye una función que reciba un array de números enteros y devuelva un valor entero con tres posibilidades:
//1 si está ordenado en orden creciente
//-1 si está ordenado en orden decrecente
//0 si no tiene orden
//Desde la función principal le pasarás un array con 5 números enteros (los pones tú a mano) y desde dicha función se imprimirán los siguiente resultados según corresponda:
//
//El array [aquí se imprime al contenido del array] está ordenado de forma creciente.
//El array [aquí se imprime al contenido del array] está ordenado de forma decreciente.
//El array [aquí se imprime al contenido del array] no tiene orden.
//
//
//Ejemplo:
//El array [50, 40, 31, 8, 1] está ordenado de forma decreciente
//El array [50, 54, 57, 80, 110] está ordenado de forma decreciente
//El array [34,14,345,1,23,3] no tiene orden
//
//
//SOLUCIÓN EN JAVA:
//package ordenarrays;
//
//public class OrdenArrays {
//
//    //Esta función averigua el orden del array que se le pasa como parámetro
//    //  1 Si está ordenado de forma creciente
//    // -1 Si está ordenado de forma decreciente
//    //  0 Si no está ordenado
//    static int averiguaOrden(int array[]) {
//        int paresOrdenadosAscendente = 0, paresOrdenadosDescendente = 0, resultado;
//
//        //Recorro todo el array y cuento los pares que hay ordenados de forma creciente
//        //y también cuento los que hay ordenados de forma decreciente
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                paresOrdenadosAscendente++;
//            }
//            if (array[i] < array[i + 1]) {
//                paresOrdenadosDescendente++;
//            }
//        }
//        if (paresOrdenadosAscendente == array.length - 1) {
//            //Si los pares ordenados de forma creciente es igual al total de pares
//            //es porque está ordenado de forma creciente todo el array
//            resultado = 1;
//        } else if (paresOrdenadosDescendente == array.length - 1) {
//            //Si los pares ordenados de forma decreciente es igual al total de pares
//            //es porque está ordenado de forma decreciente todo el array
//            resultado = -1;
//        } else {
//            //En caso contrario, es porque no hay orden
//            resultado = 0;
//        }
//
//        return resultado;
//    }
//
//    public static void main(String[] args) {
//        //Creo un array con valores arbitrarios
//        int array[] = {50, 40, 31, 8, 1};
//        int orden;
//
//        //Hago una llamada a la función para averiguar el orden del array
//        orden = averiguaOrden(array);
//        //Dependiendo del valor que devuelva la llamada a la función tendré
//        //que imprimir el orden correspondiente
//        switch (orden) {
//            case 0:
//                System.out.print("El array "+Arrays.toString(array)+" no tiene orden");
//                break;
//            case 1:
//                System.out.print("El array "+Arrays.toString(array)+" está ordenado de forma decreciente");
//                break;
//            case -1:
//                System.out.print("El array "+Arrays.toString(array)+" está ordenado de forma decreciente");
//                break;
//        }
//    }
//}
