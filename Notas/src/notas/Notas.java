package notas;

import java.util.Scanner;

public class Notas
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        /** de 0 a 4 insuficiente
        * 5 es suficiente
        * 6 es bien
        * 7 y 8 es notable
        * 9 y 10 sobresaliente.
        */
        int nota;
        
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese la nota:");
        nota=leer.nextInt();
        
        if (nota<5){
        System.out.println("Insuficiente");
        }
        else if (nota==5){
        System.out.println ("aprobado");
        }
        else if (nota==6){
       System.out.println ("bien");
        }
        else if ((nota==7) || (nota==8)){
       System.out.println ("notable");
        }
        else if ((nota==9) || (nota==10)){
       System.out.println ("sobresaliente");            
        }   
    }
}
