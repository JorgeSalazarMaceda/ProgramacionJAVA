//SE LE PIDE AL USUARIO CUANTOS NUMEROS TIENE QUE INTRODUCIR, POR EJEMPLO 5 Y UNA VEZ ESCRITO QUE DIGA EL MAYOR
package buclefornummayor;
import java.util.Scanner;
public class BUCLEFORNUMMAYOR 
{
    public static void main(String[] args)
    {
    Scanner leer=new Scanner (System.in);
    
    int maximo;//*VARIABLE DE NUMEROS MÁXIMOS A ANALIZAR/
    int num; //* VARIABLE DE NUMERO EN SÍ/
    int mayor=0; //*VARIABLE MAYOR/
    int cont; //+CONTADOR PARA EL FOR, PARA QUE CUENTE EL BUCLE DESDE 0 HASTA LA CANTIDAD QUE HAS MARCADO (MAXIMO)
//                Y VAYA INCREMENTANDO
        System.out.println("Inserte el máximo de números a analizar: ");
        maximo=leer.nextInt();
        
        for (cont=0; cont < maximo;cont++){
            System.out.println("Inserte un número: ");
            num = leer.nextInt();
            if(num>mayor)
                mayor=num;
        }
            System.out.println("El valor mayor es: " +mayor);
    }
    
}
