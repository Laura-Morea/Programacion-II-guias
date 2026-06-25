package utnfight;

public class Arquero extends Personaje {

    private int cantFlechas;
    private double potenciaArco;

    public Arquero(int flechas, double potenciaArco, String nombre) {
        super(nombre);
        this.cantFlechas=(int)Utilitaria.validarMayorACero(flechas);
        this.potenciaArco=Utilitaria.validarMayorACero(potenciaArco);
    }

    @Override
    public double ataque() {
        double danio=0.0;
        if(cantFlechas>0){
            danio=potenciaArco;
            cantFlechas--;
        }
        return danio;
    }

}