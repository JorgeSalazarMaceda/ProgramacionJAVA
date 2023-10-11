/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolista;

/**
 *
 * @author Jorge
 */
import java.util.Comparator;
    public class ComparaNombre implements Comparator {
    //añado nombre como criterio de comparacion en el metodo compare
    @Override 
    public int compare(Object o, Object obj){
        return ((Futbolista)o).getNombre().compareTo(((Futbolista)obj).getNombre());
    }
}
