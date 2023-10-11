//A cada personaje le asignamos una clase distinta con sus distintos comportamientos
package personal;

public class Maquinista {
    
    //Atributos
    String nombre;
    String dni;
    double sueldo;
    String rango;
    
    //Constructor
    
    public Maquinista (String nombre, String dni, double sueldo, String rango){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    public String toString(){
        return this.nombre;
    }
}
