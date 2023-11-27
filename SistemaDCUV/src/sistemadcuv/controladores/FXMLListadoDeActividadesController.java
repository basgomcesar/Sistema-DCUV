package sistemadcuv.controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sistemadcuv.modelo.pojo.Desarrollador;
import sistemadcuv.modelo.pojo.ResponsableDeProyecto;
import sistemadcuv.utils.Utilidades;


public class FXMLListadoDeActividadesController implements Initializable {

    private Desarrollador desarrolladorSesion;
    private ResponsableDeProyecto responsableSesion;
    @FXML
    private Label lbUsuarioActivo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void btnActividades(MouseEvent event) {
    }

    @FXML
    private void btnCambios(MouseEvent event) {
    }

    @FXML
    private void btnSolicitudes(MouseEvent event) {
    }

    @FXML
    private void btnDefectos(MouseEvent event) {
        try {
            Stage escenarioBase = (Stage) lbUsuarioActivo.getScene().getWindow();
            FXMLLoader loader = Utilidades.cargarVista("vistas/FXMLListadoDeDefectos.fxml");
            Parent vista = loader.load();
            FXMLListadoDeDefectosController controlador = loader.getController();
            controlador.inicializarInformacion(desarrolladorSesion, responsableSesion);
            Scene escena = new Scene(vista);
            escenarioBase.setScene(escena);
            escenarioBase.show();
            escenarioBase.setTitle("Listado de participantes del proyecto");
        } catch (IOException ex) {
            Utilidades.mostrarAletarSimple("Error", 
                    "Error al cargar ventana ",
                    Alert.AlertType.INFORMATION);
        }
    }

    @FXML
    private void btnParticipantes(MouseEvent event) {
        try {
            Stage escenarioBase = (Stage) lbUsuarioActivo.getScene().getWindow();
            FXMLLoader loader = Utilidades.cargarVista("vistas/FXMLParticipantesDelProyecto.fxml");
            Parent vista = loader.load();
            FXMLParticipantesDelProyectoController controlador = loader.getController();
            controlador.inicializarInformacion(desarrolladorSesion, responsableSesion);
            Scene escena = new Scene(vista);
            escenarioBase.setScene(escena);
            escenarioBase.show();
            escenarioBase.setTitle("Listado de participantes del proyecto");
        } catch (IOException ex) {
            Utilidades.mostrarAletarSimple("Error", 
                    "Error al cargar ventana ",
                    Alert.AlertType.INFORMATION);
        }
    }

    @FXML
    private void btnBitacora(MouseEvent event) {
    }
    public void inicializarInformacion(Desarrollador desarrolladorSesion,ResponsableDeProyecto responsableSesion){
        this.desarrolladorSesion = desarrolladorSesion;
        this.responsableSesion = responsableSesion;
        cargarInformacionUsuario();
    }

    private void cargarInformacionUsuario() {
        
    }
}
