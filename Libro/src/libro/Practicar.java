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
public class Practicar {

    public static void main(String[] args) {
        System.out.println("------------------- DEFENSA ------------------");
        
        Novelas novela1 = new Novelas("El Señor de los anillos");
        Novelas novela2 = new Novelas("Las dos torres");
       
         System.out.println(novela1.prestar());
         
         novela2.devolver();
       
         Libro libro = novela1;
         
         if (libro instanceof Novelas){
           ((Novelas)libro).prestar();
         }
         
       
        ((Novelas)libro).mostrar();
        ((Novelas)libro).prestar();
        ((Novelas)libro).devolver();
        System.out.println(((Novelas)libro).prestado());
        
        novela2.mostrar();
         

 System.out.println("------------------- DEFENSA ------------------");     
        
        
        
//        Novelas miNovela = new Novelas("5", "Señor", "Salamandra", Tipo_Novela.FICCION);
//        System.out.println("El título de la novela es: " + miNovela.getTitulo());
//
//        Historicos miHistorico = new Historicos("6", "Anillos", "Barroso", 0);
//        System.out.println("La serie de mi libro historico es: " + miHistorico.getSerie());
//
//        Libro libros[] = new Libro[3];
//
//        libros[0] = new Novelas();
//        libros[1] = new Historicos(0);
//        libros[2] = new Entretenimiento(null, null, null);
//
//        Novelas novelita = new Novelas();
//        Entretenimiento pepe = new Entretenimiento(null, null, null);
//        Libro libro = novelita;
//        Libro librete = pepe;
//
//        ((Novelas) libro).prestar();
//        ((Novelas) libro).prestar();
//        ((Novelas) libro).prestar();
//        ((Novelas) libro).devolver();
//        ((Novelas) libro).devolver();
//        System.out.println(((Novelas) libro).prestado());
//        ((Novelas)libro).mostrar();
//        ((Entretenimiento) pepe).devolver();
//        ((Entretenimiento) pepe).mostrar();
//        
//      
//
//        System.out.println("-----------------------");
//
//        Libro superLibro[] = new Libro[3];
//        superLibro[0] = new Novelas();
//        superLibro[1] = new Historicos("55", "Maravillosa Historia", "Editorial", 0);
//        superLibro[2] = new Entretenimiento(null, null, null);
//
//        for (int i = 0; i < superLibro.length; i++) {
//            superLibro[i].mostrar();
//        }
//
//        for (int i = 0; i < superLibro.length; i++) {
//            if (superLibro[i] instanceof Novelas) {
//                superLibro[i].mostrar();
//                ((Novelas) superLibro[i]).prestar();
//            }
//        }
//        System.out.println("--------------------------------------");
//
//        Libro libros1[] = new Libro[3];
//
//        libros1[0] = new Novelas("0", "La Comunidad del Anillo", "Chema", Tipo_Novela.FANTASTICA);
//        libros1[1] = new Historicos("1", "Las dos Torres", "Chema", 0);
//        libros1[2] = new Entretenimiento("55", null, null);
//
//        System.out.println("\n\r\n\r"); //Saltos
//        //Mostramos los libros solo de tipo novela y comprobamos que se pueden prestar
//        for (int i = 0; i < libros1.length; i++) {
//            if (libros1[i] instanceof Novelas) {
//                libros1[i].mostrar();
//                ((Novelas) libros1[i]).prestar();
//                System.out.println(libros1[i]);
//            } //Si son de tipo Entretenimiento, lo mismo.
//            else if (libros1[i] instanceof Entretenimiento) {
//                libros1[i].mostrar();
//                ((Entretenimiento) libros1[i]).prestar();
//                System.out.println(libros1[i]);
//            }
//           
//        }

    }
}
