/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoExamen;

/**
 *
 * @author Jorge
 */
public class Programa {
    
     public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        obj1.imprimir(4);
        
        Clase2 obj2 = new Clase2();
        obj2.imprimir(5);
    }
}
    class Clase1{
        int prop1=0, prop2=0;
        
        public void imprimir (int i){
            prop1=prop1+i;
            prop2=prop2+i;
            System.out.println(prop1 + " " + prop2 + " ");
        }
    }
    
    class Clase2 extends Clase1{
         
         @Override
         public void imprimir (int i){
            prop1=prop1+i;
            prop2=prop2+i;
            System.out.println(prop1 + " " + prop2);
        }
    }
   

