//Crea una funcion que devuelva la suma de dos numeros pasado por parámentros
package funcioneschema;

public class sumaConParámetros
{
    public static void main(String []args)
    {
        int a=5;
        int b=7;
        suma(a,b);
        //La funcion tambien se puede quedar en una variable si no pones sout
        
        System.out.println("El resultado es: " + suma(a,b));
    }
    public static int suma(int a,int b){
        return a+b;
    }
}
