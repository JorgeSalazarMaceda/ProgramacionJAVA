/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CochePracticarCompares;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class ComparaMatricula implements Comparator <Coche>{
    
    public int compare(Coche coche1, Coche coche2){
        return coche1.getMatricula().compareToIgnoreCase(coche2.getMatricula());
    }
    
}
