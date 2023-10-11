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
public class Tesis extends Publicacion {

    protected String departamento;

    public Tesis(String titulo, String autores, String departamento, int dia, int mes, int anio) {
        this.titulo = titulo;
        this.autores = autores;
        this.departamento = departamento;

        fecha_publicacion[0] = dia;
        fecha_publicacion[1] = mes;
        fecha_publicacion[2] = anio;
    }
    
    public String departamento(){
        return departamento;
    }

}
