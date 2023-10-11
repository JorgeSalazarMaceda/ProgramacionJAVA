/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Jorge
 */
public class Monumento implements ILugarInteresTuristico,Comparable {

    private String ubicacion, nombre;
    private int antiguedad, opiniones;

    @Override
    public int getOpinionesLugar() {
        return opiniones;
    }

    public String toString() {
        return ("Ubicacion: " + ubicacion + "nombre: " + nombre + "la antiguedad de: " + antiguedad + "y las opiniones:");
    }
    
    @Override
    public int compareTo(Object o){
        return (opiniones - ((ILugarInteresTuristico)o).getOpinionesLugar());
    }
}

