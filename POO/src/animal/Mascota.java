/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Jorge
 */
public interface Mascota {
    int getCodigo();
    
    
    public abstract void hazRuido();
    
    void come(String comida);

}
