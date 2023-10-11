/*
/*
Ejercicio 10.16: Un libro de firmas es útil para recoger los nombres de todas las personas que han pasado por un determinado lugar.
Crea una aplicación que permita mostrar el libro de firmas e insertar un nuevo nombre (comprobando que no se encuentre repetido).
Llamaremos al fichero firmas.txt
 */
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Actividad10_16 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            File fichero = new File("C:\\Users\\Jorge\\Documents\\NetBeansProjects\\Excepciones\\firmas.txt"); //Creamos un objeto de tipo file llamado fichero.

            boolean fin = false; //Variable booleana true (fin programa, al pulsar 0) // false (dentro programa).
            
            while (fin == false) {
                switch (menu()) {
                    case 0:
                        fin = true;
                        System.out.println("Adios");
                        break;
                    case 1:
                        mostrarLibro(fichero, in); //Llamada a método
                        break;
                    case 2:
                        insertarFirma(fichero, out); //Llamada a método
                        break;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    static int menu() {
        int menu;

        System.out.println("Seleccione la opción que desee:");
        System.out.println("0 - Fin Programa");
        System.out.println("1 - Mostrar Libro de Firmas");
        System.out.println("2 - Insertar Nuevo Nombre");

        menu = sc.nextInt();

        while (menu < 0 || menu > 2) {
            System.out.println("Error, introduzca una opción válida: ");
            menu = sc.nextInt();
        }
        return menu;
    }

    static void mostrarLibro(File fichero, BufferedReader in) throws Exception { //Recibe por parámetro el objeto de tipo file "fichero" y da la opcion de leer.
        in = new BufferedReader(new FileReader(fichero));
        String linea = in.readLine();
        while (linea != null) {
            System.out.println("-----------");
            System.out.println("   " + linea);
            System.out.println("-----------");
            linea = in.readLine();
        }
        in.close();
    }

    static void insertarFirma(File fichero, BufferedWriter out) throws Exception {
        String firma;
        out = new BufferedWriter(new FileWriter(fichero, true));

        System.out.println("Ingrese la firma: ");
        firma = sc.next();
        out.write(firma);
        out.newLine();

        out.close();
    }
}
