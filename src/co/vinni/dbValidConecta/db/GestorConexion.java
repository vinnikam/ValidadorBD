package co.vinni.dbValidConecta.db;
import co.vinni.dbValidConecta.dto.Config;
import java.sql.Connection;

/**
 *
 * @author Vinni@
 */
public interface GestorConexion {
    public Connection obtenerConexion();
    public void cerrarConexion(Connection connec);
}
