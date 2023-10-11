//Implementa una función: int[] suma(int t[], int numElementos), 
//que crea y devuelve una tabla con las sumas de los numElementos elementos consecutivos de t. Veamos un ejemplo, sea t=[10,1,5,8,9,2].
//Si los elementos de t se agrupan de 3 en 3, se harán las sumas:
//10+1+5. igual a 16.
//1+5+8 igual a 14.
//5+8+9 igual a 22.
//8+9+2 igual a 19.
//Por lo tanto la función devolverá una tabla con los resultados[16,14,22,19]
package arrays;

public class Ejercicio517pag159 {
    public static void main(String[] args) {
        int t[]={10,1,5,8,9,2};
        
    }
   int [] suma (int t[], int numElementos){
       int suma=0;
       for (int i = 0; i < t.length-3; i++) {
           
          suma=t[i]+t[i+1]+t[i+2];
       }
       
       int[]suma = new int(int t[],int numElementos);
   }
}
