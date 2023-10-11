
/*
Ejercicio Coche con interfaces
Interfaz para coche, llamada CochePrototipo 
1. Crea una interfaz denominada CochePrototipo con métodos para manipular
(métodos set y get) los campos que crearemos en las clases: //Métodos sin implementar al ser interfaz
• dirección en grados (tipo entero)
• velocidad (tipo float)
• propietario (tipo String)
Clase Coche
1. Implementa una clase para CochePrototipo denominada Coche y que incluya 2
métodos adicionales:
• parar: pone la velocidad a 0
• imprime: muestra por pantalla el propietario, el id, la velocidad, la dirección y la
fuente de combustible disponible.
2. Cada vehículo tendrá un identificador que no se podrá modificar después (id) y será
un número consecutivo que se irá incrementando cada vez que generamos un nuevo
coche (uno de los campos será estático y otro no estático) //Creamos id private e id++ static. el id no tendrá set para que no se pueda modificar
3. Añade un método a Coche que devuelva el número de identificación más alto creado
hasta el momento.
4. Añade un método giro que modifique la dirección incrementando o decrementando
su valor según el parámetro que tenga el método. ???????????????????????????????????
Interfaz Combustible
1. El interfaz Combustible describe la fuente de energía que mueve al vehículo. Sus
métodos son:
• getCapacidad: capacidad máxima (double)
• getDisponible: capacidad actual de energía (double)
• recarga: incrementa la capacidad actual, sin que supere la capacidad máxima
• vacio: comprueba si no queda energía (boolean)
Clases Bateria y Deposito Gasolina (implementan el interfaz Combustible)
1. Crea dos clases denominadas Bateria y DepositoGasolina para esta interface con al
menos un constructor.
2. Añade un atributo de tipo Combustible a la clase Coche y los métodos
correspondientes para manipular ese nuevo atributo.
3. Modifica el constructor de Coche para que reciba también un Combustible.

Construye un programa principal para probar todas las clases y métodos.
 */
package cocheinterfaz;

/**
 *
 * @author Jorge
 */
public class Coche implements CochePrototipo {

    //Atributos ----------------------------------------------------
    public static int lastID = 0;

    private int direccion;
    private float velocidad;
    private String propietario;
    private int id = 1; //Este no se puede modificar, por lo que solo tendrá un get, nunca un set.
    private Combustible combustible; //Atributo de tipo combustible, con el podremos acceder a los atributos que implementan la interfaz (bat y gas)

    //Constructores ----------------------------------------------------
    public Coche(float velocidad, String propietario, Combustible combustible) {

        this.direccion = direccion;
        this.velocidad = velocidad;
        this.propietario = propietario;
        this.combustible = combustible;
        this.id = id + lastID++; 
        //LastID seria el id como atributo static, que es el que se inicia en 0 y se irá incrementando, 
        //en el main y para que esto se pueda hacer, lo hacemos en el constructor. 
        if (this.combustible.getDisponible() == 0){
            this.velocidad = 0;
            System.out.println("No hay energía");
        }
    }

    public Coche(int direccion, float velocidad, String propietario, Combustible combustible) {
        this.direccion = direccion;
        this.velocidad = velocidad;
        this.propietario = propietario;
        this.combustible = combustible;
        this.id = id + lastID++;
        if (this.combustible.getDisponible() == 0){
            this.velocidad = 0;
            System.out.println("No hay energía");
        }
    }

    public Coche() {
        this.direccion = direccion;
        this.velocidad = velocidad;
        this.propietario = propietario;
        this.combustible = combustible;
        this.id = id + lastID++;
        if (this.combustible.getDisponible() == 0){
            this.velocidad = 0;
            System.out.println("No hay energía");
        }
    }
    
    

    //Getters y Setters ----------------------------------------------------
    @Override
    public int getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    @Override
    public float getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(float velocidad) {
        if (this.combustible.getDisponible() == 0) {
            System.out.println("No hay energia para acelerar");
        } else {
            System.out.println("Hay energía para acelerar");
            this.velocidad = velocidad;
        }
    }

    @Override
    public String getPropietario() {
        return this.propietario;
    }

    @Override
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Combustible getCombustible() {
        return this.combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public int getId() {
        return this.id;
    }

    //Métodos ----------------------------------------------------
    public void parar() {
        this.velocidad = 0;
        System.out.println("El coche se ha detenido");
    }

    public void imprime() {
        String tipoCombustible = "";

        if (this.combustible instanceof Bateria) {
            tipoCombustible = "Bateria";
        } else {
            tipoCombustible = "DepositoGasolina";
        }

        System.out.println("Coche--------------------------" + "\n"
                + "El coche tiene un id: " + this.id + "\n"
                + "El propietario es: " + this.propietario + "\n"
                + "La velocidad es: " + this.velocidad + "\n"
                + "La dirección en grados es: " + this.direccion + "\n"
                + "Su combustible es de: " + this.combustible + "\n"
                + "La máxima capacidad de combustible es: " + getCombustible().getCapacidad() + "\n"
                + "Su combustible disponible es: " + getCombustible().getDisponible());
        System.out.println("----------------------------------");
    }

    public String toString() {

        String cadena = "\n------------------------------------------";
        cadena += "\nCoche\n";
        cadena += "\nId: " + this.id;
        cadena += "\nPropietario: " + this.propietario;
        cadena += "\nVelocidad: " + this.velocidad;
        cadena += "\nDireccion en grados: " + this.direccion;
        cadena += "\nCombustible: " + this.combustible.toString();
        cadena += "\n------------------------------------------";
        return cadena;

    }

    public void getLastId() { //Este metodo retornará el id mas alto.
        System.out.println("El ultimo id de todos los coches creados es: " + lastID );
    }

    public void giro(int grados) { //Metodo para añadir o restar los grados de giro en la direccion (en el atributo direccion). 

        if (direccion > 0 || direccion < 360) { //Entra en el if por el ||
            direccion += grados;

            while (direccion < 0 || direccion > 360) {
                if (direccion < 0) {
                    direccion += 360;
                } else if (direccion > 360) {
                    direccion += -360;
                }
            }
            //Tenemos el metodo, mientras esté dentro del rango, devuelve los grados. Si entre dentro del bucle, si es menor que 0 le suma 360. 
            //Si es mayor, le restará 360 y así seguira dentro del bucle hasta que llegue a los grados resultantes.
        }
    }
}
//          Otra forma método giro La BUENA!! De Dante
//        public void giro(int grados){
//            this.direccion = this.direccion + grados;
//              if(direccion > 360 || direccion < -360){
//                  direccion = direccion%360;
//                   }
//                 }