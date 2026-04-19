package Persona;

public class Test {

    public static void main(String[] args) {
        Persona p1 = new Persona("Lionel", "Messi", 1987);
        p1.mostrarEstado();
        
        p1.setNombre("Laura");
        p1.setApellido("Morea");
        p1.setAnioNacimiento(1991);
        
        System.out.println("El nombre completo de p1 es "+p1.getNombreCompleto());
        System.out.println("Su edad es de " + p1.getEdad() + " anios");
        
        p1.setNombreYApellido("Marcela", "Testorelli");
        System.out.println(p1.toString());
      
        System.out.println("Es mayor de 18 anios? " + p1.esMayorQue(18));
    }
}
