/*
Pedir un entero n por consola y, a continuación pedir n números de tipo double, 
que iremos insertando en una tabla. Guardar eela tabla en un archivo binario.
 */
package ficherosbinarios;

/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;

public class Actividad11_3 implements Serializable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamano;

        System.out.println("Dime el tamaño de tu array: ");
        tamano = sc.nextInt();
        double array[] = new double[tamano];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Dime los numeros decimales: ");
            array[i] = sc.nextDouble();
             
        }
        System.out.println(Arrays.toString(array));
        
        try (ObjectOutputStream out = new ObjectOutputStream( new FileInputStream("datos1.txt"))){
            
        }
        
          

    }

}
