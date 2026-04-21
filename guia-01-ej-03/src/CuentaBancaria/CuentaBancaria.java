package CuentaBancaria;

public class CuentaBancaria {
    String CBU;
    Tipo tipo=Tipo.CUENTA_CORRIENTE;
    double saldo;

    enum Tipo {
        CAJA_DE_AHORRO,
        CUENTA_CORRIENTE;
        
        private Tipo() {
        }
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
}
