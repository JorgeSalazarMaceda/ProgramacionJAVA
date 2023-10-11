/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulacros;

import java.util.Comparator;

/**
 *
 * @author Jorge
 */
public class CompararDescripcion implements Comparator<Articulos>{
    @Override
    public int compare(Articulos o1, Articulos o2){
        return o1.getDescripcion().compareTo(o2.getDescripcion());
    }
}
