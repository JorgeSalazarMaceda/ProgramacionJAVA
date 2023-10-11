package areapoligonos;

import java.util.Scanner;

public class AREACIRCULO
{
    public static void main(String[] args)
    {
    //* El area es 3,14 * radio al cuadrado*/
        
        Scanner leer=new Scanner(System.in);
        
        double radio,pi,area;
        
        System.out.println("dame el radio del circulo:");
        radio=leer.nextInt();
        
        pi=3.14;
        area=pi*(radio*radio);
        System.out.println("El area del circulo es:" + area);
        
    }
    
}
