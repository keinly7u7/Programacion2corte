package Biberia;

public class Pasajero {
    String nombre;
    String dni;
    int edad;

    public Pasajero(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }
}
