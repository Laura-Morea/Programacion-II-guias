package Fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public static final int DIA_MAXIMO_MES=31;
    public static final int DIA_MESES_30=30;
    public static final int DIAS_FEBRERO=28;

    public Fecha(int dia, int mes, int anio) {
        setFecha(dia,mes,anio);
    }

    public int getDia() {
        return dia;
    }

    public boolean isFechaValida(int dia, int mes, int anio){   
        return ((dia>0&&mes>0&&mes<=12)&&((dia<=DIAS_FEBRERO)||(mes!=2&&dia<=DIA_MESES_30)||(dia==DIA_MAXIMO_MES&&(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12))));
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

// La fecha es invalida porque me paso y por eso no lo setea, tengo que fijarme como hacerla válida.
    public void setFecha(int dia, int mes, int anio) {
        int nuevoDia,nuevoMes,nuevoAnio;
        if(mes==2){
                nuevoDia = (dia-1)%DIAS_FEBRERO+1;
            } else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
                nuevoDia = (dia-1)%(DIA_MAXIMO_MES)+1;
            } else{
                nuevoDia = (dia-1)%DIA_MESES_30+1;
            }
            nuevoMes = (mes-1)%12+1;
            nuevoAnio = anio; 
        }
        if(isFechaValida(nuevoDia,nuevoMes,nuevoAnio)){
            
        }
    }
 
    public String fechaFormatoDdMmAa(){
        return dia+"/"+mes+"/"+anio%100;
    }
    
    public boolean esNavidad(){
        return dia==25&&mes==12;
    }
    
    public void sumarUnMes(){
        if(mes!=12){
            setFecha(dia,(mes+1),anio);
        } else{
            setFecha(dia,1,anio+1);
        }

    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
