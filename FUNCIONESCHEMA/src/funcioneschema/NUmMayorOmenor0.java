//Crea una funcion que diga si un numero es mayor o menor a 0
//Vamos a usar booleanos para practicar
//Si mayor que 0 true, menor false
package funcioneschema;

public class NUmMayorOmenor0 
{

    public static void main(String[] args) 
    {
        int num=8;
        if(mayorQue0(num)){
          System.out.println("El nummero " + num + " es mayor que 0");  
        }
        else{
            System.out.println("El nummero " + num + " es menor que 0");
        }
    }
    
    public static boolean mayorQue0( int num){
        
        return num>0;
        
    }
}
