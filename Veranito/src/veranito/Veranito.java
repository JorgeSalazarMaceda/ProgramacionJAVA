/*
1) Clase Juego
Desarrollar la clase Juego que implemente el interfaz JuegodeMesa, y a su vez implemente el
interfaz Comparable.
El interfaz JuegodeMesa tiene los siguientes métodos
o getNombre: devuelve String
o getJugadores: devuelve int
Crear varias juegos y añadirlos a un ArrayList.
Ordena el contenido del array según el siguiente criterio combinado: por nombre y jugadores,
de tal forma que primero ordene según número de jugadores y si los dos juegos tienen el
mismo número de jugadores que los ordene según el nombre.
 */
package veranito;

/**
 *
 * @author Jorge
 */
public class Veranito {

    // Atributos
    
    private String nombre;
    private int numero;
    
    //Constructores

    public Veranito(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    
     public Veranito() {
        this.nombre = "calor";
        this.numero = 2;
    }
    
    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
   //To String
    
    public String toString(){
        return "Nombre: " + nombre + "Número: " + numero;
    }
    
}
