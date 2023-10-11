//Crear y cargar una matriz con x filas y x columnas. Imprimir la diagonal principal
//Por ejemplo con una 4x4 se vería lo siguiente:
//X - - -
//- X- -
//- - X-
//- - - X
package arrays;
import java.util.Scanner;

public class Matriz 
{

    public static void main(String[] args) 
    {
//        String[][] t = new String[4][4];
        Scanner leer = new Scanner (System.in);
        int tamaño;
        
        System.out.println("Introduce el tamaño de la matriz: ");
        tamaño=leer.nextInt();
        
        char t[][] = new char [tamaño][tamaño];
        

        
//      //RELLENAMOS
      
        for (int i = 0; i <t.length; i++) {
            for (int j = 0; j <t.length; j++) {
                if (i==j){
                   t[i][j]='X';
                }
                else if (i+j == tamaño-1){
                     t[i][j]='X';
                }
                else {
                    t[i][j]='-';
                }
            }
        }
//        //IMPRIMIMOS
        
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j]);
                
            }
            System.out.println("");
        }
         
        
        
        
//      VERSION SIN RELLENAR (MALA)
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t[i].length; j++) { //Pongo longitud de i porque las columnas podrian sobrepasar a las filas.
//                if(i==j){
//                    System.out.print("X");
//                }
//                else{
//                    
//                System.out.print("-");
//                }
//            }
//            System.out.println("");
//           
//        }
 


// VERSION BUENA
//        //RELLENAMOS
//        char t[][] = new char[5][5];
//        for (char i = 0; i <t.length; i++) {
//            for (int j = 0; j <t.length; j++) {
//                if (i==j){
//                   t[i][j]='X';
//                }
//                else{
//                     t[i][j]='-';
//                }
//                
//            }
//        }   
//        //IMPRIMIMOS
//        
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t.length; j++) {
//                System.out.print(t[i][j]);
//                
//            }
//            System.out.println("");
//        }
        
//        //VERSION CONTRARIA
//        //        //RELLENAMOS
//        char t[][] = new char[5][5];
//        for (char i = 0; i <t.length; i++) {
//            for (int j = 0; j <t.length; j++) {
//                if (i+j==4){
//                   t[i][j]='X';
//                }
//                else{
//                     t[i][j]='-';
//                }
//                
//            }
//        }   
////        //IMPRIMIMOS
//        
//        for (int i = 0; i < t.length; i++) {
//            for (int j = 0; j < t.length; j++) {
//                System.out.print(t[i][j]);
//                
//            }
//            System.out.println("");
//        }
    }
}
