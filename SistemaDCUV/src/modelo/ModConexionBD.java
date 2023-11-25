package modelo;
import Utils.Constantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ModConexionBD{
    private static final String URLCONEXION = "jdbc:mysql://"+Constantes.HOSTNAME+":"+Constantes.PUERTO+"/"+Constantes.NOMBRE_BD+"?allowPublicKeyRetrieval=true&useSSL=false"; 
    public static Connection obtenerConexion(){
       Connection conexionBD = null;
       try{
           Class.forName(Constantes.DRIVER);
           conexionBD = DriverManager.getConnection(URLCONEXION,Constantes.USUARIO,Constantes.PASSWORD);
       }catch(ClassNotFoundException e){
           e.printStackTrace();
       }catch(SQLException s){
           s.printStackTrace();
       }
       return conexionBD;
    }
}