package a23;

import java.util.Scanner;

public class Conletras {

    public static void main(String[] arg) {
        Scanner leer = new Scanner(System.in);

        //Aqui estabamos cometiendo un error y salia:
        //aaaa
        //bbbb
        //cccc
        //dddd
        
        // Necesitamos que salga abcd 4 veces
        //Eso es porque en el bucle 2, el anidado, poniamos que se imprimiera i, y la i es el salto, en vez de j, j va a hacer el bucle de a,b,c,d. y el otro el salto
        for (int i = 1; i <= 4; i++) {
            for (char j = 'a'; j <= 'd'; j++) {
                System.out.print(j);
                //Con espacios

            }

            System.out.println("");
        }   // salto de linea
    }
}
