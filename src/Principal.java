
import co.vinni.dbValidConecta.db.GestorConexion;
import co.vinni.dbValidConecta.db.implementa.ConexionOracle;
import co.vinni.dbValidConecta.db.repositorio.GestorOperaciones;
import co.vinni.dbValidConecta.dto.Config;
import co.vinni.dbValidConecta.dto.MotorBd;


/**
 *
 * @author Vinni@
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println(" Conexion ... ");
        Config config = new Config(MotorBd.ORACLE, "127.0.0.1", 1521, "elusuario", "123456", "xe");
        GestorConexion gestor = new ConexionOracle(config);
        System.out.println(" gestor "+gestor.obtenerConexion());
        GestorOperaciones gestorOper = new GestorOperaciones(gestor);
        System.out.println(" "+gestorOper.validarConexion());
    }
}
