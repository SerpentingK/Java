package modelos;

public class estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private String curso;
    private float n1;
    private float n2;
    private float n3;
    private float promedio;
    private boolean aprobado;

    public estudiante(String codigo,String nombre, String apellido, String curso, float n1, float n2, float n3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        setPromedio();
        setAprobado();
    }

    public void setPromedio() {
        this.promedio = (n1 + n2 + n3)/ 3;
    }
    
    public void setAprobado() {
        if(promedio >= 3){
            this.aprobado = true;
        }else{
            this.aprobado = false;
        }
    }

    public void ActualizarNotas(){
        float 
    }



    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public float getN1() {
        return n1;
    }
    public void setN1(float n1) {
        this.n1 = n1;
    }
    public float getN2() {
        return n2;
    }
    public void setN2(float n2) {
        this.n2 = n2;
    }
    public float getN3() {
        return n3;
    }
    public void setN3(float n3) {
        this.n3 = n3;
    }
    public float getPromedio() {
        return promedio;
    }
    public boolean isAprobado() {
        return aprobado;
    }

    
}
