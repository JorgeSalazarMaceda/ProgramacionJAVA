package Ficheros;

/*
Diseña una pequeña agenda, que muestra el siguiente menú:
1.Nuevo nombre.
2.Buscar por nombre.
3.Mostrar todos.
4.Salir
En ella, guardaremos el nombre y el teléfono de un maximo de 20 personas. 
La opción 1 nos permitirá introducir un nuevo nombre siempre 
y cuando la agenda no esté llena, comprobando que el nombre no se encuentra insertado ya.

La opción 2 muestra todos los teléfonos que coinciden con la cadena que se busca. 
Por ejemplo, si tecleamos "Pe" mostrará el teléfono de Pedro, de Pepe y de Petunia.

La opción 3 mostrará mostrará un listado con toda la información (nombres y teléfonos) ordenados alfabéticamente por el nombre.

Por último, la opción 4 guarda todos los datos de la agenda en el archivo "agenda.txt.

La próxima vez que se ejecute la aplicación, si hay datos guardados, se cargarán en memoria.

 */

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.io.*;

public class agenda {
    static Scanner sc = new Scanner(System.in);
    //Métodos
    
        static int menu(){
        int menu;
        System.out.println("Introduce la opción de tu agenda: ");
        System.out.println(" 1 = Añadir contacto");
        System.out.println(" 2 = Buscar por nombre");
        System.out.println(" 3 = Mostrar todos los contactos ordenados alfabéticamente");
        System.out.println(" 4 = Guardar todos los datos en el archivo agenda.txt y salir");
        
        menu=sc.nextInt();
        
        while (menu<1 || menu>4){
            System.out.println("Error, inserta tu opción de menú");
            menu=sc.nextInt();
        }
        return menu;
    }
        
        
        
//        static void insertarFirma(File fichero, BufferedWriter out) throws Exception {

//    }
        // Menu 1.
        static void insertarContacto (File fichero, BufferedWriter out) throws Exception{
        String nombre= "";
        int telefono;
        out = new BufferedWriter(new FileWriter(fichero, true));

        if(nombre.equalsIgnoreCase(nombre)){
            System.out.println("No puedes repetir nombres");
        } else{
             System.out.println("Ingrese el nombre: ");
                nombre = sc.next();
                out.write(nombre);
                System.out.println("Ingrese el teléfono: ");
                telefono = sc.nextInt();
                out.write(nombre);
                out.write(telefono);
                out.newLine();
            }
        out.close();  
        }

        
        
        
         //Menu 2
    public void buscarContacto(String nombre){
        boolean encontrado = false; //En una busqueda siempre es bueno decir si se ha encontrado o no.
        if (nombre!=null && nombre.equalsIgnoreCase(nombre)){
            System.out.println("El contacto es: " + nombre + "y el teléfono: " + telefono);
        }
        for (int i = 0; i < contactos.length && !encontrado; i++) {//!encontrado seria true (encontrado). Entonces deja de buscar ya y dime que lo has encontrado.
            if(contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("El teléfono es: " + contactos[i].getTelefono());
                encontrado = true;
            }
        }  
    }
        
        
        
        
        
        
        
        
        
        
    public static void main(String[] args) {
     BufferedReader in = null;
     BufferedWriter out = null;
      miAgenda[] = new Agenda[20];
     try{
         File fichero = new File ("agenda.txt");
         
         boolean fin = false;
         while(fin == false){
             //    //Tendremos, con las opciones, ir llamando a cada método.
            switch (menu()) {
                case 1:
                    System.out.println("Añade un contacto");
                    break;
                case 2:
                    System.out.println("Muestra el contacto: ");
                    break;
                case 3:
                    System.out.println("Muestra todos los datos");
                    break;
                case 4:
                    fin = true;
                    System.out.println("Hemos guardado tu contacto");
                    System.out.println("Adios");
                    break;
            }
        }
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
}
