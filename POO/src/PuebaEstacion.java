//Hemos recibido el encargo de un cliente para definir los paquetes y las clases necesarias. (solo implementar los atributos y los constructores)
//para gestionar una empresa ferroviaria, en la que se distinguen dos grandes grupos: personal y maquinaria.
//En el primero se ubican todos los empleados de la empresa que se clasifican en 3 grupos: maquinistas, mecanicos y jefes de estacion.
// Maquinistas: nombre, dni, sueldo y rango.
// Mecanicos: nombre, telefono y especialidad (enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD Y MOTOS).
// Jefes de estacion: nombre, dni y fecha en la que fue nombrado.

//En la parte de maquinaria podemos encontrar trenes, locomotoras y vagones.

// Trenes: formados por una locomotora y un maximo de 5 vagones. Cada uno tiene asignado un maquinista que es responsable de el.
// Locomotora: matricula, potencia y antiguedad (año de fabricacion). Además, cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento.
// Vagones: numero de identificacion, carga maxima (kilos), carga actual y tipo de mercancia con el que se cargan.

//Todas las clases correspondientes al personal (maquinistas, mecanicos y jefes de estacion) seran de uso publico.
//Entre las clases relativas a la maquinaria solo sera posible construir desde clases externas, objetos de tipo Tren y Locomotora. 
//La clase Vagon solo sera visible por sus clases vecinas.
import personal.Maquinista;
public class PuebaEstacion {
    public static void main(String[] args) {
        Maquinista jefe = new Maquinista("paco", "555555", 6.5, "jefe");
        System.out.println(jefe);
    }
}
