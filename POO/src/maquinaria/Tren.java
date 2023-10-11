
package maquinaria;
import personal.Maquinista; //Importamos la clase maquinista del paquete personal
public class Tren {
    
    //Atributos
   Locomotora locomotora;
   Vagon vagones [];
   Maquinista responsabe;
   
   private int numVagones; //numero de vagones que forman el tren
   public Tren (Locomotora locomotora, Maquinista responsable){
       this.locomotora = locomotora;
       this.responsabe= responsable;
       
       vagones = new Vagon [5]; //Creamos la tabla de tamaño 5, pero no se crea ningun objeto del tipo Vagón.
       
       numVagones = 0; // Por ahora no hay vagones enganchados al tren
   }
   
   //Al ser la clase Vagon no visible por clases exernas, 
   //sera la clase Tren la que se encargue de construir el objeto a partir de los datos que nos pasen.
   
   //Constructor
   
   public void enganchaVagon (int cargaMax, int cargaActual, String mercancia){
       if(numVagones >= 5){
           System.out.println("El tren no admite mas vagones");
       }
       else{
           Vagon v = new Vagon (numVagones, cargaMax, cargaActual, mercancia);
           vagones[numVagones]=v; //el vagon pasado ocupa el ultimo lugar
           numVagones++; //Ahora tenemos un vagon mas enganchado al tren.
       }
      
   }
    public static void main(String[] args) {
        Maquinista jefe = new Maquinista("paco", "555555", 6.5, "jefe");
    }
}
