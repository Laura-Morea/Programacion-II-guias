package Empleado;

public class Empleado {
    private String DNI;
    private String nombre;
    private String apellido;
    private double salarioBase;
    private EstadoCivil estadoCivil;
    private int cantHijos;
    public static final double PORC_AUMENTO_HIJOS=3/100;
    public static final double PORC_AUMENTO_LIMITE=10/100;
    public static final double PORC_DESCUENTO_SOLTERO=4/100;

    public enum EstadoCivil {
        SOLTERO,
        CASADO,
        DIVORCIADO,
        VIUDO;
        
        private EstadoCivil() {
        }
    }

    public Empleado(String DNI, String nombre, String apellido, double salarioBase, EstadoCivil estadoCivil, int cantHijos) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.estadoCivil = estadoCivil;
        this.cantHijos = cantHijos;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombreYApellido() {
        return nombre + " " + apellido;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setNombreYApellido(String nombre, String apellido) {
        if(!"".equals(nombre)&&!"".equals(apellido)){
            this.nombre = nombre;
            this.apellido = apellido;
        }
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setCantHijos(int cantHijos) {
        if(cantHijos>=0)
            this.cantHijos = cantHijos;
    }
    
    public double obtenerSalarioFinal(){
        double salarioFinal=salarioBase;
        if(cantHijos!=0){
            salarioFinal=salarioFinal*(1+PORC_AUMENTO_HIJOS)*cantHijos;
            if(salarioFinal>salarioBase*(1+PORC_AUMENTO_LIMITE)){
                salarioFinal=salarioBase*(1+PORC_AUMENTO_LIMITE);
            }
        }
        if(estadoCivil.equals(EstadoCivil.SOLTERO)){
            salarioFinal=salarioFinal*(1-PORC_DESCUENTO_SOLTERO);
        }
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", salarioBase=" + salarioBase + ", estadoCivil=" + estadoCivil + ", cantHijos=" + cantHijos + '}';
    }
    
}
