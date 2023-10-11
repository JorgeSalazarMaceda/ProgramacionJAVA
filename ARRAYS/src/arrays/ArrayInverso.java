//Muestra un array invertido, por ejemplo[8,7,10,2] que muestre 2,10,7,8.
package arrays;

public class ArrayInverso {

    public static void main(String[] args) {
        int array[] = {1, 23, 45, 67, 78, 99};
        inv(array); //Se hace el llamado a la función

    }

    //El metodo es el siguiente: Partimos desde a que sería el final, y hasta que llegue a 0, decrementando, que vaya mostrándo inp(p)
    static void inv(int a[]) {
        for (int i = a.length - 1; i >= 0; i--) { //El length es - 1 porque es para no pasarse del array.
            // i es igual a la longitud de a-1 y mientras que i sea mayor o igual que 0, decrecienta.
            System.out.print(a[i] + ", "); //Imprime a (que seria toda la longitud) de i, con las comas correspondientes     
        }
    }
}
