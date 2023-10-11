/*
9.34 Pagina 301
Las cartas formadas por un palo y un número, son las bases para muchos juegos al azar. 
Construir las clases necesarias que permitan ordenar una serue de cartas segun el palo y el número, o solamente por su número. 
Asímismo, como el azar es algo ligado a los juegos de cartas, implementar en la Clase Carta un método estático que construya y devuelva una carta al azar.
 */
package carta;

/**
 *
 * @author Jorge
 */
public class Carta {
    //atributos
    public final Palo palo;
    public final int numero;
    
    //constructor
    public Carta(){
        this.palo=null;
        this.numero=0;
    }
    
    public Carta(Palo palo, int numero){
        this.palo=palo;
        //Dejamos por defecto en el constructor que las cartas solo van del 1 al 12
        if(1<= numero && numero <=12){
            this.numero=numero;
        }
        else{
            this.numero=1; //Si no,si el número pasado por parametro no está en ese rango, le pongo 1. siempre.
        }
    }
    
    static Carta cartaAlAzar(){
        Palo PalosAlAzar[]=new Palo.values();
            
        
    }
}
