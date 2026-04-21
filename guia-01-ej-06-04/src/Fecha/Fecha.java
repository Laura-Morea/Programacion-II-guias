package Fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public static final int DIA_MAXIMO_MES=31;
    public static final int DIA_MESES_30=30;
    public static final int DIAS_FEBRERO=28;
    public static final int CANT_MESES=12;

    public Fecha(int dia, int mes, int anio) {
        setFecha(dia,mes,anio);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

// La fecha es invalida porque me paso y por eso no lo setea, tengo que fijarme como hacerla válida.
    public void setFecha(int dia, int mes, int anio) {
        if(mes==2){
            if(dia==DIAS_FEBRERO)
                this.dia=DIAS_FEBRERO;
            else
                this.dia = dia%(DIAS_FEBRERO);
        } else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
            if(dia==DIA_MAXIMO_MES)
                this.dia=DIA_MAXIMO_MES;
            else 
                this.dia = dia%(DIA_MAXIMO_MES);
        } else{
            if(dia==DIA_MESES_30)
                this.dia=DIA_MESES_30;
            else
                this.dia = dia%(DIA_MESES_30);
        }
        if(mes==CANT_MESES)
            this.mes=CANT_MESES;
            else
            this.mes = (mes)%CANT_MESES;
        this.anio = anio; 
   } //necesito en cierta forma encadenar dias y meses
 
    public String fechaFormatoDdMmAa(){
        return dia+"/"+mes+"/"+anio%100;
    }
    
    public boolean esNavidad(){
        return dia==25&&mes==12;
    }
    
    public void sumarUnMes(){
        setFecha(dia,(mes+1),anio);
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
