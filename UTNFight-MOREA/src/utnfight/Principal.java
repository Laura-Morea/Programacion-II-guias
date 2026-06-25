package utnfight;

public class Principal {

    public static void main(String[] args) {
        UTNFight arena = new UTNFight();
        arena.agregarJugador(new Jugador(new Guerrero(12.7,"Gerardo")));
        arena.agregarJugador(new Jugador(new Arquero(7,5.5,"Gisela")));
        arena.agregarJugador(new Jugador(new Arquero(24,3.2,"Valentin")));
        arena.agregarJugador(new Jugador(new Guerrero(34,"Alexis")));
        arena.agregarJugador(new Jugador(new Arquero(11,6.6,"Josefina")));
        
        for(int i=0;i<arena.cantJugadores();i++){
            for(int j=i+1;j<arena.cantJugadores();j++){
                System.out.println(arena.batallar(Jugador.ID_INICIAL+i, Jugador.ID_INICIAL+j));
            }
        }
        
        System.out.println("Estadisticas Finales: ");
        for(int k=0;k<arena.cantJugadores();k++){
            System.out.println("Jugador #"+(k+1)+" "+arena.estadisticaJugador(k));
        }
    }

}