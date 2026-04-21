package Persona;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    public Persona(String nombre, String apellido, int anioNacimiento) {
        setNombreYApellido(nombre,apellido);
        setAnioNacimiento(anioNacimiento);
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public void mostrarEstado(){
        //System.out.println(toString());
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
        if(nombre!=null && nombre.length()>=3)
            this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if(apellido!=null && apellido.length()>=2)
            this.apellido = apellido;
    }
    
    public void setNombreYApellido(String nombre, String apellido){
        setNombre(nombre);
        setApellido(apellido);
    }

    public void setAnioNacimiento(int anioNac) {
        if(anioNac>0&&anioNac<=LocalDate.now().getYear())
           anioNacimiento = anioNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", anioNacimiento=" + anioNacimiento + '}';
    }
    
    
}
