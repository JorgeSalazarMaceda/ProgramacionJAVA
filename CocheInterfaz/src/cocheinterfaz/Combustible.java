/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocheinterfaz;

/**
 *
 * @author Jorge
 */
public interface Combustible {
    
    //Atributos
 
    // ------------------Metodos ---------------------
    //Comentarios con Javadoc para practicar.
    /**
     * capacidad máxima, sin implementar, ya que es interfaz.
     * Se implementarán en Bateria y DepositoGasolina
     * @return
     */
    public double getCapacidad();

    /**
     * Capacidad actual de energia
     *
     * @return
     */
    public double getDisponible();

    /**
     * Recarga: incrementa la capacidad actual, sin que supere la capacidad
     * máxima
     * @param cantidad Cantidad a recargar
     */
    public void recarga(int cantidad);

    /**
     * vacio: comprueba si no queda energía (boolean)
     * 
     * @return
     */
    public boolean vacio();
    
    public String toString();

}
