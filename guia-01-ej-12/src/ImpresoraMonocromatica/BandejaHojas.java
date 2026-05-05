package ImpresoraMonocromatica;

public class BandejaHojas {
    private int cantHojas;
    public static final int MAX_HOJAS=35;
    public static final int CANT_CHAR_HOJAS=20;
    
    public void recargarBandeja(int cant){
        if(cant>0){
            if(cant+this.cantHojas>=MAX_HOJAS)
                this.cantHojas=MAX_HOJAS;
            else
                this.cantHojas+=cant;
        }
    }
    
    private static int hojasPorCaracter(int cant){
        return (int)Math.ceil((double)cant/CANT_CHAR_HOJAS);
    }
    
    public boolean hojasSuficientes(int cant){
        return cantHojas-hojasPorCaracter(cant)>=0;
    }
    
    public void reducirHojas(int cant){
        this.cantHojas-=hojasPorCaracter(cant);
    }
}
