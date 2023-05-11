package dia33integrador;

import dia33integrador.Entidad.Estudiante;
import dia33integrador.Servicio.ServicioEstudiante;

public class Dia33integrador {

    public static void main(String[] args) {
        ServicioEstudiante se = new ServicioEstudiante();
        Estudiante e = se.init();
        
        se.promedio();
        System.out.println("");
        se.nombre_mayor();
        System.out.println("");
        se.estud_mayor();
        System.out.println("");
        
            for(int i = 2; i <= 128; i *=2){
            System.out.println("i "+i);
            }
        
    }
    
    
}
