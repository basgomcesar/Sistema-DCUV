package sistemadcuv.modelo.pojo;

public class RespuestaLogin {        
    
    private boolean error;
    private String mensaje;
    private ResponsableDeProyecto responsable;
    private Desarrollador desarrollador;

    public RespuestaLogin() {
    }

    public RespuestaLogin(boolean error, String mensaje, ResponsableDeProyecto responsable) {
        this.error = error;
        this.mensaje = mensaje;
        this.responsable = responsable;
    }

    public RespuestaLogin(boolean error, String mensaje, Desarrollador desarrollador) {
        this.error = error;
        this.mensaje = mensaje;
        this.desarrollador = desarrollador;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public ResponsableDeProyecto getResponsable() {
        return responsable;
    }

    public void setResponsable(ResponsableDeProyecto responsable) {
        this.responsable = responsable;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }

}
