//Cifras, método que dice cuantas cifras tienen un nº
public class NUMEROCIFRAS 
{
    
    public static void main (String [] args)
    {
        
        int numero;
        
        System.out.println("Numero de cifras es: " );
        
    }
    
    public static int numCifras (int numero){
        int contador = 0;
        if(numero<10){
            return contador;
        }
        else{
            
            contador++;
            return numCifras (numero/10);
        }
    }
    
}
