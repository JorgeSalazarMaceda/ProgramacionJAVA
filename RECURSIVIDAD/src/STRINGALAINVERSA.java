//INVIERTE STRING, SI INTRODUZCO EL PARAMETRO HOLA SALDRÁ ALOH.

import java.util.Scanner;

public class STRINGALAINVERSA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String palabra;

        System.out.println("Introduce palabra: ");
        palabra = leer.next();
//        System.out.println(palabra.substring(0, palabra.length()-1));
//        System.out.println(invierteString(palabra));
//        System.out.println(palabra);
        invierteString(palabra);
        System.out.println("");
////        System.out.println(invierteStringVersion2(palabra));
//        System.out.println("");

//        for(int i = palabra.length() -1; i >= 0 ; i--) {
//            System.out.print(palabra.charAt(i));
//        }
//        
//        System.out.println("");
    }

    public static void invierteString(String palabra) {
        if (palabra.length() == 1) {
            System.out.print(palabra.charAt(0));
        } else {
            char letra = palabra.charAt(0);
            invierteString(palabra.substring(1, palabra.length()));
            System.out.print(letra);
//Cogemos nuestro caso base, que es si palabra es == 1 porque palabra.length == 1 dice que de la longitud de la palabra, quedate con el caracter 1
//En ese caso imprime char de 0, porque en el caso base, en recursividad, de hola, el base es la a porque se han ido quitando letras.
//Si no estamos en el caso de que la palabra sea 1, vamos al else.
//Aquí tenemos la variable letra que es = a de toda la palabra, el char de 0 (la primera) que es la que queremos apartar.
//La función coge con sub string el resto (desde 1 hasta el final, de hola el char 0 es la h y el substring es ola.
//Se quedará guardada la h y la función continuará hasta llegar al caso base que es la a
//Cuando llegue a la a impromirá las letras en el orden inverso.

        }
    }

//    public static String invierteStringVersion2(String palabra){
//        if(palabra.length()==1){
//            return palabra.substring(0, 1);
//        }
//        else {
//            String letra = palabra.substring(0,1);
//            String trozo = palabra.substring(1, palabra.length());
//            return invierteStringVersion2(trozo) + letra;
//        }
//    }
}
