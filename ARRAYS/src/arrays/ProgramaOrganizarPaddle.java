
package arrays;
import java.util.*;
public class ProgramaOrganizarPaddle {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String nombres;
        int i=0;
        String equipos[]=new String [i];
        
        
        while (equipos[i] != "Fin"){
            System.out.println("Ingrese nombres de los participantes: ");
            equipos[i]=leer.next();
            i++;
        }
           
            System.out.println(Arrays.toString(equipos));
        
    }
 
}
