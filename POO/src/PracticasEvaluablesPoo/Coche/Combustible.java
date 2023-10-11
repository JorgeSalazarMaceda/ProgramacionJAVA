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
public class Combustible extends Coche {
    
    static enum TipoCombustible {
        gasolina,
        diesel
    }
    //Atributos
    private TipoCombustible tipo;
    private int consumo;

    
    //Constructor
    public Combustible(){
        this.tipo=TipoCombustible.diesel;
        this.consumo=0;
        this.consumoTotal=0;
    }
    
    public Combustible(TipoCombustible tipo, int consumo){ //Constructor para parte 4 de ampliacion
        this.tipo=tipo;
        this.consumo=consumo;
        if(tipo.equals("diesel")){
            consumoTotal=consumo*2; 
        }
        else{
            consumoTotal=consumo*3; //Si es gasolina, consume mas
        }
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public int getConsumo() {
        return consumo;
    }


    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

   
    
    @Override //Estamos sobreescribiendo el del padre
    public void arrancar() {
        super.arrancar();
        System.out.println("Coche arranca contaminando mucho");
    }

    @Override
    public void detenerse() {
        super.detenerse();
        System.out.println("Coche se detiene para no contaminar");
    }

    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("Coche acelera para correr y contaminar mas");
    }

    @Override
    public void frenar() {
        super.frenar();
        System.out.println("Coche frena para contaminar menos");
    }

    @Override
    public double verPrecio() {
        if(tipo.equals("diesel")){
        double precioDescontado;
        precioDescontado = (precio * this.descuento);
        return precio + precioDescontado;
        }
        else {
            return precio; //Si es el electrico se aplicará el descuento de la otra clase coche, el 10%.
        }
    }
}
