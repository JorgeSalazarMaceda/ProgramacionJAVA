/*
Haz varios metodos con la clase huevo y huega con ellos.
Ejemplo, huevo rompe, huevo vate
 */
package poo;

public class Huevo {
   //Atributos
    
    String forma;
    String tamaño;
    String sabor;
    int peso;
    
    //Constructor (Tiene que llamarse igual que la clase)
    
    Huevo(){
        this.forma= "gordo";
        this.tamaño= "enorme";
        this.peso= 5;
    }
    
    Huevo (String c){
        
    }
    //Getters
    public String getforma (){
        return this.forma;
    }
    public String gettamaño (){
        return this.tamaño;
    }
    public String getsabor (){
        return this.sabor;
    }
    public int getpeso (){
        return this.peso;
    }
    
    //Setters
    public void setforma(String a){
         this.forma= a;
     }
    public void settamaño(String b){
         this.tamaño= b;
     }
    public void setsabor(String c){
         this.sabor= c;
     }
    
    public void setpeso(int d){
         this.peso= d;
     }
    
    
    
    //Metodos
     public void forma (){
            if(forma.equalsIgnoreCase("ovoide")){
                System.out.println("El huevo es redondito");
            }
            else{
                System.out.println("El huevo es cuadrado jaja XD");
            }
        }
        public void sabor(){
            System.out.println("Sabe a rayos, está podrido");
        }
        
        public void peso(){
            System.out.println("El huevo pesa: " + peso);
        }
        @Override
        public boolean equals (Object otro){
            boolean iguales=false;
            Huevo other = (Huevo) otro;
            if(this.sabor.equals(other.sabor)){
                iguales=true;
            }
            return iguales;
        }
  
    
    
    public static void main(String[] args) {
        Huevo huevo1 = new Huevo();
        Huevo huevo2 = new Huevo();
        Huevo huevoAzul = new Huevo();
        Huevo huevoVerde = new Huevo();
        
        huevo1.forma();
        huevo2.sabor();
        huevo1.peso();
        huevo1.setpeso(9);
        System.out.println(huevo1.getpeso());
        
        System.out.println("---------------------Vamos a comprobar el equals---------------");
        huevoAzul.setsabor("frutas");
        huevoVerde.setsabor("frutas");
        
        System.out.println(huevoAzul.equals(huevoVerde));
    }
    
    
    
}
