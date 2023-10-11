/*
2) Clase Gato
Desarrollar la clase gato. Un gato se caracteriza por nombre, color y raza.
• Utilizar el método equals para comprobar si dos gatos son iguales según el nombre.
• Habrá dos constructores, uno con todos los parámetros, y otro sin parámetros que
llame al gato “callejero” por defecto.
• Crear un ArrayList de gatos, y ordenarlos por nombre y raza (dos criterios
independientes )
• Crear un HashSet de gatos, y que no inserte duplicados teniendo en cuenta el nombre.
• Crear un TreeMap de gatos, que esté formado por parejas <codigo alfanumérico, gato>  //Alfanumérico es una cadena de caracteres.
y que se muestren ordenados por su código.
• Se deberá poder imprimir objetos de tipo gato, con el siguiente formato
nombre_gato (raza)
• Voluntario: mostrar el treemap de gatos ordenados por color.
 */
package GatoEvaluable;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Jorge
 */
public class Gato implements Comparable,Comparator<String> {
    // Atributos
    private String nombre;
    private String color;
    private String raza;
    
    //Constructor con y sin atributos

    public Gato() {
        this.nombre = "";
        this.color = "";
        this.raza = "callejero";
    }
    public Gato(String nombre, String color, String raza) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " || Color: " + this.color + " || Raza: " + this.raza; 
    }
    
    public void imprimir() {
        System.out.println(String.format("%s (%s)", nombre, raza));
    }
    
    //Heredamos equals de la clase Object
    @Override //Tenemos que convertir el parametro en un objeto de tipo Gato para que compare los gatos, un casting.
    public boolean equals(Object gato){ //Método para comparar objetos. Para saber si son iguales o no
      
        return this.raza.equals(((Gato)gato).getRaza()) && this.color.equals(((Gato)gato).getColor());  
    }
    

     
//    
//    public int compareTo(String arg1) {
//        return this.nombre.compareTo(arg1); // Le tienes que decir el parametro a comparar
//        return this.raza.compareTo(arg1); // Le tienes que decir el parametro a comparar
//    }
    
    @Override
    public int compare(String arg0, String arg1) { // Puede recibir el nombre o la raza
        return arg0.compareTo(arg1);
    }
    
    /* Teoría
    - Cuando declaras una variable, ej, int z = 5,lo que haces es reservar un espacio de memoria con un valor que puede variar --> En el Stack
    - Cuando creas una nueva instancia de un objeto, ejemplo, new Libro, accedes a la memoria del pc, pero no al Stack, si no al Heap
      En el heap se reserva un espacio para almacenar los objetos de tipo libro.Despues continua la lectura por el nombre que le has dado a la instancia, ejemplo libro1.
      Con esto, lo que se almacena en el Stack es una referencia del objeto creado que nos dice donde se almacena en el Heap.
                            Referencia (Stack ej libro1) - Espacio (Heap ejemplo Objeto Libro)
    
    
      El HashCode es un número que hace referencia a la localización del objeto que tenemos almacenado en la memoria Heap.
    
        Ejemplo, libro1 = libro2 es que les pones la misma referencia y apuntas desde dos instancias diferentes al mismo objeto almacenado en memoria con su hashcode correspondiente.
    Equals te permite comparar objetos por String y por date, pero no por clases creadas por nosotros.
    */
    //HashSet es una lista no ordenada, te los muestra como quiere y con hashCode (en este caso, criterio nombre) evita duplicados.
    
    @Override
    public int hashCode() { 

        return this.raza.hashCode() + this.color.hashCode();
    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 41 * hash + Objects.hashCode(this.color);
//        return hash;
//    }

    @Override
    public int compareTo(Object arg0) {
         return this.nombre.compareTo(((Gato)arg0).getNombre());
    }
    
    
    
    
}
