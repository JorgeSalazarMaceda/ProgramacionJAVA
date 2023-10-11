/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoPrueba;

/**
 *
 * @author Jorge
 */
public class Publicacion {
    protected String titulo;
    protected String autores;
    protected int[]fecha_publicacion = new int [3];
    
    //Metodo titulo que devuelve un string, return titulo
    //Metodo autores que devuelve un string, return autores
    //Metodo fecha que devuelve un array de enteros,  public int[] fecha[]{ return fecha-publicacion;
    
    public String titulo(){
        return titulo;
    }
    
    public String autores(){
        return autores;
    }
    
    public int[]fecha(){
        return fecha_publicacion;
    }
}
