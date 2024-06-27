package EjercicioInjusto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private String nombreCliente;
    private String fecha;
    private float totalPago;
    private String numeroFactura;
    private ArrayList<Producto> productos;
    private float abono;
    private float debe;
    private static int contadorFactura = 0;
    private static char letraFactura = 'A';

    public String getCliente() {
        return nombreCliente;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public float getTotalPago() {
        return totalPago;
    }

    public String getFecha() {
        return fecha;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public float getAbono() {
        return abono;
    }

    public void setAbono(float abono) {
        this.abono = abono;
    }

    public float getDebe() {
        return debe;
    }

    public void setDebe(float debe) {
        this.debe = debe;
    }

    public void setCliente(String cliente) {
        this.nombreCliente = cliente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotalPago(float totalPago) {
        this.totalPago = totalPago;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Compra(String nombre, ArrayList<Producto> productos, float abono) {
        float total = 0;
        setCliente(nombre);
        setFecha(obtenerFechaActual());
        setProductos(productos);
        setAbono(abono);
        for (Producto p : productos) {
            total += p.getCosto();
        }

        setTotalPago(total);

        contadorFactura++;
        if (contadorFactura > 9999) {
            contadorFactura = 0;
            letraFactura++;
        }
        if (letraFactura > 'Z') {
            letraFactura = 'A';
        }

        numeroFactura = String.format("%04d-%c", contadorFactura, letraFactura);

        calcularDebe();
    }

    private String obtenerFechaActual() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }

    public void calcularDebe() {
        debe = totalPago - abono;
    }

    public void String() {
        System.out.println("Nombre: " + getCliente());
        System.out.println("Total de pago: " + getTotalPago());
        System.out.println("Abono: " + getAbono());
        System.out.println("Debe: " + getDebe());
        System.out.println("Fecha de compra: " + getFecha());
        System.out.println("Número de factura: " + getNumeroFactura());
        for (Producto p : getProductos()) {
            System.out.printf("Producto: %s || Precio: %2f || Estado: %b || Entregado: %b%n", p.getMarca() + " " + p.getModelo(), p.getCosto(), p.isRealizado(), p.isEntregado());
        }
        System.out.println("----------------------------------------------------------------");
    }
}
