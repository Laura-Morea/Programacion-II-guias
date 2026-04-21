package Fecha;

/*Refactoreá las clases de los cuatros ejercicios anteriores con los siguientes cambios: 
▪ Agregar un constructor que inicialice todos sus atributos por parámetro. 
▪ Establecer sus atributos como privados y colocar los getters/setters que correspondan. 
▪ Implementar el método toString() y comprobar su funcionamiento. */

public class Test {

    public static void main(String[] args) {

        // Creacion de una fecha normal
        Fecha f1 = new Fecha(10, 5, 2024);
        System.out.println("Fecha 1 creada: " + f1.toString());
        System.out.println("Formato corto: " + f1.fechaFormatoDdMmAa());
        System.out.println("Es Navidad? " + f1.esNavidad());

        System.out.println("------------------------------------");

        // Prueba de Navidad
        Fecha f2 = new Fecha(25, 12, 2024);
        System.out.println("Fecha 2 creada: " + f2.toString());
        System.out.println("Es Navidad? " + f2.esNavidad());

        System.out.println("------------------------------------");

        // Prueba de sumar un mes y validacion de Febrero (segun tu logica de setFecha)
        Fecha f3 = new Fecha(15, 1, 2025);
        System.out.println("Fecha inicial: " + f3.toString());
        f3.sumarUnMes();
        System.out.println("Despues de sumar un mes (deberia ser Febrero): " + f3.toString());

        System.out.println("------------------------------------");

        // Prueba de getters individuales
        System.out.println("Dia de f3: " + f3.getDia());
        System.out.println("Mes de f3: " + f3.getMes());
        System.out.println("Anio de f3: " + f3.getAnio());

        System.out.println("------------------------------------");

        // Prueba de setFecha con valores que exceden los limites
        Fecha f4 = new Fecha(31, 12, 2023);
        System.out.println("Fecha con mes 12 antes de setFecha: " + f4.toString());
        f4.sumarUnMes();
        System.out.println("Resultado de sumar mes: " + f4.toString());
        f4.sumarUnMes();
        System.out.println("Resultado de otro mes: " + f4.toString());
        f4.sumarUnMes();
        System.out.println("Resultado de otro mes: " + f4.toString());
    }
}