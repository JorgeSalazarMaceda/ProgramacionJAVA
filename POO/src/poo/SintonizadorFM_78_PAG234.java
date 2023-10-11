//Definir una clase que permita controlar un sintonizador digital de emisoras FM; 
//concretamente, se desea dotar al controlador de una interfaz que permita subir (up) o bajar (down) la frencuencia (en saltos de 0.5 MHz)
// y mostrar la frecuencia sintonizada en un momento dado (display). Supondremos que el rango de frecuencia sintonizada en un momento dado (display).
//Supondremos que el rango de frecuencias para mannejar oscila entro los 80 MHZ y los 108MHz y que, 
//al inicio, el controlador sintonice la frecuencia indicada en el constructor o 80 MHz por defecto.
// Si durante una operacion de subida o bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del extremo contrario.
//Escribir un pequeño programa principal para probar su funcionamiento.
package poo;

public class SintonizadorFM_78_PAG234 {
    //La clase tiene un atributo real que almacena la frecuencia a la que estamos sintonizando.
    //junto a los metodos necesarios para utilizar el sintonizador.
    
    //Atributo 
    double frecuencia;
    
    //Constructor que permite asignar una frecuencia inicial
    SintonizadorFM_78_PAG234 (double frecuenciaInicial){
        //La frecuencia debe estar entre 80 y 108
        if(frecuenciaInicial<80){
            frecuencia = 80; //MHz
        }
        else if (frecuenciaInicial>108){
            frecuencia = 108;
        }
        else {
            frecuencia = frecuenciaInicial;
        }
    }
    //Constructor
    SintonizadorFM_78_PAG234(){
        this(80); //Frecuencia inicial por defecto
        //Otra forma seria inicializar el valor por defecto directamente
        // frecuencia = 80;
    }
    
    //Metodos
    public double downn (){
        frecuencia -= 0.5; //Bajamos la frecuencia 0.5 MHz
        comprobarRango (); //Y comprobamos el rango
        return (frecuencia);
    }
    
    public double up (){
        frecuencia += 0.5; //Subimos la frecuencia 0.5 MHz
        comprobarRango (); //Y comprobamos el rango
        return (frecuencia);
    }
    
    public void display (){
        System.out.println("Sintonizando: " + frecuencia + "MHz");  //Mostramos
    }
    
    //Metodo de uso interno que se encarga de comrpobar que la frecuencia se encuentra en el rango 80..108. 
    //En caso de que la frecuencia esté fuera de rango la ajusta 
    
    private void comprobarRango (){
        if(frecuencia < 80){ //Si al bajar la frecuencia es menor que el limite inferior
            frecuencia = 108; //asignamos el limite superior
        }
        else if(frecuencia > 80){ //Si sobrepasamos limite superior
            frecuencia = 80; //colocamos la frecuencia en el valor menor
        }
    }        
    
    public static void main(String[] args) {
        //Probamos que funciona el sintonizador
//        SintonizadorFM_78_PAG234 a = new SintonizadorFM_78_PAG234(107);
//        SintonizadorFM_78_PAG234 b = new SintonizadorFM_78_PAG234();
        
        SintonizadorFM_78_PAG234 a, b;
        a = new SintonizadorFM_78_PAG234(107);
        a.up();a.up();a.up(); a.up();//Subimos la frecuencia 2 MHz
        a.display(); //Debe de mostrar 80.5 MHz
        
        b= new SintonizadorFM_78_PAG234(80.5);
        b.downn(); b.downn(); b.downn(); //Bajamos 1.5 MHz
        b.display(); //Debe de mostrar 107.5 MHz
        
        a = new SintonizadorFM_78_PAG234(200); //Frecuencia fuera de rango. Debe de ajustarse
        a.display(); //Debe de mostrar 108.0 MHz
    
    }
    
}
