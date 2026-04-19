package Empleado;

public class Test {

    public static void main(String[] args) {
        // 1. Crear instancias de Empleado
        // Usamos el constructor: DNI, nombre, apellido, salarioBase, estadoCivil, cantHijos
        Empleado emp1 = new Empleado("20345678", "Juan", "Perez", 500000.0, Empleado.EstadoCivil.CASADO, 2);
        Empleado emp2 = new Empleado("30123456", "Ana", "Garcia", 450000.0, Empleado.EstadoCivil.SOLTERO, 0);

        // 2. Probar el método toString()
        System.out.println("--- Datos de los Empleados ---");
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());

        // 3. Probar el cálculo del salario final
        System.out.println("\n--- Calculos de Salarios ---");
        System.out.println("Salario Final de " + emp1.getNombreYApellido() + ": $" + emp1.obtenerSalarioFinal());
        System.out.println("Salario Final de " + emp2.getNombreYApellido() + ": $" + emp2.obtenerSalarioFinal());

        // 4. Probar setters con validaciones
        System.out.println("\n--- Probando Cambios ---");
        emp1.setCantHijos(-1); // Debería ignorarse por la validación del if
        System.out.println("Hijos de Juan (despues de intentar poner -1 hijos): " + emp1.getCantHijos());
        
        emp1.setCantHijos(3);
        System.out.println("Nuevo Salario de Juan (con 3 hijos): $" + emp1.obtenerSalarioFinal());
    }
}
