package co.vinni.dbValidConecta.dto;

import java.io.Serializable;

/**
 *
 * @author Vinni@
 */
public class Config implements Serializable{
    private MotorBd motorBD;
    private String ip;
    private int puerto;
    private String usuario;
    private String clave;
    private String baseDatos;

    public Config() {
        this.motorBD = MotorBd.ORACLE;
        this.ip = "";
        this.puerto = 0;
        this.usuario = "";
        this.clave = "";
        this.baseDatos = "";
    }
    
    public Config(MotorBd motorBD, String ip, int puerto, String usuario, String clave, String baseDatos) {
        this.motorBD = motorBD;
        this.ip = ip;
        this.puerto = puerto;
        this.usuario = usuario;
        this.clave = clave;
        this.baseDatos = baseDatos;
    }

    public MotorBd getMotorBD() {
        return motorBD;
    }

    public void setMotorBD(MotorBd motorBD) {
        this.motorBD = motorBD;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
    
    
}
