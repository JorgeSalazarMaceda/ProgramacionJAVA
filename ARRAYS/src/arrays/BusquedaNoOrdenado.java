
package arrays;

public class BusquedaNoOrdenado {
    public static void main(String[] args) {
        
        //PARA LOS NO ORDENADOS
        int clave=4,i=0; //Si esta devuelve la posición, si no imprime que no lo encuentra
        int array[]={4,2,1,3,5};
        
        while(i<array.length&&array[i]!=clave){
            i++;
            if(i==array.length){
                System.out.println("Numero no encontrado");
                
            }
        }
        System.out.println(i);
    }
  
}
