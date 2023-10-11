/*
Disponemos de la BD Empleado donde se almacena la información de los empleados de una Cía y las oficinas de las que dispone en distintas ciudades.
La BD se compone de la tabla empleados y oficinas.
14.11 Crea un programa que MUESTRE TODOS LOS EMPLEADOS. (Con un void, un System con los get int y get String)
14.12 Utiliza la técnica de mapeo objetivo-relacional para cargar todas las oficinas de la BD en una lista de oficinas. Muestra el contenido de la lista de objetos creada.
14.13 Modifica la Actividad de aplicación 14.12 para que la aplicación solicite al usuario el nombre de la ciudad, y que muestre las oficinas ubicadas en esa ciudad.
14.14 Muestra un listado con el nombre y la edad de los empleados cuya edad se encuentre entre valores máximos y mínimos que introducirá el usuario.
14.15 Crea un programa que lea los datos de un empleado, excepto la fecha de contratación, que será la de hoy y los inserte en la BD.
14.16 Modifica la Actividad de la aplicación 14.15 para que el programa utilice mapeo objeto-relacional. 
Es decir, hemos de insertar los datos de un empleado creando previamente un objeto de tipo Empleado. 
Utiliza tambien un objeto DAO para la inserción. No será necesario implementar otros métodos del objeto DAO.
14.17
14.18
14.19
14.20
14.21
14.22
14.23
 */
package BD_Evaluable;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jorge
 */

public class prueba {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmpleadosDao empleadosDao = new EmpleadosDao();
        OficinasDao oficinasDao = new OficinasDao();
        int menu;
        
        do {
            System.out.println("Díganos la opción que desea:");
            System.out.println(" 0. Adiós");
            System.out.println(" 1. PREGUNTA 11. Mostrando la lista de Empleados.");
            System.out.println(" 2. PREGUNTA 12. Mostrando la lista de Oficinas y 21 Mostrando la lista de Oficinas.");
            System.out.println(" 3. PREGUNTA 13. PREGUNTAMOS CIUDAD Y MOSTRAMOS OFICINAS.");
            System.out.println(" 4. PREGUNTA 14. Empleados en rango de edades.");
            System.out.println(" 5. PREGUNTA 15 (17 y 18 (Incluye métodos existe oficina y existe empleado (ComprobacionInsert)). Insert de empleados.");
            System.out.println(" 6. PREGUNTA 16 (17 y 18 (Incluye métodos existe oficina y existe empleado)). Insert de empleados");
            System.out.println(" 7. PREGUNTA 19 CAMBIA empleados de oficina");
            System.out.println(" 8. PREGUNTA 20 BORRADO empleado");
            System.out.println(" 9. PREGUNTA 22 BUSCA OFICINA SUPERFICIE");
            
            menu = sc.nextInt();

            switch (menu) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    empleadosDao.leerEmpleados();
                    break;
                case 2:
                    System.out.println("PREGUNTA 12 y 21 Mostrando la lista de Oficinas");
                    System.out.println(oficinasDao.ListaOficinas());
                    break;
                case 3:
                    System.out.println(oficinasDao.oficinaPorCiudad());
                    break;
                case 4:
                    empleadosDao.EmpleadosPorEdad();
                    break;
                case 5:
                    empleadosDao.insertEmpleado();
                    break;
                case 6:
                    empleadosDao.insertEmpleadoObj();
                    break;
                case 7:
                    empleadosDao.cambiaEmpleadosDeOficina();
                    break;
                case 8:
                    empleadosDao.borrarEmpleado();
                    break;
                case 9:
                    oficinasDao.oficinaSuperficie();
                    break;
            }
        }while(menu != 0);
    }       
      
//        List<Oficina> oficinas = oficinasDao.ListaOficinas();
//        for (Oficina oficina : oficinas) {
//            System.out.println("Oficina: " + oficina.toString());
//            System.out.println("---------------");
//        }
}
