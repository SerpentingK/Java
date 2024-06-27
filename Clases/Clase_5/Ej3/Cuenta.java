package Ej3;

public class Cuenta {
    private String numero;
    private String tipo;
    private double saldoActual;
    private double saldoMinimo;

    public Cuenta(int numero, String tipo, double valorInicial) {
        this.numero = String.valueOf(numero);
        if(tipo.toLowerCase().equals("ahorros") || tipo.toLowerCase().equals("credito")){
            this.tipo = tipo;
        }else{
            System.out.println("Tipo indefinido, cuenta asignada como ahorros.");
            this.tipo = "ahorros";
        }
        this.saldoActual = valorInicial;
        this.saldoMinimo = Math.round(valorInicial * 0.1f * 100.0) / 100.0;

        System.out.println("Numero de cuenta: " +  this.numero);
        System.out.println("Saldo actual: $" + saldoActual);
        System.out.println("Saldo minimo: $" + saldoMinimo);
        System.out.println("Tipo: " + tipo);
    }

    public void consignar(double valor) {
        if (valor > 0) {
            System.out.println("Se han consignado $" + valor);
            saldoActual += valor;
        } else {
            System.out.println("Valor invalido para consignación.");
        }
    }

    public void retirar(double valor) {
        if (valor > 0) {
            if (saldoActual - valor < saldoMinimo) {
                System.out.println("Valor invalido para retirar, excede el saldo actual");
                System.out.println("Se retiraron $" + (saldoActual - saldoMinimo));
                saldoActual -= (saldoActual - saldoMinimo);
            } else {
                System.out.println("Se retiraron $" + valor);
                saldoActual -= valor;
            }
        } else {
            System.out.println("Valor invalido para consignación.");
        }

    }

    public double getSaldo() {
        return saldoActual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public double getCapacidadCredito() {
        if(tipo.toLowerCase().equals("ahorros")){
            return saldoActual - saldoMinimo;
        }else if(tipo.toLowerCase().equals("credito")){
            return saldoActual * 3;
        }else{
            return 0;
        }
    }
}
