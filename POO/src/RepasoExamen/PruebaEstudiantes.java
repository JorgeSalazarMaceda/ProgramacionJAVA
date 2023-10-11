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
public class PruebaEstudiantes {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante ();
        
        e1.mostrarInfo();
        
        Estudiante e2 = new Estudiante ();
        e2.mostrarInfo();
        
        e1.b++;
        
        Estudiante.b++;
        System.out.println("Estudiante 2");
        e2.mostrarInfo();
    }
}

class Estudiante{
    
    int a;
    static int b;
    
    Estudiante(){
        b++;
    }
    
    public void mostrarInfo(){
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
    }
}
