package pooObjetos;

public class Auto {
    //primero los atributos
        String placa, color, marca;
        int modelo, cilindraje;
        boolean estado;
// constructores
public Auto(String placa, String color, String marca, int modelo, int cilindraje, boolean estado) {
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
        
        public Auto(String placa, String color, String marca, int modelo, int cilindraje) {
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
