//Método para calcular si un número es perfecto. Un nº se dice que es perfecto
//cuando la suma de cada uno de los dígitos elevado al nº de dígitos da como
//resultado el mismo número.
//Por ejemplo el 153 = 1elevado a 3 + 5 elevado a 3 + 3 elevado a 3
//En el main realizar un programa que determine que números entre el 1 y el
//1000 son perfectos.
package funcioneschema;

import java.util.Scanner;

public class METODONUMPERFECTO {

    public static void main(String[] args) {


      int i, suma = 0, numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        for (i = 1; i < numero; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
            if (numero % i == 0) {
                suma = suma + i;   // si es divisor se suma
            }
        }
        if (suma == numero) {           // si el numero es igual a la suma de sus divisores es perfecto                
            System.out.println("Perfecto");
        } else {
            System.out.println("No es perfecto");

        }
    }

}
