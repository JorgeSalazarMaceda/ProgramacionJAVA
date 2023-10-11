
package num.suerte;
import java.util.Scanner;
public class NUMSUERTE
{

    public static void main(String[] args)
    {
       int resultado, numeroAcumulado = 0, numero = 0;
       int suma=0;
        
        Scanner ingrese = new Scanner(System.in);
        
        System.out.println("Ingrese el dia: ");
        int dia = ingrese.nextInt();
        
        System.out.println("Ingrese el mes: ");
        int mes = ingrese.nextInt();
        
        System.out.println("Ingrese el año: ");
        int año = ingrese.nextInt();
        
        resultado = dia + mes + año;
        System.out.println(resultado);
        
        for (int i = 0; i < resultado; i++) {
            suma = suma + numero;
            
        }
        System.out.println(suma);
        
       
            
        }
    }
 
