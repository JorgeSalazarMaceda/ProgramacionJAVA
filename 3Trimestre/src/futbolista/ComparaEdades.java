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
public class ComparaEdades  implements Comparator {
    @Override public int compare (Object o1, Object o2){
        return ((Futbolista)o1).edad - ((Futbolista) o2).edad;
    }
    
}
