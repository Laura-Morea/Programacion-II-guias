package utnfight;

public class Guerrero extends Personaje {

    private double fuerza;
    public static final double PORC_INCREMENTO_FUERZA=0.1;
    public static final double PORCENTAJE_DEBILIDAD=0.2;

    public Guerrero(double fuerza, String nombre) {
        super(nombre);
        this.fuerza=Utilitaria.validarMayorACero(fuerza);
    }
    
    @Override
    public double ataque() {
        return super.estaDebil()? fuerza*(1+PORC_INCREMENTO_FUERZA): fuerza;
    }

}