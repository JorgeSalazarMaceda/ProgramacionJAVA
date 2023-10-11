//8 // Hay 2 bombillas apagadas(b1 y b2). Introducir por teclado valores válidos para el día del mes y el mes. 
//Si día del mes y el mes es par encender b1. Si día o el mes es impar encender b2
package defensa;

import java.util.Scanner;

public class DEFENSA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dia, mes;

        System.out.println("Introduce que dia es: ");
        dia = leer.nextInt();
        System.out.println("Introduce que mes es: ");
        mes = leer.nextInt();
        
        while ((dia < 1 || dia > 31) || (mes < 1 || mes > 12)) {
            System.out.println("Te has equivocado, introduce que dia es (El rango posible es de 1 a 31): ");
            dia = leer.nextInt();
            System.out.println("Te has equivocado, introduce que mes es (El rango posible es de 1 a 12): ");
            mes = leer.nextInt();
        }
        
            boolean bombilla1=(dia%2==0 && mes%2==0)==true;
            boolean bombilla2=(dia%2!=0 || mes%2!=0)==true;
            
            System.out.println("La bombilla 1: " + bombilla1);
            System.out.println("La bombilla 2: " + bombilla2);
        
           
        
    }
}
