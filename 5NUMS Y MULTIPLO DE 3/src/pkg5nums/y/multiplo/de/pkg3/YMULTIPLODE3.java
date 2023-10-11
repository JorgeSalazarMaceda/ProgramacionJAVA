//PEDIR POR CONSOLA 5 NÚMEROS Y VER SI SON MULTIPLOS DE 3
package pkg5nums.y.multiplo.de.pkg3;
import java.util.Scanner;
public class YMULTIPLODE3 
{

    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        int numero;
        numero=leer.nextInt();
        int contador=0;
 
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un número: ");
            numero=leer.nextInt();
            
            if (numero%3==0){
                contador=contador++;
                System.out.println("Es múltiplo de 3");
                
            }
            else {
                contador=contador;
                System.out.println("No es múltiplo de 3");
                }
            
        }
        System.out.println(numero+" de los números introducidos son multiplos de 3");
        
    }
}
