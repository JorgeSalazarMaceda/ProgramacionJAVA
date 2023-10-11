/*
Realiza una prueba de cada tipo de gestión de errores.
 */
package DivideEntre0;

/**
 *
 * @author Jorge
 */
public class Errores {
//    public static void main(String[] args) {
//        divide(100,0);
//    }
//    
//    //Capturamos y gestionamos el error dentro del método
//    public static void divide(int num1, int num2){
//        try{
//            System.out.println(num1/num2);
//        }catch(Exception ex){
//            System.out.println("Se capturó el error");
//        }finally {
//            System.out.println("El metodo terminó");
//        }
//    }
    
    
    
//    //Gestionamos el error en el main
//    public static void main(String[] args) {
//         
//        try{
//            divide(100,0);
//        }catch(Exception ex){
//            System.out.println("Se capturó el error");
//        }finally {
//            System.out.println("El metodo terminó");
//        }
//    }
//    public static void divide (int num1, int num2) throws Exception{ //Avisamos que el método puede tirar un método
//        System.out.println(num1/num2);
//    }
    
    
    //En ambos, se gestiona en el método y en el main
    public static void main(String[] args) {
         try{
            divide(100,0);
        }catch(Exception ex){
             System.out.println("Capturé el error dentro del método");
        }finally {
            System.out.println("Terminó el método");
        }
    }
   public static void divide (int num1, int num2) throws Exception{
       try{
           System.out.println(num1/num2);
       }catch(Exception ex){
           System.out.println("Capturé el error dentro del método"); //Recuerda que primero, si hay dos catch pongas el mas concreto, si no, cogerá el primero
        }finally {
            System.out.println("Terminó el método");
        }
   }
}
