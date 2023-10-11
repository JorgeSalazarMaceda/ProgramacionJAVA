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
package JuegoEvaluable;

/**
 *
 * @author Jorge
 */
public class Juego implements JuegoDeMesa,Comparable<Juego>{

    //Atributos
    private String nombreJuego;
    private int numeroJugadores;
    
    //Constructores
    
    //Constructores con parámetros
    public Juego(String nombreJuego, int numeroJugadores) {
        this.nombreJuego = nombreJuego;
        this.numeroJugadores = numeroJugadores;
    }
    //Constructores sin parámetros
    public Juego() {
        this.nombreJuego = "Parchís";
        this.numeroJugadores = 4;
    }

    //Getters y Setters

    public void setNombre(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public void setJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }
    
    
    @Override
    public String getNombre() {
        return nombreJuego;
    }

    @Override
    public int getJugadores() {
        return numeroJugadores;
    }

    @Override
    public String toString() {
        return "Nombre del juego: " + nombreJuego + " y los jugadores son: " + numeroJugadores;
    }


    @Override
    public int compareTo(Juego juego) {
        //Es restar el elemento que tienes frente al que introduces, si es 0, son iguales, si no. Si es mayor que 0, 
        //quiere decir que el que tienes es mayor que el que comparas, y si es menor que 0 es que es menor
        
        //Son dos criterios combinados, comparamos por jugadores y el resultado se mete en una variable. 
        
        int resultCompare = numeroJugadores - juego.getJugadores();
                
        if (resultCompare == 0) //Si el resultado de la comparación es 0, entonces comparamos los nombres.
            resultCompare = nombreJuego.compareTo(juego.getNombre()); //Este compareTo hace referencia al String de juego.
        
        //Si el número de jugadores es igual, es decir, el numero de jugadores por defecto, y el del juego introducido en el método son iguales,
        //entonces comparame por el nombre.
        
        return resultCompare;
    }
}
