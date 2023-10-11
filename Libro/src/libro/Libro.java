/*
Clase Libro con herencia e interfaces.
Escribe un programa que gestionará distintos tipos de libros. Los libros pueden ser
históricos, de entretenimiento o novelas.
• Para todos los tipos se almacena el código y el título y la editorial. Estos atributos
se pasan por parámetro en el momento de crear los objetos.
• Los libros de entretenimiento y de novela se pueden prestar, tienen un atributo
adicional que llamaremos prestado.
• Los libros de novela pueden ser Policiaca, Suspense, Aventuras, Ficción,
Fantástica. Utilizar un tipo enumerado tipo_novela para gestionar esa lista de
valores.
• Los libros históricos tienen un número de serie, que se pasa por parámetro
cuando se crean.
• Todos los tipos de libros entretenimiento deben tener un método
toString() que devuelve el valor de todos sus atributos en una cadena de caracteres.
• El programa tiene que implementar una interfaz prestamo con los métodos
o prestar()
o devolver()
o prestado, este método devuelve un booleano teniendo en cuenta si está
prestado o no.

• La clase Entretenimiento y Novela implementan esta interfaz   //Es decir, son las que se pueden prestar!!!!!!!!!!!
• Genera un programa que haga uso de estos libros, genera un array de objetos de
tipo Libro que incluya libros de todos los tipos. Recorre el array para mostrar los
datos de todos los libros.

//Los metodos tienen que ser dependientes entre sí. Para poder prestar un libro, tiene que estar disponible.

 //En la parte de arrays de libros, para accede
 //En la par al objeto de la posicion 0 es una instancia de novela? Tienes que aplicar instance of 
 //y luego hay que adaptar la posicion de tipo libor al objeto de tipo novela con un casting, lo castearemos de el tipo libro al tipo novela (novela) libro[2]
 */
package libro;

/**
 *
 * @author Jorge
 */
public class Libro {

    //Atributos
    protected String codigo, titulo, editorial;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String editorial) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public void mostrar() {
        System.out.println("Los datos de este libro son: " + this.codigo + "-" + this.titulo + "-" + this.editorial);
    }

    
}
