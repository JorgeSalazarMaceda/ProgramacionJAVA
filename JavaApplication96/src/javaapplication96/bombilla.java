/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication96;

/**
 *
 * @author Jorge
 */
//6) Crea una clase bombilla y una subclase bombilla_led. Las bombillas led consumen un 10% menos que una bombilla
//normal. Sobrescribe el método getConsumo() para las dos clases.
public class bombilla {
    
protected double consumo;

    public double getConsumo() {
        return consumo;
    }


    
}


class bombilla_led extends bombilla{

    @Override
    public double getConsumo() {
        double consumo=0;
        
        
        return consumo-(consumo*0.10)/100;
    }
    
}