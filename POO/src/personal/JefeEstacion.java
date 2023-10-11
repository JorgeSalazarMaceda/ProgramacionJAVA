
package personal;
import java.util.Date;
public class JefeEstacion {
   //Atributos
    String nombre;
    String dni;
    Date nombramiento;
    
    //Constructores
    
    public JefeEstacion (String nombre, String dni, Date nombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.nombramiento = nombramiento;
    }
    public String toString(){
         return "Esto es un animal así: Tipo: " + this.nombre + " - Sexo: " + this.dni;
     }
}
