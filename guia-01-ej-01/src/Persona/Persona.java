package Persona;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Anio de Nacimiento: " + anioNacimiento);
    }
    
    public int getEdad(){
        int anioActual=LocalDate.now().getYear();
        return anioActual-anioNacimiento;
    }
    
    public boolean esMayorQue(int limite){
        return getEdad()>limite;
    }

    public void setNombre(String nombre) {
        if(!"".equals(nombre))
            this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if(!"".equals(apellido))
            this.apellido = apellido;
    }
    
    public void setNombreYApellido(String nombre, String apellido){
        if(!"".equals(nombre)&!"".equals(apellido)){
            this.nombre=nombre;
            this.apellido=apellido;
        }
    }
}