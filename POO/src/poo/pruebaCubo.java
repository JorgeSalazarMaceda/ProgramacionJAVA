
package poo;

public class pruebaCubo {
    
    public static void main(String[] args) {
        cubo cubo2 = new cubo(6); //El 5 es el parametro de la capacidad
        cubo cubo4 = new cubo(10);
        
      
        
        cubo2.setlitrosActuales(4);
        System.out.println("Cubo2");
        cubo2.pinta();
        
        cubo4.setlitrosActuales(6);
        System.out.println("Cubo4");
        cubo4.pinta();
        
        System.out.println("");
  
        cubo2.vuelcaEn(cubo4);
        cubo2.pinta();
        System.out.println("");
        cubo4.pinta();
    }
}
