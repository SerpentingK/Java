public class television extends electrodomestico{
    private float pulgadas;
    private boolean TDT;

    public float getPulgadas() {
        return pulgadas;
    }
    public boolean getTDT(){
        return TDT;
    }
    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }
    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public television(){
        super();
        setPulgadas(20);
        setTDT(false);
        precioFinal();
        if(pulgadas >= 40){
            precio += precio * 0.30;
        }
        if(TDT){
            precio += 50;
        }
    }
    public television(float precio, float peso) {
        super(precio, peso);
        setPulgadas(20);
        setTDT(false);
        precioFinal();
        if(pulgadas >= 40){
            precio += precio * 0.30;
        }
        if(TDT){
            precio += 50;
        }
    }
    public television(float precio, float peso, String color, String letraConsumo, float pulgadas, boolean TDT){
        super(precio, peso, color, letraConsumo);
        setPulgadas(pulgadas);
        setTDT(TDT);
        precioFinal();
        
        if(pulgadas >= 40){
            precio += precio * 0.30;
        }
        if(TDT){
            precio += 50;
        }
    }
}
