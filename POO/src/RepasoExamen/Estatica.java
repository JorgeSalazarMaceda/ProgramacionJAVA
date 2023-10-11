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
public class Estatica {
    
    int x;
    static int y;
    
    int suma(){
        y/=2; //Ampliacion para ver como la variable estatica va cambiando
        return x+y;
    }
    
    static int dimeY(){ //Ampliacion para ver como la variable estatica va cambiando
        return y;
    }
    
    public static void main(String[] args) {
        Estatica ob1 = new Estatica();
        Estatica ob2 = new Estatica();
        
        ob1.x=10;
        ob2.x=12;
        
        Estatica.y=100;
        
        System.out.println("ob1.suma(): " + ob1.suma());
        System.out.println("ob2.suma(): " + ob2.suma());
        System.out.println(Estatica.dimeY()); //Ampliacion para ver como la variable estatica va cambiando
       
        //¿Que devuelve esto??
        //Esto crea dos objetos con variable de instancia x y con variable de clase o static y
        //Entonces ob1 suma vale x=10 e y=110;
        //Entonces ob2 suma vale x=12 e y=112
        
        //Con la ampliacion vemos como la variable y cambia en el metodo (al invocarse) ya que es estatica
        //Entonces, ob1.suma será x=10, y=50 y devolverá x+y= 60
        //ob2.suma será x=12, y=25 y devolverá x+y=37
        //y dimeY devolverá y=25.
    }
}
