package ahorcado;

import java.util.Scanner;

public class Ahorcado2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra = "ALOHA";
        int max_intentos = 9;
        String letra = "";
        String palabra_intento = "";

        // Añadimos un bucle para los intentos
        for (int i = max_intentos; i >= 0; i--) {

            // Pedimos al usuario una letra o una palabra
            System.out.println("Introduzca una letrita o arriesgate: ");
            letra = scanner.nextLine();

            // Si lo que ha introducido el usuario tiene más de un carácter, es que es una palabra
            if (letra.length() > 1) {

                // Miramos si la palabra que ha introducido es la correcta
                if (palabra.equalsIgnoreCase(letra)) {
                    System.out.println("Has acertado!!!!");
                    i = -1; //esto es porque si acertó, hay que salir del bucle for, por eso ponemos i=-1, porque quiere decir que acertó y si es así queremos salir del bucle
                } else {
                    System.out.println("Fallaste, sigue intentándolo!!"); //si no acertó, el programa va al else del primer if, es una letra e iniciamos bucle
                }
            } else { // si no, es que es una letra
                int contador = 0; //ponemos el contador a 0 para comenzar el bucle desde el primer caracter hasta el ultimo (con el metodo lenght.
                while (contador < palabra.length()) {

                    // Gracias al contador (contador++) va viendo caracter por caracter y lo comparamos con lo que escrito el usuario
                    if (palabra.charAt(contador) == letra.charAt(0)) {
                        System.out.print(letra + " "); //en caso de ser correcto lo muestra, sin el ln no hace el salto de linea
                    } else {
                        System.out.print("_ "); // en caso de no ser correcto, muestra guión.
                    }

                    contador++;

                }
            }

            System.out.println(""); //salto de linea
            System.out.println("Te quedan: " + i + " intentos"); //te muestra los intentos restantes con i
            // damos la oportunidad en el último intento de arriesgar al usuario.
            if (i == 0) {
                System.out.println("Es tu último intento, arriesga!");
                System.out.println("Introduce la palabra: ");
                palabra_intento = scanner.nextLine(); //se indica al programa que se va a introducir la variable intento.

                if (palabra.equals(palabra_intento)) { //si la palabra intento coincide con la palabra acierta
                    System.out.println("Has acertado!!!!");
                } else {
                    System.out.println("Perdiste ja ja ja ja");
                }
            }
        }
    }
}

//public static void main(String[] args) {
//
// Declarar variables...
// Pedir letras al usuario
// Pintar guiones
//while(){
//  System.out.println("_ ");
// Verificar que la letra que ha introducido el usuario coincide con la palabra
// if (letra.charAt(contador) == letra.charAt(0)) {
//  ....
// }
//}


//}
