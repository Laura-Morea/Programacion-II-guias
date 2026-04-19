package Persona;

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
