import java.util.Arrays;

public class electrodomestico {

    protected float precio;
    protected float peso;
    protected colores color;
    protected consumoEnergia consumo;

    public static int num = 2;
    public static String num2 = "2";
    private String coloresValidos[] = {"blanco", "negro", "rojo", "azul", "gris"};
    private String consumosValidos[] = {"A", "B", "C", "D", "F"};

    public static enum consumoEnergia{
        A,B,C,D,E,F
    }
    public static enum colores{
        blanco, negro, rojo, azul, gris
    }
    
    public colores getColor() {
        return color;
    }
    public consumoEnergia getConsumo() {
        return consumo;
    }
    public float getPeso() {
        return peso;
    }
    public float getPrecio() {
        return precio;
    }

    public void setColor(colores color) {
        this.color = color;
    }
    public void setConsumo(consumoEnergia consumo) {
        this.consumo = consumo;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public electrodomestico(){
        setColor(colores.blanco);
        setConsumo(consumoEnergia.F);
        setPeso(5f);
        setPrecio(100);
        precioFinal();
    }
    public electrodomestico(float precio, float peso){
        setColor(colores.blanco);
        setConsumo(consumoEnergia.F);
        setPeso(peso);
        setPrecio(precio);
        precioFinal();
    }

    public electrodomestico(float precio, float peso, String color, String letraConsumo){
        comprobarColor(color);
        comprobarConsumoEnergetico(letraConsumo);
        setPeso(peso);
        setPrecio(precio);
        precioFinal();
    }

    private void comprobarConsumoEnergetico(String letra){
        if(Arrays.asList(consumosValidos).contains(letra.toUpperCase())){
            setConsumo(consumoEnergia.valueOf(letra.toUpperCase()));
        }else{
            System.out.println("Consumo invalido, valor asignado como 'F'.");
            setConsumo(consumoEnergia.F);
        }
    }
    private void comprobarColor(String color){
        if(Arrays.asList(coloresValidos).contains(color.toLowerCase())){
            setColor(colores.valueOf(color.toLowerCase()));
        } else {
            System.out.println("Color inválido, valor asignado como 'blanco'.");
            setColor(colores.blanco);
        }
    }

    protected void precioFinal(){
        switch (consumo) {
            case consumoEnergia.A:
                precio+= 100;
                break;
            
            case consumoEnergia.B:
                precio+= 80;
                break;
                
            case consumoEnergia.C:
                precio+= 60;
                break;
            
            case consumoEnergia.D:
                precio+= 50;
                break;
                
            case consumoEnergia.E:
                precio+= 30;
                break;
            
            case consumoEnergia.F:
                precio+= 10;
                break;
            default:
                break;
        }


        if(peso > 0 && precio <= 19){
            precio += 10;
        }else if(peso > 19 && peso <= 49){
            precio += 50;
        }else if(peso > 49 && peso <= 79){
            precio += 80;
        }else if(peso > 79){
            precio += 100;
        }
    }

    
}
