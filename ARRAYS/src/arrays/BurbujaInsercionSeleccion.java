//Burbuja, inserccion y seleccion.
package arrays;
import java.util.*;
public class BurbujaInsercionSeleccion {

    public static void main(String[] args) {
        int tabla[] = {5, 13, 81, 2, 3, 6, 9, 8, 4, 7, 12, 55};

        //Burbuja
        ordenarBurbuja(tabla);
        ordenarInsercion(tabla);
        ordenarSeleccion (tabla);
    
    }
//Cambiamos posiciones 0 y 1
//Cambiamos posiciones 1 y 2
//Cambiamos posiciones 2 y 3
//Cambiamos posiciones 3 y 4
//Cambiamos posiciones 4 y 5
    
//cambiamos posiciones 0 y 1
//cambiamos posiciones 1 y 2
//cambiamos posiciones 2 y 3
    
//cambiamos posiciones 0 y 1   
    static void ordenarBurbuja(int[] tabla) {
        int tmp;
        for (int i = 0; i < tabla.length - 1; i++) {
            for (int j = 0; j < tabla.length - 1; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    tmp = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = tmp;     
                }
            } 
        }
         System.out.println(Arrays.toString(tabla));
    }

    static void ordenarInsercion(int[] tabla) {
        int pos,temp;
        for (int i = 0; i < tabla.length - 1; i++) {
           pos=i;
           while (pos>1 && tabla[pos]< tabla[pos-1]){ //(MIENTRAS LA POSICION SEA MAYOR QUE UNO Y LA ANTERIOR NO SEA MAYOR, SON DOS CONDICIONES)
              temp=tabla[pos-1];
              tabla[pos-1]=tabla[pos];
              tabla[pos]=temp;
              pos=pos-1;
               
           }  
        }
        System.out.println(Arrays.toString(tabla));  
    } 
    
    static void ordenarSeleccion (int[] tabla){
        int min,temp;
        for (int i = 0; i < tabla.length - 1; i++) {
            min=1;
            for (int j = 0; j < tabla.length - 1; j++) {
                if (tabla[j]<tabla[min]){ //(si hay una posicion j que es menor a la que tenia el titulo de minimo)
                    min=j;
                }
               temp=tabla[i];
               tabla[i]=tabla[min];
               tabla[min]=temp;
            }
        }
            System.out.println(Arrays.toString(tabla)); 
    }
}
