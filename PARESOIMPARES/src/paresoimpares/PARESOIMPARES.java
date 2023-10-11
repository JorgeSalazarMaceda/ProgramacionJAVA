package paresoimpares;

import java.util.Scanner;

public class PARESOIMPARES 
{
    public static void main(String[] args)
    {
    Scanner leer=new Scanner (System.in);
    
    double num1,num2;
    //*es ver el resto, si es 0 es par y si no es impar*/
    
    System.out.println("escribe un valor para num1");
    num1=leer.nextDouble();
    
    System.out.println("escribe un valor para num2");
    num2=leer.nextDouble();
    
        if ((num1%2==0)&&(num2%2==0)){
            System.out.println("Los dos números son pares");}
        else
        if ((num1%2!=0)&&(num2%2!=0)){
            System.out.println("Los dos números son impares");}
        else
        if ((num1%2==0)&&(num2%2!=0)){
            System.out.println("Num1 es par pero Num2 es impar");}
        else
        if ((num1%2!=0)&&(num2%2==0)){
            System.out.println("Num1 es impar pero Num2 es par");}
            
    
    
    
        
        
    }
    
}
