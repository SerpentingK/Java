package modelo;

public class triangulo{
    private int ladoA;
    private int ladoB;
    private int ladoC;

    private float area;

    private String tipo;

    public triangulo(){

    }

    public triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + ", area=" + area + ", tipo="
                + tipo + "]";
    }

    public void tipoTriangulo(){
        if(ladoA == ladoB && ladoC == ladoA){
            setTipo("Equilatero");
        }else if(ladoA == ladoB || ladoA == ladoC || ladoC == ladoB){
            setTipo("Isoceles");
        }else{
            setTipo("Escaleno");
        }
    }

    public void calcularArea(){
        float s = (float)(ladoA + ladoB + ladoC)/2;
        float area = (float)Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

        setArea(area);
    }
    
}