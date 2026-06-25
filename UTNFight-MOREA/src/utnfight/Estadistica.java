package utnfight;

public class Estadistica {

    private int cantVictorias;
    private int cantDerrotas;

    public Estadistica(int victorias, int derrotas) {
        cantVictorias=victorias;
        cantDerrotas=derrotas;
    }

    @Override
    public String toString() {
        return "Estadistica{" + "cantVictorias=" + cantVictorias + ", cantDerrotas=" + cantDerrotas + '}';
    }

}