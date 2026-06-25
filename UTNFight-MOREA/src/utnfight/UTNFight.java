package utnfight;

import java.util.ArrayList;

public class UTNFight {

    private ArrayList<Jugador> jugadores;

    public UTNFight() {
        jugadores=new ArrayList<Jugador>();
    }
    
    public void agregarJugador(Jugador j){
        jugadores.add(j);
    }
    
    public int cantJugadores(){
        return jugadores.size();
    }

    public String estadisticaJugador(int idx){
        return jugadores.get(idx).getResumenPartidas().toString();
    }
    
    public boolean batallar(int idJugador1, int idJugador2) {
        int idPrimero=Utilitaria.elegirEntre(idJugador1, idJugador2);
        Jugador j1=encontrarJugador(idPrimero);
        Jugador j2=null;
        if(j1!=null){
            j2=encontrarJugador(idPrimero==idJugador1? idJugador2: idJugador1);
            if(j2!=null){
                batallar(j1,j2);
                }
            }
        return j2!=null;
    }
    
    public void batallar(Jugador j1, Jugador j2){
        Jugador aux;
        while(!j1.estaMuerto()&&!j2.estaMuerto()){
            j2.defender(j1.atacar());
            aux=j1;
            j1=j2;
            j2=aux;
        }
        j1.agregarPartida(j2,j1.resultado());
        j2.agregarPartida(j1,j2.resultado());
    }
    
    public Jugador encontrarJugador(int id){
        int i=0;
        boolean encontrado=false;
        while(i<jugadores.size()&&!encontrado){
            if(jugadores.get(i).isID(id))
                encontrado=true;
            i++;
        }
        return i==jugadores.size()?null:jugadores.get(i);
    }
}