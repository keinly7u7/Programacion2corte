package herencia;

public class Vehiculo1 {
    private String marca;
    private String color;
    public String getMarca() {
        return marca;
    }
    public Vehiculo1 (){

    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Vehiculo1(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    public void pintar
    @Override
    public String toString() {
        return "Vehiculo1 [marca=" + marca + ", color=" + color + "]";
    }
    
    
}
