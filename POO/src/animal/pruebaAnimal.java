package animal;

public class pruebaAnimal {

    public static void main(String[] args) {
        animal animal1 = new animal(); //Este animal por defecto será salvaje y macho
        System.out.println(animal1);

        animal animal2 = new animal("domestico", "macho"); //Este animal lo creamos con el segundo constructor
        System.out.println(animal2);

        Tigre miTigre = new Tigre();

        miTigre.come("Pescado");

        System.out.println(miTigre);
        miTigre.duerme();
        miTigre.come();
        //metodos 
        animal1.duerme();

        //Creamos el objeto ave
        System.out.println("Las impresiones de AVE");
        Ave ave1 = new Ave();

        ave1.vuela();
        ave1.come();
        
        //Creamos el objeto gallo
        
        Gallo gallo1 = new Gallo();
        gallo1.vuela();
        gallo1.duerme(); //El ultimo zzzz es el de este gallo que hereda de animal
        
        System.out.println("");
        System.out.println("El metodo de Gallo1 come_como_animal que va paso a paso--> PATATAS");
        gallo1.come_como_animal();
        
        
        System.out.println("LLamamos al metodo equals para comparar el objeto miTigre con ave1 y comparar sus tipos");
        miTigre.equals(ave1);
        
        Gallo gallo5 = new Gallo();
        gallo5.setSexo(hembra);

    }
}
