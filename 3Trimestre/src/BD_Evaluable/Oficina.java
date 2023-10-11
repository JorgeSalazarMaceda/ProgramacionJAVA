/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD_Evaluable;

/**
 *
 * @author Jorge
 */
import java.sql.*;
import java.util.*;
import java.util.Date;
public class Oficina {
    // Atributos
    
    private int oficina;
    private String ciudad;
    private int superficie;
    private double ventas;

    public Oficina() {
    }
    
    

    public Oficina(int oficina, String ciudad, int superficie, double ventas) {
        this.oficina = oficina;
        this.ciudad = ciudad;
        this.superficie = superficie;
        this.ventas = ventas;
    }
    
    //Método que recibe el resultset para insertar dentro del objeto oficina creado el propio resultset en cada vuelta del bucle
     public static Oficina TablaOficina(ResultSet resultado) {
          Oficina oficina = new Oficina();
          try{
              oficina.oficina = (resultado.getInt("oficina"));
              oficina.ciudad = (resultado.getString("ciudad"));
              oficina.superficie = (resultado.getInt("superficie"));
              oficina.ventas = (resultado.getDouble("ventas"));
              
          }
          catch (SQLException ex){
              System.out.println("Error al mapear los campos: " + ex.getMessage());
          }
            return oficina;
    }
     //Getters y Setters
    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
        

    @Override
    public String toString() {
        return "\n " + this.oficina + " - " + this.ciudad + " \n " + this.superficie + " \n " + this.ventas;
    }
    
}  