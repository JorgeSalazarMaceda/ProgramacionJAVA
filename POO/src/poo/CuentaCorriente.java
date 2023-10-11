/*
Actividad 7.1 y 7.2 PAGINA 215
Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. 
Las operaciones típicas con una cuenta corriente son:
    - Crear una cuenta: Se necesita el DNI y el nombre del titular. El saldo inicial será 0.
    - Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
    - Ingresar dinero: se incrementa el saldo.
    - Mostrar información: muestra la información disponible de la cuenta corriente.

Actividad 7.4 PAGINA 225
Todas las cuentas corrientes con las que se va a trabajar pertenencen al mismo banco.
Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente. 
Diseñar un método que permita recuperar y mmodificar el nombre del banco (al que pertenecen todas las cuentas corrientes)
// Vamos a añadir el atributo banco a la clase. Como el banco es el mismo para todas las cuentas, el atributo será static.
//El atributo será privado y escribiremos dos métodos estáticos para solicitar y modificar el nombre del banco.
(static private String nombreBanco = "International Java Bank";)
 */
package poo;

public class CuentaCorriente {
    //Atributos
    String dni; //Del titular
    String nombre; // Del titular
    double saldo; // Efectivo disponible en la cuenta
    // Los parámetros de entrada: nombre y dni, ocultan a los atributos de la clase con el mismo identificador.
    // Para acceder a ellos hay que utilizar this.
    
    //Constructor
    
    CuentaCorriente (String dni, String nombre){
        this.dni = dni; // Se refiere al dni pasado por parámetro haciendo referencia al atributo.
        this.nombre = nombre; // Se refiere al nombre pasado por parámetro haciendo referencia al atributo.
        saldo = 0; //Asignamos por defecto el valor 0 al saldo.
    }
    CuentaCorriente (String dni, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = "Sin asignar"; //Indicamos que no disponemos del nombre
    }
    CuentaCorriente (String dni, String nombre, double saldo){
        this.dni = dni;
        this.saldo = saldo;
        this.nombre = nombre; //Indicamos que no disponemos del nombre
    }
    
    //setters y getters (ACTIVIDAD 7.4)
    static private String nombreBanco = "International Java Bank"; //Este será el valor por defecto y se asigna antes de crear un objeto
    
    static void setBanco (String nuevoNombre){
        nombreBanco=nuevoNombre;
    }
    static String getBanco (){
        return nombreBanco;
    }
    
    
    //Metodos
    
    boolean sacar (double cantidad){ //metodo para ver si es posible sacar dinero de la cuenta corriente, es decir, si hay saldo (true)
        boolean operacionPosible;
        
        if(saldo >=cantidad){
            saldo-=cantidad;
            operacionPosible = true;
        }
        else {
            System.out.println("No hay dinnero suficiente");
            operacionPosible = false;
        }
        return (operacionPosible); //Devuelvenos si hay saldo (es posible) o no.
    }
    
    void ingreso (double cantidad){ //Metodo para añadir dinero a la cuenta
        saldo += cantidad;
    }
    
    void mostrarInformación (){
        System.out.println("Nombre: " +nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo + "euros");
    }
    
    public static void main(String[] args) {
        //Creamos un objeto CuentaCorriente para probar la clase y realizar algunas operaciones
        
        CuentaCorriente objeto = new CuentaCorriente("55776622Q","Carlos"); //Hay que poner los dos parametros, puesto que así hemos hecho el constructor
        
        objeto.ingreso(1500); //Ingresamos 1500 euros
        objeto.sacar(500); //Sacamos 500 euros y se restarán porque hemos puesto en el if del metodo saldo-=cantidad;
        objeto.mostrarInformación();
        
        System.out.println("Puedo sacar 1000 euros: " + objeto.sacar(1000)); //Quedan 0 euros si los sacas (true)
        System.out.println("Puedo sacar 1000 euros: " + objeto.sacar(1000)); //Ya no es posible sacar mas, el programa va hacia abajo y quedaban 0 (false)
        //Vamos a probar el constructor que utiliza el dni y el saldo:
        System.out.println("");
        objeto = new CuentaCorriente("2255778899P",2000); //Hacemos referencia al nuevo objeto con el dni y el saldo y aparecerá el sin asignar
        objeto.mostrarInformación();
        
        //Respuesta a Actividad 7.14, los getters y setters
        System.out.println("");
        CuentaCorriente c1,c2;
        c1 = new CuentaCorriente ("12345678A", "Pepe");
        c2 = new CuentaCorriente ("99999999B", "Ana");
        c1.mostrarInformación();
        CuentaCorriente.setBanco("Banco Central");
        c1.mostrarInformación();
        System.out.println("");
        CuentaCorriente.setBanco("Caja de Ahorros BANKIA");
        c1.mostrarInformación();
        System.out.println("");
        c2.mostrarInformación();
        
        
        
        
        
    }
}
