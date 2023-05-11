package dia33integrador.Servicio;

import dia33integrador.Entidad.Estudiante;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioEstudiante {
    
    Estudiante e = new Estudiante();
    Estudiante[] estudiantes = new Estudiante[8];
    Scanner leer = new Scanner(System.in);
        
   public Estudiante init(){
       int a = 1;
    for (int i = 0; i < estudiantes.length; i++) { 
        System.out.println("definir nombre del °"+a+" estudiante");
        e.setNombre(leer.next());
        System.out.println("definir nota del °"+a+" estudiante");
        e.setNota(leer.nextDouble());
        System.out.println("");
        
        a = a + 1;
        
        estudiantes[i] = new Estudiante(e.getNombre(),e.getNota());
    }
        return e;
   }
    
   public void promedio(){
    double suma = 0;

    for (int i = 0; i < estudiantes.length; i++) {
        suma += estudiantes[i].getNota();
    }

    e.setPromedio(suma / estudiantes.length);

    System.out.println("El promedio de notas del curso es: " + e.getPromedio());
   }
   
   public void nombre_mayor(){
    ArrayList<String> nombresMayoresAlPromedio = new ArrayList<String>();

    for (int i = 0; i < estudiantes.length; i++) {
        if (estudiantes[i].getNota() > e.getPromedio()) {
            nombresMayoresAlPromedio.add(estudiantes[i].getNombre());
        }
    }

    System.out.println("Los estudiantes que recibieron una nota mayor al promedio son: " + nombresMayoresAlPromedio);
   }
   
   public void estud_mayor(){
        System.out.println("Los estudiantes con una nota mayor al promedio son:");

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > e.getPromedio()) {
                System.out.println(estudiantes[i].getNombre() + " - " + estudiantes[i].getNota());
            }
        }
    }
}
