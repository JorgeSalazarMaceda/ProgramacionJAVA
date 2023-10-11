
package areapoligonos;

import java.util.Scanner;

public class AREARECTANGULO 
{

    public static void main(String[] args) 
    {
        Scanner leer=new Scanner (System.in);
        
        double base,altura,area;
        
        System.out.println("Digame la base");
        base=leer.nextDouble();
        
        System.out.println("Digame la altura");
        altura=leer.nextDouble();
        
        area=base*altura;
        
        System.out.println("El area del rectangulo es:" + area);
        
    }
    
}
