//Haz un array que muestre los números pares. Por lo que tenemos que crear un array para quedarnos con las posiciones pares
//Tenemos el problema de que el array puede ser impar o par, por lo que en caso de ser impar habra que hacer una condicion para que le sume 1.
package arrays;

import java.util.Arrays;

public class ArrayPares 
{
    public static void main(String[] args) 
    {
        
        //Creamos el método, necesitamos que se genere un nuevo array con las posiciones pares, por lo que tenemos que
        int array []=  {0,1,2,3,4,5};
        System.out.println(Arrays.toString(array)); //to String es para que te imprima el array entero.
        System.out.println(Arrays.toString(pospares(array)));
    }
        //Ahora hacer un método de array que devuelva las posiciones pares. La posición 0, 2 y 4. Entonces aquí sería el 1,45,78.
    public static int [] pospares(int array[]) { //Queremos que se genere un nuevo array, por lo que no puede ser un void, queremos que nos devuelva un nuevo array
        int longitud=array.length/2,posicion =0; //Creamos un array con la longitud dividida entre dos, ya que los pares serán la mitad.
        
        if(array.length %2 !=0) longitud ++; //Si los arrays son impares, se le suma longitud +1.
        int arrayC[] =new int [longitud]; //Aqui creas el array con la longitud.
        
        for (int i = 0; i < array.length-1; i ++) { //Lo recorremos
            if(i%2==0){
                arrayC[posicion]=array[i]; //Cuando el array está en la posición par, devuelve i para tener las posiciones pares. 
                //Queremos que se vaya incrementando.
                posicion++;
            }
        }
        return arrayC;
    }
}
