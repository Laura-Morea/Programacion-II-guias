package ImpresoraMonocromatica;

/* Desarrollar la clase ImpresoraMonocromatica. Sus atributos serán si 
está o no encendida, la cantidad de hojas actualmente en su bandeja y el 
nivel de tinta negra. Inicialmente, toda impresora está apagada, sin hojas y 
con nivel de tinta en 100. 
Debe responder a los siguientes métodos: 
▪ int nivelSegunCantCaracteres(int) {…} 
Devuelve cuánta cantidad de tinta debería usarse según la cantidad de caracteres recibida 
por parámetro. 
▪ void recargarBandeja(int) {…} 
Suma a la bandeja una cantidad de hojas. El máximo de la bandeja es de 35 hojas. Se debe 
verificar no excederse de tal valor. Si el parámetro es negativo, la bandeja se deja como está. 
▪ void imprimir(Documento) {…} 
Imprime en consola la fecha del documento, junto a su título y cuerpo, en el siguiente 
formato: 
Fecha            **Titulo** 
Cuerpo 
Al hacerlo, se descuenta 1 punto de nivel de tinta por cada 50 caracteres del cuerpo impresos 
y se resta 1 hoja de la cantidad en bandeja por cada 20 caracteres del cuerpo impreso. Se 
debe verificar antes de imprimir que se cuente con nivel de tinta y cantidad de hojas 
suficientes.
 */
public class Test {

    public static void main(String[] args) {
        ImpresoraMonocromatica i1= new ImpresoraMonocromatica();
        Documento d1= new Documento("Programacion II","Estamos aprendiendo sobre programacion con el paradigma de "
                + "programacion orientada a objetos, utilizando el lenguaje de Java");
        System.out.println("Imprimir con la maquina apagada");
        i1.imprimirDocumento(d1);
        System.out.println("\n\nEncendiendo y probando nuevamente");
        i1.encender();
        i1.imprimirDocumento(d1);
        System.out.println("\n\nAgregamos 3 hojas");
        i1.recargarBandeja(5);
        i1.imprimirDocumento(d1);
        System.out.println("\n\nAgregamos texto al documento y volvemos a imprimir");
        d1.agregar("\nCursamos todos los martes en el Instituto Superior del Profesorado Tecnico de 13 a 17:20hs");
        i1.imprimirDocumento(d1);
        System.out.println("\n\nSaturamos la bandeja de hojas e intentamos imprimir");
        i1.recargarBandeja(50);
        i1.imprimirDocumento(d1);
    }
    
}
