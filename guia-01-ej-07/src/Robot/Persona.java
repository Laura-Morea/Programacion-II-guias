package Robot;

import static java.lang.Math.pow;

public class Persona {
    private String nombre;
    private int telefono;
    public static final int MIN_DIGITOS_TELEFONO=8;
    
    public Persona(String nombre, int telefono){
        setNombre(nombre);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        if(nombre!=null&&nombre.length()>=3)
            this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        if(telefono>pow(10,MIN_DIGITOS_TELEFONO))
            this.telefono = telefono;
    }
    
}
