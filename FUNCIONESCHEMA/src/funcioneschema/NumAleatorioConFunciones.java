//GeneraAleatorios(cuantos, min, max)
//Método que genera números aleatorios según el valor de cuantos, y
//comprendidos entre el intervalo min y max.
package funcioneschema;

import java.util.Scanner;

public class NumAleatorioConFunciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int cuantos,minimo,maximo;
        
        System.out.println("Introduce cuantos números quieres: ");
        cuantos=leer.nextInt();
        System.out.println("Introduce el mínimo: ");
        minimo=leer.nextInt();
        System.out.println("Introduce el máximo: ");
        maximo=leer.nextInt();
        generaNumAleatorio(cuantos, minimo, maximo);

    }

    static void generaNumAleatorio(int cuantos, int minimo, int maximo) {

        for (int i = 1; i <= cuantos; i++) {
            int resultado = (int) (Math.random() * ((maximo - minimo) + 1) + minimo);
            System.out.println(resultado);
            //Formula para sacar un número aleatorio entre un min y un max
        }
//(MAX-MIN)+1-MIN A VER, MAX Y MIN (COMO ES DOUBLE, NO TENDRIAS NUNCA EL MAXIMO, 
//PORQUE EFECTIVAMENTE TENDRAS 2,9 PERO NUNCA 3, ASI QUE POR ESO SUMAMOS 1, Y COMO HACE EL CASTING, 
//ASI SIEMPRE TENDREMOS EL MAXIMO 3.9 (INT) SERIA  3 + EL MINIMO (QUE ESE CON EL CASTING SIEMPRE LE TENDREMOS).
    }
}
