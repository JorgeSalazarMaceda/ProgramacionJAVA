package variante;

import java.util.Scanner;

public class VARIANTE {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int a, b, suma, resta;

        System.out.println("diga la cantidad de a");
        a = leer.nextInt();

        System.out.println("diga la cantidad de b");
        b = leer.nextInt();

        System.out.println("Introduzca operación (+,-):");

        String operacion;
        operacion = leer.next();

        if (operacion.equals("+")) {
            System.out.println("El resultado de la suma de a+b es: " + (a + b));
        } else if (operacion.equals("-")) {
            System.out.println("El resultado de la resta de a-b es: " + (a - b));
        } else {
            System.out.println("Error");
        }

//        System.out.println("diga si desea sumar");
//        suma=leer.nextInt();
//        
//        System.out.println("diga si desea restar");
//        resta=leer.nextInt();
//        suma=(a+b);
//        
//        resta=(a-b);
//        System.out.println("El resultado de la suma es;" + suma);
//        System.out.println("El resultado de la resta es;" + resta);
    }

}
