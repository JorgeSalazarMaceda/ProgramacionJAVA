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

public class MiAgenda {
    
    static File archivo = new File ("agenda.txt"); //Declaramos la variable file de archivo
    
    //Elementos para escribir (archivo fuera) y leer (in).
    
    BufferedReader in = null;
    BufferedWriter out = null;
    
    //Métodos
    //Menu 1
    public void insertarContacto(Contacto persona){
        try {
          out = new BufferedWriter(new FileWriter(archivo, true)); //True es para que no sobreescriba
        if(!archivo.exists()){
            archivo.createNewFile();
        }else{
            out.write(persona.toString());
            out.close();
        }
        } catch(IOException e){ //Por la entrada
            System.out.println("La excepción mas concreta sería: " +e.getMessage() );
        } catch (Exception e) { //Excepción más genérica
            System.out.println("lgo fue mal, la excepción" + e.getMessage());
        }
    }
    
    //Menu 2
    
    public void buscarContacto(String nombre) {
         try {
            in = new BufferedReader(new FileReader(archivo));
             String linea = in.readLine(); //Variable String para poder leer
             while (linea != null) { //Recorremos todos los elementos de la cadena
            System.out.println("-----------");
            System.out.println("   " + linea);
            System.out.println("-----------");
            linea = in.readLine();
        }
            in.close();
        } catch (IOException e) { //Por la entrada
            System.out.println("IO Exception: " +e.getMessage());
        }
        catch (Exception e) { //Excepción más genérica
            System.out.println("Exception: " +e.getMessage());
        }
    }
    
    //Menu 3
    public void listadoCompleto(){
        try {
            in = new BufferedReader(new FileReader(archivo));
             String linea = in.readLine(); //Variable String para poder leer
             while (linea != null) { //Recorremos todos los elementos de la cadena
            System.out.println("-----------");
            System.out.println("   " + linea);
            System.out.println("-----------");
            linea = in.readLine();
        }
            in.close();
        } catch (IOException e) { //Por la entrada
            System.out.println("IO Exception: " +e.getMessage());
        }
        catch (Exception e) { //Excepción más genérica
            System.out.println("Exception: " +e.getMessage());
        }
    }
    
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu=0;
        MiAgenda agenda = new MiAgenda();
        String nombre;
        Contacto persona = null;
        
        
        while(menu!=4){
           System.out.println("Seleccione la opción que desee:");
        System.out.println("1 - Ingresar Contacto");
        System.out.println("2 - Leer Contacto");
        System.out.println("3 - Buscar contacto por nombre");
        System.out.println("4 - Salir"); 
        menu=sc.nextInt();
        
            switch (menu) {
                case 1:
                    System.out.println("Añadimos un contacto:");
                    System.out.println("Escribe un nombre: ");
                    nombre=sc.next();
                    System.out.println("Escribe el teléfono: ");
                    int telefono=sc.nextInt();
                    agenda.insertarContacto(new Contacto(nombre, telefono)); //Cada vez que llamo al metodo insertar contacto voy a generar un nuevo objeto que recibirá por parámetro un nombre y un teléfono
                    break;
                case 2:
                    System.out.println("Buscamos contacto por nombre:");
                    System.out.println("Escribe el nombre: ");
                    nombre=sc.next();
                    agenda.buscarContacto(nombre);
                    break;
                case 3:
                    agenda.listadoCompleto();
                    break;
                default:
                    throw new AssertionError();
            }
        }     
    }
}
