
package areapoligonos;

import java.util.Scanner;

public class AREATRIANGULO 
{

    public static void main(String[] args) 
    {
     Scanner leer= new Scanner(System.in);
     
     float base,altura,area;
     
     System.out.println ("Digame la base");
     base=leer.nextInt();
     System.out.println ("Digame la altura");
     altura=leer.nextInt();
     
     area=(base*altura/2);
     System.out.println("El resultado del area del triangulo es:" + area);
    }
}
