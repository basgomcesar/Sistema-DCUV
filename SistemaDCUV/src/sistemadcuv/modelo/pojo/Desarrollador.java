package sistemadcuv.modelo.pojo;

public class Desarrollador {
    private int idDesarrollador;
    private String nombreCompleto;
    private String estado;
    private String matricula;
    private int semestre;
    private String contraseña;

    public Desarrollador() {
    }

    public Desarrollador(int idDesarrollador, String nombreCompleto, String estado, String matricula, int semestre, String contraseña) {
        this.idDesarrollador = idDesarrollador;
        this.nombreCompleto = nombreCompleto;
        this.estado = estado;
        this.matricula = matricula;
        this.semestre = semestre;
        this.contraseña = contraseña;
    }

    public int getIdDesarrollador() {
        return idDesarrollador;
    }

    public void setIdDesarrollador(int idDesarrollador) {
        this.idDesarrollador = idDesarrollador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
        
}
