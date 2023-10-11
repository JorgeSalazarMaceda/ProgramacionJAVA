/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wendy;

/**
 *
 * @author Jorge
 */
public class Aula {

    public static void main(String[] args) {
        
        //Creo un objeto 
        Ordenador wendy = new Ordenador(); 
        Ordenador wendy2 = new Ordenador(); 
        
wendy.EncenderGeneral();
System.out.println(wendy.getConsumoAula());
wendy.EncenderOrdenador();
wendy.EncenderOrdenador();
wendy.ApagarOrdenador();
wendy2.EncenderOrdenador();
System.out.println(wendy.getConsumoAula());

//       wendy.EncenderGeneral();
//       wendy.EncenderOrdenador(); //50*10 = 500
//       System.out.println("consumo: "+wendy.getConsumo());
//       wendy.ApagarOrdenador(); // 500-10=490
//       System.out.println("consumo: "+wendy.getConsumo());
//       wendy.consumoTotal();
//       
//       wendy.EncenderGeneral();
//       wendy.EncenderOrdenador();
//       System.out.println("consumo: "+wendy.getConsumo());
//       wendy.ApagarOrdenador();
//       System.out.println("consumo: "+wendy.getConsumo());
//      
//       
//       wendy.estadoOrdenador();
//       wendy.consumoTotal();
//       wendy.getConsumoAula();
//       
//       System.out.println(wendy.getConsumoAula());
    }
}
