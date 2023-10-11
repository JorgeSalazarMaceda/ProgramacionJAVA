/*
En la clase hay ordenadores con un botón de encendido y apagado, y además hay un
interruptor general para el aula.
Una ordenador se enciende si su interruptor y el general del aula están activados.
Escribe una clase de nombre Aula5 que recoja estas casuísticas con los siguientes
métodos:
1. Pulsar el interruptor de un ordenador
2. Pulsar la general del aula
3. Saber si un ordenador está encendido o no
Ampliación del ejercicio: Cada ordenador puede tener un consumo eléctrico distinto. Al
encender cada ordenador, el consumo se incrementa según la potencia que tenga ese
ordenador. Al apagarlo, se reduce el consumo.
Hay que saber según los ordenadores que estén encendidos el consumo total del aula.
 */
package PracticasEvaluablesPoo.Aula5;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
//Llevará los atributos con un array declarado, constructor con el array de 5 para los ordenadores, metodo interruptor general, 
//metodo pulsar interruptor ordenador
public class Aula5 {
    //Atributo
    private boolean interruptor;
    private Ordenador[] ordenadores; //El otro atributo es un atributo de clase.
    
    //Constructor
    public Aula5(){
       
       interruptor=false;
       ordenadores = new Ordenador[5]; //Inicializamos el array ordenadores (que ya esta declarado arriba).
        for (int i = 0; i <ordenadores.length ; i++) { //Este for lo que hace es meter los ordenadores dentro del array.
            ordenadores[i]= new Ordenador();
        }
    }
    
    public void pulsarBoton (){
        interruptor = !interruptor; //Como hay dos estados, al usar este simbolo le asignas el otro estado, que es el contrario
        
    }
    
    public void pulsarBotonOrdenador (int i){
        if(interruptor) {//En false(porque así está inicializado en el constructor) //Si el general esta encendido, enciende los ordenadores
        ordenadores[i].pulsarBoton(); //Accedemos a la posicion i del array de ordenadores y accedemos al metodo de pulsar boton de ese ordenador.
        }
        else{
            interruptor=false;
            System.out.println("El general está apagado");
        }
    }
    
    public boolean consultarEstadoOrdenador(int j){
        
        return ordenadores[j].getInterruptor(); //Con este metodo, accedemos al interruptor del ordenador y vemos si esta encendido
        
    }
    
    public double totalConsumo (){
        double totalConsumoElectrico=0; //En esta variable meteremos el total del consumo electrico de cada ordenador
        for (int i = 0; i < ordenadores.length; i++) {
            totalConsumoElectrico+=ordenadores[i].getConsumoElectrico();
        }
        return totalConsumoElectrico;
    }

}
