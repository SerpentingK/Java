package EjercicioInjusto;

public class Producto {
    private String modelo;
    private String marca;
    private float costo;
    private boolean realizado;
    private boolean entregado;
    private tipo dispositivo;

    static public enum tipo{
        CelularAndroid,
        CelularIphone,
        Bafle,
        Tablet,
        Ipad,
        Indefinido
    }

    public String getModelo() {return modelo;}
    public String getMarca() {return marca;}
    public float getCosto() {return costo;}
    public tipo getDispositivo() {return dispositivo;}
    public boolean isRealizado() {return realizado;}
    public boolean isEntregado() {return entregado;}

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setCosto(float costo) {
        this.costo = costo;
    }
    public void setDispositivo(tipo dispositivo) {
        this.dispositivo = dispositivo;
    }
    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    public void setEntregado(boolean realizado){
        this.entregado = realizado;
    }

    public Producto(String modelo, String marca, float costo, tipo dispositivo){
        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
        this.dispositivo = dispositivo;
    }
}
