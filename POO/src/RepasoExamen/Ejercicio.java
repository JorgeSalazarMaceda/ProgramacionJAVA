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
public class Ejercicio {

    public static void main(String[] args) {
        Dos objeto1 = new Dos();
        double a = 5.0;
        int i = 4;
        objeto1.imprime(a);
        objeto1.imprime(i);
    }
}

class Uno {

    public void imprime(double x) {
        System.out.println("Valor de la variable pasada: " + x);
    }
}

class Dos extends Uno {

    public void imprime(int j) {
        System.out.println("Valor de la variable: " + j);
    }
}

//¿Que devuelve esto??
//Clase dos hereda el metodo imprime de clase 1, entonces clase 2 tendrá los dos metodos imprime, uno con el double que es la x 
//y otro con el int que es la j
//Entonces objeto 1 recibe un double de a=5.0 e i=4;