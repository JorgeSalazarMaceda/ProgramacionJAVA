/*
Ejercicio Coche con interfaces
Interfaz para coche, llamada CochePrototipo
1. Crea una interfaz denominada CochePrototipo con métodos para manipular
(métodos set y get) los campos que crearemos en las clases:
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
coche (uno de los campos será estático y otro no estático)
3. Añade un método a Coche que devuelva el número de identificación más alto creado
hasta el momento.
4. Añade un método giro que modifique la dirección incrementando o decrementando
su valor según el parámetro que tenga el método.
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
public class Prueba {

    public static void main(String[] args) {
        
        
        System.out.println("-------------DEFENSA-------------");
        
        DepositoGasolina gas = new DepositoGasolina(0,100);
        Coche a = new Coche (0,0, "Jorge", gas);
        gas.recarga(10);
        System.out.println(a.toString());
        
        a.giro(380);
        a.setCombustible(new Bateria());
        System.out.println(a);
        
        System.out.println(a.toString());
        Hidrogeno h = new Hidrogeno(0,100);
        Coche b = new Coche(0, 0, "Pepe", h);
        
        System.out.println(b.toString());
            
        System.out.println("-------------DEFENSA-------------");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Coche miCocheElectrico = new Coche(0, 0, "Jorge", new Bateria(100));
//        Coche miCocheGasolina = new Coche(0, 0, "Pepe", new DepositoGasolina(50));
//        Coche miCocheElectrico2 = new Coche(0, 0, "Chema", new Bateria(100));
//        miCocheElectrico.giro(90);
//        miCocheElectrico.setVelocidad(100);
//        
//        
//        
//        miCocheElectrico.getCombustible().recarga(50);
//        System.out.println("Combustible disponible del coche Electrico" + miCocheElectrico.getCombustible().getDisponible());//Con este sout, ponemos el objeto.getcombustible y getDisp.
//        System.out.println("La capacidad disponible del coche Electrico" + miCocheElectrico.getCombustible().getCapacidad());//Con este sout, ponemos el objeto.getcombustible y getCap.
//        System.out.println(miCocheElectrico.getCombustible().vacio()); //Devolverá false
//        miCocheElectrico.getCombustible().recarga(60); //Metodo que supera la maxima capacidad de recarga puesta en constructor
//        miCocheElectrico.setVelocidad(100);
//        miCocheElectrico.parar(); //Con este metodo paramos el coche y su velocidad es 0.
//        
//        miCocheElectrico.imprime();
//        
//        miCocheGasolina.imprime();
//        miCocheElectrico.getLastId();
    }  
}
