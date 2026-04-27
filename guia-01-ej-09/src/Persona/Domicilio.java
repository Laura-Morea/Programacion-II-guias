package Persona;

import static java.lang.Math.pow;

public class Domicilio {
    private String calle;
    private int altura;
    private String barrio;
    public static final int MAX_DIGITOS_ALTURA=5;

    public Domicilio(String calle, int altura, String barrio) {
        setCalle(calle);
        setAltura(altura);
        setBarrio(barrio);
    }

    private void setCalle(String calle) {
        if(calle!=null&&calle.length()>3)
            this.calle = calle;
    }

    private void setAltura(int altura) {
        if(altura<pow(10,MAX_DIGITOS_ALTURA))
            this.altura = altura;
    }

    private void setBarrio(String barrio) {
        if(barrio!=null&&barrio.length()>3)
            this.barrio = barrio;
    }

    public String getDomicilio(){
        return calle + " " + altura + " - " + barrio;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + '}';
    }
    
}
