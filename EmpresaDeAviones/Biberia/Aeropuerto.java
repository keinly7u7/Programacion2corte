package Biberia;

public abstract class Aeropuerto {
    String nombre;
    String ciudad;
    Avion[] aviones;

    public Aeropuerto(String nombre, String ciudad, Avion[] aviones) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = aviones;
    }

    public void mostrarAviones() {
        for (Avion avion : aviones) {
            avion.mostrarInformacion();
        }
    }

    public void consultarPasajero(String nombrePasajero) {
        for (Avion avion : aviones) {
            if (avion instanceof AvionPasajeros) {
                AvionPasajeros avionPasajeros = (AvionPasajeros) avion;
                for (Pasajero pasajero : avionPasajeros.pasajeros) {
                    if (pasajero.nombre.equals(nombrePasajero)) {
                        System.out.println("Pasajero encontrado: " + pasajero.nombre + " en el avión: " + avionPasajeros.nombre);
                        System.out.println("Aeropuerto: " + this.nombre + ", Ciudad: " + this.ciudad);
                        return;
                    }
                }
            } else if (avion instanceof Avioneta) {
                Avioneta avioneta = (Avioneta) avion;
                for (Pasajero pasajero : avioneta.pasajeros) {
                    if (pasajero.nombre.equals(nombrePasajero)) {
                        System.out.println("Pasajero encontrado: " + pasajero.nombre + " en la avioneta: " + avioneta.nombre);
                        System.out.println("Aeropuerto: " + this.nombre + ", Ciudad: " + this.ciudad);
                        return;
                    }
                }
            }
        }
        System.out.println("Pasajero no encontrado.");
    }
}
