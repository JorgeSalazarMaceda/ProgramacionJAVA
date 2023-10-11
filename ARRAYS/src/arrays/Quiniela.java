/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Jorge
 */
import java.util.Random;

public class Quiniela {

    public static char [] Quiniela(int unos, int equis, int doses) { 
        char []a = new char[0];
        int b;
        unos = 0;
        equis = 0;
        doses = 0;

        Random apuesta = new Random();
        apuesta.nextInt();
        for (int i = 0; i < 14; i++) {
            b = apuesta.nextInt(3); //Ponemos las tres posibilidades.
            if (b == 0) {
                equis++;
            } else if (b == 1) {
                unos++;
            } else {
                doses++;
            }
            
        }
        System.out.println(" Unos " + unos + " Doses " + doses + " Equis " +equis);
        return a;
    }

    public static void main(String[] args) {
        Quiniela.Quiniela(1, 2, 3);

    }

}
