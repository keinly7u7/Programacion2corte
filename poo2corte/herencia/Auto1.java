package herencia;

public class Auto1 extends Vehiculo1 {
    private int numPasajeros;

    public Auto1(String marca, String color, int numPasajeros) {
        super(marca, color);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    
    

}