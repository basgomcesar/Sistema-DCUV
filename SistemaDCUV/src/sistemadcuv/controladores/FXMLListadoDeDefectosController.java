package sistemadcuv.controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import sistemadcuv.modelo.pojo.Desarrollador;
import sistemadcuv.modelo.pojo.ResponsableDeProyecto;

public class FXMLListadoDeDefectosController implements Initializable {

    private Desarrollador desarrolladorSesion;
    private ResponsableDeProyecto responsableSesion;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    void inicializarInformacion(Desarrollador desarrolladorSesion, ResponsableDeProyecto responsableSesion) {
        this.desarrolladorSesion = desarrolladorSesion;
        this.responsableSesion = responsableSesion;
    }
    
}
