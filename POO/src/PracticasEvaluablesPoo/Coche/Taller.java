/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasEvaluablesPoo.Coche;

/**
 *
 * @author Jorge
 */

import static PracticasEvaluablesPoo.Coche.Coche.especialidad.CREMA;
import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Taller {
    
  public static Coche[] ordenarCoche(Coche[] a){
        Coche auxiliar; //Variable auxiliar donde ser gurardarán los precios momentaneamente.
        //Usamos el metodo burbuja para ordenarlos       
      
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length -i - 1; j++) {
                if (a[j + 1].getPrecio() < a[j].getPrecio()) {
                    auxiliar = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = auxiliar;     
                }
            } 
        }
        return a;
    } 
    public static void mostrarArray(Coche coches[]){
       for(int i=0;i<coches.length;i++){
            System.out.println("");
            System.out.println("Coche "+i);
            System.out.println("Marca: "+coches[i].getMarca());
            System.out.println("Modelo: "+coches[i].getModelo());
            System.out.println("Color: "+coches[i].getColor());
            System.out.println("Especialidad: "+coches[i].getEspecialidad());
            System.out.println("Precio: "+coches[i].getPrecio() + " euros");
            System.out.println("Precio con descuento: " + coches[i].verPrecio());
            System.out.println("-------------------------------");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca, modelo, color, matrícula;
        double precio;
        double descuento;
        //Creamos las instancias de clase u objetos
        
        Coche coche4 = new Coche (100);
        coche4.acelerar();
        coche4.frenar();
        System.out.println(coche4);
        coche4.arrancar();
        coche4.acelerar();
        coche4.frenar();
        coche4.frenar();
        
      double descuento1 = Coche.descuento;
      Coche coche = new Coche ();
      
        Coche.descuento = 2;
        Coche.setDescuento(2);
        
        Combustible comb = new Combustible();
        comb.setTipo(Combustible.TipoCombustible.diesel);
   
      
        Coche coche1 = new Coche();
        Coche coche2 = new Coche(20000); //Usamos el constructor tercero, donde solo lleva el parametro precio
        Coche coche3 = new Coche ("Mercedes", "Clase A", "negro", "9999HHH");





    
        coche1.arrancar();
        coche1.acelerar();
        coche1.frenar();
        System.out.println("");
        coche1.setPrecio(5000);
        coche2.setPrecio(8000);
        System.out.println("Precio coche 1: " +coche1.getPrecio());
        
        System.out.println("");
        System.out.println("Precio coche 2: "+coche2.getPrecio());
       
        System.out.println("");
        
        System.out.println("-----Cambiamos el coche 1 de marca y de modelo CON SET Y LO MOSTRAMOS CON GET----------");
        coche1.setMarca("audi");
        coche1.setModelo("Q7");
        System.out.println("El coche1 es de la marca: " + coche1.getMarca() + " y del modelo: " + coche1.getModelo());

        coche3.setColor("verde");
        System.out.println("El coche 3 es de color: " + coche3.getColor());

//        //Parte 3
//        Modificar la clase taller para generar un array con elementos
//        de tipo coche de tamaño 4.
//        Después mostrar todos los coches del array ordenados por
//        precio.

//        //Entiendo que hay que crear arrays de objetos, es decir un array de 4 objetos que pertenecen a la misma clase
//        //Tambien creamos objetos de array en cada posición, al igual que el ejercicio empresa
        Coche coches[] = new Coche[5];
        //Aqui vemos la sobrecarga de constructores de la clase coche
        coches[0]= new Coche("Opel","Corsa","verde","8888LLL");
        coches[1]= new Coche("Mercedes","Benz","rojo","9999JJJ");
        coches[2]= new Coche(); //Sin parametros, usando el constructor por defecto.
        coches[3]= new Coche("Seat","Con todos los extras","negro macarra","1234JJJ");
        coches[4]= new Coche(CREMA); //Para practicar, hemos añadido un enum en clase coche que sea especialidad crema o metalizado.

       
//
//Con sort no me funciona, hacemos el método burbuja
//Con el método setter le asignamos los distintos precios
//    
coches[0].setPrecio(500000);
coches[1].setPrecio(1);
coches[2].setPrecio(40000);
coches[3].setPrecio(10000);
coches[4].setPrecio(30000);

        
       System.out.println("Coches ordenados por precio: ");
       Taller.ordenarCoche(coches); //Llamado al metodo burbuja de ordenarCoche
       Taller.mostrarArray(coches);//Llamado al método mostrarArray para mostrarlo tras ordenarlos por precios.     
    }
}
