package CuentaBancaria;

public class Test {

    public static void main(String[] args) {
        // 1. Instanciamos la cuenta
        CuentaBancaria miCuenta = new CuentaBancaria();

        System.out.println("--- Prueba de Depositos ---");
        System.out.println("Saldo inicial: $" + miCuenta.obtenerSaldoActual());
        
        miCuenta.depositarDinero(1000.0);
        System.out.println("Saldo despues de depositar $1000: $" + miCuenta.obtenerSaldoActual());
        
        miCuenta.depositarDinero(-500); // Prueba de validación (no debería sumar)
        System.out.println("Intentando depositar -$500: $" + miCuenta.obtenerSaldoActual());

        System.out.println("\n--- Prueba de Extracciones ---");
        miCuenta.extraerDinero(300000.50);
        System.out.println("Saldo despues de extraer $300.50: $" + miCuenta.obtenerSaldoActual());

        //Prueba del CBU 
        System.out.println("\n--- Prueba de CBU ---");
        System.out.println("Ultimos 3 digitos: " + miCuenta.getUltimos3CBU());
    }
}
