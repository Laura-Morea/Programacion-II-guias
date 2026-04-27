package CuentaBancaria;

import java.time.LocalDate;
import java.util.Random;

public class CuentaBancaria {
    private String CBU;
    private Tipo tipo;
    private double saldo;
    private Persona titular;
    private Fecha fechaDeApertura;
    public static final int CANT_DIGITOS_CBU=22;
    public static final int MAYORIA_EDAD=18;

    public enum Tipo {
        CAJA_DE_AHORRO,
        CUENTA_CORRIENTE;
 
        private Tipo() {
        }
    }

    public CuentaBancaria(Tipo tipo, Persona titular) {
        if(titular.esMayorQue(MAYORIA_EDAD)){
            this.CBU=generarCBU();
            this.tipo = tipo;
            this.saldo = 0;
            this.titular=titular;
            this.fechaDeApertura= new Fecha(LocalDate.now().getDayOfMonth(),LocalDate.now().getMonthValue(), LocalDate.now().getYear());
        } else {
            throw new RuntimeException("El titular de la cuenta debe ser mayor de "+ MAYORIA_EDAD +" anios.");
        }
    }
    
    private String generarCBU(){
        Random r= new Random();
        char[] vector= new char[CANT_DIGITOS_CBU];
        for(int i=0;i<CANT_DIGITOS_CBU;i++){
            vector[i]=(char)r.nextInt('0','9'+1);
        }
        return String.valueOf(vector);
    }

    public String getCBU() {
        return CBU;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Persona getTitular() {
        return titular;
    }

    public Fecha getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double obtenerSaldoActual() {
        return saldo;
    }
    
    public void depositarDinero(double x){
        if(x>0)
            saldo+=x;
    }
    
    public void extraerDinero(double x){
        if(x>0&&(tipo==Tipo.CUENTA_CORRIENTE||saldo-x>=0))
            saldo-=x;
    }
    
    public String getUltimos3CBU(){
        return CBU.substring(CBU.length()-3);
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + ", fechaDeApertura=" + fechaDeApertura + '}';
    }
    
}
