//Método check_email que compruebe si un email pasado como parámetro es
//correcto o no.
//Devolverá true cuando contenga una @ y un .
package funcioneschema;
import  java.util.Scanner;
public class ComprobarMailConFuncion 
{

    public static void main(String[] args) 
    {    
        Scanner leer= new Scanner(System.in);
        String correo;
        int contador_arroba=0, contador_punto=0;
        
        System.out.println("Introduzca su correo electrónico: ");
        correo=leer.next();
             for (int i = 0; i<=correo.length()-1; i++) {
            if(correo.charAt(i)== '@') contador_arroba++; //Dame el caracter char en la posición i para la variable correo y si es = a un @ o un punto.
            if(correo.charAt(i)=='.') contador_punto++; //Será válido.
        }
        if(contador_arroba==1 && contador_punto==1){
            System.out.println("la direccion es válida");
        }
        else {
            System.out.println("Error en la dirección");
        }
    }
    //FUNCIONES
    static void validarCorreo(String correo){
         //Se hace un bucle for para comprobar uno por uno los caracteres y ver toda la longitud de la linea.
        // con el contador se va viendo cada char y ve si hay un @ o un punto en los if.
        int contador_arroba=0, contador_punto=0;
        for (int i = 0; i<=correo.length()-1; i++) {
            if(correo.charAt(i)== '@') contador_arroba++; 
            if(correo.charAt(i)=='.') contador_punto++;
        }
        if(contador_arroba==1 && contador_punto==1){
            System.out.println("la direccion es válida");
        }
        else {
            System.out.println("Error en la dirección");
        }
    }
    
}
