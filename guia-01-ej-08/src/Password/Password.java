package Password;

import java.util.Random;

public class Password {
    private String password;
    public static final int CARACTERES_FUERTE=8;
    public static final int CARACTERES_PARA_NUEVA=6;
    
    public Password(){
        password=generarAleatorio(CARACTERES_FUERTE);
    }
    
    public Password(int n){
        password=generarAleatorio(n);
    }
    
    public Password(String nueva){
        nuevoValor(nueva);
    }
    
    public boolean esFuerte(){
        return (password.length()>=CARACTERES_FUERTE);
    }
    
    public boolean nuevoValor(String nuevaPassword){
        if(nuevaPassword!=null&&nuevaPassword.length()>=CARACTERES_PARA_NUEVA){
            password=nuevaPassword;
            System.out.println("Contrasenia cambiada exitosamente");
        } else{
            System.out.println("No se pudo hacer el cambio de contrasenia. Debe ser mayor o igual a 6 caracteres");
        }
        return password==nuevaPassword;
    }
    
    private String generarAleatorio(int n){
        Random r= new Random();
        char[] retorno = new char[n];
        if(n<CARACTERES_PARA_NUEVA){
            retorno=null;
            throw new RuntimeException("No puede haber una password de menos de 6 caracteres");
        }
        else {
            for(int i=0;i<n;i++){
                retorno[i]=(char)r.nextInt(32,127);
            }
        }    
        return String.valueOf(retorno);
    }
}
