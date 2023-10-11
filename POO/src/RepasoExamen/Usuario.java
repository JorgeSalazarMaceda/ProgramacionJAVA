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
public class Usuario {
    //Atributos
    private String nombre;
    private String dni;
    public static int numero_usuarios;
    
    public void pintaDatos(){
        
        System.out.println(nombre);
        System.out.println(dni);
    }
    
}
