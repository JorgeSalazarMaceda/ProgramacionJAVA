/*
Hay que hacer un EjemploTreeSet de String haciendo un listado de colores y mostrarlo ordenados alfabéticamente.
 */
package Arraylist;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class EjemploTreeSet  {
    public static void main(String[] args) {
         // Creamos el EjemploTreeSet vacio
        Set<String> colores = new TreeSet<String>();
        
        colores.add("azul");
        colores.add("verde");
        colores.add("negro");
        
        for(String a:colores){
            System.out.println(colores);
        }
        
        //Aitor
//        
//        String colores[]={"azul" ,"amarillo","negro"};
//        Set<String> colores = new EjemploTreeSet<String>();
        
    }
}
