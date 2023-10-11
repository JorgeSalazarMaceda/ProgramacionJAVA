/*
Para que implemente una lista de alumnos que implemente NIF y nombre.
Crear menú:
a. Nuevo alumno sin permitir duplicados.
b. Buscar un nuevo alumno por NIF, si existe mostrar su nombre y si no avisarlo.
c. Buscar un alumno por nombre, si existe mostrar su NIF y si no avisarlo.
d. Modificar alumno, controlar si existe, en caso de que si, se deberá borrar el existente y volverlo a crear con los nuevos datos.
e. Borrar alumno.
f. Listar todos los alumnos.
No habla de longitud. Por lo que arrayList y LinkedList.
No habla de ordenacion. TreeSet y TreeMap descartados.
Podria usar un HashSet de alumnos, pero para evitar diplicados ya tendria que hacer el equals demás... 
Lo mas óptimo seria HashMap de dos String (ya que nif tiene una letra) String, String.

 */
package Simulacros_2;

/**-
 *
 * @author Jorge
 */
import java.util.*;
public class Examen {
    static Scanner sc = new Scanner(System.in);
    static Map<String,String> alumnos = new HashMap<>();
    public static String nombre;
    public static String nif;
    
    
    //MÉTODO MENU
    public static void menu() {
        	
        System.out.println("");
        System.out.println("Introduce la opción deseada: ");
        System.out.println("-------------------------");
        System.out.println(" 0. Salir");
        System.out.println(" 1. Nuevo alumno sin permitir duplicados.");
        System.out.println(" 2. Buscar un nuevo alumno por NIF, si existe mostrar su nombre y si no avisarlo.");
        System.out.println(" 3. Buscar un alumno por nombre, si existe mostrar su NIF y si no avisarlo.");
        System.out.println(" 4. Modificar alumno, controlar si existe, en caso de que si, se deberá borrar el existente y volverlo a crear con los nuevos datos.");
        System.out.println(" 5. Borrar alumno.");
        System.out.println(" 6. Mostrar listado de números");
        System.out.println("-------------------------");
        System.out.println("");
	}
    
    
    // MÉTODO FIN
    public static void fin(){
        System.out.println("Adiós.");
    }
    
    //MÉTODO ERROR
    public static void error(){
        System.out.println("Error, elija una opción válida");
    }
    
     //Menú 1
	public static void insertarAlumno() {
            System.out.println("Dígame el nif del alumno: ");
            nif=sc.next().toLowerCase();
            System.out.println("Dígame el nombre del alumno: ");
            nombre=sc.next().toLowerCase();
            
            if(alumnos.containsKey(nif)){ //Si existe alumno por clave
                System.out.println("Ese registro ya existe, no puedes volver a insertarlo");
            }
            else{
                alumnos.put(nif,nombre);
                System.out.println("Alumno insertado");
            }
		
	}
        
        //MÉTODO PARA BUSCAR ALUMNO POR NIF
        public static void buscarAlumnoNif(){
            System.out.println("Dígame el nif del alumno: ");
            nif=sc.next().toLowerCase();
            
            if(alumnos.containsKey(nif)){
            
                System.out.println("El alumno es: " + nombre);
            }
            else{
                System.out.println("El alumno no existe en nuestra BD");
            }
        }
        
        //MÉTODO PARA BUSCAR ALUMNO POR NOMBRE (VALOR)
        public static void buscarAlumnoNombre(){
            System.out.print("\n Introducir NOMBRE: ");
            nombre = sc.next().toLowerCase();
            
            if(alumnos.containsValue(nombre)){
                System.out.println("El nif del alumno es: " + nif);
            }
            else{
                System.out.println("El alumno no existe en nuestra BD");
            }
        }
        
        //MÉTODO PARA MODIFICAR ALUMNOS
        
        
        
        
    
    public static void main(String[] args) {
        int opcion;
        do{
            menu();
           
            opcion=sc.nextInt();
            
                switch(opcion){
                    case 0 ->
                        fin();
                    case 1 -> 
                        insertarAlumno();
                    case 2 -> 
                        buscarAlumnoNif();
                    case 3 -> 
                        buscarAlumnoNombre();
                    default ->
                        error();
            }
        }while(opcion!=0);
     
    }
 }
