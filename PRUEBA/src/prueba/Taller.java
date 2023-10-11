/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Jorge
 */

import java.util.Arrays;
public class Taller extends Coche {
    
    public static void main(String[] args) {
        
        Coche coche_1= new Coche();
        Coche coche_2= new Coche("dorado");
        
   //Uso de métodos
   coche_1.arrancar();
   coche_1.acelerar();
   coche_1.detenerse();
   coche_1.frenar();
   coche_1.verPrecio();
   coche_2.verPrecio();
        
    //Array de tamaño 4
    Coche arrayCoches[]=new Coche[4];
        
    //Creamos objetos en cada posicion
    arrayCoches[0]=new Coche();
    arrayCoches[1]=new Coche("rojo ferrari");
    arrayCoches[2]=new Coche("i20","rojo hyundai");
    arrayCoches[3]=new Coche();
     
    //Mostrar los coches ordenados por precio
    
        Arrays.sort(arrayCoches);
        System.out.println("Coches ordenados por precio: ");
        imprimeArrayCoche(arrayCoches);
    
        
        
        
    }
}
