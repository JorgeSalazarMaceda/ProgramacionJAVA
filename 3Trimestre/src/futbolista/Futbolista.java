/*
Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y numero de goles. Implementar:
    - Un constructor y los metodos toString() y equals() (este ultimo basado en el DNI).
    - La interfaz Comparable con un criterio de ordenacion basado tambien en el DNI.
    - Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad.

Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
 */
package futbolista;

/**
 *
 * @author Jorge
 */
public class Futbolista implements Comparable  {
    //Atributos
    private int dni;
    protected String nombre;
    protected int edad;
    private int goles;

    //Constructor
    public Futbolista(int dni, String nombre, int edad, int goles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.goles = goles;
    }
    
     @Override
    public boolean equals(Object obj) {
        Futbolista otro = (Futbolista) obj;
        if (dni != otro.dni) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", goles=" + goles + '}';
    }

    @Override
    public int compareTo(Object o) {
           int resultado;
        Futbolista otroFutbolista=(Futbolista) o;
        if(dni < otroFutbolista.dni){
            resultado=-1;
        }
        else if(dni > otroFutbolista.dni){
            resultado=1;
        }
        else{
            resultado=0;
        }
        //Comparar objetos por dni 
        //Si es menor devuelve negativo.
        //Si es mayor devuelve positivo.
        //Si es igual devuelve 0.
        //return dni-((Futbolista)o).dni;
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}
