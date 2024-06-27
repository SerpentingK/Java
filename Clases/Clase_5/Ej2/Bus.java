package Ej2;

public class Bus {
    private String placa;
    private int capacidadPasajeros;
    private double precioPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;

    public Bus(String placa, int capacidad, double precio) {
        this.placa = placa;
        this.capacidadPasajeros = capacidad;
        this.precioPasaje = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidad() {
        return capacidadPasajeros;
    }

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public int getPasajerosTotales() {
        return totalPasajeros;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public void SubirPasajeros(int pasajeros) {
        if (pasajerosActuales + pasajeros <= capacidadPasajeros) {
            totalPasajeros += pasajeros;
            pasajerosActuales += pasajeros;
            System.out.println("Se han subido " + pasajeros + " pasajeros" );
        } else {
            System.out.println("¡Demasiados pasajeros! No subieron todos los pasajeros, capacidad maxima alcanzada");
            totalPasajeros += capacidadPasajeros - pasajerosActuales;
            pasajerosActuales = capacidadPasajeros;
        }
    }

    public void BajarPasajeros(int pasajeros) {
        if (pasajerosActuales - pasajeros < 0) {
            System.out.println("No hay tantos pasajeros, bus vacio");
            pasajerosActuales = 0;
        } else {
            pasajerosActuales -= pasajeros;
        }
    }

    public double getDineroAcumulado(){
        return totalPasajeros * precioPasaje;
    }
}
