/*
Ejemplo de Treeset de articulos con atributos id y descripción
Mostrar ordenados por id
Mostrar ordenados por descripción
 */
package Simulacros;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Articulos a = new Articulos(5,"bolso");
        Articulos b = new Articulos(2,"cartera");
        Articulos c = new Articulos(4,"reloj");
        Articulos d = new Articulos(3,"sombrero");
        Articulos e = new Articulos(1,"guantes");
        Articulos f = new Articulos(6,"jersey");
        
        // Creamos el EjemploTreeSet vacio
        Set<Articulos> objetos = new TreeSet<Articulos>();
       
        objetos.add(a);
        objetos.add(b);
        objetos.add(c);
        objetos.add(d);
        objetos.add(e);
        objetos.add(f);
        
//        for(Articulos varArticulos: objetos){
//            System.out.println(varArticulos);
//        }

       System.out.println(objetos);
       
        System.out.println("");
        System.out.println("-------------Ahora comparamos por descripción------------");
        System.out.println("");
        CompararDescripcion compDescripcion = new CompararDescripcion();
        Set<Articulos> objetosD = new TreeSet<Articulos>(compDescripcion); //Le decimos por parametro que cambie su criterio de ordenacion y lo ordene por descripcion
        objetosD.add(a);
        objetosD.add(b);
        objetosD.add(c);
        objetosD.add(d);
        objetosD.add(e);
        objetosD.add(f);
        
        System.out.println(objetosD);
        
        //El treeSet te lo ordena directamente por defecto, pero puedes cambiarle el criterio con el parámetro
    }
}
