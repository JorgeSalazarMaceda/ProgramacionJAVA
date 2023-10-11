package booleanedadtrue;
import java.util.Scanner;
public class BOOLEANEDADTRUE 
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner (System.in);
        
        int edad;
        
        System.out.println("Escriba su edad");
        edad=leer.nextInt();
        
        boolean mayoredad=edad>=18;
        
        System.out.println("Mayoria de edad" + mayoredad);
    }
    
}
    
    
