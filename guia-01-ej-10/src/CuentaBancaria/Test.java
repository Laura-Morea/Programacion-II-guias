package CuentaBancaria;

/*Refactoreá la clase CuentaBancaria del ejercicio 2), agregando el atributo titular, que 
representa a la persona titular de la cuenta, y el atributo fechaDeApertura. 
 */
public class Test {
    public static void main(String[] args) {
        CuentaBancaria c1=new CuentaBancaria(CuentaBancaria.Tipo.CAJA_DE_AHORRO,new Persona("Laura","Morea",new Fecha(10,12,1991)));
        Fecha f2= new Fecha(15,07,2009);
        Persona p2= new Persona("Abril", "Hering", f2);
//        Fecha f2= new Fecha(15,07,2007);
//        Persona p2= new Persona("Abril", "Hering", f2);
        CuentaBancaria c2= new CuentaBancaria(CuentaBancaria.Tipo.CUENTA_CORRIENTE,p2);
        CuentaBancaria c3=new CuentaBancaria(CuentaBancaria.Tipo.CUENTA_CORRIENTE,new Persona("Marcela","Testorelli",new Fecha(20,10,1960)));
        
        CuentaBancaria[] cuentas={c1,c2,c3};
        
        for (int i=0; i<3;i++){
            System.out.println("\n\n"+cuentas[i].toString());
            System.out.println("\n--- Probando Depositos ---");
            cuentas[i].depositarDinero(1000);
            System.out.println("Saldo al depositar $1000: $" + cuentas[i].obtenerSaldoActual());
            System.out.println("\n--- Probando Extracciones ---");
            System.out.println("Intentando sacar $1500:");
            cuentas[i].extraerDinero(1500);
            System.out.println("Saldo final: $" + cuentas[i].obtenerSaldoActual());
            System.out.println("\n--- Prueba de CBU ---");
            System.out.println("Ultimos 3 digitos CBU Caja Ahorro: " + cuentas[i].getUltimos3CBU());
        }
    }
    
}
