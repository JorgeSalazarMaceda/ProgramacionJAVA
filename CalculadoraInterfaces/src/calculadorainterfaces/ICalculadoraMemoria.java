/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorainterfaces;

/**
 *
 * @author Jorge
 */
public interface ICalculadoraMemoria extends ICalculadora{
 
    
    public void SumaMemoria(double suma);
    
    public void RestaMemoria(double resta);
    
    public void ResetMemoria();
    
    public String getMemoria();
    
    public String getValores();
   

}
