package co.vinni.dbValidConecta.db.repositorio;

import co.vinni.dbValidConecta.db.GestorConexion;

/**
 *
 * @author Vinni@
 */
public class GestorOperaciones {
    private GestorConexion gestorConexion;
    public GestorOperaciones(GestorConexion gestorConexion) {
        this.gestorConexion = gestorConexion;
    }
    public boolean validarConexion(){
        if (this.gestorConexion.obtenerConexion() == null)
            return false;
        else
            return true;
    }
}
