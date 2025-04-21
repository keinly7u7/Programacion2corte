package Mercagala;

public class CarneCongeladaEntera extends CarneCongelada {
    private boolean bandeja;

    public CarneCongeladaEntera(String nombre, double peso, double precioKilo, String origen, String distribuidora, boolean bandeja) {
        super(nombre, peso, precioKilo, origen, distribuidora);
        this.bandeja = bandeja;
    }

    public boolean isBandeja() {
        return bandeja;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

