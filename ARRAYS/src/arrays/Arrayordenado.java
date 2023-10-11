//Ejercicio 55 PAG 146
//Escribe en una funcion el comportamiento de la inserción ordenada.
//La inserción ordenada consiste en añadir un nuevo elemento en la tabla en la posición adecuada para que la tabla continue ordenada.
//Se utiliza el nombre de t con una casilla mas, para saber la longitud usas el lengh y generas un array con copyof.lenght +1


package arrays;
import java.util.*; //Esto es para Scanner y para Arrays. con java.util * (entra todo, scanner y arrays.
public class Arrayordenado 
{

    public static void main(String[] args)
    {
        //Declaramos la tabla y la variable que falta.
        
    int tabla[]={1,2,3,5,6};
    int nuevo=4; //El valor a introducir
    
    int insercion=Arrays.binarySearch(tabla,nuevo);

    //Si insercción es >=0, el nuevo elemento (que está repetido) se inserta en el lugar en que ya estaba,
    //desplazando al original. Si por el contrario: if (insercion < 0) {//si no lo encuentra
    //calcula donde debería estar insercion=-insercion-1
    
    if (insercion < 0) { //Si el binarySearch no lo encuentra dará un número negativo y con insercion=-insercion-1; nos dice la posición.
        insercion=-insercion-1;
    }
    int copia[]=new int[tabla.length+1]; // Esto es para generar una nueva tabla con longitud +1.
    //Copiamos los elementos antes del hueco.
    
    System.arraycopy(tabla, 0, copia, 0,insercion);
    //copiamos desplazados los elementos tras el hueco
    System.arraycopy(tabla, insercion, copia, insercion+1, tabla.length-insercion);
    copia[insercion]=nuevo; //Asignamos el nuevo elemento, es decir, el 4
    tabla=copia; // Hacemos referencia a tabla con copia.
        System.out.println(Arrays.toString(tabla)); //Mostramos por consola.
    }
    
}
