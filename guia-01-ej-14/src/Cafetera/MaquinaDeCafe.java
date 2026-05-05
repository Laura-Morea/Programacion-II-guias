package Cafetera;

public class MaquinaDeCafe {
    private String marca;
    private boolean encendida;
    private ModuloAgua moduloAgua;
    private ModuloLeche moduloLeche;

    public MaquinaDeCafe(String marca) {
        this.marca = marca;
        encendida=false;
        moduloAgua= new ModuloAgua();
        moduloLeche= new ModuloLeche();
    }    
    
    public void encender(){
        encendida=true;
    }
    
    public void apagar(){
        encendida=false;
    }
    
    public void servirCafe(TipoCafe tipo){
        if(encendida){
            if(moduloAgua.preparado()){
                if(moduloLeche.preparado(tipo)){
                    moduloLeche.prepararLeche(tipo);
                    System.out.println("El cafe "+ tipo.name() + " se ha servido correctamente\n");
                }
            }
        } else
            System.out.println("La maquina esta apagada\n");
    }
    
    public void recargarLeche(int nivel){
        if(nivel>0)
            moduloLeche.recargarLeche(nivel);
    }
    
    public void calentarAgua(){
        moduloAgua.calentarAgua();
    }
}
