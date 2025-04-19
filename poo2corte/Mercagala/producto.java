package Mercagala;

public class producto implements IaAlmacen{
    private String nombre;
    @Override
    public String toString() {
        return "producto [nombre=" + nombre + ", peso=" + peso + ", precioKilo=" + precioKilo + "]";
    }
    private double peso;
    public producto() {
    }
    private double precioKilo;
    public String getNombre() {
        return nombre;
    }
    public producto(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
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
       
    return peso*precioKilo;

}

}
