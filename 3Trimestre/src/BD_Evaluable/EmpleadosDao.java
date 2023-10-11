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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadosDao {
    
//    private final String tabla = "empleados"; 

    //Atributos
    //Son privados y final para que nadie los pueda tocar.
    // Con static, la conexión es de toda la clase.
    static Scanner sc = new Scanner(System.in);
    private static Connection conexion;
    private final String USUARIO = "Jorge";
    private final String CONTRASEÑA = "Js010203";
    private final String MAQUINA = "localhost";
    private final String BD = "empresa";

    public EmpleadosDao() {
        conexion = conectar();
    }

    //Metodo para conectar resultado la BD instituto
    private Connection conectar() {
        Connection con = null;
        //"jdbc:mysql://localhost:3306/instituto","usuario",""
        String url = "jdbc:mysql://" + MAQUINA + "/" + BD; //En el url ponemos mis claves de workbench
        System.out.println(url);
        try {
            con = DriverManager.getConnection(url, USUARIO, CONTRASEÑA);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD");
        }
        return con;
    }

    // 14.11 Crea un programa que MUESTRE TODOS LOS EMPLEADOS. 
    void leerEmpleados() {
        String sql = "SELECT * FROM EMPLEADOS";
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql); //Para enviar la select resultado traves de la conexion
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()) { //Recorremos la select y vamos guardando en las variables cada campo de la BD
                System.out.println(resultado.getString(1) + " " + resultado.getString(2) + " " + resultado.getString(3)); //Aqui se devuelve la columna que quiero ver
                System.out.println("-------------------");
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar el empleado");
            ex.printStackTrace();
        }

    }
    //Pregunta 14.12 (Con varias formas--> MAPEO)
//    List<Empleado> getListEmpleados() { //Método que retorna una lista
//        String sql = "SELECT * FROM EMPLEADOS";
//        List<Empleado> lista = new ArrayList();
//        try {
//            PreparedStatement sentencia = conexion.prepareStatement(sql); //Para enviar la select resultado traves de la conexion
//            ResultSet resultado = sentencia.executeQuery(sql);
//            while (resultado.next()) { //Recorremos la select y vamos guardando en las variables cada campo de la BD
////                Date fecha = (Date)resultado.getDate(6);
////                Empleado empleado = new Empleado(resultado.getInt(1), resultado.getString(2), resultado.getInt(3), resultado.getInt(4), resultado.getString(5), fecha); //Aqui se devuelve la columna que quiero ver
////                Empleado empleado = new Empleado();
////                empleado.setNumemp(resultado.getInt("numemp"));
////                empleado.setNombre(resultado.getString("nombre"));
////                empleado.setEdad(resultado.getInt("edad"));
////                empleado.setOficina(resultado.getInt("oficina"));
////                empleado.setContrato(resultado.getDate("contrato"));
////                empleado.setPuesto(resultado.getString("puesto"));
//                lista.add(Empleado.TablaOficina(resultado));
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error al consultar el empleado");
//            System.out.println(ex.getLocalizedMessage());
//        }
//        
//        return lista;
//        
//    }

    //Pregunta 14.14 EDADES
    void EmpleadosPorEdad() {

        List<Empleado> lista = new ArrayList();
        Empleado a = null;
        String sql = "SELECT * FROM EMPLEADOS WHERE edad between ? and ?";
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql); //Para enviar la select resultado traves de la conexion

            System.out.println("Diganos las edades: ");
            System.out.println("Introduzca la edad mínima: ");
            int edadMin = sc.nextInt();
            sentencia.setInt(1, edadMin);
            System.out.println("Introduzca la edad máxima:  ");
            int edadMax = sc.nextInt();
            sentencia.setInt(2, edadMax);

            if (edadMin > edadMax) {
//                 sentencia.setInt(1, edadMax);
//                 sentencia.setInt(2, edadMin);
                //System.out.println("Has introducido mal las edades");
            } else {
//                 sentencia.setInt(1, edadMin);
//                 sentencia.setInt(2, edadMax);
                ResultSet resultado = sentencia.executeQuery();

                while (resultado.next()) { //Recorremos la select y vamos guardando en las variables cada campo de la BD
                    String nombre = resultado.getString("nombre");
                    int edad = resultado.getInt("edad");

                    a = new Empleado(nombre, edad);
                    //lista.add(Empleado.TablaOficina(resultado));
                    lista.add(a);

                    System.out.println("Nombre: " + resultado.getString("nombre") + " /  Edad: " + resultado.getInt("edad") + "\n");
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar las edades de los empleados");
            ex.printStackTrace();
        }
    }

    // Pregunta 14.15 INSERT EMPLEADO
    void insertEmpleado() {
        String sql = "INSERT INTO EMPLEADOS (numemp, nombre, edad, oficina, puesto, contrato) "
                + "VALUES (?,?,?,?,?,?)";
        //List<Empleado> lista = new ArrayList();
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql); //Para enviar la select resultado traves de la conexion
            System.out.println("Introduce los datos de un empleado");

            // Seteamos directamente los parametros en la sentencia.
            System.out.println("Introduce el numemp");
            int numemp = sc.nextInt();
            sentencia.setInt(1, numemp);
            System.out.println("Introduce el nombre");
            String nombre = sc.next();
            sentencia.setString(2, nombre);
            System.out.println("Introduce el edad");
            int edad = sc.nextInt();
            sentencia.setInt(3, edad);
            System.out.println("Introduce el oficina");
            int oficina = sc.nextInt();
            sentencia.setInt(4, oficina);
            System.out.println("Introduce el puesto");
            String puesto = sc.next();
            sentencia.setString(5, puesto);
            sentencia.setDate(6, new java.sql.Date(System.currentTimeMillis())); //Creamos un objeto de tipo Date inicializado con la hora del sistema en milisegundos.

            comprobacionesInsertEmpleado(oficina, numemp, sentencia);
            

        } catch (SQLException ex) {
            System.out.println("Error al consultar las edades de los empleados");
            System.out.println(ex.getLocalizedMessage());
        }
    }

    //Pregunta 14.16 INSERT EMPLEADO CON OBJETO EMPLEADO
    void insertEmpleadoObj() {
        String sql = "INSERT INTO EMPLEADOS (numemp, nombre, edad, oficina, puesto, contrato) "
                + "VALUES (?,?,?,?,?,?)";
        //List<Empleado> lista = new ArrayList();
        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql); //Para enviar la select resultado traves de la conexion
            System.out.println("Introduce los datos de un empleado");

            System.out.println("Introduce el numemp");
            int numemp = sc.nextInt();
            System.out.println("Introduce el nombre");
            String nombre = sc.next();
            System.out.println("Introduce el edad");
            int edad = sc.nextInt();
            System.out.println("Introduce el oficina");
            int oficina = sc.nextInt();
            System.out.println("Introduce el puesto");
            String puesto = sc.next();
            // Creamos el obj empleado y los parametros los seteamos (metemos) en el obj
            Empleado empleado = new Empleado(numemp, nombre, edad, oficina, puesto, new Date());

            sentencia.setInt(1, empleado.getNumemp());
            sentencia.setString(2, empleado.getNombre());
            sentencia.setInt(3, empleado.getEdad());
            sentencia.setInt(4, empleado.getOficina());
            sentencia.setString(5, empleado.getPuesto());
            sentencia.setDate(6, new java.sql.Date(empleado.getContrato().getTime())); //Metes el contrato en el new java date.

            comprobacionesInsertEmpleado(oficina, numemp, sentencia);
           

        } catch (SQLException ex) {
            System.out.println("Error al consultar las edades de los empleados");
            System.out.println(ex.getLocalizedMessage());
        }
    }

    //Pregunta 14.17 Método para ver si existe el empleado
    boolean existeEmpleado(int numemp) {
        String sql = "SELECT * FROM EMPLEADOS WHERE numemp = ?";
        boolean existe = false;

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, numemp);

            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar el empleado");
            System.out.println(ex.getLocalizedMessage());
        }
        return existe;
    }
    
    
    //    ----------------------------   COMPRUEBA EXISTENCIAS OFICINA Y EMPLEADO    --------------------------
    
    
    //Metodo que llama a las comprobaciones del ejercicio 14.17 y 14.18 (Método para ver si existe el empleado y oficina)
    private void comprobacionesInsertEmpleado(int oficina, int numemp, PreparedStatement sentencia) throws SQLException {
        // Creamos un obj de oficinasDao para usar el método existeOficina. Entonces si existe la oficina 
        // continuamos con el insert pero es necesario que no se duplique el empleado (dos if anidados)
        OficinasDao oficinasDao = new OficinasDao();
        if (oficinasDao.existeOficina(oficina)) {
            if (existeEmpleado(numemp)) {
                System.out.println("El empleado ya existe");
            } else {
                sentencia.executeUpdate(); // Donde se ejecuta la consulta
            }
        } else {
            System.out.println("Es necesario que exista la oficina para insertar al empleado");
        }
    }
    
    //      ---------------------------------------------

    //PREGUNTA 14.19 METODO que cambia los empleados de oficina.
    void cambiaEmpleadosDeOficina() {

        System.out.println("¿Cual es la oficina inicial para el traspaso de sus empleados?");
        int oficinaOrigen = sc.nextInt();
        System.out.println("¿A qué oficina quieres enviar a tus empleados?");
        int oficinaDestino = sc.nextInt();

        if (oficinaOrigen == oficinaDestino) {
            System.out.println("Misma oficina");
        } else {
            // Creamos el objeto de oficinasDao para llamar al metodo de existeOficinas
            OficinasDao oficinasDao = new OficinasDao();
            if (oficinasDao.existeOficina(oficinaOrigen) && oficinasDao.existeOficina(oficinaDestino)) {
                try {
                     
                     String sql = "UPDATE empleados set oficina = ? where oficina = ? ";
                     String sqlMuestra="SELECT nombre, oficina FROM empleados WHERE oficina = ?";
                     // Otra forma de hacer el UPDATE
                     //String tabla1 = "empleados", tabla2 = "oficinas";
                     //String sql = "UPDATE " + tabla1 + " INNER JOIN " + tabla2 + 
                            //" ON (" + tabla1 + ".oficina = " + tabla2 + ".oficina)" + " SET " + tabla1 + ".oficina " + " = ? WHERE " + tabla1 + ".oficina =?";
                    
                     PreparedStatement sentencia = conexion.prepareStatement(sql);
                     PreparedStatement sentenciaMuestra = conexion.prepareStatement(sqlMuestra);
                        
                        sentencia.setInt(1, oficinaDestino);
                        sentencia.setInt(2, oficinaOrigen);
                        
                        // ---------------- Mostramos los empleados antes del cambio -----------
                        sentenciaMuestra.setInt(1, oficinaOrigen);
                        ResultSet resultado = sentenciaMuestra.executeQuery();
                        System.out.println("");
                        System.out.println("\nEmpleados antes de la modificación: ");
                        while(resultado.next()){
                            System.out.println(" Nombre empleado: " + resultado.getString("nombre")+ " || Oficina: " + resultado.getInt("oficina"));
                        }
                        
                        int total = sentencia.executeUpdate();
                        System.out.println("Total: " + total + " Empleados cambiados de oficina: " + oficinaOrigen + " a la oficina: " + oficinaDestino);
                    
                        
                        // ----------- Mostramos el después de los empleados con el cambio -------------
                        sentenciaMuestra.setInt(1, oficinaDestino);
                        resultado = sentenciaMuestra.executeQuery();
                        
                        System.out.println("");
                        System.out.println("\nEmpleados después de la modificación: ");
                        while(resultado.next()){
                            System.out.println(" Nombre empleado: " + resultado.getString("nombre")+ " || Oficina: " + resultado.getInt("oficina"));
                        }
                        
                } catch (SQLException ex) {
                    System.out.println("Error al realizar la consulta de oficinas");
                    System.out.println(ex.getLocalizedMessage());
                }

            } else {
                System.out.println("Alguna de las oficinas no existe");
            }
        }


//        List<Empleado> listaEmpleados = new ArrayList<>();
//
//        System.out.println("¿Cual es la oficina inicial para el traspaso de sus empleados?");
//        int oficinaOrigen = sc.nextInt();
//        System.out.println("¿A qué oficina quieres enviar a tus empleados?");
//        int oficinaDestino = sc.nextInt();
//
//        if (oficinaOrigen == oficinaDestino) {
//            System.out.println("Misma oficina");
//        } else {
//            // Creamos el objeto de oficinasDao para llamar al metodo de existeOficinas
//            OficinasDao oficinasDao = new OficinasDao();
//            if (oficinasDao.existeOficina(oficinaOrigen) && oficinasDao.existeOficina(oficinaDestino)) {
//                try {
//                    
//                    String sql = "SELECT * FROM empleados WHERE oficina = ?";
//                    PreparedStatement sentencia = conexion.prepareStatement(sql);
//                    sentencia.setInt(1, oficinaOrigen);
//
//                    ResultSet resultado = sentencia.executeQuery();
//
//                    while (resultado.next()) {
//                        Empleado empleado = new Empleado(); //Creamos un objeto Empleado para obtener los empleados y añadirlos a la lista
//                        //Metemos los campos obtenidos en el objeto empleado
////                        empleado.setNumemp(resultado.getInt("numemp"));
////                        empleado.setNombre(resultado.getString("nombre"));
////                        empleado.setEdad(resultado.getInt("edad"));
////                        empleado.setOficina(resultado.getInt("oficina"));
////                        empleado.setContrato(resultado.getDate("contrato"));
////                        empleado.setPuesto(resultado.getString("puesto"));
//
//                        listaEmpleados.add(empleado);
//                    }
//                    // A partir de aqui, recorremos la lista empleados y los cambiamos de oficina
//                    for (Empleado empleado : listaEmpleados) {
//                        // Actualiza en la tabla empleados la oficina destino donde el numemp del objeto empleado era la oficina origen
//                        String sqlUpdate = "UPDATE empleados SET oficina = ? WHERE numemp = ?"; 
//                        PreparedStatement sentenciaUpdate = conexion.prepareStatement(sqlUpdate); //Segunda conexión
//
//                        // Esto seria como un SELECT * de numemp del empleado de la lista y le estamos seteando en la oficina destino.
//                        sentenciaUpdate.setInt(1, oficinaDestino);
//                        sentenciaUpdate.setInt(2, empleado.getNumemp());
//
//                        sentenciaUpdate.executeUpdate();
//                        System.out.println("Empleados cambiados de oficina: " + oficinaOrigen + " a la oficina: " + oficinaDestino);
//                    }
//
//                } catch (SQLException ex) {
//                    System.out.println("Error al realizar la consulta de oficinas");
//                    System.out.println(ex.getLocalizedMessage());
//                }
//
//            } else {
//                System.out.println("Alguna de las oficinas no existe");
//            }
//        }
    }

    // PREGUNTA 14.20 Borrar empleado
    void borrarEmpleado() {        
        //Hacemos la variable sql
        //En el try preparamos la conexion de la consulta para ejecutar
        //Preguntamos en codigo a eliminar y miramos si existe ese empleado para poder eliminar
       
        String sql = "DELETE FROM empleados WHERE numemp = ?";

        try {
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            System.out.println("¿Cual es el código empleado que quieres borrar?");
            int empleado = sc.nextInt();
              if (existeEmpleado(empleado)) {
                sentencia.setInt(1, empleado);
                sentencia.executeUpdate();
                  System.out.println("Empleado borrado");
            } else {
                  System.out.println("No existe ese empleado");
            }
        } catch (SQLException ex) {
            System.out.println("Error al realizar el DELETE de empleado");
            System.out.println(ex.getLocalizedMessage());
        }

    }
    
    // PREGUNTA 14.21 (Hecho en OficinasDao en el ejercicio 14.12)

}
