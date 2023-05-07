package co.vinni.dbValidConecta.db.implementa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import co.vinni.dbValidConecta.db.GestorConexion;
import co.vinni.dbValidConecta.dto.Config;
/**
 *
 * @author Vinni@
 */
public class ConexionOracle implements GestorConexion{
    private Config config; 
    public ConexionOracle(Config config){
        this.config = config;
    }
    @Override
    public Connection obtenerConexion() {
        try {            
            String url = "jdbc:oracle:thin:"+
                    config.getUsuario()+"/"+config.getClave()+"@"+config.getIp()+":"+
                    config.getPuerto()+":"+config.getBaseDatos();
            return DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.err.println("Error al establecer la conexion "+ex.getMessage());
        }
        return null;
    }

    @Override
    public void cerrarConexion(Connection connec) {
        if (connec != null)
            try {
                connec.close();
        } catch (SQLException ex) {
                System.err.println("Error al cerrar la conexion "+ex.getMessage());
        }
    }
    
}
