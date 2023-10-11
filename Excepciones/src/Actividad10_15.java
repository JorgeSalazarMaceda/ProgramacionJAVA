/*
Escribe el archivo numeros.txt, disponemos de una serie de números (uno por cada línea). 
Diseña un programa que procese el fichero y nos muestre el menor y el mayor.
 */
//En cada linea pongo un número y decir cual es el mayor y cual es el menor. Al primer numero que me digan, 
//le doy el titulo de menor y mayor, y lo recorres y cuando encuentre el numero mayor y menor le asigna el titulo. 
//Y al final del recorrido ya tendrá el titulo de menor y mayor.
//La dificultad es convertir los numeros a String. Con los wrappers (Integer)
/**
 *
 * @author Jorge
 */
import java.io.*;

public class Actividad10_15 {

    public static void main(String[] args) {
        BufferedReader in = null;
        int numero, max = 0, min = 9999;
        

        try {
            in = new BufferedReader(new FileReader("numeritos.txt"));

            String linea = in.readLine();
            while (linea != null) {
                numero = Integer.valueOf(linea);
                if (numero > max) {
                    max = numero;
                } else if (numero < min) {
                    min = numero;
                } else {
                    numero = numero;
                }
                linea= in.readLine(); 
              
            }
              System.out.println("El minimo es: " + min + " y el máximo es: " + max);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            }         
        }    
    }
}
