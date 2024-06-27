package EjercicioInjusto;


public class Cliente {
    private String nombreCompleto;

    // ---- GETTERS ----

    public String getNombreCompleto() {
        return nombreCompleto;
    }


    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    // ---- CONSTRUCTORS ----

    public Cliente(String nombre) {
        nombreCompleto = nombre;
    }

    // ---- METODOS ----
    
}
