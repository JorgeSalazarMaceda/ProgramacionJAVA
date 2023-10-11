package ahorcado;

import java.util.Scanner;

public class CosasJava {

    public static void main(String[] args) {
//        String palabra= "claudia";

        int variableInt = 1;
        long variableLong = 2;

        float variableFloat = (float) 1.5;
        double variableDouble = 2.5;

        boolean variableBoolean = true;

        char variableChar = 'a';

        String variableString = "hola";

        if (variableInt == 1) {
            System.out.println(variableInt);
        } else {
            System.out.println("No es un 1");
        }

        if (variableString.equals("hola")) {
        }

        switch (variableInt) {
            case 1:
                System.out.println("Es un 1");
                break;
            case 2:
            case 3:
                System.out.println("Es el numero 2 o 3");
                break;
            default:
                System.out.println("No es el 1 ni el 2 ni el 3");
        }
        

        int contador = 0;
        while (contador < 5) {
            contador++;
        }
      
        int maximo = 10;
        for(int i = 0; i < maximo; i++) {
            
        }

        int contador2 = 0;
        do {
            contador2++;
        } while (contador2 < 5);
        
    }

}
