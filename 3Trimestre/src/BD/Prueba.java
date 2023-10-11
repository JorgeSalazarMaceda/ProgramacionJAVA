/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

/**
 *
 * @author Jorge
 */
import java.util.List;
public class Prueba {
    public static void main(String[] args) {
        AlumnoDao dao = new AlumnoDao();
        
        List<Alumno> segundoA = dao.alumnosXCurso("2A");
    
        for(Alumno a: segundoA){
            System.out.println(a);
        }
    
    }
}
