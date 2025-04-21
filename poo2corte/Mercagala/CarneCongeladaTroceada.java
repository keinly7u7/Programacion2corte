package Mercagala;

public class CarneCongeladaTroceada extends CarneCongelada {
    private int piezas;

    public CarneCongeladaTroceada(String nombre, double peso, double precioKilo, String origen, String distribuidora, int piezas) {
        super(nombre, peso, precioKilo, origen, distribuidora);
        this.piezas = piezas;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
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
