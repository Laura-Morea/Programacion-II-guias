package Password;

import java.util.Random;

public class Password {
    private String password;
    public static final int CARACTERES_FUERTE=8;
    public static final int CARACTERES_PARA_NUEVA=6;
    
    public Password(){
        this(CARACTERES_FUERTE);
    }
    
    public Password(int n){
        if(n<CARACTERES_PARA_NUEVA)
            throw new RuntimeException("Una contasenia no puede tener menos de "+ CARACTERES_PARA_NUEVA +" caracteres");
        password=generarAleatorio(n);
    }
    
    public Password(String nueva){
        setValor(nueva);
    }
    
    public boolean esFuerte(){
        return (password.length()>=CARACTERES_FUERTE);
    }
    
    private void setValor(String nuevaPassword){
        if(nuevaPassword==null||nuevaPassword.length()<CARACTERES_PARA_NUEVA){
            throw new RuntimeException("No se pudo hacer el cambio de contrasenia. Debe ser mayor o igual a "+ CARACTERES_PARA_NUEVA +" caracteres");
        }
        password=nuevaPassword;
    }
    
    private String generarAleatorio(int n){
        final int MIN_ASCII_IMPR=32;
        final int MAX_ASCII_IMPR=126;
        Random r= new Random();
        char[] retorno = new char[n];
        for(int i=0;i<n;i++){
            retorno[i]=(char)r.nextInt(MIN_ASCII_IMPR,MAX_ASCII_IMPR+1); 
        }
        return String.valueOf(retorno);
    }

    @Override
    public String toString() {
        return "Password{" + "password=" + password + '}';
    }
    
}
