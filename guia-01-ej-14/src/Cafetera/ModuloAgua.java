package Cafetera;

public class ModuloAgua {
    private double temperatura;
    private boolean enMantenimiento;
    public static final double TEMP_MIN=70.0;
    public static final double TEMP_CALENTADO=80.0;
    
    public void calentarAgua(){
        temperatura=TEMP_CALENTADO;
    }
    
    public void repararModulo(){
        enMantenimiento=false;
    }
    
    public boolean preparado(){
        boolean ret=false;
        if(enMantenimiento)
            System.out.println("La maquina necesita mantenimiento\n");
        else if(temperatura<TEMP_MIN)
            System.out.println("El agua esta fria para hacer cafe\n");
        else
            ret=true;
        return ret;
    }
}
