/*

 */
package GatoEvaluable;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
//        System.out.println("------------ ARRAYLIST ------------");
//        List<Gato> listaGatos = new ArrayList<>();
//        
//        Gato a = new Gato("Felix", "negro", "pardo");
//        Gato b = new Gato("Lara", "tricolor", "comun");
//        Gato c = new Gato("Flash", "negro", "comun");
//        Gato d = new Gato("Garfield", "naranja", "siames");
//        Gato e = new Gato("Isidoro", "naranja", "siames");
//        
//        listaGatos.add(a);
//        listaGatos.add(b);
//        listaGatos.add(c);
//        listaGatos.add(d);
//        listaGatos.add(e);
//        
//        ComparaGatosPorNombre nombre = new ComparaGatosPorNombre(); //Creamos un objeto del compare para comparar gatos por nombre.
//        ComparaGatosPorRaza raza = new ComparaGatosPorRaza();
//        listaGatos.sort(raza);
//        System.out.println(listaGatos);
//        listaGatos.sort(nombre);
//        System.out.println(listaGatos);
//        
//        System.out.println("---------- SET ------------");
//        // Sin nombres duplicados con el método HashCode
//        Set<Gato> gatosHash = new HashSet<>();
//        
//        gatosHash.add(a);
//        gatosHash.add(b);
//        gatosHash.add(c);
//        gatosHash.add(d);
//        gatosHash.add(e);
//        
//        System.out.println("---------- MAP ------------");
//        TreeMap<String,Gato> gatosMap = new TreeMap<String,Gato>();
//        Gato a = new Gato("Felix", Gato);
//        Gato b = new Gato("Lara", "tricolor", "comun");
//        Gato c = new Gato("Flash", "negro", "comun");
//        Gato d = new Gato("Garfield", "naranja", "siames");
//        Gato e = new Gato("Isidoro", "naranja", "siames");
//            gatosMap.put(a);
//            gatosMap.put(b);
//            gatosMap.put(c);
//            gatosMap.put(d);
//            gatosMap.put(e);
//    
//         for(Map.Entry<String,Gato> i :gatosMap.entrySet()){
//            String clave = i.getKey(); //En una variable metemos la clave para imprimir
//            Gato valor = i.getValue(); //En otra variable metemos el valor para imprimir
//            
//            System.out.println(clave + " : " + valor); //Con toString imprime
//        }
//         
//            
//        
//        System.out.println("La longitud del mapa  de gatos es: " + gatosMap.size());
        
         //CHEMA
 System.out.println("------------ ARRAYLIST ------------");
        List<Gato> listaGatos = new ArrayList<>();       
        
        listaGatos.add(new Gato("Felix", "negro", "pardo"));
        listaGatos.add(new Gato("Lara", "tricolor", "comun"));
        listaGatos.add(new Gato("Flash", "negro", "comun"));
        listaGatos.add(new Gato("Garfield", "naranja", "siames"));
        listaGatos.add(new Gato("Isidoro", "naranja", "siames"));
        System.out.println("Por Nombre");
        //Ordenamos la lista de gatos con sort, que recibe dos objetos de gato y los ordena por nombre
        listaGatos.sort((gato1, gato2) -> {
            return gato1.compare(gato1.getNombre(), gato2.getNombre());
        });
        
       
        for(Gato gato : listaGatos) {
            System.out.println(gato);
        }
        
        System.out.println("Por Raza");
        //Ordenamos la lista de gatos con sort, que recibe dos objetos de gato y los ordena por raza
        listaGatos.sort((gato1, gato2) -> {
            return gato1.compare(gato1.getRaza(), gato2.getRaza());
        });
        
        for(Gato gato : listaGatos) {
            System.out.println(gato);
        }
        
        System.out.println("---------- SET ------------");
        // Sin nombres duplicados con el método HashCode
        Set<Gato> gatosHash = new HashSet<>();
        
        gatosHash.add(new Gato("Felix", "negro", "pardo"));
        gatosHash.add(new Gato("Lara", "tricolor", "comun"));
        gatosHash.add(new Gato("Flash", "negro", "comun"));
        gatosHash.add(new Gato("Garfield", "naranja", "siames"));
        gatosHash.add(new Gato("Garfield", "verde", "comun"));
        
        for(Gato gato : gatosHash) {
            System.out.println(gato);
        }
        
        System.out.println("---------- MAP ------------");
        
        Map<String,Gato> gatosMap = new TreeMap<>(); 
        gatosMap.put("Felix",new Gato("Felix", "negro", "pardo"));
        gatosMap.put("Lara",new Gato("Lara", "tricolor", "comun"));
        gatosMap.put("Flash",new Gato("Flash", "negro", "comun"));
        gatosMap.put("Garfield",new Gato("Garfield", "naranja", "siames"));
        gatosMap.put("Garfield",new Gato("Garfield", "verde", "comun"));
        
    // Hacemos una lista de String con las claves del mapa, usamos el sort que recibe dos parámetros que son las claves a comparar
        // La flecha (argumentos que recibe la funcion)->{la implementacion de la funcion}
        //Funciones arrow para definir funciones anónimas
        
        List<String> clavesMap = new ArrayList<>(gatosMap.keySet());
        clavesMap.sort((clave1, clave2) -> { //Ejemplo de azucar sintáctico.
            return clave1.compareTo(clave2);
        });
        
//      //Otra forma de ordenar por claves, sin la flecha      
//        clavesMap.sort(new Comparator() {
//            @Override
//            public int compare(Object clave1, Object clave2) {
//                return ((String)clave1).compareTo((String)clave2);
//            }
//        });
        
        System.out.println("Gatos ordenados por clave (nombre)");
        //Lo mostramos
        for(String claveGato : clavesMap) {
            System.out.println(gatosMap.get(claveGato));
        }
        
        System.out.println("Gatos ordenados por color");
        //Ahora creamos una lista de gatos (no de String como antes (ya que queriamos la clave)) y recibe los valores del mapa (gatoMap)
        //ordenamos la lista con sort recibiendo dos objetos Gato y hacemos la función.
        //Usamos el compare de gato para que compare los colores.
        List<Gato> coloresMap = new ArrayList<>(gatosMap.values());
        coloresMap.sort((gato1, gato2) -> {
            return gato1.compare(gato1.getColor(), gato2.getColor());
        });
        
        //Mostramos
        for(Gato colorGato : coloresMap) {
            System.out.println(colorGato);
        }
    }
}
