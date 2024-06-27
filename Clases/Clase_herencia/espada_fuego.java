public class espada_fuego extends espada{
    private float burn_damage;

    public float getBurn_damage() {
        return burn_damage;
    }
    public void setBurn_damage(float burn_damage) {
        this.burn_damage = burn_damage;
    }
    public espada_fuego(float damage, float burn_damage) {
        setDamage(damage);
        setBurn_damage(burn_damage);
    }

    public void atacar() {
        System.out.println("Ataca con " + getDamage() + " de damage, y quemadura de " + getBurn_damage());
    }
}
