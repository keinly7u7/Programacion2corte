package Biberia;

public abstract class Avion {
    protected String nombre;
    protected String matricula;
    protected int autonomia;

    public Avion(String nombre, String matricula, int autonomia) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomia = autonomia;
    }

    public abstract void mostrarInformacion();
    public abstract void consultarPasajeros();
}