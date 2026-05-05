package Cafetera;

public class ModuloLeche {
    private int liquido;
    private TexturaLeche texturaActual;
    public static final int MIN_CANT_LECHE=0;
    public static final int MAX_CANT_LECHE=5;

    public ModuloLeche() {
        liquido=MIN_CANT_LECHE;
        texturaActual=TexturaLeche.LIQUIDA;
    }
    
    public void recargarLeche(int nivel){
        if(liquido+nivel<MAX_CANT_LECHE)
            liquido+=nivel;
        else
            liquido=MAX_CANT_LECHE;
    }
    
    public boolean preparado(TipoCafe tipo){
        boolean ret=false;
        if(tipo.getCantLeche()>liquido)
            System.out.println("Hay que recargar el modulo de leche. Es insuficiente para este cafe\n");
        else
            ret=true;
        return ret;
    }
    
    public void prepararLeche(TipoCafe tipo){
        texturaActual=tipo.getTextura();
        liquido-=tipo.getCantLeche();
    }
}
