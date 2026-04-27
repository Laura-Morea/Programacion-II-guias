package Persona;

import java.time.LocalDate;

/*Refactoreá la clase Persona del ejercicio 1), cambiando el año de nacimiento por su fecha de 
nacimiento y agregando el atributo domicilio, que contenga calle, altura y barrio. 
 */
public class Test {

    public static void main(String[] args) {
        Persona p1 = new Persona("Laura", "Morea", 10,12,1991, "Naon", 3815, "Saavedra");
        Fecha f2= new Fecha(LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), 2009);
        Domicilio d2 = new Domicilio("Colonia", 648, "Parque Patricios");
        Persona p2 = new Persona("Abril", "Hering", f2, d2);
        
        p1.mostrarEstado();
        System.out.println(p2.toString());
        System.out.println(p1.getNombreCompleto() + " tiene " + p1.getEdad() + " anios. Es mayor de edad? " + p1.esMayorQue(18));
        System.out.println(p2.getNombreCompleto() + " tiene " + p2.getEdad() + " anios. Es mayor de edad? " + p2.esMayorQue(18));
    }
    
}
