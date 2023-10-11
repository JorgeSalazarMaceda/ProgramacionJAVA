/*
Escribe como una cadena, en el fichero binario cancionPirata.dat, la siquiente estrofa:
                  "Con 10 cañones por banda, \n"
                + "viento en popa a toda vela, \n"
                + "no corta el mar, sino vuela \n"
                + "un velero bergantín";
 */
package ficherosbinarios;

/**
 *
 * @author Jorge
 */
import java.io.*;
public class Actividad11_2 implements Serializable{
    public static void main(String[] args) {
        //Como no se trata de un archivo de texto, convertimos la estrofa en una cadena, 
        //incluyendo los cambios de línea, y luego la escribimos en el flujo como un objeto String
        String estrofa = "Con 10 cañones por banda, \n"
                + "viento en popa a toda vela, \n"
                + "no corta el mar, sino vuela \n"
                + "un velero bergantín";
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))){
            out.writeObject(estrofa);
                    
        }catch (IOException ex){
            System.out.println(ex);
        } 
    }
}
