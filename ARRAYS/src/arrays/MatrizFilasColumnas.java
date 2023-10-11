//Crear y cargar una matriz de 3 filas por 4 columnas.
//Hacer:
//- Método que imprima la primera fila
//- Método que imprima la última fila
//- Método que imprima la primera columna
//- Método que imprima la primera fila, la última fila y la primera columna
package arrays;

public class MatrizFilasColumnas 
{
    public static void main(String[] args) 
    {
        int miMatriz[][] = new int[3][4];
        int cont=1;
        for (int fila = 0; fila < miMatriz.length; fila++) {
            for (int columna = 0; columna < miMatriz[fila].length; columna++) {
                miMatriz[fila][columna]=cont; //Esto es para rellenar la matriz con fila y con j. Así se van incrementando.
                cont++;
                
            }        
        }  
        imprimirPrimeraFila(miMatriz);
        System.out.println("-----------------");
        imprimirUltimaFila(miMatriz);
        System.out.println("------------------");
        imprimirPrimeraColumna(miMatriz);
        System.out.println("------------------");
        imprimir(miMatriz);
    }
    public static void imprimirPrimeraFila ( int[][] miMatriz){
        for (int columna = 0; columna < miMatriz[0].length; columna++) { //añadimos el corchete [0] porque queremos que muestre la fila en su posicion 0.
            System.out.println("La primera fila es: " + miMatriz[0][columna]); //Con mi matriz 0 indicamos que es la primera fila y con fila mostramos las columnas.
        }
    }
    public static void imprimirUltimaFila (int[][] miMatriz){
        for (int columna = 0; columna < miMatriz[miMatriz.length - 1].length; columna++) {
           System.out.println("La última fila es: " + miMatriz[miMatriz.length - 1][columna]); //Con mi matriz 2 indicamos que es la última fila y con fila mostramos las columnas. 
            
        }
    }
    public static void imprimirPrimeraColumna (int[][] miMatriz){
        for (int fila = 0; fila < miMatriz.length; fila++) {
             System.out.println("La primera columna es: " + miMatriz[fila][0]);
            
        }  
    }
    public static void imprimir (int[][] miMatriz){ //Las funciones ya están hechas, por lo que solo es invocarlas nuevamente en un nuevo método.
        System.out.println("***************");
        imprimirPrimeraFila(miMatriz);
        System.out.println("***************");
        imprimirUltimaFila(miMatriz);
        System.out.println("***************");
        imprimirPrimeraColumna(miMatriz);
        
    }
}