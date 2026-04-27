package Password;

/*Desarrollá la clase Password, que permita tener contraseñas como objetos. Su único atributo 
será el valor de la password (String). Debe responder a los siguientes métodos: 
▪ boolean esFuerte() {…} 
Devuelve si la password es fuerte o no. Una password es fuerte cuando tenga al menos 8 
caracteres. 
▪ boolean nuevoValor(String) {…} 
Establece como nuevo valor de password el recibido como parámetro, siempre y cuando su 
longitud sea mayor o igual a 6, si no, lo deja como estaba. Devuelve si se pudo o no establecer 
el valor. 
▪ String generarAleatorio(int) {…} 
Devuelve una cadena que representa un valor de password aleatorio cuya longitud coincida 
con el parámetro recibido. Si el parámetro es menor que 6, devuelve null. 
Además, deben poder crearse passwords con o sin valor inicial, por ello es que la clase contará con 
un constructor sobrecargado: 
▪ Password(String) {…} 
Crea un password cuyo valor viene dado por parámetro. 
▪ Password() {…} 
Crea un password cuyo valor se crea automáticamente. 
 */
public class Test {

    public static void main(String[] args) {
        Password p1= new Password();
        Password p2= new Password(9);
        Password p3= new Password("qwerty");
        
        //Password pFallida= new Password("as");
        
        Password[] pruebas = {p1,p2,p3};
        
        for (int i = 0; i < pruebas.length; i++) {
            System.out.println(pruebas[i]);
            System.out.println(pruebas[i].esFuerte());
            System.out.println("-----");
        }
        
        /*
        // Test 1: Constructor por defecto (genera password de 8 caracteres)
        System.out.println("--- Test 1: Constructor por defecto ---");
        Password p1 = new Password();
        System.out.println("Es fuerte p1? " + p1.esFuerte());

        System.out.println("------------------------------------");

        // Test 2: Constructor con tamanio especifico (12 caracteres)
        System.out.println("--- Test 2: Password de 12 caracteres ---");
        Password p2 = new Password(12);
        System.out.println("Es fuerte p2? " + p2.esFuerte());

        System.out.println("------------------------------------");

        // Test 3: Constructor con String (valida si es mayor a 6)
        System.out.println("--- Test 3: Constructor con String 'abc' (invalido) ---");
        Password p3 = new Password("abc");
        
        System.out.println("--- Test 3b: Constructor con String '1234567' (valido pero debil) ---");
        Password p4 = new Password("1234567");
        System.out.println("Es fuerte p4? " + p4.esFuerte());

        System.out.println("------------------------------------");

        System.out.println("------------------------------------");

        // Test 4: Intentar generar una password muy corta
        System.out.println("--- Test 4: Password de 4 caracteres ---");
        Password p5 = new Password(4);*/
    }
   
}
