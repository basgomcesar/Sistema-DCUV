package sistemadcuv.controladores;

import Utils.Utilidades;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class FXMLInicioSesionController implements Initializable {

    @FXML
    private TextField tfUsuario;
    @FXML
    private PasswordField tfContrasenia;
    String formato = "zs[0-9]{8}";


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void iniciarSesion(ActionEvent event) {
        if(!esCamposVacios()){
            if(esFormatoValido()){
                if(tfUsuario.getText().matches(formato)){
                   
                }
            }else{
                Utilidades.mostrarDialogo("Formato invalido",
                        "El usuario no coincide con el formato de una matricula o numero de personal\n"
                                + "Ej.matricula valida: 'zsXXXXXXX", 
                        Alert.AlertType.INFORMATION);
            }
        }else{
            Utilidades.mostrarDialogo("Campos vacios", 
                    "Por favor llene los campos faltantes", 
                    Alert.AlertType.INFORMATION);
        }
    }

    private boolean esCamposVacios() {
        return tfUsuario.getText().trim().isEmpty() || tfContrasenia.getText().trim().isEmpty();
    }

    private boolean esFormatoValido() {
        return tfUsuario.getText().matches(formato);
    }
    
}
