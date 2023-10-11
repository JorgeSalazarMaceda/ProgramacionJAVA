//EJERCICIO 23 //Dibuja un cuadrado de n elementos de lado utilizando *. Los n elementos los introduce el usuario por pantalla
package a23;

import java.util.Scanner;

public class A23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

//        int alto, ancho;
//
//        System.out.println("Introduzca la altura: ");
//        alto = leer.nextInt();
//
//        System.out.println("Introduzca la anchura: ");
//        ancho = leer.nextInt();
//        // El usuario introduce alto y ancho
//        //Se hace un bucle for donde se van a recoger los system our print de alto
//        //Se le anida otro buce for para el ancho y ahí se le da a imprimir asteriscos, (print sin ln para que no haga el salto de linea)
//        //Cuando salga de este bucle (al dejar de imprimir el ancho) volverá al primer for y hará los saltos de linea
//        //La altura, es decir, el primer for, vale 1, ¿se cumple? si, 1 es menor que la altura introducida.
//        //Pues pasamos al segundo bucle... j es 1, se cumple ya que es menor que la anchura introducida, entonces imprime *
//        //Se imprime * en la misma linea
//        //Y volvemos a hacer el segundo bucle mientras se cumpla la condicion, es decir que j sea <= que la anchura introducida e imprimira toda la linea.
//        //Cuando no se cumpla la condicion del segundo bucle, volverá al primero y mientras se cumpla no saldrá de ahí. Volerá al segundo para hacer otra linea.
//        //Así van haciendo las lineas. Digamos que el primer for dice el número de lineas que hará.
//        for (int i = 1; i <= alto; i++) {
//            for (int j = 1; j <= ancho; j++) {
//                System.out.print(" * ");
//                //Con espacios
//            }
//
//            System.out.println("");
//        }   // salto de linea


//           T R I A N G U L O 
        int filas;

        System.out.println("Ingresa la cantidad de filas del triangulo: ");
        filas = leer.nextInt();

        for (int i = 1; i <= filas; i++) {
            //Espacios
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            for (int asteriscos = 1; asteriscos <= (i * 2) - 1; asteriscos++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
