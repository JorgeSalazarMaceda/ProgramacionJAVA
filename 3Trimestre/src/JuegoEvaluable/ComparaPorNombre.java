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
import java.util.Comparator;
public class ComparaPorNombre implements Comparator<Juego>{
     @Override
    public int compare(Juego ob1, Juego ob2) {
       return ob1.getNombre().compareTo(ob2.getNombre());
    }
}
