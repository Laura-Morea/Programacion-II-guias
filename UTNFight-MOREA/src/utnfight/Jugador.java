package utnfight;

import java.util.ArrayList;

public class Jugador {

    private int ID;
    private static int contadorId;
    private Personaje favorito;
    private ArrayList<Partida> historial;
    public static final int ID_INICIAL=10000;

    public Jugador(Personaje personajeFav) {
        ID=generarID();
        System.out.println(ID);
        favorito=personajeFav;
        historial= new ArrayList <Partida>();
    }

    private int generarID(){
        int idCreado;
        if(contadorId==0){
            contadorId=ID_INICIAL;
            idCreado=contadorId++;
        }        
        else
            idCreado=contadorId++;
        return idCreado;
    }
    
    public void inicializar(){
        favorito.inicializar();
    }
    
    public boolean isID(int id){
        return id==ID;
    }
    
    public void agregarPartida(Jugador oponente, Resultado resultado){
        historial.add(new Partida(oponente, resultado));
    }
    
    public Resultado resultado(){
        Resultado retorno;
        if(estaMuerto()){
            retorno=Resultado.DERROTA;
        } else{
            retorno=Resultado.VICTORIA;
        }
        return retorno;
    }
    
    public Estadistica getResumenPartidas() {
        int victorias=0;
        int derrotas=0;
        for(Partida p: historial){
            if(p.isVictoria())
                victorias++;
            else
                derrotas++;
        }
        return new Estadistica(victorias,derrotas);
    }

    public boolean estaMuerto(){
        return favorito.estaMuerto();
    }
    
    public double atacar(){
        return favorito.ataque();
    }
    
    public void defender(double ataqueEnemigo){
        favorito.defensa(ataqueEnemigo);
    }
}