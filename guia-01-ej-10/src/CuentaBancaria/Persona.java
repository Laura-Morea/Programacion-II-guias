package CuentaBancaria;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fechaDeNacimiento;

    public Persona(String nombre, String apellido, Fecha fechaDeNacimiento) {
        setNombreYApellido(nombre, apellido);
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona(String nombre, String apellido, int diaNac, int mesNac, int anioNac) {
        setNombreYApellido(nombre, apellido);
        this.fechaDeNacimiento = new Fecha(diaNac, mesNac, anioNac);
    }
    
    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public void mostrarEstado(){
        //System.out.println(toString());
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaDeNacimiento.fechaFormatoDdMmAa());
    }
    
    public int getEdad(){
        int anioActual=LocalDate.now().getYear();
        int diferenciaAnios=anioActual-fechaDeNacimiento.getAnio();
        return yaCumplio()? diferenciaAnios++: diferenciaAnios ;
    }
    
    private boolean yaCumplio(){
        return (fechaDeNacimiento.getMes()>LocalDate.now().getMonthValue())||
                (fechaDeNacimiento.getMes()==LocalDate.now().getMonthValue()&&
                fechaDeNacimiento.getDia()>=LocalDate.now().getDayOfMonth());
    }
    
    public boolean esMayorQue(int limite){
        return getEdad()>=limite;
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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento=" + fechaDeNacimiento +'}';
    }

   
    
}
