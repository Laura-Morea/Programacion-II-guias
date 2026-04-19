package Fecha;

public class Test {

    public static void main(String[] args) {

        // 1. Crear una instancia de Fecha
        Fecha hoy = new Fecha();
        
        // Asignamos valores manualmente
        hoy.dia = 25;
        hoy.mes = 12;
        hoy.anio = 2026;

        // 2. Probar formato de fecha (DD/MM/AA)
        System.out.println("--- Prueba de Formato ---");
        System.out.println("Fecha actual: " + hoy.fechaFormatoDdMmAa());

        // 3. Probar si es Navidad
        System.out.println("\n--- Prueba de Navidad ---");
        System.out.println("Hoy es Navidad?: " + (hoy.esNavidad() ? "Si, es Navidad!" : "No, no lo es."));
        
        hoy.dia = 10;
        hoy.mes = 5;
        System.out.println("Cambiando a 10/5... Es Navidad?: " + (hoy.esNavidad() ? "Si, es Navidad!" : "No, no lo es."));

        // 4. Probar sumar un mes
        System.out.println("\n--- Prueba de Sumar un Mes ---");
        Fecha f2 = new Fecha();
        f2.dia = 31;
        f2.mes = 1; // Enero
        f2.anio = 2024;
        
        System.out.println("Fecha inicial: " + f2.fechaFormatoDdMmAa());
        f2.sumarUnMes();
        System.out.println("Despues de sumar un mes (Enero 31): " + f2.fechaFormatoDdMmAa());

        // Probando paso de Noviembre a Diciembre
        Fecha f3 = new Fecha();
        f3.dia = 15;
        f3.mes = 11; // Noviembre
        f3.anio = 2025;
        
        System.out.println("\nFecha inicial: " + f3.fechaFormatoDdMmAa());
        f3.sumarUnMes();
        System.out.println("Despues de sumar un mes (Noviembre 15): " + f3.fechaFormatoDdMmAa());
    }
}
