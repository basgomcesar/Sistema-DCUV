package sistemadcuv.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Utilidades {
    
        public static void mostrarAletarSimple(String titulo, String mensaje, Alert.AlertType tipo){
        Alert alertaSimple = new Alert(tipo);
        alertaSimple.setTitle(titulo);
        alertaSimple.setHeaderText(null);
        alertaSimple.setContentText(mensaje);
        alertaSimple.showAndWait();
    }
    
    public static FXMLLoader cargarVista(String rutaFXML) throws IOException{
        URL url = sistemadcuv.SistemaDCUV.class.getResource(rutaFXML);
        return new FXMLLoader(url);
    }
    
    public static boolean correoValido(String correo){        
        if(correo != null && !correo.isEmpty()){
            Pattern patronCorreo = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+");
            Matcher matchPatron = patronCorreo.matcher(correo);
            
            return matchPatron.find();
        } else{
            return false;
        }
    }
    
    public static boolean mostrarDialogoConfirmacion(String titulo, String mensaje) {
        Alert alertaConfirmacion = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacion.setTitle(titulo);
        alertaConfirmacion.setContentText(mensaje);
        alertaConfirmacion.setHeaderText(null);
        Optional<ButtonType> botonClic = alertaConfirmacion.showAndWait(); 
        
        return (botonClic.get() == ButtonType.OK);
    }
}
