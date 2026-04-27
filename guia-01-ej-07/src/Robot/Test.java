package Robot;

/* Se precisa un robot (que tiene nombre) que permita atender llamadas telefónicas. La compañía 
puede detectar algunos clientes según su número de teléfono, sin embargo, en otros casos no. Por 
ello, el robot debe ser capaz de procesar alguno de los siguientes métodos homónimos: 
▪ saludar(): void 
Emite por consola un saludo diciendo: "Hola, mi nombre es ___. ¿En qué puedo 
ayudarte?".2 
▪ saludar(Persona): void 
Emite por consola un saludo diciendo: "Hola ___, mi nombre es ___. ¿En qué puedo 
ayudarte?".3 
Modelá la clase Robot en Java. Luego, invocá varias veces el método saludar a través del método 
main de la clase Principal con diferentes variantes para ver si saluda como corresponde.4 
 */
public class Test {
    public static void main(String[] args) {
        Persona p1= new Persona("Laura",45454017);
        Persona p2= new Persona("Gustavo",1169674852);
        Robot r= new Robot("Benito");
        Robot r2 = new Robot("Raul");
        
        r.saludar();
        r.saludar(p1);
        r2.saludar(p2);
    }
    
}
