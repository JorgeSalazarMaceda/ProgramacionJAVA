package arrays;
/*
Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
 */
/**
 *
 * @author Jorge
 */
import java.util.Scanner;

public class Practicas_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int suma[][] = new int [3][3];

  // M A T R I Z      A 
        //Introducimos elementos en matriz a
        System.out.println("Digite la Matriz a: ");
        for (int i = 0; i < a.length; i++) { //filas
            for (int j = 0; j < a.length; j++) { //columnas
                System.out.println("Matriz a: [" + i + "] [" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }
        // for para imprimir array de arrays u array bidimensional, dara todo ceros porque la matriz es de 3x3 pero no tiene elementos
        for (int i = 0; i < a.length; i++) { //Número de filas
            for (int j = 0; j < a.length; j++) { // Número de columnas
                System.out.print(a[i][j]);//Qutamos el salto de linea
            }
            System.out.println("");
        }
        
        
    // M A T R I Z      B

    //Introducimos los elementos de la matriz b
        System.out.println("Digite la matriz b: ");
        for (int i = 0; i < b.length; i++) { //filas
            for (int j = 0; j < b.length; j++) { //columnas
                System.out.println("Matriz b: [" + i + "] ["+ j +"]");
                b[i][j]= sc.nextInt();
            }
        }
        // Imprimimos array b
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j]); //Quitamos el salto de linea
            }
            System.out.println(""); 
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j]=a[i][j] + b[i][j];       
            }      
        }
        System.out.println("Imprimiento la matriz suma, que es la suma de la matriz a y b");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(suma[i][j]+" ");
            }
            System.out.println("");
        }
    }
} 

//Ejemplo con elementos ya introducidos para hacerlo mas facil

// public static void main(String[] args) {
//       int matrizA[][] = {{1,2,3},{4,5,6},{7,8,9}};
//       int matrizB[][] = {{1,2,3},{4,5,6},{7,8,9}};
//       int matrizC[][] = new int [3][3];
//       
//       
//       for(int i=0;i<3;i++){
//           for(int j=0;j<3;j++){
//               matrizC[i][j] = matrizA[i][j]+ matrizB[i][j];
//               
//           }
//       }
//       
//        System.out.println("Imprimiendo la matriz C resultante de sumar la Matriz A con la Matriz B");
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(matrizC[i][j]+" ");
//            }
//            System.out.println("");
//        }
//    }
