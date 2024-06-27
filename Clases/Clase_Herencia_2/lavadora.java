public class lavadora extends electrodomestico{
    private float carga;

    public void setCarga(float carga) {
        this.carga = carga;
    }
    public float getCarga() {
        return carga;
    }
    public lavadora(){
        super();
        setCarga(5);
        precioFinal();
        if(carga >= 30){
            precio += 50;
        }
    }
    public lavadora(float precio, float peso){
        super(precio, peso);
        setCarga(5);
        precioFinal();
        if(carga >= 30){
            precio += 50;
        }
    }
    public lavadora(float precio, float peso, String color, String letraConsumo, float carga){
        super(precio, peso, color, letraConsumo);
        setCarga(carga);
        precioFinal();
        if(carga >= 30){
            precio += 50;
        }
    }


}
