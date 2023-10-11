/*
Diseñar un método que diga el numero más alto que haya introducido el usuario de
una matriz unidimensional y hacer un programa que haga uso de dicho método.
 */
package arrays;

/**
 *
 * @author Jorge
 */
import java.util.Arrays;
import java.util.Scanner;
public class Metodos_1 {
    
    public static int maximo(int[]a){  //Es static porque no hay objetos. Va a recibir un array de enteros
        int maximo=0;
        Arrays.sort(a); //Esto ordena el array (a)de menor a mayor
        maximo=a[a.length-1]; //Despues del sort, el maximo será el array de a, la ultima posición, porque ya esta ordenado.
        return maximo;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero;
        System.out.println("De cuanto quieres que sea tu array: ");
        numero=sc.nextInt();
        
        int []a = new int [numero]; //El tamaño será el que diga el usuario.
        for (int i = 0; i <a.length; i++) {
            System.out.println("Digite los valores del array: ");
            a[i]=sc.nextInt(); 
        }  
        System.out.println("El máximo del array será: " + Metodos_1.maximo(a));
    }
    
    
    // Lo hemos hecho con un for each
    
//  public static void main(String[] args) {
//    int maximo;
//    int minimo;
//    int[] serie = {10, 5, 1, 28, -10, 7, 12, 91, 19, 84,-22,530};
//  
//    maximo = serie[0]; 
//    minimo = serie[0];
//
//    for(int valor: serie){ //Es igual que un for pero para los arrays, sin contador. Valor es un puntero que va recorriendo y tomando los valores del array
//      if(valor > maximo){
//        maximo = valor;
//      }
//      if(valor < minimo){
//        minimo = valor;
//      }
//    }
//    System.out.println("El valor máximo es: " + maximo);
//    System.out.println("El valor míximo es: " + minimo);
//  }

    
    // Otra forma
//    
//     int num_array;
//   
//     //Introduce numero de celdas
//        System.out.println("Cuantas celdas tiene tu array: ");
//        num_array=sc.nextInt();
//        int array []= new int [num_array];
//        
//     //Introduce todos los numeros
//     for(int i=0; i<num_array; i++){
//         System.out.println("Introduce numero: ");
//         array[i]=sc.nextInt();
//     }
//        
//        System.out.println("El mayor de los numeros del arrays es : "+mayor(array)[0]);
//        
//        
//    }
//    public static int[] mayor(int num[]){
//int mayor=num[0];
//int resultado[]={mayor};
//
//    for(int i:num){
//        if(i>mayor){
//            mayor=i;
//        }
//    }
//    resultado[0]=mayor;
//    return resultado;
//    }
}
