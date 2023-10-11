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
import java.util.*;

public class FicheroNumericoAct10_3 {

    public static void main(String[] args) {
        
        BufferedReader entrada = null;
        int contador = 0;
        int sumaEdades = 0;
        double sumaEstaturas = 0;

        try {
            FileReader fichero = new FileReader("C:\\Users\\Jorge\\Documents\\NetBeansProjects\\Excepciones\\Jugadores.txt");
            entrada = new BufferedReader(fichero);
            String linea = entrada.readLine();
            while (linea != null) {
                
                // Contador de lineas
                contador++;

                Scanner sc = new Scanner(linea).useLocale(Locale.US); //Esto es para que lea los puntos de los decimales

                // Leo el nombre
                String nombre = sc.next();
                System.out.print(nombre + " ");

                // Leo la edad
                int edad = sc.nextInt();
                sumaEdades += edad;
                System.out.print(edad + " ");

                // Leo la estatura
                double estatura = sc.nextDouble();
                sumaEstaturas += estatura;
                System.out.print(estatura + "\n");

                linea = entrada.readLine();
                sc.close();
            }
            System.out.println("Edad media: " + sumaEdades / contador);
            System.out.println("Estatura media: " + sumaEstaturas / contador);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (entrada != null)
            try {
                entrada.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
