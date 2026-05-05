package Cafetera;

public enum TipoCafe {
    EXPRESSO(0,null),
    LATTE(3,TexturaLeche.ESPUMOSA),
    LAGRIMA(2,TexturaLeche.LIQUIDA);
    private int cantLeche;
    private TexturaLeche textura;
    
    private TipoCafe(int cantLeche,TexturaLeche textura){
        this.cantLeche=cantLeche;
        this.textura=textura;
    }

    public int getCantLeche() {
        return cantLeche;
    }

    public TexturaLeche getTextura() {
        return textura;
    }
    
}
