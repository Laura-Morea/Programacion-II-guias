package CuentaBancaria;

/*Refactoreá las clases de los cuatros ejercicios anteriores con los siguientes cambios: 
▪ Agregar un constructor que inicialice todos sus atributos por parámetro. 
▪ Establecer sus atributos como privados y colocar los getters/setters que correspondan. 
▪ Implementar el método toString() y comprobar su funcionamiento. */

public class Test {

    public static void main(String[] args) {
       // 1. Creamos dos cuentas para probar las diferencias de tipo
        CuentaBancaria cajaAhorro = new CuentaBancaria("285123456789", CuentaBancaria.Tipo.CAJA_DE_AHORRO);
        CuentaBancaria cuentaCorriente = new CuentaBancaria("285987654321", CuentaBancaria.Tipo.CUENTA_CORRIENTE);
        
        System.out.println("--- Estado Inicial ---");
        System.out.println(cajaAhorro.toString());
        System.out.println(cuentaCorriente.toString());

        // 2. Probar Depósitos
        System.out.println("\n--- Probando Depositos ---");
        cajaAhorro.depositarDinero(1000);
        cuentaCorriente.depositarDinero(500);
        System.out.println("Saldo Caja Ahorro: $" + cajaAhorro.obtenerSaldoActual());
        System.out.println("Saldo Cuenta Corriente: $" + cuentaCorriente.obtenerSaldoActual());

        // 3. Probar Extracciones (La lógica clave de tu clase)
        System.out.println("\n--- Probando Extracciones ---");
        
        // Caso A: Caja de Ahorro intenta sacar más de lo que tiene (No debería dejar)
        System.out.println("Intentando sacar $1500 de Caja de Ahorro (tiene $1000)...");
        cajaAhorro.extraerDinero(1500);
        System.out.println("Saldo final Caja Ahorro: $" + cajaAhorro.obtenerSaldoActual());

        // Caso B: Cuenta Corriente intenta sacar más de lo que tiene (Debería dejar quedar en negativo)
        System.out.println("Intentando sacar $1500 de Cuenta Corriente (tiene $500)...");
        cuentaCorriente.extraerDinero(1500);
        System.out.println("Saldo final Cuenta Corriente: $" + cuentaCorriente.obtenerSaldoActual());

        // 4. Probar método de CBU
        System.out.println("\n--- Prueba de CBU ---");
        System.out.println("Ultimos 3 digitos CBU Caja Ahorro: " + cajaAhorro.getUltimos3CBU());
        System.out.println("Ultimos 3 digitos CBU Cuenta Corriente: " + cuentaCorriente.getUltimos3CBU());
    }
}
