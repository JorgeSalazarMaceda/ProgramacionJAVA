//FUNCION BORDE, RODEA LA PALABRA HOLA CON ASTERISCOS
package funcionborde;

import java.util.Scanner;

public class FUNCIONBORDE {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra = "HOLA";

//        for (int i = 1; i <= palabra.length() + 2; i++) {
//            System.out.print("*");
//        }
        imprimirAsteriscos(palabra);
        System.out.println("");
        System.out.println("*" + "HOLA" + "*");

//        for (int j = 1; j <= palabra.length() + 2; j++) {
//            System.out.print("*");
//        }
        imprimirAsteriscos(palabra);
        System.out.println("");
    }

    //AHORA CON FUNCIONES
    public static void imprimirAsteriscos(String palabra) {
        for (int i = 1; i <= palabra.length() + 2; i++) {
            System.out.print("*");
        }
    }

}
