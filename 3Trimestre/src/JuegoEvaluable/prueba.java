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
import java.util.*;

public class prueba {
    //Tres formas de ordenar
    //Colecctions.sort
    //lista.sort
    //parametro de construccion de la coleccion, le doy el criterio de comparación.set mi set = new treeset(comparapornombre).
    
    public static void main(String[] args) {
        ArrayList<Juego> juegos = new ArrayList<Juego>(); //Hacemos el arrayList de la clase Juegos para introducir objetos.

        Juego a = new Juego("Parchis", 4);
        Juego b = new Juego("Oca", 4);
        Juego e = new Juego("zAjedrez", 2);
        Juego i = new Juego("Parchis", 6);
        
        //Las letras serían el nombre de la instancia.
        
        juegos.add(a);
        juegos.add(b);
        juegos.add(i);
        juegos.add(e);
   
        //System.out.println("Sin ordenar con toString: " + juegos);
        

        
        juegos.sort((arg0, arg1) -> {
            return arg0.compareTo(arg1);
        });
        
            for (Juego juego : juegos) {
            System.out.println(juego);
        }
            
            System.out.println("COMPARA POR NOMBRE");
            
        ComparaPorNombre nombre = new ComparaPorNombre(); //Creamos un objeto del compare para comparar gatos por NOMBRE.
        juegos.sort(nombre); 
        for(Juego juego : juegos) {
            System.out.println(juego);
        }

//        for (int i = 0; i < juegos.size(); i++) {
//            Juego juego = juegos.get(i);
//            //...
//        }
//

////
//        a.setNombre("Perrakos");
//        System.out.println(juegos);
//        System.out.println("----------------------------------");
//
//        juegos.remove((new Juego("PAPAPAPAPAP", 2)));
//        System.out.println(juegos);
//
//        System.out.println("");
//        
//        
//        //PREGUNTAR POR QUÉ NO SETEA ASÍ.
//        juegos.remove((new Juego("PAPAPAPAPAP", 2)));
//        System.out.println(juegos);  
    }
}
