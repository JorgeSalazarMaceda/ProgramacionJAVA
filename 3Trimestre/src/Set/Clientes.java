/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;

import java.util.Objects;

/**
 *
 * @author Jorge
 */
// compareTo --> Comparable
//compare --> comparator
public class Clientes implements Comparable<Clientes>{ //Para usar el compareTo, hay que implementar Comparable
    private String nombre;
     private String email;
      private String tipo_cliente;
       private int codigo;
//Constructor
    public Clientes(String nombre, String email, String tipo_cliente, int codigo) {
        this.nombre = nombre;
        this.email = email;
        this.tipo_cliente = tipo_cliente;
        this.codigo = codigo;
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    //Metodos hashcode y equals para el EMAIL
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    //Metodo para resolver el ejercicio 1 del main (comparar por defecto, criterio natural)
    public int compareTo(Clientes otro){
        return codigo - otro.codigo;
    }
    
    public int comparaPorNombre(Clientes otro){
        String nombre2 = otro.getNombre();
        return nombre.compareTo(nombre2);
        //Este compareTo no tiene nada que ver con el compareTo de arriba, estoy comparando otro criterio.
        //compareTo solo puedes ponerlo una vez, pero luego puedes llamarlo x veces.
    }

    @Override
    public String toString() {
        return "\nCliente: " + nombre + ", su email es: " + email + ",el tipo_cliente es: " + tipo_cliente + " y el codigo es: " + codigo;
    }
}
