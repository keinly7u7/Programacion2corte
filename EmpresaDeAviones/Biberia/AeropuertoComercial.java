package Biberia;

public class AeropuertoComercial extends Aeropuerto {
    int numTerminales;

    public AeropuertoComercial(String nombre, String ciudad, Avion[] aviones, int numTerminales) {
        super(nombre, ciudad, aviones);
        this.numTerminales = numTerminales;
    }
}
