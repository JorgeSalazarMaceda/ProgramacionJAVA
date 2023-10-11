//UN PROGRAMA QUE CALCULE LA MEDIA DE NOTAS DE N ALUMNOS DE UNA CLASE
package pruebas.pkg3;

import java.util.Scanner;

public class PRUEBAS3 
{

    public static void main(String[] args)
    {
        
        Scanner leer =  new Scanner(System.in);
        int notas;
        int suma = 0;
        int prom = 0; 

       System.out.print("Ingrese cantidad de notas:");
        notas = leer.nextInt();

        for(int i=1; i<= notas; i++){
            System.out.println("ingrese nota: " +i+ " de " +notas+ ":");
            int nota = leer.nextInt();  
            suma = suma + nota;
        } 
            prom= suma /notas;
            System.out.println("Promedio de las notas:"+prom );
    }   
}
 