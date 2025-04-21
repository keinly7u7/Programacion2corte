package Mercagala;

public class Carne implements producto {
    protected String nombre;
    protected double peso;
    protected double precioKilo;
    private String origen; // "vacuno" o "avícola"

    public Carne(String nombre, double peso, double precioKilo, String origen) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
        this.origen = origen;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}

