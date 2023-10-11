// EJERCICIO 15 // LEER UN NÚMERO Y MOSTRAR SU CUADRADO, REPETIR EL PROCESO HASTA QUE SE INTRODUZCA UN Nº NEGATIVO

package practicar;
import java.util.Scanner;
public class PRACTICAR {

    public static void main(String[] args) {
//        int numero,cuadrado;
         Scanner leer = new Scanner(System.in);
//        
//        System.out.println("Introduce numero");
//        numero=leer.nextInt();
//      while(numero>=0){
//            cuadrado=(int)Math.pow(numero, 2);
//             System.out.println(cuadrado);
//                 System.out.println("Introduzca otro número (Número negativo = Fin de programa): ");
//            numero = leer.nextInt();
//      }
//        System.out.println("Fin");
     int numero=1;
     
     int resultado;
     while (numero>0){
     
        System.out.println("Introduce numero: ");
        numero=leer.nextInt();
        resultado=numero*numero;
        System.out.println("El resultado de: " + numero + " elevado al cuadrado es: " +resultado);
    }
        System.out.println("Fin de programa");
    }

}
