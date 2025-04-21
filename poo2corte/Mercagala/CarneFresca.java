package Mercagala;

public class CarneFresca extends Carne {
    private int diasCaducidad;

    public CarneFresca(String nombre, double peso, double precioKilo, String origen, int diasCaducidad) {
        super(nombre, peso, precioKilo, origen);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
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
