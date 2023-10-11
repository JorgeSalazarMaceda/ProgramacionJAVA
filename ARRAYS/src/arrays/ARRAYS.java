//Funcion Fill (para rellenar el array por defecto con x caracteres)
//System.out.println(Arrays.toString(nombreArray)); --> Imprime el array
//Ordenacion de un array:Arrays.sort(nombreArray)); --> De menor a mayor
//Busqueda, hay dos: No ordenado (Hay que recorrer de inicio a fin) u Ordenado (Recorremos de mitad a mitad)
//Para hacer la busqueda ordenada rápida usamos: binarySearch (tipo array [], tipo que buscamos ) te devuelve positivo si encontró (y ese positivo significa en que posición está),
//negativo si no se encontró (ese negativo te dice la posicion donde deberia estar, es decir, - nº negativo - 1 nos dará la posición donde insertar)
//Copiar un Array (crea array):Arrays.copyOf(array,longitud);--> La longitud es el número de valores que quieres que copie
//Copiar Array con origen y final (crea array): copyOfRange (tipo origen [],int desdes, int hasta); --> desde y hasta son las posiciones
//Copiar Array (no crea array): System.arraycopy(tipo origen [],int posOrigen, tipo destino[], int porDestino, int longitud);

//Los algoritmos de ordenación.
// EL DE BURBUJA       (ineficiente) va recorriendo todo el array y compa
//for i=1 TO n - 1   (seria for (int i = 1; i<m.length-1 ;i++) porque el ejemplo está en pseudocódigo.
//    for j=1 TO n - 1
//        IF m[j]> m[j+1]
//            tmp=m[j]
//            m[j]=m[j+1]
//            m[j+1]=tmp
//        END IF
//    END FOR
//END FOR

//EL DE INSERCIÓN, va insertando elementos en la parte de la izquierda 
//y esa parte de la izq es lo considerado como ordenado y lo de la derecha lo desordenado
//Va a ir buscando cada vez en un array mas pequeño porque dada vez va a haber mas elementoss ordenados en la izq
//Al insertar el elemento lo inserta en la parte ordenada y en la posición correcta porque va preguntando posición a posición
//Por esto la parte ordenada se va haciendo mas grande y la desordenada (en la derecha) va encogiendo.
//FOR i = 1 TO n
//pos = i (esto es la flecha)
//while pos>1 AND m[pos]<m[pos-1] (MIENTRAS LA POSICION SEA MAYOR QUE UNO Y LA ANTERIOR NO SEA MAYOR, SON DOS CONDICIONES)
//temp=m[pos-1]
//m[pos-1]=m[pos]
//m[pos]=temp
//pos=pos-1
//END WHILE
//END FOR

//EL DE SELECCION va recorriendo el array y en cada vueelta va buscando el minimo, lo selecciona y va buscando (mientras recorre)
//es mas pequeño? y así sucesivamente y si es mas pequeño le da el titulo de pequeño, pregunta en la siguiente posición y si es mas pequeño le da 
//el titulo.
//Cuando encuentra el mas pequeño intercambia el que tenias como mas pequeño con el que has encontrado el mas pequeño 
//(en clase del 6 que era el mas pequeño al 1) El 1 está ordenado, por lo que empieza la segunda vuelta.
//FOR i = 1 TO n -1
//    min = i 
//    for j = i + 1 TO n
//        if v[j] < v [min] then min = j (si hay una posicion j que es menor a la que tenia el titulo de minimo)
//    END FOR
//    temp =v[i]
//    v[i]=v[min]
//    v[min]=temp
//END FOR


//Algoritmos de ordenación RECURSIVOS (QUICKSORT o de Partición Y MERGESORT)

//El quicksort es el algoritmo de ordenación más rápido.
//Se basa en divide y vencerás, va subdividiendo el array en arrays mas pequeños y los ordena. Es un algoritmo recursivo.
//Necesita un pivote.
//Un indice o parte izquierda.
//Un indice de la parte derecha.
//La clave del quicksort está en la elección del pivote y la diferencia está en como se selecciona. Por ej {6,4,2,1,3,5}.
//Coges el 5 y todos los elementos mas pequeños del 5 los pones a su izquierda y todos los que son mayor los pones a la derecha. entonces {4,2,1,3,5,6}
//Y hace una matriz de{4,2,1,3,(5)6} y vuelve a hacer esa operación una y otra vez.
//{4,2,1,3} coge el 3 y los elementos menores al 3 van a la izquierda y los mayores van a la derecha. y así sucesivaente.
//{2,1,(3),4}.
//Cada paso de estos se le conoce como una llamada de quicksort.
//Luego va haciendo (llamadas de quicksort) y va haciendo como una ramificación de un arbol. Coge otro pivote (salen arrays mas pequeños y va haciendo quicksort de cada array)

//MERGESORT
//Busca la mitad del array y cuando lo tiene genera un array troceado en 2(GENERA DOS ARRAYS) y así sucesivamente hastaa el caso 0 y luego, cuando tiene elementos individuales los junta ya ordenados.
//Mergesort desconstruye y el merge construye ordenando.

package arrays;
import javax.swing.*;
public class ARRAYS 
{

    public static void main(String[] args) 
    {
       String colores[] = new String [4];
       //Introduzco valores
        for (int i = 0; i < colores.length; i++) { 
            colores[i]=JOptionPane.showInputDialog("Colores");
            
        }
        for (int i = 0; i < colores.length; i++) {
            System.out.println("Opcion 1: Pinto valores");
            System.out.println(colores[i]);
            
        }
        
        //Otra forma de pintar un array es
        System.out.println("Opcion 2:pinto los valores: ");
        for (String a:colores) {
            System.out.println(a);
        }
        
//        // String numeros[] = new String [4], con numeros la opcion 2 de recorrer con for each es
//       //Introduzco valores
//       numeros [0]=3;
//       numeros [4]=-2;
//       numeros [2]=8;
//        for (int viernes:numeros) {
//            System.out.println("viernes");
//            
//        }
    }
    
}
