/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacticar;

/**
 *
 * @author Jorge
 */
import java.sql.*;
public class Practicar {
    private static String usuario="root";
    private static String contraseña="admin";
    private static String bd="empresa";
    private static final String MAQUINA = "localhost";
    
    private static Connection Conectar(){
        String url="jdbc:mysql://"+ MAQUINA + "/" + bd;
        Connection con = null;
         try {
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD");
        }
        return con;
    }
    }
}
