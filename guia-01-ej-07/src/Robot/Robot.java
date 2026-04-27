package Robot;

public class Robot {
    private String nombre;
    
    public Robot(String nombre){
        this.nombre=nombre;
    }
    
    public void saludar(){
        System.out.println("Hola, mi nombre es "+ nombre +". En que puedo ayudarte?");
    }
    
    public void saludar(Persona p){
        System.out.println("Hola "+ p.getNombre() +", mi nombre es "+ nombre +". En que puedo ayudarte?");
    }
}
