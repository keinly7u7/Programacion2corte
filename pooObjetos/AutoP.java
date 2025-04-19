package pooObjetos;

public class AutoP {
    //primero los atributos
      private  String placa, color, marca;
        private int modelo, cilindraje;
       private boolean estado;
// constructores
public AutoP(String placa, String color, String marca, int modelo, int cilindraje, boolean estado) {
    this.placa = placa;
    this.color = color;
    this.marca = marca;
    this.modelo = modelo;
    this.cilindraje = cilindraje;
    this.estado = estado;
}
void pintarAuto (String color){
    this.color=color;
}

//metodos
        
     public String getPlaca() {
    return placa;
}
public void setPlaca(String placa) {
    this.placa = placa;
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public int getModelo() {
    return modelo;
}
public void setModelo(int modelo) {
    this.modelo = modelo;
}
public int getCilindraje() {
    return cilindraje;
}
public void setCilindraje(int cilindraje) {
    this.cilindraje = cilindraje;
}
public boolean isEstado() {
    return estado;
}
public void setEstado(boolean estado) {
    this.estado = estado;
}
    public AutoP(String placa, String color, String marca, int modelo, int cilindraje) {
    this.placa = placa;
    this.color = color;
    this.marca = marca;
    this.modelo = modelo;
    this.cilindraje = cilindraje;
}
        void dimeSiesMetalizado(){
            if(color.equals("negro"))
            System.out.println("es metalizado");
            else
            System.out.println("no es metalizado");
    
    
        }
       
    
    
}
