//Tenemos una fabrica de camiones, queremos que sean todos blancos y usa setters para asignar los valores y getters para obtenerlos.
package poo;

//Creamos la clase camion (El main lo haremos en otro java.class llamado pruebaCamion)
//Private porque no todo el mundo podrá modificar los métodos
public class camion {
    private String color;
    int peso;
    String motor;
    int capacidad;
    
    //Constructores es para darle estructura al objeto.
    public camion(){
    color="blanco"; //Como lo he puesto en el constructor, por defecto, todos seran blancos
    peso=5;
    
    }
    
    //Getters para tomar valores
    
    public String getColor(){
        return this.color;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public String getMotor(){
        return this.motor;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
   
    //Setters para poner valores, en el main, luego le puedes cambiar los valores, por defecto por el constructor los camiones son blancos,
    //luego lo puedes cambiar.
    //This es para hacer referencia al atributo de clase y así lo diferencias de los parametros del método si se llaman igual
    
    public void setColor( String a){
         this.color=a;
    } 
     public void setPeso(int b){
       this.peso=b;
    }
     public void setMotor(String c){
         this.motor=c;
    }
     public void setCapacidad(int d){
         this.capacidad=d;
    }
}
