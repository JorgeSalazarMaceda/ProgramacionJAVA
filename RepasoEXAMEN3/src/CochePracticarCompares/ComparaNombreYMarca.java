/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CochePracticarCompares;

import java.util.*;

/**
 *
 * @author Jorge
 */
public class ComparaNombreYMarca implements Comparator <Coche>{
    
    public int compare(Coche coche1, Coche coche2){
        int resultado = coche1.getMarca().compareToIgnoreCase(coche2.getMarca());
      
        
        if (resultado == 0){
            resultado = coche1.getMatricula().compareToIgnoreCase(coche2.getMatricula());
        }
        return resultado;
        
    }
    
}
