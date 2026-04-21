package Empleado;

public class Empleado {
    String DNI;
    String nombre;
    String apellido;
    double salarioBase;
    EstadoCivil estadoCivil=EstadoCivil.CASADO;
    int cantHijos;
    static final double PORC_AUMENTO_HIJOS=0.03;
    static final double PORC_AUMENTO_LIMITE=0.10;
    static final double PORC_DESCUENTO_SOLTERO=0.04;

    enum EstadoCivil {
        SOLTERO,
        CASADO,
        DIVORCIADO,
        VIUDO;
        
        private EstadoCivil() {
        }
    }
    
    public double obtenerSalarioFinal(){
        double salarioFinal=salarioBase;
        if(cantHijos!=0){
            salarioFinal=(salarioFinal*(1+PORC_AUMENTO_HIJOS*cantHijos));
            if(salarioFinal>salarioBase*(1+PORC_AUMENTO_LIMITE)){
                salarioFinal=salarioBase*(1+PORC_AUMENTO_LIMITE);
            }
            if(estadoCivil.equals(EstadoCivil.SOLTERO)){
            salarioFinal=salarioFinal*(1-PORC_DESCUENTO_SOLTERO);
            }
        }
        return salarioFinal;
    }
}
