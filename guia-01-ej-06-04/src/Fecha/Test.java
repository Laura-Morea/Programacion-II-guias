package Fecha;

public class Test {

    public static void main(String[] args) {

        // 1. Probar Constructor y Validaciones
        System.out.println("--- Prueba de Construccion y Validacion ---");
        Fecha fecha1 = new Fecha(25, 12, 2026); // Fecha válida
        Fecha fechaInvalida = new Fecha(31, 4, 2026); // Abril tiene 30, debería fallar

        System.out.println("Fecha 1 (Navidad): " + fecha1.fechaFormatoDdMmAa());
        
        // Si la validación falló en el constructor, los valores serán 0
        System.out.println("Fecha invalida (31/4): " + fechaInvalida.fechaFormatoDdMmAa());

        // 2. Probar esNavidad
        System.out.println("\n--- Prueba de esNavidad ---");
        System.out.println("La fecha 1 es Navidad?: " + (fecha1.esNavidad() ? "Si" : "No"));
        
        Fecha cumple = new Fecha(15, 5, 1995);
        System.out.println("El " + cumple.fechaFormatoDdMmAa() + " es Navidad?: " + (cumple.esNavidad()? "Si" : "No"));

        // 3. Probar sumarUnMes
        System.out.println("\n--- Prueba de sumarUnMes ---");
        
        // Caso A: Un mes normal
        Fecha f2 = new Fecha(10, 3, 2026);
        System.out.print(f2.fechaFormatoDdMmAa() + " + 1 mes = ");
        f2.sumarUnMes();
        System.out.println(f2.fechaFormatoDdMmAa());

        // Caso B: Probar el salto que definiste con el módulo %12
        Fecha f3 = new Fecha(31, 12, 2026);
        System.out.print(f3.isFechaValida(f3.getDia(),f3.getMes(),f3.getAnio())+f3.fechaFormatoDdMmAa() + " (Diciembre) + 2 meses = ");
        f3.sumarUnMes();
        System.out.println(f3.toString());
        f3.sumarUnMes();
        System.out.println(f3.fechaFormatoDdMmAa());
    }
}