//Escribir un meteodo que reciba como parametro un nº de DNI y calcule la letra de su código de verificacion (letra del nif)
//Se supone que el DNI es un entero de 8 cifras.
//Para calcular la letra se calcula el resto de dividir el numero del DNI entre 23 y e devuelve la letra segun la correspondencia siguiente
package dni;

public class DNI {

    public static void main(String[] args) {
     //Tiene que haber una correspondencia entre cada letra y cada resto
     //Cuando tu divides una serie, si divides el numero total de la serie +1, el resto va a ser el correspondiente con la posición de ese length
       
     System.out.println(DNI.letraDNI(50776127)); //La clase hay que ponerla (DNI) y luego el llamado de la función.
    }
    
    public static char letraDNI(int dni){
        int resultado;
        char nif;
        char[] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        resultado=dni%23;
        nif=letra[resultado];
        
        return nif;
    
    }
    
}
