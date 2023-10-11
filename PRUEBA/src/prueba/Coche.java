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
public class Coche {

  //Atributos
    String marca, modelo, color,matricula;
    int precio=0;
    static int descuento;
    
//Constructor
    public Coche(){
        marca="Hyundai";
        modelo="i30";
        
    }
    public Coche(String color){
        marca="Hyundai";
        modelo="IONIQ Eléctrico";
    }
    public Coche(String modelo,String color){
        precio=20000;
    }
    
//Metodos
    void arrancar(){
        System.out.println("Llave + Embrague = Arrancar");
    }
    void detenerse(){
        System.out.println("Freno + (Embargue + Marcha Neutro) = Detenerse") ;
    }
    void acelerar(){
        System.out.println("(Embrague + (Marcha + 1)) + Acelerador = Acelerar");
    }
    void frenar(){
        System.out.println("Freno + (Embargue + Marcha - 1) = Frenar");
    }
    void verPrecio(){
        System.out.println("Precio: "+precio);
    }
    
    //COMPARE TO
    public int compareTo(Coche p){//Compara los precios
        if(precio>p.precio){
            return -1;
        }else if(precio<p.precio){
            return 1;
        }
        return 0;
    }
    
    static void imprimeArrayCoche (Coche arrayCoche[]){//Una vez ordenado en el main, hago que me imprima los datos
        for(int i=0;i<arrayCoche.length;i++){
            System.out.println("");
            System.out.println("Coche "+i);
            System.out.println("Marca: "+arrayCoche[i].marca);
            System.out.println("Modelo: "+arrayCoche[i].modelo);
            System.out.println("Precio: "+arrayCoche[i].precio);
            System.out.println("-------------------------------");
        }
    }
    
}

    

