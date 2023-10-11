
package personal;

public class Mecanico {
    //Atributos
    String nombre;
    String telefono;
    
    //enum. Una enumeración es una lista de constantes con nombre que definen un nuevo tipo de datos.
    //Puede hacerse fuera de una clase, o dentro de una clase (class), pero NO dentro de un método.
    //se denominan constantes de enumeración.
    enum Especialidad{
        FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR //enumerado Especialidad especialidad
    }
    Especialidad especialidad;
    //Constructor
    public Mecanico (String nombre, String telefono, String especialidad,Mecanico mec){
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad); //Pasamos de String a enumerado
    }
}
