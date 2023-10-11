/*
Almacena un listado de marcas de coches que no contenga duplicados.
1. Inserta marca.
2. Borrar marca.
3. Mostrar
4. Cuantos elementos hay.
5. Se debe poder comprobar sin una determinada marca está en el listado por ejemplo "Renault".
6. Eliminiar las marcas que tengan mas de 3 letras.
 */
package Iterator;

/**
 *
 * @author Jorge
 */

import java.util.*;
public class CochesMenuIterator {
    public static void main(String[] args) {
       Set<String> marcas = new TreeSet<>();
       
       marcas.add("mercedes");
       marcas.add("Seat");
       marcas.add("Bmw");
       marcas.add("Audi");
       marcas.add("Seat");
       
       Iterator <String> listaMarcas = marcas.iterator();
       while(listaMarcas.hasNext()){
           String elemento = listaMarcas.next();
           if(elemento.length()>3){
               listaMarcas.remove();
           }
       }
        System.out.println(marcas);
        System.out.println(marcas.size());
    }
}
