package co.vinni.dbValidConecta.util;

import co.vinni.dbValidConecta.dto.Config;
import java.io.FileNotFoundException;
import utilidades.GArchivosBinario;

/**
 *
 * @author Vinni@
 */
public class GestorConfig {
    private final static String ARCHIVOCONF = "dbvalidconecta.cfg"; 
    public static Config cargarConfig(){
        Object object = null;
        try{
            object = GArchivosBinario.leer(ARCHIVOCONF);
        }catch(Exception fe){
            object = null;
        }
        if (object == null)
            return null;
        else
            return (Config)object;
    }
    public static void actualizaConfig(Config config){
        GArchivosBinario.guardar(ARCHIVOCONF, config);
    }
}
