/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GatoEvaluable;

/**
 *
 * @author Jorge
 */
import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        
        
        System.out.println("DEFENSA");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("---------------------- A R R A Y L I S T ----------------------");
        List<Gato> listaGatos = new ArrayList<>();

        Gato a = new Gato("Felix", "azul", "pardo");
        Gato b = new Gato("Lara", "blanco", "ruso");
        Gato c = new Gato("Flash", "azul", "siammes");
        Gato d = new Gato("Garfield", "naranja", "siames");
//        Gato e = new Gato("Isidoro", "naranja", "siames");
//        Gato f = new Gato("Isidoro", "naranja", "siames");
//        Gato g = new Gato("ZAnubis", "Azul", "Azulito");
//        Gato h = new Gato("Felix", "negro", "pardo"); // a y h para probar equals true
        listaGatos.add(a);
        listaGatos.add(b);
        listaGatos.add(c);
//        listaGatos.add(d);
//        listaGatos.add(e);
//        listaGatos.add(f);
//        listaGatos.add(g);
       
//        System.out.println("EQUALS" + a.equals(h));
        System.out.println("");
        System.out.println("FORMATO() e iterator"); //ITERATOR --> Objeto para recorrer listas
        //Iterator<Gato> iterator =listaGatos.iterator(); //Modificando el toString tambien se puede
        for(Gato aux : listaGatos){
            aux.imprimir();
        }
        System.out.println("PRUEBA CompareTo" + a.compareTo(b)); //CompareTo
       
        //ORDENA POR NOMBRE
        System.out.println("Ordenados POR NOMBRE");
        ComparaGatosPorNombre nombre = new ComparaGatosPorNombre(); //Creamos un objeto del compare para comparar gatos por NOMBRE.
        // listaGatos.sort(new ComparaGatosPorNombre()); //Otra forma
        listaGatos.sort(nombre);
        for (Gato gato : listaGatos) {
            System.out.println(gato);
        }
        
        

        //ORDENA POR RAZA
        System.out.println("Ordenados POR RAZA");
        ComparaGatosPorRaza raza = new ComparaGatosPorRaza(); //Creamos un objeto del compare para comparar gatos por RAZA.
        //Collections.sort(listaGatos,new ComparaGatosPorRaza()); // Otra forma de ordenar con COLLECTIONS	
        listaGatos.sort(raza); //Por parámetro ponemos el criterio de comparación
        for (Gato gato : listaGatos) {
            System.out.println(gato);
        }
   
        // System.out.println(listaGatos); //Otra forma de imprimir (con el toString)

        System.out.println("");
        System.out.println("-------------------- S E T ----------------------");
        
       
        // Sin nombres duplicados con el método HashCode
        // Reutilizamos los gatos creados anteriormente.
        Set<Gato> gatosHash = new HashSet<>();

        gatosHash.add(a);
        gatosHash.add(b);
        gatosHash.add(c);
//        gatosHash.add(d);
//        gatosHash.add(e);
//        gatosHash.add(f);
//        listaGatos.add(g);
        for (Gato gato : gatosHash) {
            System.out.println(gato);
        }
        
        
    

        //System.out.println(gatosHash);
        System.out.println("");
        System.out.println("-------------------- M A P ----------------------"); 
//Siempre se ordena por claves, si quieres cambiar el criterio con los valores ya te toca hacer lo de colores, una lista con valores
        Map<String, Gato> gatosMap = new TreeMap<>();

        gatosMap.put("Felix", a);
        gatosMap.put("Lara", b);
        gatosMap.put("Flash", c);
        gatosMap.put("Garfield", d);
//        gatosMap.put("Isidoro", e);
//        gatosMap.put("Isidoro", f);
//        gatosMap.put("Anubis", g);


        System.out.println("Imprimimos MAPA");
        //Para imprimir el mapa con Map.Entry
        for (Map.Entry<String, Gato> i : gatosMap.entrySet()) {
            String clave = i.getKey(); //En una variable metemos la clave para imprimir
            Gato valor = i.getValue(); //En otra variable metemos el valor para imprimir

            System.out.println(clave + " : " + valor); //Con toString imprime           
        }
        

//        //System.out.println("La longitud del mapa  de gatos es: " + gatosMap.size());
       
        System.out.println("");
        System.out.println("Ordenados por COLORES");
        List<Gato> coloresMap = new ArrayList<>(gatosMap.values());  
        ComparaGatosPorColor color = new ComparaGatosPorColor();
        coloresMap.sort(color); 
        //coloresMap.sort(new ComparaGatosPorColor());
        //System.out.println(coloresMap);
        for(Gato colores:coloresMap){
            System.out.println(colores);
        }
        System.out.println("------  NOMBRE -------");
        
      coloresMap.sort(nombre);
      for(Gato x:coloresMap){
            System.out.println(x);
           
        }
        
//Formas de imprimir por color
        
            System.out.println("-------------------FORMAS-------------------------");
        
        for (Gato gato : gatosHash) {
            System.out.println(gato); // QUITAMOS DUPLICADOS
            
        }
         for(Gato colores:coloresMap){
            System.out.println(colores);
        }
        System.out.println("");
        System.out.println("Primera");
        
        for (Map.Entry<String, Gato> i : gatosMap.entrySet()) {
            Gato valor = i.getValue(); //En otra variable metemos el valor para imprimir

            System.out.println( valor.getColor()); //Con toString imprime           
        }
         System.out.println("");
        System.out.println("Segunda");
       
         for(Gato colores:coloresMap){
            System.out.println(colores.getColor());
        }
          System.out.println("");
         System.out.println("Tercera");
        
         gatosMap.forEach((key,value)-> System.out.println(value.getColor()));
           
         System.out.println("");
         System.out.println("Cuarta");
         for(Gato i: gatosMap.values()){
             System.out.println(i.getColor());
         }
         
           System.out.println("");
         System.out.println("Quinta");
         for(String i: gatosMap.keySet()){
             System.out.println(i);
         }
         
         
         
//       System.out.println("Felix".compareTo("Lara"));      
//        System.out.println("FORMA TRADICIONAL");
//        gatosMap.put(b.getRaza(), b);
//        gatosMap.put(a.getRaza(), a);
//        gatosMap.put(c.getRaza(), c);
//        gatosMap.put(d.getRaza(), d);
//        gatosMap.put(e.getRaza(), e);
//        gatosMap.put(f.getRaza(), f);
//        gatosMap.put(g.getRaza(), g);
//        gatosMap.put(h.getRaza(), h);
//        
//        for (Map.Entry<String, Gato> i : gatosMap.entrySet()) {
//            String clave = i.getKey(); //En una variable metemos la clave para imprimir
//            Gato valor = i.getValue(); //En otra variable metemos el valor para imprimir
//
//            System.out.println(clave + " : " + valor); //Con toString imprime           
//        }
    }
}
