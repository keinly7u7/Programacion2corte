package Biberia;

public class AeropuertoMilitar extends Aeropuerto {
    String nombreClave;

    public AeropuertoMilitar(String nombre, String ciudad, Avion[] aviones, String nombreClave) {
        super(nombre, ciudad, aviones);
        this.nombreClave = nombreClave;
    }
}
