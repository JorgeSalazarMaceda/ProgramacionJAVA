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
import java.util.*;
public class Prueba {
    public static void main(String[] args) {
      Futbolista[] t = new Futbolista[6];
      t[0]=new Futbolista(1,"Cristiano", 36,7);
      t[1]=new Futbolista(3,"Messi", 34,10);
      t[2]=new Futbolista(2,"Hazard", 25,15);
      t[3]=new Futbolista(5,"Neymar", 26,20);
      t[4]=new Futbolista(4,"Pique", 29,3);
      t[5]=new Futbolista(6,"Ramos", 36,1);
      ComparaNombre comparanombres = new ComparaNombre();
      
      Arrays.sort(t,comparanombres);
        System.out.println("Por nombres: " + Arrays.deepToString(t));
        System.out.println("");
        Arrays.sort(t,new ComparaEdades());
        System.out.println("Por edades: " + Arrays.deepToString(t));
    }
    
}
