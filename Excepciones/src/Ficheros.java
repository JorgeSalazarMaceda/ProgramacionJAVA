/*
Lee el archivo de texto de uno de los proyectos y muestralo por pantalla
 */

/**
 *
 * @author Jorge
 */
import java.io.*;

public class Ficheros {

    public static void main(String[] args) {
        String texto = "";
        FileReader in = null; //Se declara fuera del try para que sea accesible tabien desde fuera

        try {
            in = new FileReader("C:\\Users\\Jorge\\Documents\\NetBeansProjects\\Excepciones\\Pepito.txt"); //Dejando el fichero dentro del paquete
            // C:\ ruta...
            //No es necesario poner la ruta completa
            //in = new FileReader(.....Ruta) Se podria tambien la ruta c
            int c = in.read(); //read() devuelve un entero
            while (c != -1) { //-1 cuando llegue al final del archivo
                texto = texto + (char) c;
                c = in.read();
                
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Ha entrado en el catch");
        } finally {
            if (in != null) {
                try {
                    in.close();
                    System.out.println("Ha cerrado el fichero");
                } catch (IOException ex) {
                    System.out.println(ex);
                    
                }
            }
        }
        System.out.println(texto);
    }
}
