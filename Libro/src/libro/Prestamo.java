/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Jorge
 */
//Los metodos tienen que ser dependientes entre sí. Para poder prestar un libro, tiene que estar disponible.
public interface Prestamo {

    //Una interfaz, como por definicion no tiene implementación,y no tiene atributos 
    //no hace falta poner abstract, porque abstract puede tener metodos implementados y no implementados.
    
    //Métodos 
    public boolean prestar();

    public void devolver();

    public boolean prestado();

    static void prueba() { //Pero son métodos estáticos, no dinámicos.
        System.out.println("Prueba de que se pueden implementar metodos en una interfaz");
    }

}
