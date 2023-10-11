/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD_Evaluable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author Jorge
 */

// INTERROGANTE = CONTENEDOR
public class OficinasDao {
    //Atributos
    //Son privados y final para que nadie los pueda tocar.
    // Con static, la conexión es de toda la clase.
    static Scanner sc=new Scanner(System.in);
    private static Connection conexion;
    private final String USUARIO = "Jorge";
    private final String CONTRASEÑA = "Js010203";
    private final String MAQUINA = "localhost";
    private final String BD = "empresa";

    public OficinasDao() {
        conexion = conectar();
    }

    //Metodo para conectar a la BD empresa
    private Connection conectar() {
        Connection con = null;
        //"jdbc:mysql://localhost:3306/instituto","usuario",""
        String url = "jdbc:mysql://" + MAQUINA + "/" + BD; //En el url ponemos mis claves de workbench
        //System.out.println(url);
        try {
            con = DriverManager.getConnection(url, USUARIO, CONTRASEÑA);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD");
        }
        return con;
    }
    //EJERCICIOS
    
    //Pregunta 14.12(Con varias formas--> MAPEO) // PREGUNTA 14.21
    List<Oficina> ListaOficinas(){
        
        String sql = "Select * From oficinas";
       List<Oficina> listaOficinas = new ArrayList();
       
       try{
           PreparedStatement sentencia = conexion.prepareStatement(sql);
           ResultSet resultado = sentencia.executeQuery(sql);
          
           while (resultado.next()){
               //listaOficinas.add(Oficina.TablaOficina(resultado));
               int oficina = resultado.getInt("oficina"); //Tambien se puede poner con números
               String ciudad = resultado.getString("ciudad");
               int superficie = resultado.getInt("superficie");
               double ventas = resultado.getDouble("ventas");
               Oficina a = new Oficina(oficina,ciudad,superficie,ventas);
            listaOficinas.add(a);
       }
       }
       catch(SQLException ex){
           System.out.println("Error al consultar las oficinas");
       }
       return listaOficinas;
    }
    //Pregunta 14.13
    List<Oficina> oficinaPorCiudad() {
        List<Oficina> oficinas = new ArrayList();

        String sql = "SELECT * FROM OFICINAS WHERE CIUDAD = ?";
        //System.out.println(sql);
//         List<Oficina> listaOficina = oficinasDao.oficinaPorCiudad();
//                    if (listaOficina.isEmpty()) {
//                    System.out.println("No se ha encontrado ninguna oficina en esa ciudad");
//                    } else {
//                        System.out.println(listaOficina);
//                       }
        try {
            
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            System.out.println("Introduzca una ciudad: ");
            String ciudad = sc.nextLine();
            sentencia.setString(1, ciudad);
            
            ResultSet result = sentencia.executeQuery();
            
            while (result.next()) {
                //oficinas.add(Oficina.TablaOficina(result));
                
                int oficina = result.getInt("oficina"); //Tambien se puede poner con números
                ciudad = result.getString("ciudad");
                int superficie = result.getInt("superficie");
                double ventas = result.getDouble("ventas");
                
                Oficina a = new Oficina(oficina,ciudad,superficie,ventas);
                oficinas.add(a);
            }
            if (oficinas.isEmpty()) {
                    System.out.println("No se ha encontrado ninguna oficina en esa ciudad");
                    } 
        } catch (SQLException ex) {
            System.out.println("Error al consultar las oficinas: " + ex.getLocalizedMessage());
        }
        return oficinas;
    }
    
    

    
    //Pregunta 14.18 Método para ver si existe la oficina
    
        boolean existeOficina(int oficina){
        String sql = "SELECT * FROM oficinas WHERE oficina = ?";
        boolean existe = false;
        
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, oficina);
            
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al comprobar si existe la oficina");
            System.out.println(ex.getLocalizedMessage());
        }
        return existe;
    }
        
    // PREGUNTA 14.22 METODO que MUESTRA OFICINAS con SUPERFICIE SUPERIOR
    void oficinaSuperficie(){
        String sql ="SELECT * FROM oficinas WHERE superficie > ?";
        boolean hayOficinas = false;
        Oficina ofi = new Oficina();
        try{
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            System.out.println("Introduzca una superfice: ");
            int superficieUsuario = sc.nextInt();

            sentencia.setInt(1, superficieUsuario);
            
            
            ResultSet resultado = sentencia.executeQuery();
//            if(!resultado.next()){
//                System.out.println("Oficina: " + oficina + " || " + " Ciudad: " + ciudad + " || " + "Superficie: " + superficie);
//            }
            while(resultado.next()){
               int oficina = resultado.getInt("oficina");
               String ciudad = resultado.getString("ciudad");
               int superficie = resultado.getInt("superficie");
               
                System.out.println("Oficina: " + oficina + " || " + " Ciudad: " + ciudad + " || " + "Superficie: " + superficie);
                hayOficinas = true;
            }
            
            if (!hayOficinas) {
                System.out.println("No hay oficinas con una superficie mayor que " + superficieUsuario);
            }
            
           
        }catch (SQLException ex){
            System.out.println("Error al realizar el CONSULTA de oficinas de superficie mayor");
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
    //PREGUNTA 14.23 MODIFICA OFICINA (CIUDAD Y VENTAS)
    //void modificaOficina(){
        //Preguntamos al usuario por la oficina (id)
        //Miramos si existe la oficina con ese id, si no existe, avisas. Si existe
        // Preguntar al usuario por la ciudad a la que quieres trasladar tu oficina
        //Preguntar por el incremento de ventas.
        //Hacer el UPDATE.
//        List<Oficina> camposOficina = new ArrayList<>();
//         
//
//        System.out.println("¿Cual es la oficina que quieres cambiar");
//        int oficina = sc.nextInt();
//        if(existeOficina(oficina)){
//            try{
//                
//                      System.out.println("¿A qué ciudad la trasladas?");
//                      String ciudad = sc.nextLine();
//                      System.out.println("¿Que ventas esperas tener?");
//                      int ventas = sc.nextInt();
//                
//                      Statement sentencia = conexion.createStatement();
//                
//                int valor = sentencia.executeUpdate("UPDATE oficinas SET ciudad = '" + ciudad + ", '" + ventas + " where oficina" +oficina);
//                if(valor == 1){
//                    System.out.println("Hemos trasladado la oficina a la ciudad: " + ciudad + " y sus ventas son: " + ventas);
//                }
//                else{
//                    System.out.println("No existe la oficina que deseas modificar");
//                }
//                String sql = "SELECT * FROM oficinas WHERE oficina = ?";
//                PreparedStatement sentencia = conexion.prepareStatement(sql);
//                sentencia.setInt(1, oficina);
//                
//                ResultSet resultado = sentencia.executeQuery();
//                  while (resultado.next()) {
//                        Oficina ofi = new Oficina(); //Creamos un objeto Oficina para obtener la oficina y añadirlos a la lista
//                        //Metemos los campos obtenidos en el objeto ofi
//                        ofi.setOficina(resultado.getInt("oficina"));
//                        ofi.setCiudad(resultado.getString("ciudad"));
//                        ofi.setSuperficie(resultado.getInt("superficie"));
//                        ofi.setVentas(resultado.getInt("ventas"));
//
//                        camposOficina.add(ofi);
//                    }
//                  
//                  //Ahora ya tenemos la oficina a cambiar, solo es recorrerla la lista y hacer el UPDATE de ciudad y ventas
//                  for (Oficina of : camposOficina) {
//                      System.out.println("¿A qué ciudad la trasladas?");
//                      String ciudad = sc.nextLine();
//                      System.out.println("¿Que ventas esperas tener?");
//                      int ventas = sc.nextInt();
//                        String sqlCiudad = "UPDATE oficinas SET ciudad = '"+ciudad+", '"+ventas+"';
//                        PreparedStatement sentenciaCiudad = conexion.prepareStatement(sqlCiudad); //Segunda conexión
//                  }
//            }catch(SQLException ex){
//                System.out.println("Error al modificar la oficina");
//                System.out.println(ex.getLocalizedMessage());
//            }
//        }else {
//            System.out.println("Esa oficina que quieres cambiar no existe");
//        }
//    }
}

              
                    

                    
                    
