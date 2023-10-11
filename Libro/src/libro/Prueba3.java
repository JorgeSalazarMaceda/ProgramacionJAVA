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
public class Prueba3 {
    public static void main(String[] args) {
        Novelas novela1 = new Novelas ("Titulo1");
        
        novela1.prestar();
        novela1.prestar();
        novela1.getTitulo();
        Novelas novela2 = new Novelas ();
        
        Libro libro = novela2; //Crea un libro y ese libro que sea de la novela que has creado antes
             
        ((Novelas)libro).prestar(); //Dejame usar los metodos de novela en el objeto libro
        
        
        System.out.println("--------------------------------------");
        
        Libro libros[] = new Libro[3];

        libros[0] = new Novelas("0", "La Comunidad del Anillo", "Chema", Tipo_Novela.FANTASTICA);
        libros[1] = new Historicos("1", "Las dos Torres", "Chema",0);
        libros[2] = new Entretenimiento("55", null, null);
        

       
        System.out.println("\n\r\n\r"); //Saltos
        //Mostramos los libros solo de novelas
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] instanceof Novelas) {
                libros[i].mostrar();
               ((Novelas)libros[i]).prestar();
                System.out.println(libros[i]);
            }
            else if(libros[i] instanceof Entretenimiento){
                libros[i].mostrar();
               ((Entretenimiento)libros[i]).prestar();
               System.out.println(libros[i]);
            } 
        }   
    }
}
