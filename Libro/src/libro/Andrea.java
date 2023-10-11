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
public class Andrea {

    public static void main(String[] args) {
        Novelas novela1 = new Novelas();
        Historicos his = new Historicos(5);
        Entretenimiento Ent = new Entretenimiento(null, null, null);

        novela1.prestar();
        Ent.prestar();

        Libro libros[] = new Libro[3];
        libros[0] = novela1;
        libros[1] = his;
        libros[2] = Ent;

        for (int i = 0; i < libros.length; i++) {
            if (libros[i] instanceof Novelas) {
                ((Novelas) libros[i]).prestar();
            } else if (libros[i] instanceof Entretenimiento) {
                ((Entretenimiento) libros[i]).prestar();
            }
        }

    }

}
