/*
2. Leer 10 números enteros por teclado y mostrarlos en el siguiente orden: el primero,
el último, el segundo, el penúltimo, el tercero, ...
 */
package arrays;

/**
 *
 * @author Jorge
 */
import java.util.Arrays;
import java.util.Scanner;

public class Practicas_2 {

    //Tenemos el array a, el que introducimos en Scanner.
    //Tenemos el array b, el que será invertido.
    //Tenemos el array c, el del resultado.
    
    public static int[] listaInvertidaMixta(int[]a){ //El array lista del main es a, b será a invertido y c el nuevo array
        int[] b=new int[a.length]; //array al revés. Su longitud será la del array de a, introducido por parámetro
        int[] c=new int [a.length]; // array que va a contener la combinación y tambien tendrá la misma longitud de a
        int i=0; //inicializamos i en 0 y hacemos un for each, porque este ya nos muestra los valores del array
        
        for (int vector:a){ 
            b[(a.length-1)-i] = vector; //Esto es el array b, que se imprimirá descendiente gracias al -i
            i++;
        }
        System.out.println(Arrays.toString(b)); //Lo imprimimos
        //Hacemos un bucle para recorrer a y aplicar las condiciones 
        //para indicar en array c los elementos que llevarán sus posiciones segun sean par (llevarán array b) e impar (llevarán array a)
        for (int j = 0; j < a.length; j++) {
            if(j%2==0){
                c[j] = b[j]; //(Si array c de j está en posicion par, pondrá el valor del array b, si no, el de a)
            }
            else{
                c[j]=a[j];
            } 
        }
        return c;
    }
    public static void main(String[] args) {
        int[]lista=new int[10];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Introduce tus números: ");
            lista[i]=sc.nextInt();
        }
        System.out.println("Lista loca: " + Arrays.toString(listaInvertidaMixta(lista)));
    }
    
    
    //Método sacado de internet
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i, t[];
//        int array[] = new int[10];
//        for (i = 0; i < array.length; i++) {
//            System.out.print("Introduzca numero: ");
//            array[i] = sc.nextInt();
//        }
//
//        System.out.println("El resultado es:");
//        for (i = 0; i <= 4; i++) {
//            System.out.println(array[i]); // mostramos el i-ésimo número por el principio
//            System.out.println(array[9 - i]); // y el i-ésimo por el final
//        }
//    }
}
