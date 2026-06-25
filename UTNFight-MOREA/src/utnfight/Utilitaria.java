package utnfight;

import java.util.Random;

public class Utilitaria {

    private Utilitaria() {
    }

    public static double generarAleatorioEntre0y1() {
        return Math.random();
    }

    public static int elegirEntre(int int1, int int2) {
        Random r= new Random();
        return r.nextBoolean()==true? int1: int2;
    }
    
    public static String validarCadena(String cadena){
        String retorno="";
        if(cadena!=null&&cadena.length()>2)
            retorno=cadena;
        return retorno;
    }

    public static double validarMayorACero(double n){
        if(n<=0)
            throw new RuntimeException("El valor " + n + " deberia haber sido mayor a cero");
        else
            return n;
    }
}