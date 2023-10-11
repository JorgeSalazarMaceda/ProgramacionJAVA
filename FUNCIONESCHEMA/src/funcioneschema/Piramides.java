package funcioneschema;

public class Piramides {

    public static void main(String[] args) {
        pintarPiramide(true, 3, '*');
        pintarPiramide(false, 3, '*');
        pintarPiramide(true, 4, '*');
        pintarPiramide(false, 4, '*');
        pintarPiramide(true, 4, 'x');
    }

    public static void pintarPiramide(boolean relleno, int altura, char simbolo) {
        
        for (int fila = 0; fila < altura; fila++) {
            for (int columna = 0; columna < altura*2; columna++) {
                if (columna < altura - fila - 1 || columna > altura + fila - 1) {
                    System.out.print(" ");
                } else {
                    if (!relleno 
                            && (columna > altura - fila - 1 && columna < altura + fila - 1)
                            && (fila!=0 && fila!=altura-1)) 
                    {
                        System.out.print(" ");
                    } else {
                        System.out.print(simbolo);
                    }
                }
            }
            System.out.println("");
        }
        
    }
}
