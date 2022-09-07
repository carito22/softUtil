/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdSectorTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "sec_empresa")
    private String secEmpresa;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "sec_nombre")
    private String secNombre;

    @Column(name = "sec_latitud")
    private String secLatitud;

    @Column(name = "sec_longitud")
    private String secLongitud;

    @Column(name = "sec_activo")
    private Boolean secActivo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaSector;

    @Column(name = "sec_direccion")
    private String secDireccion;

    @Column(name = "sec_telefono")
    private String secTelefono;

    @Column(name = "sec_actividad")
    private String secActividad;

    public PrdSectorTO() {
    }

    public PrdSectorTO(String secEmpresa, String secCodigo, String secNombre, String secDireccion, String secTelefono, String secLatitud, String secLongitud,
            Boolean secActivo, String usrEmpresa, String usrCodigo, String usrFechaInsertaSector) {
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.secNombre = secNombre;
        this.secDireccion = secDireccion;
        this.secTelefono = secTelefono;
        this.secLatitud = secLatitud;
        this.secLongitud = secLongitud;
        this.secActivo = secActivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInsertaSector = usrFechaInsertaSector;
    }

    public Boolean getSecActivo() {
        return secActivo;
    }

    public void setSecActivo(Boolean secActivo) {
        this.secActivo = secActivo;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecLatitud() {
        return secLatitud;
    }

    public void setSecLatitud(String secLatitud) {
        this.secLatitud = secLatitud;
    }

    public String getSecLongitud() {
        return secLongitud;
    }

    public void setSecLongitud(String secLongitud) {
        this.secLongitud = secLongitud;
    }

    public String getSecNombre() {
        return secNombre;
    }

    public void setSecNombre(String secNombre) {
        this.secNombre = secNombre;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInsertaSector() {
        return usrFechaInsertaSector;
    }

    public void setUsrFechaInsertaSector(String usrFechaInsertaSector) {
        this.usrFechaInsertaSector = usrFechaInsertaSector;
    }

    public String getSecDireccion() {
        return secDireccion;
    }

    public void setSecDireccion(String secDireccion) {
        this.secDireccion = secDireccion;
    }

    public String getSecTelefono() {
        return secTelefono;
    }

    public void setSecTelefono(String secTelefono) {
        this.secTelefono = secTelefono;
    }

    public String getSecActividad() {
        return secActividad;
    }

    public void setSecActividad(String secActividad) {
        this.secActividad = secActividad;
    }

    public void convertirObjeto(PrdSector prdSector) {
        if (prdSector != null) {
            this.secActivo = prdSector.getSecActivo();
            this.secCodigo = prdSector.getPrdSectorPK().getSecCodigo();
            this.secEmpresa = prdSector.getPrdSectorPK().getSecEmpresa();
            this.secLatitud = prdSector.getSecLatitud();
            this.secLongitud = prdSector.getSecLongitud();
            this.secNombre = prdSector.getSecNombre();
            this.usrCodigo = prdSector.getUsrCodigo();
            this.usrEmpresa = prdSector.getUsrEmpresa();
            this.usrFechaInsertaSector = prdSector.getUsrFechaInserta().toLocaleString();
        }
    }
}
