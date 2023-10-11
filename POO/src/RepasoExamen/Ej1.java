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
//¿Que devuelve??

//Tenemos dos atributos para parametros
//Un constructor de dos parametros
//Creamos en el main 2 objetos con parametros
//El obj1 con 5 y 4 llama a la funcion modificar y pasa por parametro 4, entonces:
//p1=p1+i;  p1 = 5 + 4 = 9
//p2=p2+i;  p2 = 4 + 4 = 8
//Imprime p2 --> 8
//Retorna p1 --> 9


//El objeto 2
//con 5 y 4 llama a la funcion modificar y pasa por parametro 5, entonces:
//p1=p1+i;  p1 = 5 + 5 = 10
//p2=p2+i;  p2 = 4 + 5 = 9
//Imprime p2 --> 9
//Retorna p1 --> 10

//Ahora
//obj2=obj1 entonces 9,10 = 9,8 (Lo que resulta anteriormente, pero en el orden este, porque una cosa es como lo imprime y otra como es)
//Y obj2 vuelve a llamar al metodo modificar pasando de parametro 5, entonces:
//con 9 y 8
//p1=p1+i;  p1 = 9 + 5 = 14
//p2=p2+i;  p2 = 8 + 5 = 13
//Imprime p2 --> 13
//Retorna p1 --> 14
public class Ej1 {
    public static void main(String[] args) {
        class1 obj1= new class1(5,4);
        System.out.println(obj1.modificar(4) + " ");
        
        
        class1 obj2 = new class1(5,4);
         System.out.println(obj2.modificar(5) + " ");
         
         obj2=obj1;
         System.out.println(obj2.modificar(5));
    }
    
    
}
class class1{
       int p1,p2;
       
       
       public class1 (int i, int j){
           p1=i;
           p2=j;
              
       }
       
       public int modificar (int i){
           p1=p1+i;
           p2=p2+i;
           System.out.println(p2 + " " );
           return p1;
       }
    }
