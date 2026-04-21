package Empleado;

/*Desarrollar la clase Empleado, cuyos atributos sean su DNI, nombre, apellido, salario base, 
estado civil (soltero, casado, divorciado o viudo) y cantidad de hijos. 
Se sabe que todos los empleados cobran el salario base más un plus del 3% de éste por cada hijo, con 
un tope de hasta 10%. Del salario resultante debe descontarse un 4% en caso de que el estado civil 
sea soltero. */

public class Test {

    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();
        Empleado e3 = new Empleado();
        e1.nombre="Laura";
        e1.salarioBase=200000;
        e1.cantHijos=0;
        e1.estadoCivil=e1.estadoCivil.SOLTERO;
        e2.nombre="Marcela";
        e2.salarioBase=300000;
        e2.cantHijos=2;
        e2.estadoCivil=e1.estadoCivil.VIUDO;
        e3.nombre="Jose";
        e3.salarioBase=500000;
        e3.cantHijos=5;
        e3.estadoCivil=e1.estadoCivil.SOLTERO;
        System.out.println("El salario final de "+ e1.nombre +" es de $" + e1.obtenerSalarioFinal());
        System.out.println("El salario final de "+ e2.nombre +" es de $" + e2.obtenerSalarioFinal());
        System.out.println("El salario final de "+ e3.nombre +" es de $" + e3.obtenerSalarioFinal());
    }
    
}
