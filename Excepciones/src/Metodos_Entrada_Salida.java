/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Metodos_Entrada_Salida {
//El problema es que ahora, tenemos hecho el metodo para escritura, que recibe un array, y ese array se escribe en el texto en blanco.
    //Pero para hacer el metodo de leer... Lo que recibirá el metodo de lectura es un texto ya escrito... Entonces... ¿Cómo se hace??
    
//    static void leerFichero(bufferedReader in,int numeros[]){
//        for (int i = 0; i < 10; i++) {
//            System.out.println(numeros[i]);
//        }
//    }
    public static void main(String[] args) {

        BufferedReader in = null;
        
        int[] numeros = new int[0];
//BufferedReader es como el cajon que envia todos los caracteres de la linea, así nos ahorramos interacciones, porque si no, 
//tendriamos que interactuar con cada caracter viendolo con charat.
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\Jorge\\Documents\\NetBeansProjects\\Excepciones\\linea1.txt"));
            String linea_numeros = in.readLine(); //Leemos la cadena de números, aqui va almacenadoss los datos del texto como String, que luego, con el interger.valueOf lo pasamos a int   

            while (linea_numeros != null) {
                int copia[] = Arrays.copyOf(numeros, numeros.length + 1);//Copia y Crea Array: int copia[] = Arrays.copyOf(array, longitud); -> Lontitud = nº de valores a copiar
                copia[copia.length - 1] = Integer.valueOf(linea_numeros);
                numeros = copia;
                linea_numeros = in.readLine();
            }
            System.out.println(Arrays.toString(numeros)); //Para verlo
            in.close();

            
            //Segundo texto, hacemos lo mismo
            in = new BufferedReader(new FileReader("C:\\Users\\Jorge\\Documents\\NetBeansProjects\\Excepciones\\linea2.txt"));
            linea_numeros = in.readLine(); //Leemos la cadena de números.    

            while (linea_numeros != null) {
                int copia[] = Arrays.copyOf(numeros, numeros.length + 1);//Copia y Crea Array: int copia[] = Arrays.copyOf(array, longitud); -> Lontitud = nº de valores a copiar
                copia[copia.length - 1] = Integer.valueOf(linea_numeros);
                numeros = copia;
                linea_numeros = in.readLine();
            }
            System.out.println(Arrays.toString(numeros));
            
            //Lo ordenamos y mostramos
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
            
            //Ahora escribimos esto en el fichero llamado TextoBlanco.txt con un método llamado escribirFichero
            
            
            escribirFichero(numeros);
        } 
        
        catch (IOException ex) {
            System.out.println(ex.getMessage());

        } finally {
            if (in != null) {
                try {
                    in.close(); //Cierra las lecturas
                    
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }     
    }
    static void escribirFichero(int numeros[]){
            BufferedWriter out = null; //Creamos el buffered para que el array que reciba quede almacenado
            try{
               out = new BufferedWriter(new FileWriter("TextoBlanco.txt",true)); //True, Para que no lo sobreescriba y me cree otra linea
            //String nuevaLista_Numeros = out.readLine(); Esto no haria falta porque ya vamos a usar el propio array en vez de una variable
               //Hacemos un for para recorrer el array 
            for (int i = 0; i < numeros.length; i++) {
                out.write(String.valueOf(numeros[i])); //out.write es para escribir dentro del array y hacemos el cambio, 
                                                        //porque es un array de enteros y necesitamos cambiarlo a String
                out.newLine();  
                }        
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
            finally{
                if (out!= null){
                    try{
                        out.close(); //Cerramos el buffer y hacemos que escriba en el archivo
                    }
                    catch(IOException ex){
                        System.out.println(ex);
                    }
                }
            }
        }
}

