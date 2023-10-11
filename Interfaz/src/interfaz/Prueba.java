/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Jorge
 */
import java.util.*;

public class Prueba {

    public static void main(String[] args) {
        ILugarInteresTuristico[] array = new ILugarInteresTuristico[6];
        array[0] = new Mercado("San Anton", 1, Tipo_Lugar.CULTURAL);
        array[1] = new Mercado("San Fernando", 2, Tipo_Lugar.GASTRONOMICO);
        array[2] = new Mercado("San Miguel", 3, Tipo_Lugar.OCIO);
        array[3] = new Monumento();
        array[4] = new Monumento();
        array[5] = new Monumento();

        for (int i = 0; i < array.length; i++) {
            System.out.println("Mi array en la posición: " + i + "es: " + array[i]);;
        }

        Arrays.sort(array);
        System.out.println("Array Ordenado");
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Mi array en la posición: " + i + "es: " + array[i]);;
        }
    }
}
