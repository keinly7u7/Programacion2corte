package Biberia;

public class Avioneta extends Avion {
    int numPasajeros;
    Pasajero[] pasajeros;

    public Avioneta(String nombre, String matricula, int autonomia, int numPasajeros, Pasajero[] pasajeros) {
        super(nombre, matricula, autonomia);
        this.numPasajeros = numPasajeros;
        this.pasajeros = pasajeros;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avioneta: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Autonomía: " + autonomia + " km");
        System.out.println("Número de Pasajeros: " + numPasajeros);
    }

    @Override
    public void consultarPasajeros() {
        for (Pasajero pasajero : pasajeros) {
            System.out.println("Nombre: " + pasajero.nombre + ", DNI: " + pasajero.dni + ", Edad: " + pasajero.edad);
        }
    }
}
