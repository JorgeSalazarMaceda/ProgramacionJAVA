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
public class Prueba {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        dado1.lanzar();
        //Podria poner int a= dado1.lanzar(); Porque el mmetodo me devuelve un entero
        int a= dado1.lanzar();
        System.out.println(a);
        
        Moneda moneda1 = new Moneda();
        moneda1.lanzar();
    }
}
