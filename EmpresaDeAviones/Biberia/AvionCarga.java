package Biberia;

public class AvionCarga extends Avion {
    private int cargaMaxima;

    public AvionCarga(String nombre, String matricula, int autonomia, int cargaMaxima) {
        super(nombre, matricula, autonomia);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avión de Carga: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Autonomía: " + autonomia + " km");
        System.out.println("Carga Máxima: " + cargaMaxima + " kg");
    }

    @Override
    public void consultarPasajeros() {
        System.out.println("Este avión de carga no tiene pasajeros.");
    }
}
