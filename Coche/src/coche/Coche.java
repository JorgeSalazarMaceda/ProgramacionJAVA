/*
1. Clase Coche
La clase contiene 6 atributos:
marca, modelo, color, matrícula, precio y descuento.
El descuento es una cantidad que se aplica a todos los coches sobre
el precio de venta (tipo static)
Definir los métodos siguientes:
- Arrancar
- Detenerse
- Acelerar
- Frenar
- verPrecio
2. Generar clase Taller
Generando varios objetos de tipo Coche y usa sus métodos.
3. Modificar la clase taller para generar un array con elementos
de tipo coche de tamaño 4.
Después mostrar todos los coches del array ordenados por
precio.
 */

 /*static: Los miembros estaticos son miembros que le pertenecen a la clase, 
es decir que todo cambio en un atributo estático afectará a todos los objetos,
Pasa igual con los métodos estáticos, que le pertenecen a la clase*/
package coche;

/**
 *
 * @author Jorge
 */
public class Coche {

//Atributos
    private String marca, modelo, color,matricula;
    private int precio=27800;
    protected static final double descuento = 0.10;
    
//Constructor
    public Coche(){
        marca="Hyundai";
        modelo="i30";
        precio=15520;
    }
    public Coche(String color){
        marca="Hyundai";
        modelo="I30";
    }
    public Coche(String modelo,String color){
        precio=15000;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }
    
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static double getDescuento() {
        return descuento;
    }   
 
    
    
//Metodos
    void arrancar(){
        System.out.println("Coche arranca");
    }
    void detenerse(){
        System.out.println("Coche se detiene") ;
    }
    void acelerar(){
        System.out.println("Coche acelera");
    }
    void frenar(){
        System.out.println("Coche frena");
    }
    void verPrecio(){
        System.out.println("Precio: "+precio);
    }
    
     public double verPrecioconDescuento(double porcentaje) {
        double precioDescontado;
        precioDescontado = ((precio * porcentaje)/100);
        return precio - precioDescontado;
        
    }

        //Metodo burbuja que ordena los coches por precios
    
  
        
          public static Coche[] ordenarCoche(Coche[] a){
        Coche auxiliar; //Variable auxiliar donde ser gurardarán los precios momentaneamente.
        //Usamos el metodo burbuja para ordenarlos       
      
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length -i - 1; j++) {
                if (a[j + 1].getPrecio() < a[j].getPrecio()) {
                    auxiliar = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = auxiliar;     
                }
            } 
        }
        return a;
    } 
        public double verPrecio2() {
        double precioDescontado;
        precioDescontado = (precio * this.descuento);
        return precio - precioDescontado;
        
    }
    
            public static void imprimeArray(Coche coches[]){
       for(int i=0;i<coches.length;i++){
            System.out.println("");
            System.out.println("El Coche: " + i);
            System.out.println("La marca: "+coches[i].getMarca());
            System.out.println("El modelo: "+coches[i].getModelo());
            System.out.println("El precio: "+coches[i].getPrecio() + " euros");
            System.out.println("Precio con descuento: " + coches[i].verPrecio2());
        
            System.out.println("-------------------------------");
        }
    }

   
    
}
