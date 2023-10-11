//Gato con 5 atributos
//String color,raza,sexo
//int edad
//double peso
//Y con metodos maulla, ronrronea, come (String), pelea (gato).
//Si maulla que imprima miau, es un metodo void, que no devuelve nada
//Si come, si la comida es pescado que diga que rico el pescado y si no, que diga no lo quiero
//Si duerme que imprima zzzzz
package animal;

/*
ATRIBUTOS : 
COLOR, RAZA Y SEXO
EDAD
PESO

CONSTRUCTORES(MÉTODOS):
MAULLA....SE IMPRIME POR PANTALLA "MIAU"
RONRONEA......SE IMPRIME POR PANTALLA "MMRRRR"
PELEA CON (String)
COME (String).....SI ES PESCADO "QUE RICO", SI ES CARNE "BUAH"
DUERME
 */

public class Gato extends animal implements Mascota{
//Atributos
String color, sexo;
int edad;
double peso;
private String raza;

//Constructores 

public Gato (){
    raza="callejera";
    sexo="hembra";
    edad=5;
}
public Gato (String r){//Haces otro constructor para que no sea igual al que no tiene parámetros
    this.raza=r;
} 
//getters (siempre return)
public String getSexo(){
    return this.sexo;
}

public String getRaza(){
    return this.raza;
}

public int getEdad(){
    return this.edad;
}

public String getRaza(String raza){
   return this.raza=raza+'*';
}

//Setters (siempre void)
public void setSexo(String s){
    this.sexo=s;
}
public void setEdad(int a){
    this.edad=a;
}
public void setColor(String color){
    this.color=color;
}

// Métodos
void maulla(){
    System.out.println("Miauuuuu");
}
void ronronea(){
    System.out.println("Mrrrrrrr");
}
@Override
public void duerme(){
    System.out.println("Zzzzzzzzz");
}
@Override
public void come(String comida){
    if(comida.equals("pescado")){
        System.out.println("Que rico"); 
    }else{
        System.out.println("Que asco");
    }
}

public void hazRuido(){
    System.out.println("Grita");
}

void pelea_con (Gato b){
    if(b.edad<edad){
        System.out.println("El gato ganador tiene "+b.edad);
    }else if (b.edad==edad){
        System.out.println("Se respetan");
    }else{
        System.out.println("El gato ganador tiene "+edad);
    }
}


public String toString(){
    return "Soy un gato "+raza;
}
 public boolean equals (Gato obj){
        Gato other = (Gato) obj;
        if(!color.equals(other.color))
            return false;
        else 
            return true;
    }



    public static void main(String[] args) {
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        Gato jorge = new Gato();
        
        gato1.setSexo("macho");
        System.out.println(gato2.getSexo());
        System.out.println(gato1.getSexo());
        
        gato2.setEdad(5);
        System.out.println("El Gato 2 tiene "+gato2.getEdad()+ " años");
        
        gato1.come("pescado");
        gato1.maulla();
        
        gato2.pelea_con(gato1);
        
       
        System.out.println("Esto es con TO STRING DE JORGE: " + jorge);
        System.out.println("Esto es con TO STRING DE gato1: " + gato1);//ToString
         
        System.out.println(jorge.getRaza("spiderman"));
        
        
        
        System.out.println("---------------Vamos a ver la comparacion de objetos con el gato garfield e isidoro");
        Gato garfield = new Gato ("persa");
        Gato isidoro = new Gato ("indio");
        
        garfield.setColor("verde");
        isidoro.setColor("verde");
        
        if(garfield.equals(isidoro))
            System.out.println("Los gatos son iguales");
        else System.out.println("Los gatos no son iguales");
        
    }
    
}

