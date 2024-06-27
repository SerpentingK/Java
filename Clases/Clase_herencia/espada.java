public class espada {
    //Atributos
    private float damage;

    //Getters
    public float getDamage() {
        return damage;
    }

    //Setters
    public void setDamage(float damage) {
        this.damage = damage;
    }

    //Constructors
    public espada(){
        System.out.println("Crea una espada");
    }
    public espada(float damage){
        setDamage(damage);
    }
    //Metodos
    public void atacar(){
        System.out.println("Ataca con " + damage + " de damage");
    }
}
