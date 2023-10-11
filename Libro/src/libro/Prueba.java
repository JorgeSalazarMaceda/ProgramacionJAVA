/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

/**
 *
 * @author Jorge
 */
public class Prueba {

    public static void prestarLibro(Libro libro) {
        if (libro instanceof Novelas) {
            if (!((Novelas) libro).prestado()) {
                ((Novelas) libro).prestar();
            } else {
                System.out.println("El libro ya estaba prestado");
            }
        }
    }

    public static void main(String[] args) {

        Novelas novela1 = new Novelas("999", "Harry Potter", "Libero", Tipo_Novela.AVENTURAS);
        System.out.println("---------");
        System.out.println(novela1);
        System.out.println("");
        System.out.println(novela1.getTitulo());
        System.out.println("");
        System.out.println(novela1.codigo);

        Novelas novela2 = new Novelas();
        System.out.println("la novela 2 es: " + novela2);

        novela1.prestar();
        novela1.prestar();
        novela1.devolver();
        novela1.devolver();
        // System.out.println(novela1.prestado());

//        novela1.prestar();
//        System.out.println("La novela 1: " + novela1.prestado());
//        novela1.devolver();
//        System.out.println("La novela 1: " + novela1.prestado());
//        novela1.prestar();
//        novela1.prestar();
//        System.out.println("La novela 1: " + novela1.prestado());
//        novela1.prestar();
//        System.out.println("La novela 1: " + novela1.prestado());
        Historicos historia = new Historicos(56);

        System.out.println("--------------------------------------");

        Libro libros[] = new Libro[3];

        libros[0] = new Novelas("0", "La Comunidad del Anillo", "Chema", Tipo_Novela.FANTASTICA);
        libros[1] = new Historicos("1", "Las dos Torres", "Chema", 0);
        libros[2] = new Entretenimiento("55", null, null);

        System.out.println("\n\r\n\r"); //Saltos
        //Mostramos los libros solo de novelas
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] instanceof Novelas) {
                libros[i].mostrar();
                ((Novelas) libros[i]).prestar();
                System.out.println(libros[i]);
            } else if (libros[i] instanceof Entretenimiento) {
                libros[i].mostrar();
                ((Entretenimiento) libros[i]).prestar();
                System.out.println(libros[i]);
            }
        }
    }
}
