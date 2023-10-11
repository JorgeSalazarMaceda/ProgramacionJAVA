package edad;
import java.util.Scanner;
public class EDAD 
{

    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        
        int edad;
        
        System.out.println ("digame su edad");
        edad=leer.nextInt();
        
        if (edad<=18){
            System.out.println ("Eres muy joven");}
        
        if ((edad>18) && (edad<=30)){
            System.out.println ("Eres un chaval");}
        
        if ((edad>30) &&(edad<=50)) {
            System.out.println ("Eres todo un hombre");}    
        
        if (edad>50){
            System.out.print("Cuidate!!!!!");}
        
    }
    
}
