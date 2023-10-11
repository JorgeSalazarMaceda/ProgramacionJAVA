/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GatoEvaluable;
/**
 *
 * @author Jorge
 */
import java.util.Comparator;
public class ComparaGatosPorRaza implements Comparator<Gato>{
    
  
    @Override
    public int compare (Gato ob1, Gato ob2){
        return ob1.getRaza().compareTo(ob2.getRaza());
    }
}
