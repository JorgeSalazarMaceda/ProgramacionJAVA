/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import java.util.Arrays;

/**
 *
 * @author Jorge
 */
public class Prueba2 {

    public static void main(String[] args) {

        Novelas n = new Novelas();

        Libro libros[] = new Libro[5];

        libros[0] = new Novelas("0", "La Comunidad del Anillo", "Chema", Tipo_Novela.FANTASTICA);
        libros[1] = new Novelas("1", "Las dos Torres", "Chema", Tipo_Novela.FICCION);
        libros[2] = new Novelas("2", "El Retorno del Rey", "Chema", Tipo_Novela.AVENTURAS);
        libros[3] = new Historicos("3", "Alatriste", "Marinas", 5);
        libros[4] = new Entretenimiento("4", "Chema is fun", "Jorge");

        //Hacemos el metodo mostrar donde solo vemos un par atributos
        for (int i = 0; i < libros.length; i++) {
            libros[i].mostrar();

        }
        System.out.println("\n\r\n\r"); //Saltos
        System.out.println("Mostramos solo las novelas");
        //Mostramos los libros solo de novelas
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] instanceof Novelas) {
                libros[i].mostrar();
            }
        }
        //Queremos acceder al titulo chema is fun
        for (int i = 0; i < libros.length; i++) {
//            if(libros[i].titulo.equals("Chema is fun")){
            if ("Chema is fun".equals(libros[i].titulo)) {
                System.out.println(libros[i].titulo);
            }
            if ("Chema is fun".equals(libros[i].titulo) && libros[i] instanceof Entretenimiento) { //Vemos si el titulo chema is fun esta prestado
                Entretenimiento miEntretenimiento = (Entretenimiento) libros[i];
                System.out.println(miEntretenimiento.prestado());
                ((Entretenimiento) libros[i]).prestar();
                System.out.println(((Entretenimiento) libros[i]).prestado());
                ((Entretenimiento) libros[i]).prestar();
                System.out.println(((Entretenimiento) libros[i]).prestado());
                ((Entretenimiento) libros[i]).devolver();
                System.out.println(((Entretenimiento) libros[i]).prestado());
                ((Entretenimiento) libros[i]).devolver();
                System.out.println(((Entretenimiento) libros[i]).prestado());
            }

        }

//        for (int i = 0; i < libros.length; i++){
//            if("Alatriste".equals(libros[i].titulo)){
//                System.out.println(libros[i]);
//            }
//        }
////----------------------------A R R A Y---------------------------------
//        Novelas[] novelitas = new Novelas[3]; //Creamos el array
//        novelitas[0] = new Novelas("001", "Comunidad del anillo", "SPA", Tipo_Novela.FANTASTICA);
//        novelitas[1] = new Novelas("002", "Las dos torres", "SPA", Tipo_Novela.FANTASTICA);
//        novelitas[2] = new Novelas("003", "El retorno del rey", "SPA", Tipo_Novela.FANTASTICA);
//
//        Libro[] libros = new Libro[3];
//        libros[0] = new Novelas("001", "La comunidad del anillo", "SPA", Tipo_Novela.AVENTURAS);
//        libros[1] = new Historicos("002", "Las dos torres", "SPA", 1234);
//        libros[2] = new Entretenimiento("003", "El retorno del rey", "SPA");
//
////        for (int i = 0; i < libros.length; i++) {
////            if (libros[i] instanceof Prestamo) {
////                ((Prestamo) libros[i]).prestar();
////                ((Prestamo) libros[i]).prestar();
////            }
////        }
//        //Con el instanceof podemos saber de que tipo es un objeto. Y al hacer el casting cambiariamos el objeto de tipo Libro a tipo Novela, cuando corresponda.
//        for (Libro libro : libros) {
//            if (libro instanceof Novelas) {
//                System.out.println(((Novelas) libro).tipo);
//            }
//            if (libro instanceof Historicos) {
//                System.out.println(((Historicos) libro).getSerie());
//            }
//            if (libro instanceof Entretenimiento) {
//                System.out.println(((Entretenimiento) libro).prestado());
//            }
//        }
////        System.out.println("-------------------     C A S T I N G       -----------------");
////        System.out.println(((Novelas) libros[0]).prestado());
////        ((Novelas) libros[0]).prestar();
////        System.out.println(((Novelas) libros[0]).prestado());
//
////        ((Entretenimiento)libros[2]).prestar();
////        System.out.println(((Entretenimiento)libros[2]).prestado()); 
//        //Al reves no deberia funcionar, ejemplo: Novela n1.... (Libro n1)
//        //Si cambio la posicion o pongo historicos no deja prestar porque no está implementado.
//        //En la parte de arrays de libros, para acceder al objeto de la posicion 0 es una instancia de novela? Tienes que aplicar instanceof
//        //y luego hay que adaptar la posicion de tipo libor al objeto de tipo novela con un casting, lo castearemos de el tipo libro al tipo novela (novela) libro[2]
    }
}
