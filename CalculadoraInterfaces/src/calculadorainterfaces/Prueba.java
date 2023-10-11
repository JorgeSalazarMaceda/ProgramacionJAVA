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
public class Prueba {
    
    public static void main(String[] args) {
        
      System.out.println("----------DEFENSA------------");
      
      Calculadora c = new Calculadora();
      c.Suma(10, 20);
      c.SumaMemoria(10);
      c.SumaMemoria(c.Resta(3, 2));
      System.out.println(c.getMemoria());
      System.out.println(c.getValores());
      c.ResetMemoria();
      System.out.println(c.getMemoria());
      System.out.println(c.getValores());  
      
      System.out.println("----------DEFENSA------------");
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Calculadora Calcu1 = new Calculadora();
//        Calculadora Calcu2 = new Calculadora();
//        
//        //Ver solo con ToString, como podria imprimir un objeto ya que las variables de los metodos son locales.
//               
//        
//        System.out.println(Calcu1.Suma(2,6));
//        System.out.println(Calcu2.Resta(5,3));
//        System.out.println(Calcu2.Multiplicacion(5,5));
//        System.out.println(Calcu2.Division(5,5));
//       
//        
//        
//        System.out.println("");
//        System.out.println("-------- M E M O R I A ---------");
//        System.out.println("");
//        
//        System.out.println(Calcu1.getMemoria() + " De Calcu1");
//        System.out.println(Calcu2.getMemoria() + " De Calcu2");
//        
//        Calcu1.SumaMemoria(6);
//        Calcu1.SumaMemoria(10);
//        Calcu1.RestaMemoria(5);
//        System.out.println(Calcu1.getMemoria());
//        System.out.println(Calcu1.getValores());
//         System.out.println(Calcu1);
//        
//        Calcu1.ResetMemoria();
//        System.out.println(Calcu1.getMemoria());
//        System.out.println(Calcu1.getValores());
//        
        
        
    }
}
