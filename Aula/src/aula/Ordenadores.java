/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author Jorge
 */
public class Ordenadores {
    //Atributos

    private boolean botonPC;
    private int potencia;
    private int consumo;
    private int consumoTotal;

    //Constructor
    public Ordenadores() {
        botonPC = false;
        consumo = 0;
        potencia = 2;
    }

    //Getters y Setters

    public int getPotencia() {
        return potencia;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean getBotonPC() {
        return botonPC;
    }

    //Método para calcular el consumo del ordenador
    int calculaConsumoPC() {
        botonPC = !botonPC;
        consumo = 2;
        if (botonPC) {
            consumo = (consumo * potencia);
        } else {
            consumo = 0;
        }
        return consumo;
    }
}
