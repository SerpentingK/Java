package Ej1;

public class Cita {
    
    private int numero;
    private int tipo;
    private double tarifa;
    private double valorFinal;

    public Cita(int numero, int tipo, double tarifa) {
        this.numero = numero;
        this.tipo = tipo;
        this.tarifa = tarifa;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        if (tipo == 1 || tipo == 2 || tipo == 3) {
            return "General";
        } else if (tipo == 4 || tipo == 5) {
            return "Especialista";
        } else {
            return "Null";
        }
    }

    public double getTarifa() {
        return tarifa;
    }

    public double calcularValorFinal() {
        double descuento = tarifa * 0.5f;
        if (tipo == 1 || tipo == 2 || tipo == 3) {
            valorFinal = tarifa - descuento;
            return valorFinal;
        } else if (tipo == 4 || tipo == 5) {
            valorFinal = tarifa + descuento;
            return valorFinal;
        } else {
            return tarifa;
        }
    }
}
