package Mercagala;

public class pescado implements producto {
    private String nombre;
    private double peso;
    private double precioKilo;
    private String tipo;

    public pescado(String nombre, double peso, double precioKilo, String tipo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(double precioKilo) {
        this.precioKilo = precioKilo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }
}

