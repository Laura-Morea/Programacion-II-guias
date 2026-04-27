package Fraccion;

public class Fraccion {
    private int numerador;
    private int denominador;
    
    public enum Tipo{
        PROPIA,
        IMPROPIA,
        APARENTE;
    }
    
    public Fraccion(int numerador,int denominador){
        setNumerador(numerador);
        setDenominador(denominador);
        simplificarFraccion();
    }

    private void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    private void setDenominador(int denominador) {
        if(denominador!=0)
            this.denominador = denominador;
        else
            throw new RuntimeException("No se puede dividir por cero");
    }   

    public void mostrarFraccion(){
        System.out.println(numerador+"/"+denominador);
    }
    
    public double getDecimal(){
        return (double)numerador/denominador;
    }
    
    public void sumarUnEntero(){
        Fraccion e1 = new Fraccion(1,1);
        sumarFraccion(e1);
    }
    
    public void sumarFraccion(Fraccion f){
        this.numerador=f.numerador*this.denominador+this.numerador*f.denominador;
        this.denominador*=f.denominador;
        simplificarFraccion();
    }
    
    public void simplificarFraccion(){
        int mcd=mcd();
        this.numerador/=mcd;
        this.denominador/=mcd;
    }
    
    public int mcd(){
        int mcd, dividendo, divisor, aux;
        if(tipoFraccion()==Tipo.PROPIA){
            mcd=numerador;
            dividendo=denominador;
            divisor=numerador;
            while(dividendo%divisor!=0){
                aux=dividendo;
                dividendo=divisor;
                divisor=aux%divisor;
                mcd=divisor;
            }
        } else{
            mcd=denominador;
            dividendo=numerador;
            divisor=denominador;
            while(dividendo%divisor!=0){
                aux=dividendo;
                dividendo=divisor;
                divisor=aux%divisor;
                mcd=divisor;
            }
        }
        return mcd;
    }
    
    public Tipo tipoFraccion(){
        Tipo retorno;
        if(numerador<denominador)
            retorno=Tipo.PROPIA;
        else if(denominador==1){
            retorno=Tipo.APARENTE;
        } else
            retorno=Tipo.IMPROPIA;
        return retorno;
    }
}
