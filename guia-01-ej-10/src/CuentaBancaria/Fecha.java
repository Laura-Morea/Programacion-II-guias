package CuentaBancaria;

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

    private void setFecha(int dia, int mes, int anio) {
        if(dia>DIAS_POR_MES[mes-1])
            mes++;
        if(mes>CANT_MESES){
            anio++;
            this.mes=mes%CANT_MESES;
        } else
            this.mes=mes;
        if(dia==DIAS_POR_MES[mes-1])
            this.dia=DIAS_POR_MES[mes-1];
        else{
            this.dia=dia%DIAS_POR_MES[mes-1];
        }
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