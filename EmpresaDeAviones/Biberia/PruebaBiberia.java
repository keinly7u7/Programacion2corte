package Biberia;

public class PruebaBiberia {
    public static void main(String[] args) {
        Pasajero[] pasajeros1 = { new Pasajero("Juan", "13579246A", 30)}; Pasajero[] pasajeros2 = { new Pasajero("Maria", "11111111B", 35)}; Pasajero[] pasajeros3 = { new Pasajero("Andrea", "758854B", 22)};
        AvionPasajeros avionPasajeros1 = new AvionPasajeros("Avión de Pasajeros 1", "ABC123", 2000, 1, pasajeros1);
        AvionPasajeros avionPasajeros2 = new AvionPasajeros("Avión de Pasajeros 2", "DEF456", 3500, 1, pasajeros2);
        AvionCarga avionCarga1 = new AvionCarga("Avión de Carga 1", "GHI789", 2000, 10000);
        Avioneta avioneta1 = new Avioneta("Avioneta 1", "JKL012", 500, 1, pasajeros3);
        
        Avion[] avionesComerciales = {avionPasajeros1, avionPasajeros2, avionCarga1};
        AeropuertoComercial aeropuertoComercial = new AeropuertoComercial("Aeropuerto Comercial 1", "Ciudad A", avionesComerciales, 3);
        
        Avion[] avionesMilitares = {avioneta1};
        AeropuertoMilitar aeropuertoMilitar = new AeropuertoMilitar("Aeropuerto Militar 1", "Ciudad B", avionesMilitares, "Clave123");
        
        aeropuertoComercial.mostrarAviones();
        aeropuertoMilitar.mostrarAviones();
        aeropuertoComercial.consultarPasajero("Juan");
        aeropuertoComercial.consultarPasajero("Maria");
        aeropuertoMilitar.consultarPasajero("Andrea");
    }
}
