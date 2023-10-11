package suma.de.enteros;

import java.util.Scanner;

public class SumaDeEnteros {

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        
        int num1, num2, suma;

        System.out.println ("inserte num 1:");
        num1 = leer.nextInt();
        
        System.out.println ("inserte num 2:");
        num2 = leer.nextInt();
        suma= num1+num2;
        
        System.out.println ("El resultado de la suma es:" + suma);
    }
}       
