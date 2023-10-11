
package concierto2;

import java.util.Scanner;

public class CONCIERTO2 {
    public static void main(String[] args) 
    {
        Scanner leer = new Scanner (System.in);
        
        int aforo,precio,vendidas;
        double recaudado ;
        
        System.out.println("ingrese el aforo maximo del local: ");
        aforo=leer.nextInt();
        System.out.println("ingrese el precio de entrada: ");
        precio=leer.nextInt();
        System.out.println("nº entradas vendidas: ");
        vendidas=leer.nextInt();
        
        
        
        if (vendidas<=(0.2 * aforo)){
            System.out.println ("se cancela el concierto");}
        else if (vendidas<=(0.5*aforo)){
            recaudado=precio*vendidas;
            recaudado=recaudado*0.75;
            System.out.println("el dinero recaudado es: " + recaudado);}
        else if(vendidas>=(aforo*0.90)){
            System.out.println ("es gratis");}
        else{
                recaudado=precio*vendidas;
                System.out.println("el dinero recaudado es: " + recaudado);}
    }
                
} 
    
                
    
    

