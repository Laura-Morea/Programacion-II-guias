package Fecha;

public class Fecha {
    int dia;
    int mes;
    int anio;
    public static final int DIA_MAXIMO_MES=31;
    public static final int DIA_MESES_30=30;
    public static final int DIAS_FEBRERO=28;
    
    public String fechaFormatoDdMmAa(){
        return dia+"/"+mes+"/"+anio%100;
    }
    
    public boolean esNavidad(){
        return dia==25&&mes==12;
    }
    
    public void sumarUnMes(){
        if(dia<=DIAS_FEBRERO||dia<=30||mes==7){
            mes=(mes)%12+1;
        } else if(mes==1){
            mes+=2;
            dia=dia%28;
        } else {
            mes+=2;
            dia=dia%30;
        }
    }
}
