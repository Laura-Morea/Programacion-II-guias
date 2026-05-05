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
    
    public void prepararLeche(TipoCafe tipo){
        if(tipo.getCantLeche()>liquido)
            System.out.println("Hay que recargar el modulo de leche. Es insuficiente para este cafe\n");
        else {
            texturaActual=tipo.getTextura();
            liquido-=tipo.getCantLeche();
            System.out.println("El cafe "+ tipo.name() + " se ha servido correctamente\n");
        }
    }
}
