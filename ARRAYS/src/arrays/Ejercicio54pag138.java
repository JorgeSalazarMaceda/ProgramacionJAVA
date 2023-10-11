//Diseñar la funcion int maximo (int t[]) que devuelva el maximo valor contenido en la tabla t
package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio54pag138 {
    public static void main(String[] args) {
        int valor;
        int t [] = new int [2];
         Scanner leer = new Scanner(System.in);
         for (int i = 0; i < t.length; i++) {
         System.out.println("Introduce valores: " + i);
         valor=leer.nextInt();
         
         t[i]=valor;
         valor=leer.nextInt();
        }
         
        
       valor = maximo (t);
    }
    static int maximo (int t[]) {
        
        int max =t[0]; //El primer elemento será, en principio el máximo.
        //Suponemos que la tabla siempre tendrá al menos un elemento.
        //Vas buscando celda por celda el maximo y lo compara.
        for(int e:t){ //recorremos para biscar un elemento mayor que maximo
            if (e>max){ //si e (t[i] es mayor que max, es el nuevo máximo
                max=e;
            }
        }
        return (max);
    }
}
