package Posnet;

import java.util.Random;

public class TarjetaCredito {
    private EntidadFinanciera entidadFinanciera;
    private String entidadBancaria;
    private String numeroTarjeta;
    private double saldoDisponible;
    private Persona titular;
    public static final int MAYORIA_EDAD=18;
    public static final int DIGITOS_TARJETA=6;

    public TarjetaCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, double saldoDisponible, Persona titular) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        setNumeroTarjeta();
        this.saldoDisponible = saldoDisponible;
        this.titular=titular;
    }
    
    public TarjetaCredito(EntidadFinanciera entidadFinanciera, String entidadBancaria, double saldoDisponible, String nombre, String apellido,int dia, int mes, int anio, String calle, int altura, String barrio) {
        this.entidadFinanciera = entidadFinanciera;
        this.entidadBancaria = entidadBancaria;
        setNumeroTarjeta();
        this.saldoDisponible = saldoDisponible;
        this.titular= new Persona(nombre,apellido, new Fecha(dia,mes,anio), new Domicilio(calle,altura,barrio));
    }
    
    public String getNombreCompletoTitular(){
        return titular.getNombreCompleto();
    }
    
    private void setNumeroTarjeta(){
        String numero="";
        Random r = new Random();
        for(int i=0;i<DIGITOS_TARJETA;i++){
            numero+=(char)r.nextInt(48,58);
        }
        this.numeroTarjeta=numero;
    }
    
    public boolean saldoSuficiente(double monto){
        return monto<=saldoDisponible;
    }
}
