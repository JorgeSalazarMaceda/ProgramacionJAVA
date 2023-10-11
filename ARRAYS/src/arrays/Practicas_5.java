/*
5-Desarrollar una aplicación que nos ayude a gestionar las notas del Instituto. Cada
grupo está compuesto por 15 alumnos. Se pide leer las notas del primer, segundo y
tercer trimestre de un grupo. Debemos mostrar al final: la nota media del grupo en
cada trimestre, y la media del alumno que se encuentre en la posición N (N se leerá
por teclado).
 */
package arrays;
import java.util.Scanner;
public class Practicas_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Declaracion de variables
        int numeroAlumno;
        double suma_trimestre1=0, suma_trimestre2=0,suma_trimestre3=0; //Inicializados en 0
        double notaMedia;
        
        //Creamos los arrays
        double [] trimestre1 = new double [2];
        double [] trimestre2 = new double [2];
        double [] trimestre3 = new double [2];
        
        //Cogemos las notas del primer trimestre
        System.out.println("¿Cuales son las notas del primer trimestre: ");
        for (int i = 0; i < trimestre1.length; i++) {
            System.out.print("Alumno "+(i+1)+" :"); //Así aparece cada alumno, desde el 1 hasta el final
            trimestre1[i]=sc.nextDouble();
        }
        
        //Cogemos las notas del segundo trimestre
        System.out.println("¿Cuales son las notas del segundo trimestre: ");
        for (int i = 0; i < trimestre2.length; i++) {
            System.out.print("Alumno "+(i+1)+" :");
            trimestre2[i]=sc.nextDouble();
        }
        
        //Cogemos las notas del tercer trimestre
        System.out.println("");
        System.out.println("¿Cuales son las notas del tercer trimestre: ");
        for (int i = 0; i < trimestre3.length; i++) {
            System.out.print("Alumno "+(i+1)+" :");
            trimestre3[i]=sc.nextDouble();
        }
        
        System.out.println("");
        //Calculamos las notas medias: hacemos un for para que se recorran los 
        //arrays (trimestres), con los valores de las notas introducidos, y dentro de ese for
        //indicamos que las variables suma_trimestres es la suma (+=) de todos los valores de los array.
        for (int i = 0; i < 2; i++) {
            suma_trimestre1+=trimestre1[i];
            suma_trimestre2+=trimestre2[i];
            suma_trimestre3+=trimestre3[i];
        }
        
        //Mostramos la nota media
        System.out.println("Notas primer trimestre: " + suma_trimestre1/trimestre1.length);
        System.out.println("Notas segundo trimestre: " + suma_trimestre2/trimestre2.length);
        System.out.println("Notas tercer trimestre: " + suma_trimestre3/trimestre3.length);
        System.out.println("");
        
        //Ahora queremos saber la nota de algún alumno en concreto,
        //buscando la posición (Que seria el alumno), sumanlas notas y dividendo entre 3
        System.out.println("Introduce la posición del alunmno: ");
        numeroAlumno=sc.nextInt();
        
        notaMedia =((trimestre1[numeroAlumno] + trimestre2[numeroAlumno] + trimestre3[numeroAlumno])/3);
        System.out.println("La nota media del alumno: " + numeroAlumno + " es: " + notaMedia);
    }   
}
