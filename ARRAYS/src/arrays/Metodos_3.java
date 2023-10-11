/*
Diseñar un método que muestre en binario un número entre 0 y 255. Hacer un
programa que haga uso de dicho método eligiendo por teclado el número a convertir.
 */
package arrays;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;

public class Metodos_3 {

    public static String pasarBinario(int numero) {

        int modulo, auxiliar;
        String binario = "";
        auxiliar = numero; //Para guardar el valor original del numero decimal e imprimirlo en pantalla
        while (numero > 0 && numero <=255) {
            modulo = (numero % 2);
            binario = modulo + binario; //Es un String, podemos convertir binario a texto y binario no sumará nada
            numero = numero / 2; //Divimos numero entre 2 y numero tendrá un nuevo valor, así se ejecutará el bucle hasta que numero sea 0
        }
        return binario;
    }

    public static void main(String[] args) {
        //Partimos de la base 2 y sus correspondientes exponentes
        // 255 es 1111 1111

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un número decimal: ");
        numero = sc.nextInt();

        System.out.println("El binario del numero: " + numero + " es: " + Metodos_3.pasarBinario(numero));
        
        
        //OTRA VERSIÓN

//        int array[] = new int[8]; //Ponemos 8 porque son 8 bits para los números de 0 a 255
//        int contador = 0;
//        int numero;
//
//        System.out.println("Introduce un número decimal: ");
//        numero = sc.nextInt();
//
//        if (numero < 0 || numero > 255) {
//            System.out.println("El número se encuentra fuera del rango del 0 al 255");
//        } else { //Si el rango es correcto, lo hacemos en el else
//            if (numero == 0) {
//                //El numero introducido es 0? Si es así, se guarda en la posición 0 por el contador
//                array[contador] = 0;
//                contador++;// Contador aumenta en caso de que haya entrado el if
//            }
//            //Si no metemos 0, entramos en el while, porque es diferente de 0
//            while (numero != 0) {
//                array[contador] = numero % 2; //En caso de que se haya introducido numero !=0, hacemos modulo y el residuo se almacena
//                numero = numero / 2;
//                contador++; //Contador aumenta en caso de que haya entrado el while, es decir, se haya metido un numero !=0 y no haya entrado el if anterior
//                //El while se va a estar ejecutando mientras el número sea distinto de 0
//                //Por ejemplo, metemos 4, el residuo de 4 es 0, ese 0 se almacenará en array[contador]
//                //Ahora numero ya no sería 4, seria 2, porque numero = numero / 2, que en este caso seria 2, 4/2 es 2 y el contador aumenta (La posicion)
//                //Se hace la misma operacion con 2, 2/2 el residuo es 0, se almacena en la posicion siguiente.
//                //Ahora el numero es 2/2 que es 1, por lo que numero es 1 
//                //Se hace la misma operacion con 1, 1/1 el residuo es 1 aumenta la posicion y se almacena en la posición.
//                //Ahora numero seria 1/2 (como hablamos de int) ya quedaria 0 y ya no es distinto de 0, finaliza el while
//            }
//            System.out.print(" En binario es: ");
//
//            for (int i = contador - 1; i >= 0; i--) {
//                System.out.print(array[i]);
//                System.out.print("");
//            }
//            //Hacemos el bucle para mostrar
//            //iniciamos i en el final -1 para mostrar nuestro array al revés, desde la posición ultima, hasta la posición 0.
//            //En binario es así, y se tiene que mostrar como un decremento.
//        }
    }

}
