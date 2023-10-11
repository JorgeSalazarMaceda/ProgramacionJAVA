//Introduce por teclado un numero n; a continuacion, solicita al usuario quee teclee n numeros.
//Realiza la media de los numeros positivos, la media de los negativos y cuenta el numero de ceros introducidos.
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Actividad53Pag136 {
    public static void main(String[] args) {
           int longitud, numero, mediapositivo=0, medianegativo=0, cero=0;
           int positivo=0, negativo=0;
            Scanner leer=new Scanner (System.in);
            
            System.out.println("Introduce longitud: "); //Pedimos al usuario la longitud del array
            longitud=leer.nextInt();
            
            int array[]=new int [longitud]; //creamos una tabla o array de tipo entero que tendrá la longitud dada por usuario
            
            for (int i = 0; i < array.length; i++) { //Se recorre el array y se pregunta celda a celda que valor tendrá
                System.out.println("Introduce los valores para cada posicion de i: " + i);
                numero=leer.nextInt();
                array[i]=numero; //array de i (que es el indice) es = al numero.
                System.out.println(array[i]);
                
        }
            for (int i = 0; i < array.length; i++) { //Ahora recorremos para ver la media positivos, negativos y contador de 0
            if(array[i]>0){
                mediapositivo+=i/longitud;
            }
            else if (array[i]<0){
                medianegativo+=i/longitud;
            }
            else{
                
                cero+=i;
            }
        }
    }
 
}
