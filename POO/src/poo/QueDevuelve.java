/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Jorge
 */
public class QueDevuelve {
    
    //Atributos
    int p1,p2;
    
    //Constructor
    public QueDevuelve (int i, int j){
        p1=i;
        p2=j;
    }
    //Metodo
    public int modificar (int i){
       p1=p1+i;
       p2=p2+i;
        System.out.print(p2+" ");
        return p1;
    }
    
    public static void main(String[] args) {
        QueDevuelve objeto1 = new QueDevuelve(5,4);
        System.out.print(objeto1.modificar(4)+" ");
        
        QueDevuelve objeto2 = new QueDevuelve(5,4);
        System.out.print(objeto2.modificar(5)+" ");
        
        objeto2 = objeto1; //Aquí objeto 2 es 9,10 y pasa a ser 8,9
        
        System.out.print(objeto2.modificar(5)+" ");
    }
}
