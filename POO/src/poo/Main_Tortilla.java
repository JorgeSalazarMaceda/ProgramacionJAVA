
package poo;
    
public class Main_Tortilla {
    public static void main(String[] Args) {
		SabrosaTortilla Almacen1 = new SabrosaTortilla(5, 8);
		Almacen1.addHuevos(2);
		Almacen1.addPatatas(3);
		System.out.println("Hay " + Almacen1.docenas_huevos + " docenas huevos " + Almacen1.kilos_patatas + " kilos de patatas ");
		Almacen1.hayExistencias(Almacen1.docenas_huevos);
		Almacen1.sirveTortilla(Almacen1.docenas_huevos);

	}
}
