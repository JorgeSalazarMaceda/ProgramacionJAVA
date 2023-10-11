
package arrays;
import java.util.*;
public class RellenarUnArrayParesImpares {
    public static void main(String[] args) {
         char array[]=new char [10]; //con fill
         
         for (int i = 0; i< array.length; i++) {
            array[i]='I';
            
        }
         
         for (int i = 0; i< array.length; i=i+2) {
            array[i]='P';
         }
         System.out.println(Arrays.toString(array));
         
        
    }
}
//    HECHO CON UN SOLO BUCLE
//        char t[] = new char[10];
//        for (int i = 0; i < t.length; i++) {
//            if (i % 2 == 0) {
//                t[i] = 'P';
//            }
//            else{
//                t[i]='I';
//            }
//            
//        }
//        System.out.println(Arrays.toString(t));