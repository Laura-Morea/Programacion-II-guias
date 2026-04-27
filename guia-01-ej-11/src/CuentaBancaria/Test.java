package CuentaBancaria;

/*Utilizando las clases generadas hasta ahora, codificá en Java la siguiente situación: 
Una cuenta bancaria de tipo caja de ahorros le pertenece a Fulano Gomez, nacido 
el 16/04/1990 y otra de tipo cuenta corriente le pertenece a Mengana Torres, 
nacida el 23/11/1991. Ambos están casados y viven juntos en Av. Triunvirato 
3174, Villa Ortúzar. 
Supongamos que Fulano y Mengana se mudan a nuevo hogar: ¿Hay que cambiar el domicilio de 
cada uno o basta con cambiar uno de los dos? 
 */
public class Test {
    public static void main(String[] args) {
        Domicilio d1= new Domicilio("Av. Triunvirato",3174, "Villa Ortuzar");
        CuentaBancaria c1=new CuentaBancaria(CuentaBancaria.Tipo.CAJA_DE_AHORRO,new Persona("Fulano","Gomez",new Fecha(16,04,1990),d1));
        CuentaBancaria c2= new CuentaBancaria(CuentaBancaria.Tipo.CUENTA_CORRIENTE,new Persona("Mengana", "Torres", new Fecha(23,11,1991),d1));
        
        CuentaBancaria[] cuentas={c1,c2};
        System.out.println("\n\n"+c1.toString()+"\n"+c2.toString());
        System.out.println("\nCambio de domicilio");
//        d1= new Domicilio("Dr. Pedro Rivera",4523,"Villa Urquiza");
//        c1.getTitular().setDomicilioPersonal(d1);
//        c2.getTitular().setDomicilioPersonal(d1); //hay que cambiar ambos?
        d1.setCambioDomicilio("Dr. Pedro Rivera",4523,"Villa Urquiza"); //cambio uno solo, pero estoy 
                                                                        //afectando a un objeto ya creado que era independiente
        
        for (int i=0; i<2;i++){
            System.out.println("\n"+cuentas[i].toString());
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
