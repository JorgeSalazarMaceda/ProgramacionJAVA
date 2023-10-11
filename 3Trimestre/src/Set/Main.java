/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;

/**
 *
 * @author Jorge
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Clientes c1 = new Clientes("Paco", "paco@gmail.com", "Oro", 1);
        Clientes c2 = new Clientes("Mar", "mar@gmail.com", "Oro", 2);
        Clientes c3 = new Clientes("Juan", "juan@gmail.com", "Oro", 3);
        Clientes c4 = new Clientes("Pepe", "pepe@gmail.com", "Oro", 4);
        Clientes c5 = new Clientes("Jorge", "Jorge@gmail.com", "Oro", 5);
        Clientes c6 = new Clientes("Dante", "Jorge@gmail.com", "Oro", 6);
        //Dante y jorge tienen el mismo email, (ESTO ES IMPORTANTE PARA ENTENDERLO)
        //Set<Clientes> coleccion_clientes1 = new Set<Clientes>(); Esto estaria mal, no podemos crear un objeto set, hay que crear un objeto hashset
    //La forma correcta es esta
        
        Set<Clientes> listaclientes = new HashSet<Clientes>(); //TreeShet los ordenaria segun el criterio que le pongas
        HashSet<Clientes> listaclientes2 = new HashSet<Clientes>();
        
        listaclientes.add(c5);
        listaclientes.add(c2);
        listaclientes.add(c3);
        listaclientes.add(c4);
        listaclientes.add(c1);
        listaclientes.add(c6);
        
        //El add de c5 y c6 no se añaden cuando improtar el metodo equals y el hashCode
        
        for(Clientes varclientes: listaclientes){
            System.out.println(varclientes.getNombre()+", "+ varclientes.getEmail());
        }
        
        System.out.println(listaclientes);
        //EJERCICIOS
        //Dentro de la clase Clientes: PODRIA SER EXAMEN PARA VER QUE METODO ES EL NECESARIO
        //Criterio de orden natural (por defecto) : compara por tipo de cliente --> Seria el compareTo
        //Otro metodo: comparaPorNombre, que compare los clientes segun su nombre
        
        /*
        Para que yo pueda ejecutar esto
                if c1.comparaPorNombre(c2);
        */
        //El resultado seria este, comparas un nombre con otro, si es = 0 son iguales
        if(c1.comparaPorNombre(c2)==0){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        //Ejercicio 1 y 2 --> Por tipo. Como dice por defecto hay que hacer el compareTo
        //En la clase hemos implementado el compareTo (Que devuelve un entero y el compara por nombre).
        
    }
}
