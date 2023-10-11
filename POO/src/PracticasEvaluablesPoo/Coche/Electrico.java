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
public class Electrico extends Coche {

    //Atributos
    private int numeroBaterias;
    private int consumo;
    

    public Electrico() {
        numeroBaterias = 0;
        consumo = 0;
        consumoTotal = 0;
    }

    //Constructor con parametros
    public Electrico(int numeroBaterias, int consumo) {
        this.numeroBaterias = numeroBaterias;
        this.consumo = consumo;
        this.consumoTotal=numeroBaterias*consumo; //Así tenemos el consumo total de la parte 4 del ejercicio
    }

    //Getters y Setters
    public int getNumeroBaterias() {
        return numeroBaterias;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setNumeroBaterias(int numeroBaterias) {
        this.numeroBaterias = numeroBaterias;
    }



    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    @Override //Estamos sobreescribiendo el del padre
    public void arrancar() {
       // super.arrancar(); //Para coger los métodos del padre
        System.out.println("Coche arranca silenciosamente");
    }

    @Override
    public void detenerse() {
      //  super.detenerse();
        System.out.println("Coche se detiene electricamente");
    }

    @Override
    public void acelerar() {
      //  super.acelerar();
        System.out.println("Coche acelera como un híbrido");
    }

    @Override
    public void frenar() {
       // super.frenar();
        System.out.println("Coche frena ahorrando energía");
    }

    @Override
    public double verPrecio() {
        double precioDescontado;
        precioDescontado = (precio * this.descuento);
        return precio - precioDescontado;
    }
}
