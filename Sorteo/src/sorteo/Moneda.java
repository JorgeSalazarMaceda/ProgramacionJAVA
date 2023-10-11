/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteo;

/**
 *
 * @author Jorge
 */
public class Moneda extends Sorteo {

  Moneda(){
   posibilidades=2;
}
    @Override
    public int lanzar() {
        int valor = (int)(Math.random()*posibilidades+1);// Con esto me aseguro que va desde 1 hasta el numero de posibilidades
        if(valor==1) System.out.println("Cara");
        else System.out.println("Cruz");
        return valor;
    }
    
    
}
