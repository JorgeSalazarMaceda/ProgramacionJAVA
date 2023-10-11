/*
Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse en el fichero "datos.txt".
Si este fichero existe, deben añadirse al final en una nueva linea y en caso de no existir, debe crearse.
 */

/**
THROWABLE "Arrojable" Es una clase y de ella heredan error (hardware como memoria) o exception.
* try = intenta --> Intenta hacer la instrucción y si no, captura la excepción.
* catch = capturar
* File = parámetro de tipo file es un archivo
* 
* Si el metodo va mal (en el try) se genera un objeto de tipo error que es capturado en el catch
 */
import java.io.*;
import java.util.Scanner;

public class Actividad10_12 {

    public static void main(String[] args) {
        BufferedWriter out = null;
        String nombre;
        int edad;

        try {
            //Crea un objeto de salida de tipo buffered que recibe un parametro file (archivo)
            out = new BufferedWriter(new FileWriter("datos.txt", true)); //True para que no lo machaque y añada lineas
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el nombre: ");
            nombre = sc.next();
            System.out.println("Dime la edad: ");
            edad = sc.nextInt();

            String usuario = "Su nombre es " + nombre + " y su edad es " + edad;

            out.write(usuario);
            out.newLine(); //Salto de linea
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

