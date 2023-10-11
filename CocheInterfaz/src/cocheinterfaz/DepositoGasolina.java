
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
public class DepositoGasolina implements Combustible {

    //Atributos -----------------------------------------------
    private int capacidadMaxima = 500;
    private int capacidadActual = 0;

    //Constructores -----------------------------------------------
    public DepositoGasolina(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = 0;
        setCapacidadActual(capacidadActual);
    }

    public DepositoGasolina() {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        setCapacidadActual(capacidadActual);
    }
    
    public DepositoGasolina(int capacidadActual, int capacidadMaxima){
        this.capacidadMaxima= capacidadMaxima;
        this.capacidadActual=0;
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
    public void recarga(int cantidad) {
        this.capacidadActual = this.capacidadActual + cantidad;
        //Si la capacidad actual es mayor que la máxima, esta sera la actual y te avisa que no se puede cargar mas.
        if (this.capacidadActual >= this.capacidadMaxima) {
            capacidadActual = this.capacidadMaxima;
            System.out.println("Has echado mucho combustible, ahora mismo tienes: " + capacidadActual + " litros.");
        } else {
            this.capacidadActual= capacidadActual;
            System.out.println("La capacidad actual es: " + this.capacidadActual);
        }
    }
    

    @Override
    public boolean vacio() {
        boolean vacio;
        // return this.capacidadActual == 0;

        if (capacidadActual == 0) {
            vacio = true;
            System.out.println("No queda gasolina");
        } else {
            vacio = false;
            System.out.println("Te queda de gasolina: " + capacidadActual);
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
        cadena += "\nDepósito de gasolina:\n";
        cadena += "\nCapacidad Máxima: " + this.capacidadMaxima;
        cadena += "\nLitros actuales: " + this.capacidadActual;
        cadena += "\n------------------------------------------";
        return cadena;
    }
}
