//Realiza la función: int[] buscarTodos(int[], int clave), que crea y devuelve una tabla con todos los índices de los elementos donde
//se encuentra la clave de busqueda. En el caso de que clave no se encuentre en la tabla t, la funcion devolverá una lista vacia.
package arrays;
import java.util.*;
public class EJERCICIO511PAG159 {
    public static void main(String[] args) {
        
        int tabla[]= {1,4,6,8,4,0}; 
//        int tabla[] = new int[5]; Aqui es necesario el new in porque no metes parametros, solo reservas el espacio de memoria.
  
        System.out.println(Arrays.toString(buscarTodos(tabla,7)));
        
    }
    
    static int[] buscarTodos(int tabla[], int clave){
        int contadorClaves=0,indice=0;
        
        
        for (int i = 0; i< tabla.length; i++) { //Con este for buscamos todas las claves para ver el tamaño que debe de tener el array que devolveremos
            if(tabla[i]==clave){
                contadorClaves++; //Para incrementar el contador de claves
            }
            
        }
        
        
        int resultado[] = new int[contadorClaves]; //Declaramos el nuevo array de resultado con el tamaño del numero de ocurrencias
        
        if (contadorClaves != 0) { //Si contador de claves es distinto de 0, entramos en el bucle porque si que tiene la coincidencia, ese 0 se refiere a las coincidencias.
            for (int i = 0; i < tabla.length; i++) { //Este otro bucle es para recorrerlo nuevamente y comprobar con el if si la clave coincide.
                if (tabla[i] == clave) { 
                    resultado[indice] = i; //Si coincide, necesitamos un array de indice de coincidencias para que nos devuelva el resultado.
                    indice++;
                }
            }
        }
        
        return resultado;
        
    }
}
