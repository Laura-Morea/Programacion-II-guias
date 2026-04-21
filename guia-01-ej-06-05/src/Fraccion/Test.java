
package Fraccion;

/*Refactoreá las clases con los siguientes cambios: 
▪ Agregar un constructor que inicialice todos sus atributos por parámetro. 
▪ Establecer sus atributos como privados y colocar los getters/setters que correspondan. 
▪ Implementar el método toString() y comprobar su funcionamiento. 
 */
public class Test {
    public static void main(String[] args) {

        // Prueba de constructor y simplificacion automatica (6/9 deberia ser 2/3)
        Fraccion f1 = new Fraccion(6, 9);
        System.out.print("Fraccion 1 (creada como 6/9): ");
        f1.mostrarFraccion();
        System.out.println("Valor decimal: " + f1.getDecimal());
        System.out.println("Tipo: " + f1.tipoFraccion());

        System.out.println("------------------------------------");

        // Prueba de fraccion impropia
        Fraccion f2 = new Fraccion(5, 2);
        System.out.print("Fraccion 2: ");
        f2.mostrarFraccion();
        System.out.println("Tipo: " + f2.tipoFraccion());

        System.out.println("------------------------------------");

        // Prueba de fraccion aparente (12/4 deberia simplificarse a 3/1)
        Fraccion f3 = new Fraccion(12, 4);
        System.out.print("Fraccion 3 (creada como 12/4): ");
        f3.mostrarFraccion();
        System.out.println("Tipo: " + f3.tipoFraccion());

        System.out.println("------------------------------------");

        // Prueba de suma de fracciones (2/3 + 5/2)
        // El calculo seria (2*2 + 5*3) / (3*2) = 19/6
        System.out.println("Sumando fraccion 2 a fraccion 1...");
        f1.sumarFraccion(f2);
        System.out.print("Resultado de la suma: ");
        f1.mostrarFraccion();

        System.out.println("------------------------------------");

        // Prueba de sumar un entero (19/6 + 1 = 25/6)
        System.out.println("Sumando un entero al resultado anterior...");
        f1.sumarUnEntero();
        System.out.print("Resultado final: ");
        f1.mostrarFraccion();
        
        System.out.println("------------------------------------");

        // Prueba de denominador cero (el sistema deberia setearlo en 1)
        Fraccion f4 = new Fraccion(5, 0);
        System.out.print("Fraccion 4 (creada con denominador 0): ");
        f4.mostrarFraccion();
    }
    
}
