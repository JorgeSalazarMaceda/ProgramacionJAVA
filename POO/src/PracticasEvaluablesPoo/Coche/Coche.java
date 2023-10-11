/*
1. Clase Coche
La clase contiene 6 atributos:
marca, modelo, color, matrícula, precio y descuento.
El descuento es una cantidad que se aplica a todos los coches sobre
el precio de venta (tipo static)
Definir los métodos siguientes:
- Arrancar
- Detenerse
- Acelerar
- Frenar
- verPrecio
2. Generar clase Taller
Generando varios objetos de tipo Coche y usa sus métodos.
3. Modificar la clase taller para generar un array con elementos
de tipo coche de tamaño 4.
Después mostrar todos los coches del array ordenados por
precio.
 */

 /*static: Los miembros estaticos son miembros que le pertenecen a la clase, 
es decir que todo cambio en un atributo estático afectará a todos los objetos,
Pasa igual con los métodos estáticos, que le pertenecen a la clase*/
package PracticasEvaluablesPoo.Coche;

/**
 *
 * @author Jorge
 */
import java.util.*;

public class Coche {

    //Atributos
    enum especialidad {METALIZADO,CREMA};
    especialidad especialidad;
    protected String marca, modelo, color, matrícula;
    protected static double descuento=0.10;
    protected double precio;
    protected int numeroPuertas;
    protected boolean arrancado;
     protected boolean frenado;
     protected static int consumoTotal;

    //Constructor sin parámetros
    public Coche() {
        this.marca = "seat";
        this.modelo = "ibiza";
        this.color = "azul";
        this.matrícula = "0000KJV";
        this.precio = 6000;
        this.arrancado=false; //ampliacion
        this.frenado=false;
        this.consumoTotal=0;// Este lo heredarán la clase electrico y la clase combustible
    }

    //Constructores con parámetros
    public Coche(String marca, String modelo, String color, String matrícula) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matrícula = matrícula;

    }
    
    public Coche(double descuento) {
        

    }

    public Coche(int precio) {
        this.precio = precio;
    }
    
    public Coche (especialidad especialidad){
        this.especialidad = especialidad;
    }
    

    //Como son privados, creamos los métodos de acceso (Getters y Setters)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public static void setDescuento(int descuento) {
        Coche.descuento = descuento;
    }
  
    

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatrícula() {
        return matrícula;
    }

    public double getPrecio() {
        return precio;
    }
     public void setConsumoTotal(int consumoTotal) {
        this.consumoTotal = consumoTotal;
    }
     
    public int getConsumoTotal() {
        return consumoTotal;
    }

    public especialidad getEspecialidad() {
        return especialidad;
    }
    
   

    //Metodos
    public void arrancar() {
        System.out.println("Coche arranca");
        this.arrancado=true;
    }

    public void detenerse() {
        if(frenado){
        System.out.println("Coche se detiene");
        this.arrancado=false; 
        }
        else{
            System.out.println("El coche no se puede detener, porque no está frenado");
        }
    }

    public void acelerar() {
        if(arrancado){
        this.frenado=false;
        System.out.println("Coche acelera");
        }
        else{
        System.out.println("El coche no está arrancado");
        }
    }

    public void frenar() {
        this.frenado=true;
        System.out.println("Coche frena"); 
    }

    public double verPrecio() {
        double precioDescontado;
        precioDescontado = (precio * this.descuento);
        return precio - precioDescontado;
        
    }
    
     public double verPrecioconDescuento(double porcentaje) {
        double precioDescontado;
        precioDescontado = ((precio * porcentaje)/100);
        return precio - precioDescontado;
        
    }

}
