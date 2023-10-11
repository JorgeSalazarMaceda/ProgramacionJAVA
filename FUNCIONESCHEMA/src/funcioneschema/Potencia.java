package funcioneschema;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero, exponente, resultado;

        System.out.println("Introduce número para calcular su potencia: ");
        numero = leer.nextInt();
        System.out.println("Introduce potencia: ");
        exponente = leer.nextInt();

        resultado = potencia(numero, exponente);
        System.out.println("El resultado es: " + resultado);
    }

    public static int potencia(int numero, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * numero;
        }
        return resultado;
    }

}
