/*
Escribe un programa que lea un fichero llamado carta.txt. Tenemos que contar los caracteres, las lineas y las palabras. 
Para simplificar supondremos que cada palabra está separada de otra por un único espacio en blanco o por un cambio de línea.
 */
//Con el readline puedes ver cada linea, y con el Scanner .next() puedes recoger los caracteres
/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.Scanner;

public class Actividad10_14 {

    public static void main(String[] args) {

        int caracteres = 0, lineas = 0, palabras = 0;
        try ( BufferedReader in = new BufferedReader(new FileReader("carta.txt"))) {
            String linea = in.readLine(); //Para leer el texto. 
            while (linea != null) { // Este while son las lineas hacia abajo. Mientras no llegue al final del archivo, voy leyendo lineas con el readLine, y para ello pongo lineas++
                //Antes haciamos el Scanner con el System.in, pero el flujo de entrada para el Scanner no va a ser el teclado, va a ser el String.
                //Pues mientras haya algo que leer, con has next (next palabra) va a llamar al bucle y contar las palabras.
                //Es interesante que se haga el readLine fuera del bucle porque hay que leer una primera linea
                //Ahora solo me falta saber el numero de caracteres, con el length
                while (linea != null) {
                    lineas++;
                    Scanner sc = new Scanner(linea);
                    while (sc.hasNext()) {
                        palabras++;
                        String palabra = sc.next();
                        caracteres += palabra.length();
                    }
                    linea = in.readLine();
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        System.out.println("Numero de lineas: " + lineas);
        System.out.println("Numero de palabras: " + palabras);
        System.out.println("Numero de caracteres: " + caracteres);
    }
}
