//Ejercicio cubos
//Atributos: capacidad máxima y litros actuales
//Métodos: vacia(), llena(), pinta(), vuelcaEn (Cubo destino)
//Cubo 2
//|  |
//|  |
//----
//
//Cubo 4
//|  |
//|  |
//|  |
//|  |
//----
//Lleno el cubo 2
//|~~|
//|~~|
//----
//
//Cubo 4
//|  |
//|  |
//|~~|
//|~~|
//----
package poo;

public class cubo {
//Creamos la clase cubo (El main lo haremos en otro java.class llamado pruebaCubo)
//Private porque no todo el mundo podrá modificar los métodos
    //Atributos
    
    private int capacidadMaxima;
        int litrosActuales;
        
    //Constructores
    public cubo( int capacidadMaxima){ //Lo pongo como parámetro para que sea el usuario el que diga la capacidad en el main
        this.capacidadMaxima=capacidadMaxima;//Con el this, al objeto le metemos el parámetro
        
    }
    
    //Getters para tomar valores
    
    public int getcapacidadMaxima(){
        return this.capacidadMaxima;
    }
    
    public int getlitrosActuales(){
        return this.litrosActuales;
    }
    
    //Setters para poner valores
    //This es para hacer referencia al atributo de clase y así lo diferencias de los parametros del método si se llaman igual
    
    public void setcapacidadMaxima(int a){
         this.capacidadMaxima=a;
    } 
     public void setlitrosActuales(int b){
       this.litrosActuales=b;
    }
     
    //Métodos para darle el comportamiento
     
     public void vacia(){
         this.litrosActuales=0;
     }
     public void llena(){
         this.litrosActuales=capacidadMaxima; //Aqui le decimos que los litros están al tope
         
     }
     
     public void pinta(){
         for (int i = capacidadMaxima; i >0; i--) { //Ponemos i = al máximo de capacidad, mientras i sea menor o = a o y que decrezca
             if(litrosActuales==i){
          
                 System.out.println("|~~~~|"); //Simepre habrá agua porque son iguales
                 
                 
             }
             else if(litrosActuales<i){
                 System.out.println("|    |"); //Si es menos, lo pinta vacio
               
             }
             else{
                System.out.println("|~~~~|"); //Si no, es que litrosActuales>i por lo que tambien lleva agua
             }
             
         
        }
         System.out.println("|----|"); //El final del cubo
        
     }
     public void vuelcaEn(cubo cuboDestino){ //Pongo cubo porque cuboDestino es un objeto de la clase, en vez de int pongo cubo
           cuboDestino.litrosActuales = this.litrosActuales; //This se refiere al cubo que yo ponga en el main
           
           if(this.litrosActuales + cuboDestino.litrosActuales >cuboDestino.capacidadMaxima){ 
                //Si la suma de los litros del cubo de origen (this.litrosActuales) y el de destino es mayor que la capacidadMaxima del cuboDestino
                //queremos que se quede en capacidad máxima y se desborde el resto, es decir, se pierde.
               cuboDestino.litrosActuales = cuboDestino.capacidadMaxima;
               System.out.println("Se deborda");
           }
           else{
               cuboDestino.litrosActuales = this.litrosActuales+cuboDestino.litrosActuales ; 
                //Si no, el cubo destino tendrá la suma de los litros del cubo de origen y del cuboDestino
           }
           
         }
     
     
}

