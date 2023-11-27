package sistemadcuv.controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sistemadcuv.modelo.pojo.Desarrollador;
import sistemadcuv.modelo.pojo.ResponsableDeProyecto;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import sistemadcuv.modelo.dao.ProyectoDAO;
import sistemadcuv.utils.Utilidades;

public class FXMLParticipantesDelProyectoController implements Initializable {


    @FXML
    private Label lbUsuarioActivo;
    private Desarrollador desarrolladorSesion;
    private ResponsableDeProyecto responsableSesion;
    private ObservableList<Desarrollador> desarrolladores;
    @FXML
    private TableView<Desarrollador> tvDesarrolladores;
    @FXML
    private TableColumn colNombreDesarrollador;
    @FXML
    private TableColumn colCorreo;
    @FXML
    private TableColumn colEliminar;
    @FXML
    private Button btnAgregarParticipante;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        configurarTabla();
    }    

    void inicializarInformacion(Desarrollador desarrolladorSesion, ResponsableDeProyecto responsableSesion) {
        this.desarrolladorSesion = desarrolladorSesion;
        this.responsableSesion = responsableSesion;
        cargarInformacion();
    }

    private void cargarInformacion() {
        if(desarrolladorSesion == null){
            lbUsuarioActivo.setText("Responsable - "+responsableSesion.getNombreCompleto());
            obtenerInformacion(responsableSesion.getIdProyecto());
        }else{
            lbUsuarioActivo.setText("Desarrollador - "+desarrolladorSesion.getNombreCompleto());
            obtenerInformacion(desarrolladorSesion.getIdProyecto());
            btnAgregarParticipante.setVisible(false);
            colEliminar.setVisible(false);
        }
    }

    private void configurarTabla() {
        this.colNombreDesarrollador.setCellValueFactory(new PropertyValueFactory("nombreCompleto"));
        this.colCorreo.setCellValueFactory(new PropertyValueFactory("correo"));
        this.colEliminar.setCellValueFactory(new PropertyValueFactory("eliminar"));
    }
    private void obtenerInformacion(int idProyecto){
        HashMap<String, Object> respuesta = ProyectoDAO.obtenerDesarrolladoresPorProyecto(idProyecto);
        if(!(boolean) respuesta.get("error")){
            desarrolladores = FXCollections.observableArrayList();
            ArrayList<Desarrollador> desarrolladorDAO = (ArrayList<Desarrollador>) respuesta.get("desarrolladores");
            ArrayList<Desarrollador> lista = desarrolladorDAO;
            desarrolladores.addAll(lista);
            tvDesarrolladores.setItems(desarrolladores);
        }else{
            Utilidades.mostrarAletarSimple("Error de carga", (String) respuesta.get("mensaje"),
                    Alert.AlertType.ERROR);
        }
    }

    @FXML
    private void clicAgregarParticipante(ActionEvent event) {
        try {
            FXMLLoader load = Utilidades.cargarVista("vistas/FXMLRegistrarDesarrollador.fxml");
            Parent vista = load.load();
            Scene escena = new Scene(vista);
            FXMLRegistrarDesarrolladorController controlador = load.getController();
            controlador.inicializarInformacion(responsableSesion.getIdProyecto());
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.setTitle("Registrar desarrollador");
            escenario.showAndWait();
        } catch (IOException ex) {
            Logger.getLogger(FXMLParticipantesDelProyectoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
