package expediente.x;

import java.util.Scanner;

public class EXPEDIENTEX 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        double num1,num2,suma,resta,multiplicacion,division;
        
        System.out.println("Dame el primer número:");
        num1= leer.nextDouble();
        System.out.println("Dame el segundo número:");
        num2= leer.nextDouble();
        
        suma=num1+num2;
        resta=num1-num2;
        multiplicacion=num1*num2;
        division=num1/num2;
        
        System.out.println("El resultado de la suma es:" + suma);
        System.out.println("El resultado de la resta es:" + resta);
        System.out.println("El resultado de la multiplicacion es:" + multiplicacion);
        System.out.println("El resultado de la division es:" + division);
    }
    
}