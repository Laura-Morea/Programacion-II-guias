package utnfight;

public abstract class Personaje {

    private String nombre;
    private int puntosDeVida;
    public static final int VIDA_INICIAL = 100;

    public Personaje(String nombre) {
        this.nombre=Utilitaria.validarCadena(nombre);
        puntosDeVida=VIDA_INICIAL;
    }
    
    public void inicializar(){
        puntosDeVida=VIDA_INICIAL;
    }

    public abstract double ataque();

    public void defensa(double ataqueEnemigo) {
        double esquivar=Utilitaria.generarAleatorioEntre0y1();
        double danio;
        danio=ataqueEnemigo*esquivar;
        if(puntosDeVida-danio<0)
            puntosDeVida=0;
        else
            puntosDeVida-=danio;
    }
    
    public boolean estaMuerto(){
        return puntosDeVida==0;
    }
    
    public boolean estaDebil(){
        return puntosDeVida<=(VIDA_INICIAL*Guerrero.PORCENTAJE_DEBILIDAD);
    }
}