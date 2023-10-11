/*
Crea una clase Alumno
Haz otra clase AlumnoDao
Haz un método de AlumnosXcurso que recibe como parámetro un String que es el curso
y que devuelve una lista (List) de Alumnos utilizando la BD de Instituto. En un resulset, dentro del curso, guardas los alumnos y para sacarlos usas get.
Imagina String nombre= resulset.getString(nombre del campo que sería "nombre")
 */
package BD;

import java.util.Date;

/**
 *
 * @author Jorge
 */
public class Alumno {
    
    //Atributos
    private final int TAM_NOMBRE = 30;
    private int id;
    private String nombre;
    private Date fNacimiento;
    private double notaMedia;
    private String curso;
    
    
    //Constructores
    public Alumno(int id) {
        this.id = id;
    }

    public Alumno(int id, String nombre, Date fNacimiento, double notaMedia, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
        this.notaMedia = notaMedia;
        this.curso = curso;
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Alumno: " + TAM_NOMBRE +" " + id + " , nombre=" + nombre + ", fNacimiento=" + fNacimiento + ", notaMedia=" + notaMedia + " y curso=" + curso;
    }
    
    
}
