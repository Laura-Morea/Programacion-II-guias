package ImpresoraMonocromatica;

public class ImpresoraMonocromatica {
    private boolean encendida;
    private BandejaHojas bandeja;
    private CartuchoTinta cartucho;

    public ImpresoraMonocromatica() {
        this.encendida=false;
        this.bandeja= new BandejaHojas();
        this.cartucho= new CartuchoTinta();
    }
    
    public void encender(){
        this.encendida=true;
    }
    
    public void apagar(){
        this.encendida=false;
    }
    
    public void recargarBandeja(int cant){
        bandeja.recargarBandeja(cant);
    }
    
    public void recargarTinta(int cant){
        cartucho.recargarTinta(cant);
    }
    
    public void imprimirDocumento(Documento doc){
        if(encendida){
            if(cartucho.tintaSuficiente(doc.cantCaracteres())&&bandeja.hojasSuficientes(doc.cantCaracteres())){
                System.out.println(doc);
                cartucho.reducirTinta(doc.cantCaracteres());
                bandeja.reducirHojas(doc.cantCaracteres());
            } else{
                if(!cartucho.tintaSuficiente(doc.cantCaracteres())){
                    System.out.println("Hay que recargar la tinta");
                } else
                    System.out.println("No hay suficientes hojas en la bandeja");
            }
        }
    }
}
