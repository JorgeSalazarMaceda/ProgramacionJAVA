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
public class Dado extends Sorteo{
Dado(){
   posibilidades=6;
}
    @Override
    public int lanzar() {
        int valor = (int)(Math.random()*posibilidades+1);// Con esto me aseguro que va desde 1 hasta el numero de posibilidades
        //Dentro del metodo imprimo por pantalla.
        System.out.println(valor);
        return valor;//Retorno el valor
    }
    
 //Esta solucion está hardcodeada porque puede haber dados de muchos numeros, podria hacerlo con parametros en el constructor
    
}
