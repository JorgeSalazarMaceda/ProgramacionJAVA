/*
Pinta por pantalla el contenido de los mapas
 */
package Mapas;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class Mapa {
    public static void main(String[] args) {
        HashMap<String,String> diccionario = new HashMap<String,String>();
        diccionario.put("Lunes", "Primer día de la semana");
        diccionario.put("Martes", "Segundo día de la semana");
        diccionario.put("Miercoles", "Tercer día de la semana");
        diccionario.put("Jueves", "Cuarto día de la semana");
        diccionario.put("Viernes", "Quinto día de la semana");
        
        
        System.out.println("---------forma perezosa------");
        System.out.println(diccionario);
        
        System.out.println("---------Solo claves------------");
        System.out.println(diccionario.keySet());
        
        System.out.println("---------  forma 2, recorriendo con bucle for each ----------");
        System.out.println("--------Sale desordenado así-----");
        for (String a:diccionario.keySet()){
            System.out.println(a);
        }
        
        System.out.println("----------Solo valores-----------");
        for (String a:diccionario.values()){
            System.out.println(a);
        }
        
        
        
        System.out.println("----------Cuarta forma-----------");
        for (String a:diccionario.values()){
            System.out.println("Key: " + a + " valor: " + diccionario.get(a));
        }
        
        System.out.println("----------Quinta forma-----------");
        for (String a:diccionario.values()){
            System.out.println("Key: " + a + " valor: " + diccionario.values());
        }
    }
}
