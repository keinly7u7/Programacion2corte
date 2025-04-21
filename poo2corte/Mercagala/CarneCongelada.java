package Mercagala;

public class CarneCongelada extends Carne {
    protected String distribuidora;

    public CarneCongelada(String nombre, double peso, double precioKilo, String origen, String distribuidora) {
        super(nombre, peso, precioKilo, origen);
        this.distribuidora = distribuidora;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }
}

