/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Jorge
 */
public class Taller {
    
public static void main(String[] args) {
        
        Coche coche_1= new Coche();
        Coche coche_2= new Coche("dorado");
        
   //Uso de los métodos
   coche_1.arrancar();
   coche_1.acelerar();
   coche_1.detenerse();
   coche_1.frenar();
   coche_1.verPrecio();
   coche_2.verPrecio();
   
   
        
//    //Array de tamaño 4
//    Coche[] Coches=new Coche[4];
    
    
        
//    //Creamos objetos en cada posicion
//    Coches[0]=new Coche();
//    Coches[1]=new Coche("Mercedes de Chang");
//    Coches[2]=new Coche("i20","Hyundai rojo de Miguelito");
//    Coches[3]=new Coche();
//
//     
//    //Mostrar los coches ordenados por precio
//    
//    Coches[0].setPrecio(50);    
//    Coches[1].setPrecio(51000);
//    Coches[2].setPrecio(25000);
//    Coches[3].setPrecio(26000);
//    
//    Coches[1].acelerar();
//    Coches[2].frenar();
//         System.out.println("Coches ordenados por precio: ");
//       Coche.ordenarCoche(Coches); 
//       Coche.imprimeArray(Coches);     
    }
}
