/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulacros_2;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.util.*;

public class Exa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> alumnos = new HashMap<String, String>();
        int numero = 0;
        String nombre;
        String nif;

        do {
            System.out.println("Diganos la opción que desea:");
            System.out.println(" 0. Salir");
            System.out.println(" 1. Nuevo alumno sin permitir duplicados.");
            System.out.println(" 2. Buscar un nuevo alumno por NIF, si existe mostrar su nombre y si no avisarlo.");
            System.out.println(" 3. Buscar un alumno por nombre, si existe mostrar su NIF y si no avisarlo.");
            System.out.println(" 4. Modificar alumno, controlar si existe, en caso de que si, se deberá borrar el existente y volverlo a crear con los nuevos datos.");
            System.out.println(" 5. Borrar alumno.");
            System.out.println(" 6. Mostrar listado de números");
            numero = sc.nextInt();

            switch (numero) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:

                    System.out.println("Introduce el nombre");
                    nombre = sc.next();
                    System.out.println("Introduce el nif");
                    nif = sc.next();
                    insertarAlumno(nombre, nif, alumnos);
                    break;

            }
        }while(numero != 0);
    }

    //Menú 1
    public static void insertarAlumno(String nombre, String nif, HashMap<String, String> alumnos) {

        if (alumnos.containsKey(nombre)) { //Para ver si estan repetidas las claves
            System.out.println("No se puede añadir al alumno.");
        } else {
            alumnos.put(nombre, nif); // Si no contiene la clave, se añade
            System.out.println("Añadimos al usuario");
        }

    }
    
    //Menú 2
    //Menú 3
    //Menú 4
    //Menú 5
    //Menu 6 //for each

}
