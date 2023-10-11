/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticasEvaluablesPoo.Aula5;

/**
 *
 * @author Jorge
 */
public class UsoAula5 {
    public static void main(String[] args) {
        
    	Aula5 a = new Aula5();
//     //Cada vez que pulsemos se encenderán o apagarán los interruptores
//     a.pulsarBoton();
//     a.pulsarBotonOrdenador(2); //encendemos el ordenador 2
//     System.out.println("El ordeandor 2 está: " + a.consultarEstadoOrdenador(2));
//     a.pulsarBotonOrdenador(2); //apagamos el ordenador 2
//     System.out.println("El ordeandor 2 está: " + a.consultarEstadoOrdenador(2));
//     a.pulsarBotonOrdenador(2); //encendemos el ordenador 2
//     System.out.println("El ordeandor 2 está: " + a.consultarEstadoOrdenador(2));
//     a.pulsarBoton();
//     System.out.println("El ordeandor 2 está: " + a.consultarEstadoOrdenador(2));
     
        a.pulsarBoton();
        System.out.println("El ordeandor 1 está: " + a.consultarEstadoOrdenador(1)); //false
        System.out.println("El ordeandor 2 está: " + a.consultarEstadoOrdenador(2)); //false
        
        a.pulsarBotonOrdenador(2);
        System.out.println("El ordenador 2 ahora está: " + a.consultarEstadoOrdenador(2)); //true
        
        a.pulsarBotonOrdenador(2);
        System.out.println("El ordenador 2 ahora está: " + a.consultarEstadoOrdenador(2));//false
        
        a.pulsarBotonOrdenador(2);
        System.out.println("El ordenador 2 ahora está: " + a.consultarEstadoOrdenador(2));//true
        
        a.pulsarBoton();
        a.pulsarBotonOrdenador(3);
        System.out.println("El ordenador 2 ahora está: " + a.consultarEstadoOrdenador(2)); //Debería estar false por el general
        
        //Ampliacion
        //Ampliación del ejercicio: Cada ordenador puede tener un consumo eléctrico distinto. Al
        //encender cada ordenador, el consumo se incrementa según la potencia que tenga ese
        //ordenador. Al apagarlo, se reduce el consumo.
        //Hay que saber según los ordenadores que estén encendidos el consumo total del aula.
        
        System.out.println("El consumo total del aula es: " + a.totalConsumo());
        
        a.pulsarBotonOrdenador(3);
        System.out.println("El consumo total del aula es: " + a.totalConsumo());
        
        a.pulsarBotonOrdenador(2);
        System.out.println("El consumo total del aula es: " + a.totalConsumo());
        
    }
}
