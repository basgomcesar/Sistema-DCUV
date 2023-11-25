package Utils;

import sistemadcuv.SistemaDCUV;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;

public class Utilidades {
    public static void mostrarDialogo(String titulo, String mensaje,
        Alert.AlertType tipo) {
        Alert alertaSimple = new Alert(tipo);
        alertaSimple.setTitle(titulo);
        alertaSimple.setContentText(mensaje);
        alertaSimple.setHeaderText(null);
        alertaSimple.showAndWait();
    }
    public static FXMLLoader cargarVista(String rutaFXML) throws IOException{
        URL url = SistemaDCUV.class.getResource(rutaFXML);
        return new FXMLLoader(url);
    }
}
