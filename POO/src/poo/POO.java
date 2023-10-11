
package poo;

public class POO {

    public static void main(String[] args) {
        //A modo metafórico
        // Clase: Imagina una masa para galletas, y al poner el molde de la ardilla, 
        // cada vez que pongo una, genero una clase nueva de ardilla (Sería el molde) y cada vez que genero una nueva ardilla genero un objeto
        // de una determinada clase. En este caso clase ardilla.
        
        //Si yo genero varios objetos, 1,2,3,4, que son de la misma clase, pero modifico uno de ellos, por ejemplo el objeto 1, solo modifico ese,
        //Pero todos vienen de la misma clase, tienen un origen común que es esa clase.
        
        //Imagina una fabrica de coches, todos los Ibiza son iguales, con el mismo chasis de serie, componentes etc, la clase es Ibiza, pero al final
        //de la cadena, uno es rojo, otro lleva navegador etc.
        
        //Lo que se busca es que objetos de la vida real puedan ser objeto de programación.
        
        //Siempre la primera letra en mayúscula 
        //Cada uno de estos casos serían las instancias u objetos (instancia y objeto es lo mismo)
        //Ej Coche coche 1 = new Coche()
        //   Coche coche 2 = new Coche()
        //   Coche coche 3 = new Coche()
        
        //ATRIBUTOS serian las propiedades como por ejemplo en el coche, las luces, tracción, potencia, si es electrico, gasolina etc.
        
        //No se puede hacer un sout de un objeto, ya que solo imprime la ref de memoria, no el contenido.
        //Para que salga el contenido hay que poner sout libro1.titulo, si solo pones libro1 no imprime el contenido
        
        //ENCAPSULACIÓN 
        //Definir todas las propiedades y el comportamiento de una clase, dentro de esa clase; es decir, en la clase coche estará definido todo lo concerniente
        //a la clase Coche y en la clase Libro estará definido todo lo que tenga que ver con la clase Libro.
        //Cuando generas un objeto lo que se procura es que no pueda cualquier usuario modificar el objeto, por lo que a través de la encapsulación,
        //tu decides el nivel de acceso y como accede a las propiedades cada usuario.
        //Para esto se hacen métodos, por ejemplo, con el metodo cambiar autor, si el usuario quiere cambiarlo, lo hará a través del método y tu defines
        //las reglas en el método... Por ejemplo en el metodo dices que sea un String etc.
        
        //METODOS (SON VERBOS, como se comporta el coche)
        //Nos permiten definir el comprotamiento de la clase.
        
        //Cuando yo defino una CLASE, tengo una parte que es el bloque de atributos o propiedades (EN LIBRO SERIA ISBN, NUM PAGS ETC) y otra parte
        //que son los métodos.
        
        //CONSTRUCTOR
        //Es el método que nos va a decir por defecto como se construye el objeto, dice por defecto como vamos a crear ese objeto o con que valores
        //Te tienen que llamar  igual.
        
        
        }
        
        public class GatoComun{
            String color,raza,sexo;
            int edad;
            double peso;
            
            //Constructores, (se tienen que llamar igual que la clase) que nos dirá como se generará, dentro de la clase, entonces, si yo genero
            //gato 1, gato 2, todos tienen esta plantilla, la raza será callejero.
            // Constructor Sin parámetro
            public GatoComun(){
              this.raza="callejero";  
            }
            //Constructor con Parámetro
            public GatoComun(String s){
              this.raza=s;  
            }
            
            //Entonces, todos los atributos serían nulos y por ejemplo para raza, GatoComun() para gato 1 y 2 pones callejero 
            //y para gato 3 pones s que saldrá s(persa por ej)
            //Gato 1 = new Gato()
            //Gato 2 = new Gato()
            //Gato 3 = new Gato("Persa")
            
            //Getters (obtener, siempre lleva un return)
            //Son métodos para conseguir los valores de los atributos 
//            public String getSexo(){
//                return this.sexo;
//            }
//            Es un metodo que no tiene parametro y devuelve un string, por eso tiene un return.

            //Setters (No devuelve nada, solo asigna un valor, inicializa un atributo, en este caso sexo s)
//            public void setSexo(String s){
//                this.sexo=s;
//            }
            //Luego tu en el main le metes el valor
            
//          TO STRING para mostrar una clase
//            public String toString(){
//           return "Soy un gato con color" + color + "y de raza" + raza;
//       }
            
            //STATIC
//            Va a diferenciar atributos de clase y atributos de instancia
//            Un atributo de clase es static, que quiere decir que se queda estatico, el resto serían atributos de objeto
            
            //ATRIBUTOS
//            - Hay de clase (static)
//            - De instancia (Asociados a cada objeto)

            //PAQUETES 
            //Los paquetes son contenedores o carpetas donde guardo las clases y yo podré acceder a las clases de esas carpetas
            //Si las clases estan en distintas carpetas, puedo acceder a las distintas clases?? Si, con un import (parecido a scanner) 
            //Pones import java.util Scanner.
            
            //Sobrecarga de metodo (con @override, solo es una ayuda que indica a JAVA que efectivamente quieres sobrecargarlo, es decir, 
            // al mismo metodo, cambiarle el comportamiento. 
            //Es una buena practica, funciona igual, pero imagina que borras el metodo vuela de la clase padre, dejas el de gallo descolgado.
            //Es cuando digo que el hijo va a modificar un metodo del padre, entonces tu podrias coger el metodo come y haces tu propia version del come.
            // Un metodo se puede redefinir en una subclase. Por ejemplo el metodo vuela que esta definido 
            //en la clase ave se puede volver a definir en la clase Gallo, con el mimsmo nomnbre pero comportandose de manera distinta.
            //En estos casos, indicaremos nuestra intencion de sobreescribir un metodo mediante la etiqueta @override.
            //Si no escribimos esta etiqueta, la sobreescritura del metodo se realizará de todas las formas ya que @override indica simplemente una intención.
            // Si lo ponemos el programa nos informará si estamos haciendo algo mal en la sobreescritura.
            // Imagina que quieres sobreescribir el metodo come de animal declarando un come especifico para los tigres de la clase Tigre. 
            //Si escribes @Override y luego te equivocas en el nombre del método y escribes comer, entonces el compilador te avisaría con algo como:
            // Cuidado, algo no esta bien, me has dicho que ibas a sobreescribir un método de la superclase y sin embargo comer no está definido, es come, 
            //por lo que estarias creando otro metodo nuevo.
            
            //ARRAYS DE OBJETOS
            
            //Para comparar objetos y los String, se usa equals. Seria String.equals(el otro String). En el libro viene en la pagina 261.
            //+No se puede comparar objetos con == porque daria la ref de memoria. Hay que usar equals
            //Otro viene en la pagina 267 para comparar dos objetos de tipo hora
            
            //Tipo enumerado
            //Una forma de delimitar los valores que puede tomar un atributo enumerado. Mediante enum se puee definir un tipo enumerado
            //Solo podra tener uno de los posibles valores que se especifican en el tipo enumerado se suelen escribir en mayuscula
            
            //WRAPPERS
           // A veces puede resultar util trabajar con los datos primitivos (int, boolean, float, double...)
            //como si fueran objetos, para trabajar con los metodos que nos proporciona la API de jAVA de una forma mas sencilla(conversiones entre tipos de datos por ejemplo)
            //Como los datos primitivos no son objetos, JAVA lo resuelve utilizando los WRAPPERS (clase envoltorio), estas clases envuelven a los dtos primitivos.
            //Byte para byte
            // -Short para short
            // -Interger para Int
            // -Long para long
            // -Boolean para boolean
            // -Float para float
            // -Double para double
            // -Character para Char
            //Ejemplos de uso: Convertimos String a int
            //Tenemos un String con espacios en blanco u qieremos convertirlo a número. con parselInt (sTRING) devolvemos directamente un primitivo int.
            //String numero ="6"
            //int numero = Interger.parseInt(numero.trim());
            
            //Convertimos un String a un entero. con valueOf(String) se devuelve un oobjeto, por eso ejecutamos el método intValue para poder asignarlo a un primitivo int.
            //int a = Interger.valueOf("22"9.intValue());
            
            //Otras operaciones con wrappers
            //Declarando objetos de tipos Integer, podemos usar sus métodos.
            //Integer I1 = 6;
            //¿Por que no trabajamos directamente con WRAPPERS?
            //A dia de hoy los tipos primitivos, siguen utilizándose principalmente por el rendimiento
            
            //CLASES ABSTRACTAS
            //Es aquella que no va a tener instancias de forma directa, aunque si habra instancias de las subclases (siempre que esas subclases no sean tambien abstractas).
            //Por ej, si se define la clase animal como abstracta, no se podran crear objetos de clase animal, es decir, no se podra hacer animal mascota = new animal (), 
            //pero si la clase tigre ave o gallo que son subclases.
            //De una clase abstracta no se pueden generar instancias, solo en sus subclases. Imagina un molde (clase abstracta) 
            //y de ahí sacas las subclases circulo, triangulo.
            //Obliga a las clases hijas a implementar una funcion, no se pueden crear instancias de una clase abstracta. ES COMO UN MOLDE
            
           
    }
    
}
