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
public class Novelas extends Libro implements Prestamo {

    //Atributos
    private boolean prestado;
    Tipo_Novela tipo; //Es un atributo de tipo de tipo enumerado

    public Novelas(String codigo, String titulo, String editorial, Tipo_Novela a) { //En a vamos a meter el tipo de novela, es una variable
        super(codigo,titulo,editorial);
        
//        this.codigo=codigo;
//        this.titulo=titulo;             
//        this.editorial=editorial;
        this.prestado = false;
        this.tipo = a;
    }

    public Novelas(String titulo) {
        super();
        this.titulo=titulo;
    }

    public Novelas() {
        this.prestado = false;
        this.codigo = "123";
        this.editorial = "SALAMANDRA";
        this.titulo = "MamaWendy";
        this.tipo = Tipo_Novela.SUSPENSE;

    }
    
    

    public String getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public String toString() {
        return "La novela es del tipo: " + tipo + codigo + titulo + editorial;
    }

    //El atributo prestado, es el que guarda si está prestado o no y el metodo boolean es el que te retorna su estado(prestado o no prestado).
    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public boolean prestar() {
        if (prestado == false) {
            prestado = true;
            System.out.println("Has prestado la novela");
        } else {
            System.out.println("La novela ya está prestada");
        }
        return prestado;

    }

    @Override
    public void devolver() {
        if (prestado == true) {
            prestado = false;
            System.out.println("Has devuelto la novela");
        } else {
            System.out.println("No puedes devolver la novela, porque no está prestada, la tienes en tu poder");
        }
    }

//    @Override
//    public void prestar() {
//        if (prestado) {
//            System.out.println("La novela ya estaba prestada");
//        }
//        prestado=true;
//    }
//
//    @Override
//    public void devolver() {
//        if (!prestado) {
//            System.out.println("La novela no estaba prestada todavía");
//        }
//        prestado=false;
//    
    @Override
    public void mostrar() {
        System.out.println("Los datos de la novela son: " + this.titulo);
    }

}
