package CuentaBancaria;

/*Modelá la clase CuentaBancaria, la cual posea como atributos la clave bancaria uniforme (CBU), 
el tipo (caja de ahorro o cuenta corriente) y el saldo (inicialmente en 0). Luego, implementá métodos 
que permitan: 
▪ Obtener el saldo actual. 
▪ Depositar dinero en la cuenta (actualizando el saldo). 
▪ Extraer dinero de la cuenta (actualizando el saldo). Solo puede quedar en saldo negativo si es 
cuenta corriente. 
▪ Obtener los últimos 3 dígitos del CBU.*/

public class Test {

    public static void main(String[] args) {
        // 1. Instanciamos la cuenta
        CuentaBancaria miCuenta = new CuentaBancaria();
        CuentaBancaria otraCuenta = new CuentaBancaria();
        
        miCuenta.CBU="234586217";
        miCuenta.tipo=miCuenta.tipo.CAJA_DE_AHORRO;
        otraCuenta.CBU="2754786215";
        otraCuenta.tipo=otraCuenta.tipo.CUENTA_CORRIENTE;

        System.out.println("--- Prueba de Depositos en mi cuenta ---");
        System.out.println("Saldo inicial: $" + miCuenta.obtenerSaldoActual());
        
        miCuenta.depositarDinero(1000.0);
        System.out.println("Saldo despues de depositar $1000: $" + miCuenta.obtenerSaldoActual());
        
        miCuenta.depositarDinero(-500); // Prueba de validación (no debería sumar)
        System.out.println("Intentando depositar -$500: $" + miCuenta.obtenerSaldoActual());

        System.out.println("\n--- Prueba de Extracciones ---");
        miCuenta.extraerDinero(300.50);
        System.out.println("Saldo despues de extraer $300.50: $" + miCuenta.obtenerSaldoActual());
        miCuenta.extraerDinero(5000.50);
        System.out.println("Saldo despues de extraer $5000.50: $" + miCuenta.obtenerSaldoActual());
        
        System.out.println("\n--- Prueba de Depositos en otra cuenta ---");
        System.out.println("Saldo inicial: $" + otraCuenta.obtenerSaldoActual());
        
        otraCuenta.depositarDinero(1000.0);
        System.out.println("Saldo despues de depositar $1000: $" + otraCuenta.obtenerSaldoActual());
        
        otraCuenta.depositarDinero(-500); // Prueba de validación (no debería sumar)
        System.out.println("Intentando depositar -$500: $" + otraCuenta.obtenerSaldoActual());

        System.out.println("\n--- Prueba de Extracciones ---");
        otraCuenta.extraerDinero(300.50);
        System.out.println("Saldo despues de extraer $300.50: $" + otraCuenta.obtenerSaldoActual());
        otraCuenta.extraerDinero(5000.50);
        System.out.println("Saldo despues de extraer $5000.50: $" + otraCuenta.obtenerSaldoActual());

        //Prueba del CBU 
        System.out.println("\n--- Prueba de CBU ---");
        System.out.println("Ultimos 3 digitos en mi cuenta: " + miCuenta.getUltimos3CBU());
        System.out.println("Ultimos 3 digitos en otra cuenta: " + otraCuenta.getUltimos3CBU());
    }
}
