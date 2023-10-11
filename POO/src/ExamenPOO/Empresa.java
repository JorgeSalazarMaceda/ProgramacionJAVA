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
import java.util.Scanner;
public class Empresa {
    
    public static void main(String[] args) {
    
    Empleado empleado1=new Empleado();
    Empleado empleado2=new Empleado("pepe", 700.00);
    Empleado empleado3=new Empleado();
        
    System.out.println("");
 //Utilización método sube sueldo
   
 System.out.println("SUELDO DE LOS TRABAJADORES CON UNA SUBIDA DE SUELDO DISTINTA PARA CADA UNO");
    empleado1.subeSueldo(10);
    empleado2.subeSueldo(50);
    empleado2.subeSueldo(20);
        System.out.println("Empleado 1: ");//Usa el constructor SIN parametros
        System.out.println(empleado1); //Los system.out muestran el método to String, sin el, mostrarian solo la ubicación de memoria
        System.out.println("-------------");
        System.out.println("Empleado 2: ");//Usa el constructor CON parametros
        System.out.println(empleado2); 
        
        System.out.println("----- Ahora con el metodo mostrar datos-----");
        empleado2.mostrarDatos();
        
        System.out.println("--------------------------");
        
        //Le cambiamos el nombre a pepe
        empleado2.setNombre("PEPE");
        empleado2.setEstatura(180);
        empleado2.setAntiguedad(5);
        empleado2.setEdad(25);
        empleado2.mostrarDatos(); //Al volverlos a mostrar cambió de pepe a Jacobo y le subimos la antiguedad
        empleado1.mostrarDatos();
        
        
        //A partir de aquí, todos los empleados tendrán antiguedad de 5 porque la variable era static, es decir de clase, común para todos
        //Lo comprobamos con Juan, el empleado 1
        System.out.println("--------------------------");
        System.out.println("Cambio de antiguedad por variable static");
        empleado1.mostrarDatos();
       
//        System.out.println("Subir sueldo de forma individual con set");
//        //Subirle sueldo de forma individual
//        empleado3.setSueldo(1000);
//        empleado3.subeSueldo(10);
//        System.out.println(empleado3);
//        System.out.println("Le ponemos el nombre");
//        empleado3.setNombre("Pepe");
//        System.out.println(empleado3);
//        System.out.println("Le cambiamos la antiguedad");
//        empleado3.setAntiguedad(1);
//        System.out.println(empleado3);
       
        //Ejercicio 2
        //ARRAY, creamos un array de objetos de 3 posiciones con 3 empleados y en cada posición irá un empleado
        System.out.println("---------------- A R R A Y ----------------");
        Empleado [] misEmpleados = new Empleado[3];
        Scanner sc = new Scanner (System.in);
        
        misEmpleados[0]=empleado1;
        misEmpleados[1]=empleado2;
        misEmpleados[2]=empleado3;
//        Utilizar un bucle para recorrer el array y subirle el sueldo a todos los empleados
//        Utilizar un bucle para recorrer el array y mostrar los datos de todos los 
//        empleados
//        
        for(int i=0;i<misEmpleados.length;i++){
        System.out.println("¿Cuanto quieres subir el sueldo a " +misEmpleados[i].nombre);
	misEmpleados[i].subeSueldo(sc.nextDouble()); //Indico que el usuario introducirá el parametro o argumento al método subeSueldo
    }

	//For para mostrar los todos los empleados
		
		for(int j=0; j<misEmpleados.length; j++) {
			System.out.println(misEmpleados[j].toString());
	}  
    }
}
