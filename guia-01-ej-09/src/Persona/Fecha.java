package Persona;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    public static final int[] DIAS_POR_MES={31,28,31,30,31,30,31,31,30,31,30,31};
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


    public void setFecha(int dia, int mes, int anio) {
        while (dia>DIAS_POR_MES[(mes-1)%CANT_MESES]||mes>CANT_MESES) {            
            if(dia>DIAS_POR_MES[(mes-1)%CANT_MESES]){
                dia=dia%DIAS_POR_MES[(mes-1)%CANT_MESES];
                mes++;
            }                
            if(mes>CANT_MESES){
                anio++;
                mes=mes%CANT_MESES;
            }
            if(dia==DIAS_POR_MES[mes-1])
                dia=DIAS_POR_MES[mes-1];
            else{
                dia=dia%DIAS_POR_MES[mes-1];
            }
        }
        this.dia=dia;
        this.mes=mes;
        this.anio = anio; 
   }
 
    public String fechaFormatoDdMmAa(){
        return dia+"/"+mes+"/"+anio%100;
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}