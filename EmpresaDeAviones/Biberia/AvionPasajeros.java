package Biberia;

public class AvionPasajeros extends Avion {
    Pasajero[] pasajeros;

    public AvionPasajeros(String nombre, String matricula, int autonomia, int numPasajeros, Pasajero[] pasajeros) {
        super(nombre, matricula, autonomia);
        this.pasajeros = pasajeros;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avión de Pasajeros: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Autonomía: " + autonomia + " km");
        System.out.println("Número de Pasajeros: " + pasajeros.length);
    }

    @Override
    public void consultarPasajeros() {
        for (Pasajero pasajero : pasajeros) {
            System.out.println("Pasajero: " + pasajero.getNombre());
        }
    }
}