package a21;

//EJERCICIO 21// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos
  import java.util.Scanner;  
public class PRIMOSVERSIONBUENA {
    
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        int numero;
        boolean primo=false;
        
        System.out.println("Introduce un número: ");
        numero=leer.nextInt();
        
        for (int i = 2; i <= numero; i++) {
            if(numero%2==0);
            primo=true;
            
        }
    }
    
}
