package funcioneschema;

import java.util.Scanner;

public class ComprobarEmail {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        String email;

        System.out.println("Ingrese el correo: ");
        email = leer.next();

        comprobarEmail(email);

    }

    static void comprobarEmail(String email) {
        int contadorArrobas = 0, contadorPuntos = 0;

        for (int i = 0; i < email.length() - 1; i++) {
            if (email.charAt(i) == '@') {
                contadorArrobas++;
            } else if (email.charAt(i) == '.') {
                contadorPuntos++;
            }
        }

        if (contadorArrobas == 1 && contadorPuntos == 1) {
            System.out.println("la direccion es válida");
        } else {
            System.out.println("Error en la dirección");
        }
    }
}
