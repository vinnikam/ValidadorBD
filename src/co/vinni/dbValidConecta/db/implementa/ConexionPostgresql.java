/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.vinni.dbValidConecta.db.implementa;

import co.vinni.dbValidConecta.db.GestorConexion;
import co.vinni.dbValidConecta.dto.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vinni@
 */
public class ConexionPostgresql implements GestorConexion{
    private Config config; 
    public ConexionPostgresql(Config config){
        this.config = config;
    }
    @Override
    public Connection obtenerConexion() {
        try {            
            String url = "jdbc:postgresql://"+config.getIp()+":"+
                    config.getPuerto()+"/"+config.getBaseDatos();
            return DriverManager.getConnection(url, config.getUsuario(), config.getClave());
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
