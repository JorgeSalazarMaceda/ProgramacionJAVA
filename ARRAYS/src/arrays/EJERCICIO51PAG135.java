//Ejercicio5.1 pagina 135 //  Crear una tabla de longitud 10 que se iniciará con números aleatorios
//comprendidos entre el 1 y el 100. Mostrar la suma de todos los numeros aleatorios.
package arrays;

public class EJERCICIO51PAG135 {
    public static void main(String[] args) {
        
        int tabla [];
        tabla =new int[10];
        
        //Vamos a recorrer la tabla para inicializar con valores aleatorios.
        //Cuando se modifican los elementos de una tabla no podemos usar for-each
        
        for (int i = 0; i < tabla.length; i++) {
            tabla [i] =(int)(Math.random()*100+1);          
        }
        //Ahora recorreremos la tabla para calcular la suma de sus elementos.
        int suma=0;
        
        for(int sumaaleatorio: tabla){
            suma+=sumaaleatorio;
        }
        
        System.out.println("La suma de los valores aleatorios es: " + suma);
    }
    
}
