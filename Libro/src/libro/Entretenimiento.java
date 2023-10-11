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
public class Entretenimiento extends Libro implements Prestamo {

    //Atributos
    private boolean prestado;

    //Constructor
    public Entretenimiento(String codigo, String titulo, String editorial) {
        super(codigo, titulo, editorial);
        this.prestado = false;
//        this.codigo = codigo;
//        this.editorial= editorial;
    }

    //Metodo toString
    @Override //Esto lo hemos sobreescrito de Object de java, lo hemos heredado de Libro y Libro de Object
    public String toString() {
        return "El libro de entretenimiento: " + this.codigo + "," + this.editorial + "," + "," + this.prestado; //PRESTADO ES BOOLEAN Y TE PIDE UNA CADENA DE CARACTERES???????
    }

    @Override
    public boolean prestado() {

        return prestado;
    }

    @Override
    public boolean prestar() {
        if (prestado == false) {
            prestado = true;
            System.out.println("Has prestado el libro de entretenimiento");
        } else {
            System.out.println("El libro de entretenimiento ya está prestado");
        }
        return prestado;
    }

    @Override
    public void devolver() {
        if (prestado == true) {
            prestado = false;
            System.out.println("Has devuelto el libro de entretenimiento");
        } else {
            System.out.println("No puedes devolver el libro de entretenimiento, porque no está prestado");
        }
    }
    
    @Override
     public void mostrar() {
        System.out.println("Los datos del libro de entretenimiento son: " + this.codigo + "-" + this.titulo + "-" + this.editorial);
    }

}
