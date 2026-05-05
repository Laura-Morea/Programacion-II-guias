package ejemplos;

class Alumno {
    private String nombre;
    private double promedio;

    public Alumno(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", promedio=" + promedio + '}';
    }
}
