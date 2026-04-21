package Fraccion;

/*Modelá la clase Fraccion, la cual posea como atributos numerador y denominador. Luego, 
implementá métodos que permitan: 
▪ Mostrarse en consola, con el formato "numerador/denominador". 
▪ Obtener el valor decimal. 
▪ Sumarle un entero. 
▪ Sumarle una fracción. 
▪ Simplificar la fracción. 
▪ Saber si la fracción es propia, impropia u aparente.1 
Finalmente, instanciá una fracción en el método main y probá todos sus métodos. 
 */
public class Test {

    public static void main(String[] args) {
        // Creacion de la primera fraccion: 1/2
        Fraccion f1 = new Fraccion();
        f1.numerador = 1;
        f1.denominador = 2;

        System.out.print("Fraccion 1: ");
        f1.mostrarFraccion();
        System.out.println("Valor decimal: " + f1.getDecimal());
        System.out.println("Tipo inicial: " + f1.tipoFraccion());

        System.out.println("------------------------------------");

        // Creacion de la segunda fraccion: 3/4
        Fraccion f2 = new Fraccion();
        f2.numerador = 3;
        f2.denominador = 4;

        System.out.print("Fraccion 2: ");
        f2.mostrarFraccion();

        System.out.println("------------------------------------");

        // Prueba del metodo sumarFraccion (1/2 + 3/4 = 5/4)
        System.out.println("Sumando fraccion 2 a fraccion 1...");
        f1.sumarFraccion(f2);
        System.out.print("Resultado de la suma: ");
        f1.mostrarFraccion();
        System.out.println("Nuevo tipo: " + f1.tipoFraccion());

        System.out.println("------------------------------------");

        // Prueba del metodo sumarUnEntero (5/4 + 1 = 9/4)
        System.out.println("Sumando un entero al resultado...");
        f1.sumarUnEntero();
        System.out.print("Resultado final: ");
        f1.mostrarFraccion();
        
        System.out.println("------------------------------------");

        // Prueba de una fraccion aparente
        Fraccion f3 = new Fraccion();
        f3.numerador = 8;
        f3.denominador = 4;
        System.out.print("Fraccion 3: ");
        f3.mostrarFraccion();
        System.out.println("Tipo de fraccion 3: " + f3.tipoFraccion());
    }
}
    
