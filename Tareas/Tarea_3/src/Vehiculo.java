public class Vehiculo {
    private float velocidadActual = 0;
    private EstadoCarro state;

    public int modelo;
    public int velocidad;
    public String marca;
    public String placa;
    public String color;
    public String estado;
    public float cilindraje;

    public enum EstadoCarro {
        DETENIDO,
        ARRANCADO,
        ACCELERANDO,
        FRENANDO
    }

    public Vehiculo(int modelo, int velocidad, String marca, String placa, String color, String estado, float cilindraje){
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.marca = marca;
        this.placa = placa;
        this.color = color;
        this.estado = estado;
        this.cilindraje = cilindraje;
        System.out.println("Ha sido creado el " + marca + " modelo " + modelo + " color " + color + ",clindraje " + cilindraje + "cm2");
        this.state = EstadoCarro.DETENIDO;
    }

    public void Arrancar(){
        if(velocidadActual == 0){
            System.out.println("Arrancando el " + marca + " modelo " + modelo);
            velocidadActual = 3;
            System.out.println("Velocidad actual: " + velocidadActual);
            state = EstadoCarro.ARRANCADO;
            System.out.println(state);
        }else {
            System.out.println("No puedes arrancar, necesitas estar detenido");
        }

    }
    public void Frenar(){
        System.out.println("Frenando");
        if (velocidadActual > 0){
            velocidadActual -= 20;
            if (velocidadActual < 0){
                velocidadActual = 0;
            }
            System.out.println("Velocidad actual: " +  velocidadActual +"Km/h");
            state = EstadoCarro.FRENANDO;
            System.out.println(state);
        }else{
            System.out.println("No puedes frenar, estas detenido");
        }

    }
    public void Acelerar(int vel){
        if(velocidadActual > 0){
            if(velocidadActual + vel > velocidad){
                velocidadActual = velocidad;
                System.out.println("Velocidad actual: " +  velocidadActual +"Km/h");
            }else{
                System.out.println("Acelerando: " + vel + "Km/h, velocidad maxima: " + velocidad);
                velocidadActual += vel;
                System.out.println("Velocidad actual: " +  velocidadActual +"Km/h");
            }
            state = EstadoCarro.ACCELERANDO;
            System.out.println(state);
        }else {
            System.out.println("Necesitas arrancar antes de acelerar");
        }

    }
    public void Detener(){
        if (velocidadActual <= 30) {
            velocidadActual = 0;
            System.out.println("Velocidad actual: " +  velocidadActual +"Km/h");
            state = EstadoCarro.DETENIDO;
            System.out.println(state);
        }else {
            System.out.println("Debes disminuir la velocidad para detenerte");
            System.out.println("Velocidad actual: " +  velocidadActual +"Km/h");
            System.out.println(state);
        }

    }
    public void SetColor(String color){
            this.color = color;
            System.out.println("El " +  marca + " ahora es " + color);
        }
}

