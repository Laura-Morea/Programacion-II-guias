package ImpresoraMonocromatica;

public class CartuchoTinta {
    private int nivelTinta;
    public static final int NIVEL_MAXIMO_TINTA=100;
    public static final int CANT_CHAR_TINTA=50;
    
    public CartuchoTinta(){
        this.nivelTinta=NIVEL_MAXIMO_TINTA;
    }
    
    private static int nivelSegunCantCaracteres(int cant){
        return (int)Math.ceil((double)cant/CANT_CHAR_TINTA);
    }
    
    public boolean tintaSuficiente(int cant){
        return nivelTinta-nivelSegunCantCaracteres(cant)>=0;
    }
    
    public void reducirTinta(int cant){
        this.nivelTinta -= nivelSegunCantCaracteres(cant);
    }
    
    public void recargarTinta(int cant){
        if(cant>0){
            if(cant<NIVEL_MAXIMO_TINTA-nivelTinta){
                this.nivelTinta+=cant;
            } else{
                this.nivelTinta=NIVEL_MAXIMO_TINTA;
            }
        }
    }
}
