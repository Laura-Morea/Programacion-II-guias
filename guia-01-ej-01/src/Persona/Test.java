package Persona;

/*1) Modelá la clase Persona, la cual posea como atributos nombre, apellido y año de nacimiento. 
Luego, implementá métodos que permitan: 
▪ Devolver el nombre completo de la persona. 
▪ Mostrar su estado en la consola. 
▪ Obtener su edad actual. 
▪ Saber si es mayor que una edad dada. 
▪ Cambiar su nombre. 
▪ Cambiar su apellido. 
▪ Cambiar su nombre y su apellido. 
Finalmente, instanciá una persona en el método main y probá todos sus métodos. */

public class Test {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.mostrarEstado();
        
        p1.setNombre("Laura");
        p1.setApellido("Morea");
        System.out.println("El nombre completo de p1 es "+p1.getNombreCompleto());
        
        p1.setNombreYApellido("Marcela", "Testorelli");
        p1.mostrarEstado();
        System.out.println("Su edad entonces es de " + p1.getEdad() + " anios");
        
        System.out.println("Es mayor de 18 anios? " + p1.esMayorQue(18));
    }
}
