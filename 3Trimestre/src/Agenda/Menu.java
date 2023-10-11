/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author Jorge
 */
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
public class Menu {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    sc.useDelimiter("\n"); // Para que no haya errores en caso de meter nombres compuestos
    boolean fin = false;
    int menu; 
    Contacto cont;
    
    Agenda miAgenda = new Agenda();
    String nombre;
    int telefono;
    
    while(!fin){
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println(" 1 = Añadir contacto");
        System.out.println(" 2 = Buscar por nombre");
        System.out.println(" 3 = Mostrar todos los contactos ordenados alfabéticamente");
        System.out.println(" 4 = Salir");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("");
        try{
            System.out.println("Introduce la opción de tu agenda: ");
            menu=sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Añadimos un contacto:");
                    System.out.println("Escribe un nombre: ");
                    nombre=sc.next();
                    System.out.println("Escribe el teléfono: ");
                    telefono=sc.nextInt();
                    
                    cont = new Contacto (nombre,telefono); //Creamos el contacto que recibe por parametro (tal y como dice el constructor) los datos.
                    miAgenda.anadirContacto(cont);
                    break;
                case 2:
                    System.out.println("Buscar por nombre: ");
                    System.out.println("Escribe un nombre: ");
                    nombre=sc.next();
                    miAgenda.buscarContacto(nombre);
                    break;
                case 3:
                    System.out.println("Muestra todos los datos");
                    miAgenda.listado();
                    break;
                case 4:
                    fin = true;
                    System.out.println("Restistro/s guardado/s");
                    System.out.println("Adios");
                    miAgenda.guardarSalir();
                    break;
            }
        } catch (InputMismatchException ex){
            System.out.println("Debes insertar un número");
            sc.next();
            /*   InputMismatchException
            Lanzada por la clase Scanner cuando el elemento recibido no corresponde al tipo de dato esperado,
            por ejemplo al utilizar Scanner.nextInt(),se espera recibir un número entero, pero si se introduce un caracter.
            */
        }
    }
    }
    
}
