//Constructores con el tipo y sexo 
//Otro sin parametros () que sea tipo=salvaje y sexo = macho.
//getters y setters.
// to String.
//metodo duerme zzz.

package animal;


public class animal {
  //Atributos
    
    
    
    private String tipo; //Private para que nadie tenga acceso a estos atributos
    private String sexo;
    protected int codigo;
    
  //Constructores
     animal (){ //Sin parametros
    this.tipo="salvaje";
    this.sexo="macho";
}
     public animal (String t, String s){// con parametros
         tipo=t;
         sexo=s;
     }
     
     //Getters y Setters
     public String getSexo(){
         return sexo;
     }
     public void setSexo(String sexo){
         this.sexo= sexo;
     }
     
     public String getTipo(){
         return tipo;
     }
     public void setTipo(String a){
         tipo=a;
     }
    
     public int getCodigo(){
          return codigo;
      }
     
     //To String
     
     public String toString(){
         return "Esto es un animal así: Tipo: " + this.tipo + " - Sexo: " + this.sexo;
     }
     
    //Metodo duerme 
    
    public void duerme(){
        System.out.println("ZZZZZ");
    }
    public void come (){
        System.out.println("PATATAS");
    }
    
    public boolean equals(animal otro){
        animal otroAnimal = (animal) otro;
        boolean iguales;
        if(this.tipo.equals(otroAnimal.tipo)){
            iguales = true;
          
        }
        else{
            iguales=false;
            System.out.println("Es falso");
        }
        return iguales;
    }
    
    
    
    //Gracias a la herencia puedes crear subtipos o subclases que hereden los atributos y métodos de una clase. 
    // En el apartado anterior se define la clase animal. Uno de los metodos de esta clase es duerme. 
    // A continuacion podemos crear las clases Tigre y Ave como subclases de animal.
    // De forma automatica, se puede utilizar el metodo duerme con las instancias de las clases Tigre y Ave.
    // La clase Ave, subclase de Animal, hereda todos sus atributos y métodos. A su vez esa clase Ave, podemos crear la clase Gallo. 
    // Esta clase Gallo heredaria todos los atributos y metodos de Ave y tambien los de animal.
    // De la misma forma que se heredan cosas de padres a hijos en la vida real, en POO se heredan los atributos y metodos de clases a subclases.
    // Para crear en Java una subclase de otra clase existente se utiliza la palabra reservada extends.
    // a continuacion se muestra el codigo de las clases Tigre, Ave y Pinguino, asi como el programa que prueba estas clases creando instancias y aplicandoles metodos.
    
    //This es para el objeto en el que estás 
    //Super es para el objeto que queremos que herede
    
//// Definicion de clase TIGRE  ----------------------
//    
//    public class Tigre extends animal {
//        //Atributos
//        private String raza;
//        // Constructor
//        public Tigre (){ //Este hacemos referencia para los atributos de clase animal sin parámetros
//            super(); //Con el super esta generando el constructor de la clase padre
//            raza = "Bengala"; //Ademas añadimos el atributo raza.
//            //Esta clase tendrá tres atributos, tipo y sexo de la clase animal y la que añadimos de raza.
//           
//        }
//        
//        public Tigre (String tipo, String clase, String r){ //Este hacemos referencia para los atributos de clase animal con parámetros
//            super(tipo,clase);
//            raza=r;
//        }
//        
//        public String toString (){
//            return "Tigre - Raza: " + this.raza + " \n " + super.toString();
//        }
//        
//        //El trigre ruge
//        public void sonido(){
//            System.out.println("Grrrrr");
//        }
//        
//        //El tigre come
//        public void come (String comida){
//            if(comida.equals("pescado")){
//                System.out.println("No quiero pescado");
//            }
//            else{
//                System.out.println("Estoy hambiento, me como lo que sea");
//            }
//        }
//    }
//    
//    // Definicion de clase AVE  ----------------------
//    
//    public class Ave extends animal {
//        //Ave no tiene atributos añadidos
//        //Constructor        
//    }
    
    //    // Definicion de clase GALLO  ----------------------
//    
//    public class Gallo extends animal {
//        //Gallo no tiene atributos añadidos
          //Atributos de animal, pero si están privados no los verás.
          //Con protected solo ves los del padre
//        //Constructor        
//    }
    
    public static void main(String[] args) {
        animal animal1 = new animal(); //Este animal por defecto será salvaje y macho
        System.out.println(animal1);
        
        animal animal2 = new animal ("domestico", "macho"); //Este animal lo creamos con el segundo constructor
        System.out.println(animal2);
        
        
        Tigre miTigre = new Tigre();
        
       miTigre.come("Pescado");
       
        System.out.println(miTigre);
        miTigre.duerme();
        //metodos 
        animal1.duerme();
        
        
  
    }
  
}
