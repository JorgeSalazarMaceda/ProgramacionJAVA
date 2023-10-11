/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JuegoEvaluable;

/**
 *
 * @author Jorge
 */
public interface JuegoDeMesa {
    //Con la interfaz lo que haces es crear los métodos abstractos para obligar a la clase que implementa la misma a usarlos y sobreescribirlos.
    
    public String getNombre();
    public int getJugadores();

}
