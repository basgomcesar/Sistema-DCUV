package sistemadcuv.modelo.pojo;

public class ResponsableDeProyecto {
    
    private String nombreCompleto;
    private int numeroPersonal;
    private String correoElectronico;

    public ResponsableDeProyecto() {
    }

    public ResponsableDeProyecto(String nombreCompleto, int numeroPersonal, String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.numeroPersonal = numeroPersonal;
        this.correoElectronico = correoElectronico;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getNumeroPersonal() {
        return numeroPersonal;
    }

    public void setNumeroPersonal(int numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
