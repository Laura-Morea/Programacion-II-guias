package utnfight;

public class Partida {

    private Jugador oponente;
    private Resultado resultado;
    
    public Partida(Jugador oponente, Resultado resultado){
        this.oponente=oponente;
        this.resultado=resultado;
    }
    
    public boolean isVictoria() {
        return resultado.equals(Resultado.VICTORIA);
    }

}