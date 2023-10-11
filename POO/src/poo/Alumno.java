// A continuacion se define un array de 5 alumnos que posteriormente se rellena, Por ultimo, se muestran los datos de los alumnos por pantalla.
package poo;
import java.util.Scanner;
public class Alumno {
    private String nombre;
    private double notaMedia = 0.0;
    //Constructor, no hay, asi que por defecto será 1 constructor, el nulo
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getNotaMedia(){
        return notaMedia;
    }
    public void setNotaMedia(double notaMedia){
        this.notaMedia = notaMedia;
        
    }
    
   
    public static void main(String[] args) {
    String nombre;
    double nota;
    double sumaDeMedias = 0;
    
    Scanner sc = new Scanner (System.in);
     Alumno [] alum = new Alumno [5]; //Generamos un array de enteros de 5
    
    // Ahora creamos objetos (alumnos)
    Alumno alumno1 = new Alumno();
    Alumno alumno2 = new Alumno();
    Alumno alumno3 = new Alumno();
    Alumno alumno4 = new Alumno();
    Alumno alumno5 = new Alumno();
    
    //Meter un objeto en un array es muy util, porque te permite crear una tabla de información.
    
    //Pide los datos de los alumnos
    
        for (int i = 0; i < 5; i++) {
            alum [i]= new Alumno ();
            System.out.println("Alumno: " + i);
            
            nombre= sc.next();
            alum [i].setNombre(nombre);
            
            System.out.println("Nota media: ");
            nota=sc.nextDouble();
            alum[i].setNotaMedia(nota);
        }
        
        //Muestra los datos de los alumnos
        System.out.println("Los datos introducidos son: ");
        sc.close();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + alum[i].getNombre());
            System.out.println("Nota media: " + alum[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias +=alum[i].getNotaMedia();
        }
        System.out.println("La media de la clase es " + sumaDeMedias);
    }
}
