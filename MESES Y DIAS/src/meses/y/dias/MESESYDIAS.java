package meses.y.dias;
//* dado un nº de días digame cuantos anios, mmeses y dias son*/
import java.util.Scanner;

public class MESESYDIAS 
{
    public static void main(String[] args) 
    {
       Scanner leer=new Scanner (System.in);
       
       int dias,anios,meses;
       
       System.out.println("Digame cuantos días son:");
       dias=leer.nextInt();
       
       anios=dias/365;
       System.out.println("El número de años es:" + anios);
       
       int aux= dias%365;
       meses=aux/30;
       System.out.println("El número de meses es:" + meses);
       
       dias= aux%30;
       System.out.println("El número de dias es:" + dias);
          
    }
  //* En clase lo hicieron así:*/
 //* int dias=400 int anios/365;*/
 //* Sout ("el numero de años es" + anios);*/
 //* int aux = ndias% 365;*/
 //*int meses = aux / 30*/
 //*sout ("el nº de meses son" + meses);*/
 //* int dias = aux % 30;*/
 //*el numero de dias son" + dias);*/
}
