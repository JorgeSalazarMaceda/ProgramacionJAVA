/*
Examen – Clases y objetos
Trimestre 2 – 0,5 puntos en prácticas evaluables
Ejercicio 1
• Clase Empleado
o 2 atributos de instancia: nombre (String) y sueldo (double)  //LOS ATRIBUTOS DE INSTANCIA SON LOS ATRIBUTOS DE OBJETO
o Constructor
o Todos los getters y setters
o método de instancia subeSueldo (como parámetro el porcentaje de 
incremento)
o atributo de clase antiguedad (int)
• Clase Empresa, tendrá el main.
o Generar 3 objetos de tipo Empleado.
o Utilizar el método subeSueldo para subir el sueldo de forma distinta a cada 
empleado.
 */

 /*Ejercicio 2
• En la clase Empresa utilizar arrays de objetos.
Creamos un array con 3 posiciones, de la clase Empleado
Empleado [] misEmpleados = new Empleado[3];
• Utilizar un bucle para recorrer el array y subirle el sueldo a todos los empleados
• Utilizar un bucle para recorrer el array y mostrar los datos de todos los 
empleados
 */

//Ampliación de Salva
//Añadir un metodo que sea mostrar datos de un empleado y el sueldo
//Son 3 clases, empresa, empleado y persona. Empleado hereda de persona y tendrán dos metodos mostrar diferenciados, que cada uno haga lo suyo
//Nueva clase persona nombre edad y estatura que tena su propio metodo mostrar datos. pero metiendo el metodo sueldo que has puesto en empleado.
//EJEMPLO DE COMO EMPLEADO HEREDA DE PERSONA
//class Empleado extends Persona {
//double salario
//@Override void mostrarDatos() {
//super.mostrarDatos(); Metodo de la superclase, muestra los atributos definidos en Persona
//Systemm.out.println(salario);muestra el atributo añadido en Empleado
//}
//Mostrar datos de empleado muestra todos los atributos de persona + el salario.	

package ExamenPOO;

import java.util.*;

public class Empleado extends Persona {

    

    //Atributos (Los de instancia son los de uno o varios objetos y los de clase son los que comparte toda la clase).
    protected String nombre;
    protected double sueldo;
    protected static int antiguedad;
    protected static int antiguedadTotal;

    //Constructores
    public Empleado() { //Sin parametros
        this.nombre = "Juan";
        this.sueldo = 1000.00;

    }

    public Empleado(String nombre, double sueldo) { //Con parametros
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    //Getters y Setters 
    public void setNombre(String nombre) { //Set para introducir el valor
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad=antiguedad;
    }

    public String getNombre() { //Get para obtenerlo
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    //Metodo para subir el sueldo
    public void subeSueldo(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            porcentaje = porcentaje / 100;
            this.sueldo = (porcentaje * sueldo) + sueldo;
            System.out.println(sueldo);
        } else {
            System.out.println("Despedido");
        }

    }

    public String toString() {
        return "Nombre: " + nombre + "/ Sueldo: " + sueldo + "/ Antiguedad: " + antiguedad;
    }
   
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Datos Empleado: ");
//        System.out.println("Nombre: " + nombre);
//        System.out.println("Edad: " + edad);
//        System.out.println("Estatura: " + estatura);
            System.out.println("Antiguedad: " + antiguedad);
    }
    

}




