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
public class Historicos extends Libro {
    //Atributos

    private int serie;

    //Constructor
    public Historicos(int serie) { //Constructor solo con un parametro, (SERIE)
        this.serie = serie;
    }

    public Historicos(String titulo) {
        this.titulo = titulo;
    }

    public Historicos(String codigo, String titulo, String editorial, int serie) { //Constructor con todos los parámetros
         super(codigo,titulo,editorial);
//        this.codigo=codigo;
//        this.titulo=titulo;
//        this.editorial=editorial;
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public String toString() {
        return "El historico es del tipo: " + codigo + titulo + editorial;
    }
    @Override
    public void mostrar() {
        System.out.println("Los datos de este libro historico son: " + this.codigo + "-" + this.titulo + "-" + this.editorial);
    }

}
