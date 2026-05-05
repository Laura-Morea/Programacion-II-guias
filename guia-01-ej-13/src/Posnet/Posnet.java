package Posnet;

public class Posnet {
    public static final int MAX_CUOTAS=6;
    public static final int MIN_CUOTAS=1;
    public static final double PORC_RECARGO_CUOTAS=0.03;
    
    public String efectuarPago(TarjetaCredito tarjeta,double monto, int cantCuotas){
        double pagar=recargarMonto(monto,cantCuotas);
        return "Nombre y apellido cliente: "+ tarjeta.getNombreCompletoTitular()+"\nMonto total a pagar: $"+ pagar + "Monto de cada cuota: $"+ montoPorCuota(pagar,cantCuotas);
    }//chequear el caso de null
    
    private double recargarMonto(double monto, int cantCuotas){
        return monto+(cantCuotas-MIN_CUOTAS)*PORC_RECARGO_CUOTAS;
    }
    
    private double montoPorCuota(double montoRecargado, int cantCuotas){
        return montoRecargado/cantCuotas;
    }
}
