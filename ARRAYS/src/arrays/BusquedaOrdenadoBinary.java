
package arrays;
import java.util.*;
public class BusquedaOrdenadoBinary {
    public static void main(String[] args) {
        int busqueda;
        int clave=4;
        int clave2=8;
        int array[]={1,2,3,4,5};
        
        System.out.println(Arrays.binarySearch(array,clave));   //Esto te devuelve, si está, la posicion donde esta.
        System.out.println(Arrays.binarySearch(array,clave2));
        //Esta formula es para que nos diga donde iria el que no se encuentra, hemos hecho clave dos para ver la opcion que no esta
        System.out.println("La posición donde se tiene que insertar es: " + (-(Arrays.binarySearch(array,clave2))-1)); 
        //Ahora lo hacemos con una condicion, si lo encuentra te dice donde esta, si no, te dice donde deberia estar
        busqueda=Arrays.binarySearch(array,clave);
        
        if(busqueda>0){
            System.out.println(busqueda);
        }
        else{
            System.out.println(-busqueda-1);
        }
    }
 
}
