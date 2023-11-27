package sistemadcuv.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistemadcuv.modelo.ConexionBD;
import sistemadcuv.modelo.pojo.ResponsableDeProyecto;
import sistemadcuv.modelo.pojo.RespuestaLogin;

public class ResponsableDAO {
    
    public static RespuestaLogin inicioSesionResponsable (int numPersonal, String contraseña){
        RespuestaLogin respuesta = new RespuestaLogin();
        respuesta.setError(true);
        Connection conexionBD = ConexionBD.obtenerConexion();
        if(conexionBD != null){
            try{
                String consulta = "";
                PreparedStatement prepararSentencia = conexionBD.prepareStatement(consulta);
                prepararSentencia.setInt(1, numPersonal);
                prepararSentencia.setString(2, contraseña);
                ResultSet resultadoSentencia = prepararSentencia.executeQuery();
                if(resultadoSentencia.next()){
                    respuesta.setError(false);
                    respuesta.setMensaje("ERROR CON LA BASE DE DATOS");
                    ResponsableDeProyecto responsable = new ResponsableDeProyecto();
                    //SETTERS
                    respuesta.setResponsable(responsable);
                }else{                    
                    respuesta.setMensaje("Numero de personal y/o contraseña incorrectas.");
                }
                conexionBD.close();
            }catch(SQLException e){
                respuesta.setMensaje("Error al consultar la información");
            }
        }else{
            respuesta.setMensaje("Error en la conexión con la base de datos");
        }        
        return respuesta;
    }
}
