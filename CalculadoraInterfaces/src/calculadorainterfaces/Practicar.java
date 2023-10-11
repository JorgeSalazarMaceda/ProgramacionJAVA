/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorainterfaces;

/**
 *
 * @author Jorge
 */
public class Practicar {

    public static void main(String[] args) {
        
        Calculadora maquina = new Calculadora();

        System.out.println(maquina.Suma(10, 10));
        maquina.SumaMemoria(maquina.Suma(5,5));
        maquina.RestaMemoria(maquina.Resta(2, 10));
        System.out.println(maquina.getValores());
        System.out.println(maquina.getMemoria());
//        System.out.println(maquina.getValores());
//        maquina.ResetMemoria();
//        System.out.println(maquina.getMemoria());
//        System.out.println(maquina.getValores());
//        System.out.println(maquina.toString());
        
    }
}
