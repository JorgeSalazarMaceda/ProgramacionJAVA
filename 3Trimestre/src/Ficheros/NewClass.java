package Ficheros;

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
class InformacionFichero {
public static void main( String args[ ] ) throws IOException {
Scanner leer = new Scanner(System.in);
    String ruta, nombre;
    System.out.println("Introduzca ruta del fichero: ");
    ruta= leer.next();
    System.out.println("Introduzca nombre del fichero: ");
    nombre= leer.next();
    File f = new File( ruta + nombre );
    if( f.exists()){
       System.out.print( "Fichero existente " );
       System.out.print( (f.canRead( ) ? "y se puede Leer":""));
       System.out.print( (f.canWrite( )? ",se puede Escribir":""));
       System.out.println( "." );
       System.out.println( "La longitud del fichero son " +f.length( )+ " bytes" );
       }
              else{
              System.out.println( "El fichero no existe." );
              }
    }      
 }

