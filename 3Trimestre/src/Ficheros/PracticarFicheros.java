package Ficheros;

//Implementa un programa que lea dos listas de números enteros no ordenados de sendos archivos con un número por linea,
//los reuna en una única lista y los guarde en orden creciente en un tercer archivo, de nuevo uno por linea.
//Tenemos una lista desordenada en dos ficheros y unirlas en una ordenada (Cuando esté todo leido, Arrays.sort).
//Coges un array de 0 posiciones y con copy off (length +1) 
//Despues un buffereader con un for y un new line

/**
THROWABLE "Arrojable" Es una clase y de ella heredan error (hardware como memoria) o exception.
* try = intenta --> Intenta hacer la instrucción y si no, captura la excepción.
* catch = capturar
* File = parámetro de tipo file es un archivo
* 
* Si el metodo va mal (en el try) se genera un objeto de tipo error que es capturado en el catch
 */
/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.Scanner;
public class PracticarFicheros {
    private static BufferedWriter out = null;
    private static String nombre;
    private static int edad;
    
    
    
    public static void main(String[] args) {
    
        try{
      Scanner sc = new Scanner(System.in);
      out = new BufferedWriter(new FileWriter("datos.txt",true));
            System.out.println("Dime el nombre: ");
            nombre= sc.next();
            
            System.out.println("Dime la edad: ");
            edad= sc.nextInt();
            
            String usuario = " Su nombre es" 
 + nombre + " y su edad es: " + edad;
            
            out.write(usuario);
            out.newLine();
            out.close();
        } catch (IOException ex){
            System.out.println("Error");
            System.out.println(ex.getLocalizedMessage());
        } finally{
            try{
                out.close();
            } catch(IOException ex){
                System.out.println(ex.getLocalizedMessage());
            }
        }
        
    }

}
