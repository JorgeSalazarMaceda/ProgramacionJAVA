//Pedirle al usuario su nombre, su edad, y su altura con decimales. El programa
//mostrará de nuevo la información desglosando los metros y centímetros.
//Por ejemplo:
//Pepe
//21 años
//1,60
//El resultado por pantalla sería el siguiente:
//Hola Pepe, tienes 21 años y mides 1 metro y 60 centímetros.
package edades;

import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        String nombre;
        double altura, parteDecimal, parteEntera;
        int edad;

        Scanner leer = new Scanner(System.in);
        System.out.println("Hoooolaa");

        System.out.println("¿Como te llamas? ");
        nombre = leer.next();
        System.out.println("¿Cual es tu edad? ");
        edad = leer.nextInt();
        System.out.println("¿Cual es tu altura? ");
        altura = leer.nextDouble();
        
        parteDecimal=altura%1;
        parteEntera=(altura-parteDecimal);
        
        System.out.println(" Hola " + nombre + " tienes " + edad + " años y mides " + (int)parteEntera + " metros y " + (int)(parteDecimal*100) + " centimetros ");
    }
}
