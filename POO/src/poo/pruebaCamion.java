
package poo;

public class pruebaCamion {
    
    public static void main(String[] args) {
        
        camion camion1 = new camion();
        camion camion2 = new camion();
        
        
        camion1.setCapacidad(3500);
        camion1.setMotor("Diesel");
        //camion1.getColor(); //Aqui da blanco porque en el archivo de la clase está predetirminado como blanco y aquí no lo he cambiado.
        System.out.println("La capacidad del camion 1 es: " +camion1.getCapacidad());
        System.out.println("El motor del camion 1 es: " +camion1.getMotor());
        System.out.println("El color del camion 1 es: " +camion1.getColor());
        
        System.out.println("");
        
        camion2.setColor("azul");
        camion2.setCapacidad(2000);
        System.out.println("El color del camion 2 es: " +camion2.getColor());
        System.out.println("La capacidad del camion 2: "+camion2.getCapacidad());
        
        
       
    
    }
}
