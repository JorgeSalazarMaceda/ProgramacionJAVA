/*
Escribir en un archivo datos.dat los valores de una tabla de diez enteros.
 */
package ficherosbinarios;

import java.io.*;

/**
 *
 * @author Jorge
 */
public class Actividad11_1 implements Serializable {

    public static void main(String[] args) {
        // Inicializamos la tabla con enteros del 0 al 9. Luego creamos el archivo y le asociamos un flujo de 
        //salida de la clase ObjectOutputStream. A continuación, recorremmos la tabla escribiendo enteros en el.

        int[] t = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //Array de enteros con 10 posiciones
        ObjectOutputStream flujoSalida = null;

        try {
            flujoSalida = new ObjectOutputStream(new FileOutputStream("datos.dat"));
            for (int n : t) {
                flujoSalida.writeInt(n);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
        if(flujoSalida !=null){
            try{
                flujoSalida.close();
            } catch (IOException ex){
                System.out.println(ex);
            } 
        }
    }
    }

}
