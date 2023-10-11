
package animal;


public class Tigre extends animal {
    // Definicion de clase TIGRE  ----------------------
    
    
        //Atributos
        private String raza;
        // Constructor
        public Tigre (){ //Este hacemos referencia para los atributos de clase animal sin parámetros
            super(); //Con el super esta generando el constructor de la clase padre
            raza = "Bengala"; //Ademas añadimos el atributo raza.
            //Esta clase tendrá tres atributos, tipo y sexo de la clase animal y la que añadimos de raza.
           
        }
        
        public Tigre (String tipo, String clase, String r){ //Este hacemos referencia para los atributos de clase animal con parámetros
            super(tipo,clase);
            raza=r;
        }
        
        public String toString (){
            return "Tigre - Raza: " + this.raza + " \n " + super.toString();
        }
        
        //El trigre ruge
        public void sonido(){
            System.out.println("Grrrrr");
        }
        
        //El tigre come
        public void come (String comida){
            if(comida.equals("pescado")){
                System.out.println("No quiero pescado");
            }
            else{
                System.out.println("Estoy hambiento, me como lo que sea");
            }
        }
        public void come(){
            System.out.println("Como sin parametros en tigre");
        }
    }
    
    

