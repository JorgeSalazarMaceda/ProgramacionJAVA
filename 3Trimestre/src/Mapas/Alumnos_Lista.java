/* PROGRAMA QUE IMPLEMENTE UNA LISTA DE ALUMNOS CON NIF Y NOMBRE.
 * 	- Crear un menu:
 * 		a) NUEVO alumno, no permitir duplicados
 * 		b) BUSCAR un alumno por NIF, si existe mostrar su nombre y sino aviarlo
 * 		c) BUSCAR un alumno por nombre, si existe mostrar su NIF y sino avisarlo
 * 		d) MODIFICAR alumno, controlar si existe, en caso de que s�, se deberá borrar el exixtente
 * 			y volver a crearlo con los nuevos datos
 * 		e) BORRAR alumno
 * 		f) LISTAR todos los alumnos
 * 
 * 
 * @author JOSE LOZANO
 * ECLIPSE21
 * JDK-16
 */
package Mapas;

/**
 *
 * @author Jorge
 */

import java.util.*;
public class Alumnos_Lista {



// ********** ATRIBUTOS Y MÉTODOS ***********
    /* Creación de objeto y lista de clase para introducción y guardar datos introducidos por teclado */
    static Scanner leer = new Scanner(System.in);
    static HashMap<String, String> listadoAlumnos = new HashMap<String, String>();

    /* MÉTODO PARA MOSTRAR MENÚ */
    static void menu() {
        System.out.println("\nLISTA DE ALUMNOS (Nombre y NIF)\n-------------------------------");
        System.out.println("\n  1 - Nuevo alumno"
                + "\n  2 - Buscar alumno (NIF)"
                + "\n  3 - Buscar alumno (Nombre)"
                + "\n  4 - Modificar alumno (NIF)"
                + "\n  5 - Borrar alumno (NIF)"
                + "\n  6 - Listado alumnos"
                + "\n  0 - SALIR");
        System.out.print("\nElegir una opción: ");
    }

    /* MÉTODO PARA MOSTRAR SI ERROR DE ELECCIÓN */
    static void errorEleccion() {
        System.out.println("\n\tERROR de elección !!  \n");
    }

    /* MÉTODO PARA INFORMAR DE FIN DE PROGRAMA */
    static void finPrograma() {
        System.out.println("\n\tFIN DE PROGRAMA !!  \n");
    }

    /* MÉTODO PARA CREAR NUEVO ALUMNO */
    static void nuevoAlumno() {
        System.out.print("\n - Introducir NIF: ");
        String nif = leer.next().toLowerCase();		// Convierte a minusculas la entrada
        System.out.print(" - Introducir NOMBRE: ");
        String nombre = leer.next().toLowerCase();	// Convierte a minusculas la entrada

        if (!listadoAlumnos.containsKey(nif)) // Si no existe
        {
            listadoAlumnos.put(nif, nombre);			// Introduce datos
            System.out.println("\n Registro a�adido correctamente!! \n");
        } else {
            System.out.println("\n El registro YA existe!! \n");
        }
    }

    /* MÉTODO PARA BUSCAR UN ALUMNO POR NIF */
    static void buscarAlumnoNIF() {
        System.out.print("\n Introducir NIF: ");
        String nif = leer.next().toLowerCase();		// Convierte a minusculas la entrada

        if (listadoAlumnos.containsKey(nif)) // Si existe
        {
            String nombre = listadoAlumnos.get(nif);	// Guarda nombre (Value)
            System.out.println("\n - Nombre: " + nombre + ". NIF: " + nif + "\n");
        } else {
            System.out.println("\n  El registro NO existe!! \n");
        }
    }

    /* MÉTODO PARA BUSCAR UN ALUMNO POR NOMBRE */
    static void buscarAlumnoNOMBRE() {
        System.out.print("\n Introducir NOMBRE: ");
        String nombre = leer.next().toLowerCase();	// Convierte a minusculas la entrada
        System.out.println();

        if (listadoAlumnos.containsValue(nombre)) // Si existe
        {
            for (String alumno : listadoAlumnos.keySet()) // Foreach para recorrer la lista
            {
                if (listadoAlumnos.get(alumno).equals(nombre)) // Si coincide nombre
                {
                    System.out.println(" - Nombre: " + listadoAlumnos.get(alumno) + ". NIF: " + alumno);
                }
            }

            System.out.println();
        } else {
            System.out.println("\n El registro NO existe!! \n");
        }
    }

    /* MÉTODO PARA MODIFICAR LOS DATOS DE UN ALUMNO. REESCRIBIR TODOS LOS DATOS */
    static void modificarAlumnoNIF() {
        System.out.print("\n Introducir NIF: ");
        String nif = leer.next().toLowerCase();		// Convierte a minusculas la entrada

        if (listadoAlumnos.containsKey(nif)) // Si existe
        {
            listadoAlumnos.remove(nif);				// Borra registro
            nuevoAlumno();							// Llamada a función nuevo registro de alumno
        } else {
            System.out.println("\n  El registro NO existe!! \n");
        }
    }

    /* MÉTODO PARA BORRAR UN ALUMNO POR NIF */
    static void borrarAlumnoNIF() {
        System.out.print("\n Introducir NIF: ");
        String nif = leer.next().toLowerCase();		// Convierte a minusculas la entrada

        if (listadoAlumnos.containsKey(nif)) // Si existe
        {
            listadoAlumnos.remove(nif);				// Borra registro
            System.out.println("\n El registro ha sido BORRADO!! \n");
        } else {
            System.out.println("\n El registro NO existe!! \n");
        }
    }

    /* MÉTODO PARA LISTAR TODOS LOS ALUMNOS */
    static void listarAlumnos() {
        if (!listadoAlumnos.isEmpty()) // Si lista no esta vacia
        {
            int contador = 1;						// Contador de registros

            System.out.println("\nListado alumnos");
            for (String alumno : listadoAlumnos.keySet()) // Foreach para recorrer lista, extrae nif (key)
            {
                String nombre = listadoAlumnos.get(alumno);	// Guarda el nombre (Value)
                System.out.println("  - Reg. " + contador + ". Nombre: " + nombre + ". NIF: " + alumno);
                contador++;							// Incremento contador registros
            }
            System.out.println();
        } else {
            System.out.println("\nNO hay registros que mostrar!! \n");
        }
    }
    
        /* MÉTODO MAIN */
    public static void main(String[] args) {
        // Atributos
        int opcion;

        // Cuerpo programa MAIN
        do {
            menu();
            opcion = leer.nextInt();

            switch (opcion) {
                case 0 ->
                    finPrograma();
                case 1 ->
                    nuevoAlumno();
                case 2 ->
                    buscarAlumnoNIF();
                case 3 ->
                    buscarAlumnoNOMBRE();
                case 4 ->
                    modificarAlumnoNIF();
                case 5 ->
                    borrarAlumnoNIF();
                case 6 ->
                    listarAlumnos();
                default ->
                    errorEleccion();
            }

        } while (opcion != 0);
    }

}






