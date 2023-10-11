
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ComparaEdades implements Comparator<Persona>{
    
    public int compare(Persona pers1, Persona pers2){
        return pers1.getEdad() - pers2.getEdad();
    }
   
}
