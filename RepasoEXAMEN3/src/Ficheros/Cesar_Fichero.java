/*
Crea un programa que inserte una palabra en un fichero.
Si existe el fichero, lo borra y lo vuelve a crear.
En caso de error (IOException) muestre solo el mensaje de error.
 */
package Ficheros;

/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.Scanner;
public class Cesar_Fichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedWriter out = null;
        try{
            out = new BufferedWriter(new FileWriter("C:\\Users\\Jorge\\Desktop\\a.txt"));
            System.out.println("Palabra: ");
            out.write(sc.next());
            out.newLine();
            out.close();
        }catch(IOException ex){
            System.out.println(ex.getLocalizedMessage());
            System.out.println("Error");
        }
    }
}
