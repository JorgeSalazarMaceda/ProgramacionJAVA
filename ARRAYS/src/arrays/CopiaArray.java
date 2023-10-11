
package arrays;

import java.util.Arrays;

public class CopiaArray {
    public static void main(String[] args) {
        int busqueda;
        int clave=4;
        int clave2=8;
        int array[]={1,2,3,4,5,6,7,8};
        
       int copia []=Arrays.copyOf(array, array.length);//Copia y Crea Array: int copia[] = Arrays.copyOf(array, longitud); -> Lontitud = nº de valores a copiar
        System.out.println(Arrays.toString(copia));
        
        
        int copia2[]=Arrays.copyOfRange(array, 1, 4);//Copia y Crea Array con Origen y Final: copyOfRange(tipo origen[], int desde, int hasta); -> Desde / Hasta = posiciones
        System.out.println(Arrays.toString(copia2));
        
        int copia3[]=new int[2];//Copia y NO Crea Array: System.arraycopy(tipo origen[], int posOrigen, tipo destino[], int posDestino,int longitud);
        System.arraycopy(array,1,copia,0,2);
        System.out.println(Arrays.toString(copia2));
    }
}
