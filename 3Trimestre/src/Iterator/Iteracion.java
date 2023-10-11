/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class Iteracion {
    public static void main(String[] args) {
        List<String>lista = new ArrayList<>();
        lista.add("Dante");
        lista.add("Jorge");
        lista.add("Aitor");
        
        Iterator<String>iterator = lista.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println( next );
        }
    }
}
