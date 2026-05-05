package ejemplos;

import java.util.ArrayList;

public class IntroArrayList {

    public static void main(String[] args) {
        ArrayList <Alumno> alumnos = new ArrayList<Alumno>();
        System.out.println(alumnos);
        System.out.println(alumnos.size());
        alumnos.add(new Alumno("Juan",7.3));
        alumnos.add(new Alumno("Maria",4.5));
        alumnos.add(new Alumno("Pedro",6.6));
        alumnos.add(new Alumno("Ana",3.9));
        System.out.println(alumnos.size());
        System.out.println(alumnos);
        Alumno primerAlumno= alumnos.get(0);
        System.out.println(primerAlumno.getNombre());
       // alumnos.remove(0);
        Alumno otroAlumno = alumnos.get(0);
        System.out.println(otroAlumno.getNombre());
        
        double acu = 0;
        for(int i=0;i<alumnos.size();i++){
            acu+= alumnos.get(i).getPromedio();
        }
        System.out.println("Promedio: "+ acu/alumnos.size());
        
        for(Alumno alu: alumnos){ //el for each genera un iterador y recorre todos los elementos. Ya sea un array, un arbol o lo que sea
            acu+=alu.getPromedio();
        }
        System.out.println("Promedio: "+ acu/alumnos.size());
    }
    
}
