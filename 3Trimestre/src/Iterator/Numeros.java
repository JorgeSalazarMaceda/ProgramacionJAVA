/*
Generar listado de números (utiliza la colección que quieras)
1- Insertar varios números de ejemplo.
2- Borrar los números que se hayan introducido menores de 5.
 */
package Iterator;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class Numeros {
    public static void main(String[] args) {
       
        List<Integer>numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(7);
        numeros.add(4);
        numeros.add(56);
        numeros.add(6);
        numeros.add(10);
        
        Iterator<Integer>iterator = numeros.iterator();
        while(iterator.hasNext()){
            if (iterator.next() < 5) iterator.remove();
        }
        System.out.println(numeros);
        
        
        System.out.println("------- ListIterator para ir hacia atrás -------");
        ListIterator<Integer> listIterator = numeros.listIterator();
         while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
  
    }
}
