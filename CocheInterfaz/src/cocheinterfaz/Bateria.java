/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocheinterfaz;

/**
 *
 * @author Jorge
 */
public class Bateria implements Combustible {

    //Atributos ----------------------------------------------- (Cantidades por defecto, luego se pueden modificar)
    private int capacidadMaxima = 500;
    protected int capacidadActual = 0;

    //Constructores -----------------------------------------------
    public Bateria(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
        setCapacidadActual(capacidadActual); //Utilizamos en el constructor el set con la condición de que la Cap Actual no puede superar la Máxima
    }
   //No se pueden crear constructores con la misma estructura, es una de las limitaciones de Java.

    public Bateria() {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
        setCapacidadActual(capacidadActual);
    }

    public Bateria(int capacidadActual, int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        setCapacidadActual(capacidadActual);
    }

    //Getters -----------------------------------------------
    @Override
    public double getCapacidad() {
        return this.capacidadMaxima;
    }

    @Override
    public double getDisponible() {
        return this.capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        if (capacidadActual >= capacidadMaxima) {
            this.capacidadActual = capacidadMaxima;
            System.out.println("No se puede superar la capacidad máxima, su capacidad actual y máxima es: " + capacidadMaxima);
        } else {
            this.capacidadActual = capacidadActual;
            //System.out.println("La capacidad actual es: " + this.capacidadActual);
        }
    }
    
    

    //Métodos -----------------------------------------------
    @Override
    public void recarga(int cantidad) { //La capacidad actual se agregará por parametro.
        this.capacidadActual = this.capacidadActual+cantidad;
        //Si la capacidad actual es mayor que la máxima, esta sera la actual y te avisa que no se puede cargar mas.
        if (this.capacidadActual >= this.capacidadMaxima) {
            capacidadActual = this.capacidadMaxima;
            System.out.println("Te has pasado de recarga, tu bateria esta al nivel de: " + this.capacidadActual);
        } else {
            this.capacidadActual= capacidadActual;
            System.out.println("La capacidad actual es: " + this.capacidadActual);
        }
    }

    @Override
    public boolean vacio() { //Método que te indica si hay bateria o no. Si la hay, te dice cuanta (Es un boolean)
        boolean vacio;
        // return this.capacidadActual == 0;
        if (capacidadActual == 0) {
            vacio = true;
            System.out.println("No queda bateria");
        } else {
            vacio = false;
            System.out.println("La bateria tiene: " + capacidadActual);
        }
        return vacio;
    }
    
    public int agotar(){
        return capacidadActual =0;
    }

    //toString -----------------------------------------------
    @Override
    public String toString() {

        String cadena = "\n------------------------------------------";
        cadena += "\nBateria: \n";
        cadena += "\nCapacidad Máxima: " + this.capacidadMaxima;
        cadena += "\nCapacidad Actual: " + this.capacidadActual;
        cadena += "\n------------------------------------------";
        return cadena;

    }
    //Crear un metodo para vaciarlo a 0 todoooo!!!!!!!!!!!!!!!!!!!!!!!!!!!
}
