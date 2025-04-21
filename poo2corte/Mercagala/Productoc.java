package Mercagala;

public class Productoc implements producto { // Cambié IaAlmacen por Producto
    private String nombre;
    private double peso;
    private double precioKilo;

    public Productoc() {
    }

    public Productoc(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
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

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", peso=" + peso + ", precioKilo=" + precioKilo + "]";
    }
}
