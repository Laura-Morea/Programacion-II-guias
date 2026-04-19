package CuentaBancaria;

public class CuentaBancaria {
    private String CBU;
    private Tipo tipo;
    private double saldo;

    public enum Tipo {
        CAJA_DE_AHORRO,
        CUENTA_CORRIENTE;
        
        private Tipo() {
        }
    }

    public CuentaBancaria(String CBU, Tipo tipo) {
        this.CBU = CBU;
        this.tipo = tipo;
        this.saldo = 0;
    }

    public String getCBU() {
        return CBU;
    }

    public Tipo getTipo() {
        return tipo;
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
        return "CuentaBancaria{" + "CBU=" + CBU + ", tipo=" + tipo + ", saldo=" + saldo + '}';
    }
    
}
