/*
Disponemos de la BD Empleado donde se almacena la información de los empleados de una Cía y las oficinas de las que dispone en distintas ciudades.
La BD se compone de la tabla empleados y oficinas.
14.11 Crea un programa que MUESTRE TODOS LOS EMPLEADOS. (Con un void, un System con los get int y get String)
14.12 Utiliza la técnica de mapeo objetivo-relacional para cargar todas las oficinas de la BD en una lista de oficinas. Muestra el contenido de la lista de objetos creada.
14.13 Modifica la Actividad de aplicación 14.12 para que la aplicación solicite al usuario el nombre de la ciudad, y que muestre las oficinas ubicadas en esa ciudad.
14.14 Muestra un listado con el nombre y la edad de los empleados cuya edad se encuentre entre valores máximos y mínimos que introducirá el usuario.
14.15 Crea un programa que lea los datos de un empleados, excepto la fecha de contratación, que será la de hoy y los inserte en la BD.
14.16 Modifica la Actividad de aplicación 14.15 para que el programa utilice mapeo objeto-relacional. Es decir, hemos de insertar los datos de un empleado creando previamente un objeto de tipo Empleado.
      Utiliza también un DAO para la inserción. No será necesario implementar otros métodos del objeto DAO.
14.17 Repite la Actividad de aplicación 14.16 para comprobar que el empleado que se va a insertar no existe en la BD. Para ello es necesario controlar que no encontramos un empleado con idéntico numemp de la BD.
14.18
14.19
14.20
14.21
14.22
14.23
*/
package BD_Evaluable;

/**
 *
 * @author Jorge
 */
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empleado {
    //Atributos
    private int numemp;		
    private String nombre;
    private int edad;
    private int oficina;
    private String puesto;
    private Date contrato;             
    
    
    //Constructores
    public Empleado() {
        
    }

    public Empleado(int numemp, String nombre, int edad, int oficina, String puesto, Date contrato) {
        this.numemp = numemp;
        this.nombre = nombre;
        this.edad = edad;
        this.oficina = oficina;
        this.puesto = puesto;
        this.contrato = contrato;
    }
    
        public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }
    //Pregunta 14.12 (Con varias formas--> MAPEO)
    //Método que recibe el resultset para insertar dentro del objeto empleados creado el propio resultset en cada vuelta del bucle
    public static Empleado TablaOficina(ResultSet result) {
        Empleado empleados = new Empleado();
        try {
            empleados.setNumemp(result.getInt("numemp"));
            empleados.setNombre(result.getString("nombre"));
            empleados.setEdad(result.getInt("edad"));
            empleados.setOficina(result.getInt("oficina"));
            empleados.setContrato(result.getDate("contrato"));
            empleados.setPuesto(result.getString("puesto"));
        } catch (SQLException ex) {
            System.out.println("Error al mapear los campos: " + ex.getMessage());
        }
        return empleados;
    }
    // Getters y Setters
    public int getNumemp() {
        return numemp;
    }

    public void setNumemp(int numemp) {
        this.numemp = numemp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getContrato() {
        return contrato;
    }

    public void setContrato(Date contrato) {
        this.contrato = contrato;
    }
    
    

    @Override
    public String toString() {
        return this.numemp + " - " + this.nombre + " - " + this.edad + " - " + this.oficina + " - " + this.puesto + " - " + this.contrato.toString();
    }
   
}
