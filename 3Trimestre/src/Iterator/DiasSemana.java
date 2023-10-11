/*
Generar listado de días de la semana.
Borrar todos los días que tengan la letra a.
Pintar todos los días antes y después de borrar para comprobar el contenido de la colección.
 */
package Iterator;

/**
 *
 * @author Jorge
 */
import java.util.*;

public class DiasSemana {
    public static void main(String[] args) {
        List<String>dias = new ArrayList<>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miércoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sábado");
        dias.add("Domingo");
        
        Iterator<String>iterator = dias.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println( next );
        }
        System.out.println("----------- Sin la letra A --------------");
        
        Iterator<String>indice = dias.iterator();
        while(indice.hasNext()){
            String next = indice.next();
            if(next.contains("a")){
                indice.remove();
            
            }
            System.out.println( dias ); 
            
        }
    }
}
