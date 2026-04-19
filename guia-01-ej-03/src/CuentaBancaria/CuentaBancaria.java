package CuentaBancaria;

public class CuentaBancaria {
    private String CBU="27141513538";
    private Tipo tipo=Tipo.CUENTA_CORRIENTE;
    private double saldo;

    public enum Tipo {
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
