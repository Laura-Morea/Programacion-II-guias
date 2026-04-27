package ImpresoraMonocromatica;

public class ImpresoraMonocromatica {
    private boolean encendida;
    private int cantHojas;
    private int nivelTinta;
    public static final int NIVEL_MAXIMO_TINTA=100;
    public static final int MAX_HOJAS=35;
    public static final int CANT_CHAR_TINTA=50;
    public static final int CANT_CHAR_HOJAS=20;

    public ImpresoraMonocromatica() {
        this.encendida=false;
        this.cantHojas=0;
        this.nivelTinta=NIVEL_MAXIMO_TINTA;
    }
    
    public void encender(){
        this.encendida=true;
    }
    
    public void apagar(){
        this.encendida=false;
    }
    
    public int nivelSegunCantCaracteres(int cant){
        return cant%CANT_CHAR_TINTA;
    }
    
    public void recargarBandeja(int cant){
        if(cant>0){
            if(cant+this.cantHojas>=MAX_HOJAS)
                this.cantHojas=MAX_HOJAS;
            else
                this.cantHojas+=cant;
        }
    }
    
    public void imprimirDocumento(Documento doc){
        if(encendida){
            if(nivelTinta-nivelSegunCantCaracteres(doc.cantCaracteres())>=0&&cantHojas-doc.cantCaracteres()%CANT_CHAR_HOJAS>=0){
                System.out.println(doc.getFecha().fechaFormatoDdMmAa() + "\t\t**" + doc.getTitulo() + "**");
                System.out.println(doc.getCuerpo());
                this.nivelTinta-=nivelSegunCantCaracteres(doc.cantCaracteres());
                this.cantHojas-=doc.cantCaracteres()%CANT_CHAR_HOJAS;
            } else{
                if(nivelTinta-nivelSegunCantCaracteres(doc.cantCaracteres())<0){
                    System.out.println("Hay que recargar la tinta");
                } else
                    System.out.println("No hay suficientes hojas en la bandeja");
            }
        }
    }
}
