public class espada_oscura extends espada{

    public espada_oscura(float damage) {
        setDamage(damage);
    }
    public void atacar() {
        System.out.println("Ataca con " + getDamage() + " de damage, y absorbe un poco de energia ");
    }
}
