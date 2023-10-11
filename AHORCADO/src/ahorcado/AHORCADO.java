package ahorcado;

import java.util.Scanner;

public class AHORCADO {

    public static void main2(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra = "aloha", resultado = " ";
        char letra;
        //*abrimos variables con la palabra a adivinar, el resultado y otra char para las letras que introduzca.

        for (int i = 5; i > 0; i--) {
            System.out.println("Introduce una letra: ");
            letra = leer.next().charAt(0);
            int j = 0;
            if (palabra.indexOf(letra) >= 0) {
                while (j < palabra.length()) {
                    if (palabra.charAt(j) == letra) {
                        System.out.print(letra);
                    } else {
                        System.out.print("_");
                    }

                    j++;
                }
            } else {
                System.out.println("No existe esa letra en la palabra");
                System.out.println();
                System.out.println("Te quedan " + i + " intentos");
            }
        }
        System.out.println("Introduce la palabra final: ");
        resultado = leer.next();
        if (resultado.equals(palabra)) {
            System.out.println("Enhorabuena, has acertado!!!");
        } else {
            System.out.println("Sigue intentándolo");
        }
    }
}
