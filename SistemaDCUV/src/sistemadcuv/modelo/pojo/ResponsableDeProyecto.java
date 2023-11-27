package sistemadcuv.modelo.pojo;

public class ResponsableDeProyecto {
    
    private int idResponsable;
    private String nombreCompleto;
    private int numeroPersonal;
    private String correoElectronico;
    private String contreseña;

    public ResponsableDeProyecto() {
    }    

    public ResponsableDeProyecto(int idResponsable, String nombreCompleto, int numeroPersonal, String correoElectronico, String contreseña) {
        this.idResponsable = idResponsable;
        this.nombreCompleto = nombreCompleto;
        this.numeroPersonal = numeroPersonal;
        this.correoElectronico = correoElectronico;
        this.contreseña = contreseña;
    }

    public int getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(int idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getContreseña() {
        return contreseña;
    }

    public void setContreseña(String contreseña) {
        this.contreseña = contreseña;
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
