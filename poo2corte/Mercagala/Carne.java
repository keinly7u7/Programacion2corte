package Mercagala;

public class Carne extends producto {
    private String origen;

    public Carne(String origen) {
        this.origen = origen;
    }

    public Carne(String nombre, double peso, double precioKilo, String origen) {
        super(nombre, peso, precioKilo);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    

}
