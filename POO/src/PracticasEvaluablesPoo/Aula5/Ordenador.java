/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasEvaluablesPoo.Aula5;

/**
 *
 * @author Jorge
 */
public class Ordenador {
    
    //Esta clase solo tendrá los atributos, el constructor, el metodo pulsar boton 
    //Y los getter del innterruptor del ordenador para que accedan a el desde otras clases
    //Y el getter para que puedan acceder a sus atributoss privados desde otras clases
    //Atributos
    private boolean interruptor;
    private double consumoElectrico; //Random??
    private int potencia;
    
    public Ordenador(){
    interruptor=false;
    consumoElectrico=0;
    potencia=5;
    }
    
    public void pulsarBoton(){ //Este metodo es para ver que si está encendido se le añada el consumo
        interruptor= !interruptor; //Como hay dos estados, al usar este simbolo le asignas el otro estado, que es el contrario.
        if(interruptor){
            this.consumoElectrico = (Math.random()*100) * potencia; //Si esta encendido es consumo electrico por si mismo.
        }
        else{
            consumoElectrico=0; //Si está apagado.
        }
    }
    
    public boolean getInterruptor(){ // Como es privado lo hacemos el getter
        
        return interruptor;
    }
    
    public double getConsumoElectrico(){ //Creamos el get para que desde la clase aula (al ser private el atributo...) podamos acceder y hacer el total
        return consumoElectrico;
    }
}
