public class main {
    public static void main(String[] args) {
        espada espada1 = new espada(3.5f);
        espada espada2 = new espada_fuego(5.3f, 0.5f);
        espada espada3 = new espada_oscura(5.3f);
        espada1.atacar();
        espada2.atacar();
        espada3.atacar();
    }
}
