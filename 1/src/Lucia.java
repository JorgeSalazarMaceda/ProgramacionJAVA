/*
Programa que muestre las tablas de multiplicar del 1 al 10
 */

/**
 *
 * @author Jorge
 */
public class Lucia {
public static void main(String[]args) {
    for (int i = 1; i <=10; i++) {
        for(int j=1;j<=10;j++){
            int result=i*j;
            System.out.println("El resultado de la operación es "+i+ "*"+j+ "="+result );
        }
    }
} 
}
