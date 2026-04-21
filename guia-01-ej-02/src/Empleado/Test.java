package Empleado;

/*Desarrollar la clase Empleado, cuyos atributos sean su DNI, nombre, apellido, salario base, 
estado civil (soltero, casado, divorciado o viudo) y cantidad de hijos. 
Se sabe que todos los empleados cobran el salario base más un plus del 3% de éste por cada hijo, con 
un tope de hasta 10%. Del salario resultante debe descontarse un 4% en caso de que el estado civil 
sea soltero. */

public class Test {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        System.out.println("Su salario final es de $" + e1.obtenerSalarioFinal());
    }
    
}
