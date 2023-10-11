/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenPOO;

/**
 *
 * @author Jorge
 */
public class Persona {
    //Atributos
   protected String nombre; //Protected para que la clase hija pueda ver estos atributos
    protected int edad,estatura;
    
    
    
//getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstatura() {
        return estatura;
    }
    
    
    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    
    public void mostrarDatos(){
        System.out.println("Datos : ");
            System.out.println("Nombre: "+nombre);
            System.out.println("Edad: "+edad);
            System.out.println("Estatura: "+estatura);
    }
}
