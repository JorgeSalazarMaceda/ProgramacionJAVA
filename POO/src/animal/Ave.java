
package animal;

public class Ave extends animal {
    public Ave(){
    super();
}
    public void come_como_animal(){ 
//Hemos creado un metodo publico que se llama distinto (come_como_animal) 
//para hacer posible que el nieto (gallo) pueda acceder al metodo come del abuelo.
//Van paso a paso
       super.come();
    }
    public void vuela(){
        System.out.println("El ave vuela");
        }
//    public void come (){
//        System.out.println("El ave come chorizo");
//    }
    
    
    }
