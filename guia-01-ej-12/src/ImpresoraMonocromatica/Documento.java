package ImpresoraMonocromatica;

public class Documento {
    private Fecha fecha;
    private String titulo;
    private String cuerpo;

    public Documento(String titulo, String cuerpo) {
        setTitulo(titulo);
        this.cuerpo = cuerpo;
        this.fecha= new Fecha();
    }
    
    public Fecha getFecha() {
        return fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }
    
    public int cantCaracteres(){
        return fecha.fechaFormatoDdMmAa().length()+titulo.length()+cuerpo.length();
    }

    public void setTitulo(String titulo) {
        if(titulo!=null)
            this.titulo = titulo;
    }
    
    public void agregar(String texto){
        reescribir(cuerpo+texto);
    }
    
    public void reescribir(String texto){
        if(texto!=null)
            this.cuerpo=texto;
    }
}
