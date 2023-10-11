//PEDIR NOMBRE Y LA EDAD POR TECLADO
//MOSTRAR POR PANTALLA LO SIGUIENTE Y COMPLETARLO SEGÚN CORRESPONDA:
//MI NOMBRE ES:
//MI NOMBRE TIENE: LETRAS
//LA PRIMERA LETRA DE MI NOMBRE ES:
//LA ÚLTIMA LETRA DE MI NOMBRE ES:
//TENGO AÑOS Y EL AÑO QUE VIENE TENDRÉ:
//MIS APELLIDOS SON
package stringjorge;
import java.util.Scanner;
public class STRINGJORGE 
{

    public static void main(String[] args) 
    {
       Scanner leer=new Scanner (System.in);
       
       String nombre = " ";
       int edad;
   
        System.out.println("Cual es tu nombre: ");
        nombre=leer.next();
        
        System.out.println("Cual es tu edad");
        edad=leer.nextInt();
        
        System.out.println("Mi nombre es: " +nombre);
        System.out.println("Mi edad es: " +edad);
        
        System.out.println("Mi nombre tiene: " +nombre.length() + " letras");
        System.out.println("La primera letra de mi nombre es: " +nombre.charAt(0));
        System.out.println("La última letra de mi nombre es: " +nombre.charAt(nombre.length()-1));
//HEMOS PUESTO + NOMBRE.CHARAT(NOMBRE.LENGTH()-1, PORQUE SI EL USUARIO METE UN NOMBRE CUALQUIERA NO SABEMOS DONDE ESTA EL FINAL
//ENTONCES PONEMOS + NOMBRE.CHARAT(NOMBRE.LENGTH()-1) PARA RESTARLE UNO AL FINAL QUE QUE CHARAT PARTE DESDE EL 0
//PARA QUE SIEMPRE NOS DIGA LA ULTIMA SEA EL NOMBRE QUE SEA

        System.out.println("Tengo: " +edad+ " y el año que viene tendré: " +(edad+1));

    }
    
}
