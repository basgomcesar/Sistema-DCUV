package sistemadcuv.modelo.pojo;

public class Desarrollador {
    private String nombreCompleto;
    private String estado;
    private String matricula;
    private int semestre;

    public Desarrollador() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Desarrollador{" + "nombreCompleto=" + nombreCompleto + ", estado=" + estado + ", matricula=" + matricula + ", semestre=" + semestre + '}';
    }
        
}
