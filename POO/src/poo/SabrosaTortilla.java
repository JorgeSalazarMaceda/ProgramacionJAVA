
package poo;

public class SabrosaTortilla {
    //Atributos
	static int y;
	double kilos_patatas;
	int huevos;
	int docenas_huevos = (12 * huevos); ///huevos = 12 * docenash
	boolean existencias;

//*Constructor recibirá el numero de docenas de huevos y kilos de patatas*/
	public SabrosaTortilla(int docenas_huevos, double kilos_patatas) {
		this.docenas_huevos = docenas_huevos;
		this.kilos_patatas = kilos_patatas;
		//this.y=y;

	}

//* Método que incrementa el numero de docenas de huevos*/
	public int addHuevos(int decenas_huevos1) {
		this.docenas_huevos = (docenas_huevos + decenas_huevos1);
		return docenas_huevos;
	}

//*Método que incrementa el nº de kilos de patatas*/
	public double addPatatas(double kilos_patatas1) {
		this.kilos_patatas = (kilos_patatas + kilos_patatas1);
		return kilos_patatas;
	}

//* Metodo booleano que da true si hay existencias*/
	public boolean hayExistencias(int docenas_huevos) {
		return existencias = docenas_huevos > 1 && kilos_patatas > 0.5; //Usas una docena de huevos y medio kilo de patatas
	}

//*Método que disminuye los kilos de patatas y los huevos por cada tortilla que se realice da mensaje error, si no hay suficientes existencias*/	
	public void sirveTortilla(int docenas_huevos) {
		if (existencias == true)

			System.out.println("Servir tortilla en mesa 3:\nLe quedan " + (kilos_patatas - 0.5) + " kilos de patatas "
					+ ((docenas_huevos * 12) - 6) + " huevos");

		else
			System.out.println("No hay suficientes existencias para hacer otra tortilla");
	}

}

