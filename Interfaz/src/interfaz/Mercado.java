/*
Simulacro Examen Interfaces – Trimestre 3o
Un mercado es un lugar donde se puede tomar unos vinos y tapas, hay de muchos tipos. En
Madrid, algunos ejemplos son el mercado de San Antón, San Fernando, y el de San Miguel (ESTO SON OBJETOS). El
tipo de mercado vendrá dado con el método int getTipoDeMercado(). Los tipos de mercado
pueden ser de tipo 1, 2 o 3. (ESTO LO PUEDO HACER CON UN IF O CON SWTICH)
• Tipo 1 son mercados donde solo se vende
• En los de tipo 2, solo se come
• Los de tipo 3 son mixtos, se puede comprar producto y también se puede comer.
Un lugar de interés para nosotros es un lugar turístico que la gente suele visitar. Para esos
lugares definimos un método int getOpinionesLugar() y guardamos el tipo de lugar de
interés: //ESTO ES UN ENUM
• Cultural
• Gastronómico
• Ocio
Cualquiera de los 3 ejemplos de mercados mencionados son al mismo tiempo un
mercado y un lugar de interés turístico (ESTA FRASE ES LA CLAVE, San Miguel es un ITipo_Mercado y a la vez lugar de interes turistico).
Para cada ejemplo de mercado registramos el nombre y el número de opiniones que tiene. //Esto son los atributos de ITipo_Mercado
Por otro lado, un monumento también es un tipo de lugar de interés. De los monumentos
registramos su ubicación, su nombre y su antigüedad. //Esto son los atributos de Monumento.
Tareas a realizar:
• Definir dos interfaces (mercado y lugar de interés turístico) y las clases necesarias
que implementen esas interfaces para representar la situación anterior.
• En una clase principal con el método main, crear una matriz que contenga los 3
ejemplos de mercados mencionados y 3 monumentos.
• Ordenar la matriz según el volumen de opiniones que han recibido los mercados
y los monumentos y mostrarla por pantalla. Para la ordenación utiliza un método
de comparación y el método Arrays.sort.
CONSEJOS DE SALVA:
- Quita la paja y centrate en interpretar el esquema de lo que te pide el enunciado. (IMercado) (ILugarDeInteres)
-(IMercado) getTipoMercado. 
- (ILugarDeInteres) int getNumeroOpiniones y TipoLugar getTipoLugar (Porque este es el enum).
- Ahora vemos que ITipo_Mercado implementa (IMercado) y (ILugarDeInteres). 
    Por tanto tendra que desarrollar getTipoMercado, int getNumeroOpiniones y TipoLugar getTipoLugar y tiene de atributos nombre y numero opiniones.
- Monumento tiene de atributos ubicacion, nombre y antiguedad e implements (ILugarDeInteres) por lo que implementa TipoLugar getTipoLugar
 */
package interfaz;

/**
 *
 * @author Jorge
 */
public class Mercado implements ITipo_Mercado, ILugarInteresTuristico, Comparable {

    //Atributos
    private String nombre;
    private int tipoMercado, opiniones;
    private boolean come, vende;
    private Tipo_Lugar tipoLugar;

    //Constructor
    public Mercado(String nombre, int tipoMercado, Tipo_Lugar tipoLugar) {
        this.nombre = nombre;
        this.tipoMercado = tipoMercado;
        this.tipoLugar = tipoLugar;
        this.opiniones = opiniones = (int) (Math.random() * 100);

        switch (tipoMercado) {
            case 1:
                vende = true;
                come = false;
            case 2:
                come = true;
                vende = false;
            case 3:
                come = true;
                vende = true;
                break;
        }
        //De SALVA, NO PUEDE SER BOOLEAN, PORQUE EL getTipoMercado devuelve un entero
//        if(tipoMercado == 1 || tipoMercado == 2 || tipoMercado == 1){
//            this.tipoMercado = tipoMercado;
//        }
//        else this.tipoMercado = 1;
//        
//        this.tipoLugar = tipo;
//        this.nombre = nombre;
//        this.opiniones = opiniones;  
        
    }

    @Override
    public int getTipoDeMercado() {
        return tipoMercado;
    }

    @Override
    public int getOpinionesLugar() {
        return opiniones;
    }

    public String toString() {
        return "El nombre del mercado es: " + nombre + ", su tipo es: " + tipoMercado + ", el tipo de lugar es: " + tipoLugar + ", las opiniones son: " + opiniones + " y puede comer: " + come + " o vender: " + vende;
    }

    @Override
    public int compareTo(Object o) {
        return (opiniones - ((ILugarInteresTuristico) o).getOpinionesLugar());
    }
    
//    //Metodo DE SALVA por defecto para comparar, segun numero de opiniones.
        //Hacemos clase ComparaOpiniones implements Comparatos <LugarInteresTuristico>{
//    public int compare(ILugarInteresTuristico ob1, ILugarInteresTuristico ob2)
//            return (ob1.getIOpionionesLugar() - ob2.getIOpionionesLugar())
            //}
//     @Override
//    public int compareTo(Object o) {
//        ILugarInteresTuristico lugar = (ILugarInteresTuristico)o;
//        return (this.getOpinionesLugar()-getOpinionesLugar());
//    }
}
