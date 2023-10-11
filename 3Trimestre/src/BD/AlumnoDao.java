/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author Jorge
 */
import java.sql.*;
import java.util.*;
import java.util.Date;
public class AlumnoDao {
    
    //Atributos
    //Son privados y final para que nadie los pueda tocar.
    // Con static, la conexión es de toda la clase.
    private static Connection conexion;
    private final String USUARIO="Jorge"; 
    private final String CONTRASEÑA="Js010203";
    private final String MAQUINA="localhost";
    private final String BD="Instituto";

    public AlumnoDao() {
        conexion=conectar();
    }
    
    //Metodo para conectar a la BD instituto
    private Connection conectar(){
        Connection con = null;
        //"jdbc:mysql://localhost:3306/instituto","usuario",""
        String url = "jdbc:mysql://" + MAQUINA + "/" +BD; //En el url ponemos mis claves de workbench
        System.out.println(url);
       try{
           con = DriverManager.getConnection(url,USUARIO, CONTRASEÑA);
        }catch (SQLException ex){
           System.out.println("Error al conectar al SGBD");
    }
       return con;
    }
    
        //Metodo para leer los alumnos de la BD
        List<Alumno>alumnosXCurso(String curso){
    
        List<Alumno> mismoCurso= new LinkedList();
        Alumno alumno = null;
        String sql = "SELECT * FROM Alumnos WHERE curso = ?";
    
         try{     
            PreparedStatement sentencia=conexion.prepareStatement(sql); //Para enviar la select a traves de la conexion
            
            sentencia.setString(1,curso); //Curso es el parámetro que luego pasamos en el main
            
            ResultSet a = sentencia.executeQuery();
            
            while (a.next()){ //Recorremos la select y vamos guardando en las variables cada campo de la BD
                int id = a.getInt("num");
                String nombre = a.getString("Nombre");
                Date fNacimiento = a.getDate("fNac");
                Double notaMedia = a.getDouble("media");
                
                alumno = new Alumno(id, nombre, fNacimiento, 0, curso); //Creamos un objeto alumno con todos los campos
                mismoCurso.add(alumno); //Y lo metemos en la lista mismo curso.
                //Y así tenemos una lista de objetos tipo alumno.
            }
     } catch (SQLException ex){
         System.out.println("Error al consultar el alumno");
         //ex.printStrackTrace();
     }
     return mismoCurso;
    }
        
        //Método para insertar un alumno
        public void create (Alumno alumno){
            if (alumno != null){
                
            }
        }
}


    
