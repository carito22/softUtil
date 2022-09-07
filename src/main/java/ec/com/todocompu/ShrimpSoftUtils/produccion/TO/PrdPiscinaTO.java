/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdPiscinaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "pis_empresa")
    private String pisEmpresa;

    @Column(name = "pis_sector")
    private String pisSector;

    @Column(name = "pis_numero")
    private String pisNumero;

    @Column(name = "pis_nombre")
    private String pisNombre;

    @Column(name = "pis_hectareaje")
    private BigDecimal pisHectareaje;

    @Column(name = "pis_activa")
    private Boolean pisActiva;

    @Column(name = "sec_empresa")
    private String secEmpresa;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "cta_costo_directo")
    private String ctaCostoDirecto;
    @Column(name = "cta_costo_indirecto")
    private String ctaCostoIndirecto;
    @Column(name = "cta_costo_transferencia")
    private String ctaCostoTransferencia;
    @Column(name = "cta_costo_producto_terminado")
    private String ctaCostoProductoTerminado;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaPiscina;

    @Column(name = "tipo_empresa")
    private String tipoEmpresa;

    @Column(name = "tipo_codigo")
    private String tipoCodigo;
    @Column(name = "cta_costo_venta")
    private String ctaCostoVenta;

    public PrdPiscinaTO() {
    }

    public PrdPiscinaTO(String pisEmpresa, String pisSector, String pisNumero, String pisNombre,
            BigDecimal pisHectareaje, Boolean pisActiva, String secEmpresa, String secCodigo, String usrEmpresa,
            String usrCodigo, String usrFechaInsertaPiscina) {
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.pisNombre = pisNombre;
        this.pisHectareaje = pisHectareaje;
        this.pisActiva = pisActiva;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInsertaPiscina = usrFechaInsertaPiscina;
    }

    public PrdPiscinaTO(String pisEmpresa, String pisSector, String pisNumero, String pisNombre,
            BigDecimal pisHectareaje, Boolean pisActiva, String secEmpresa, String secCodigo, String ctaCostoDirecto,
            String ctaCostoIndirecto, String ctaCostoTransferencia, String ctaCostoProductoTerminado, String usrEmpresa,
            String usrCodigo, String usrFechaInsertaPiscina) {
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.pisNombre = pisNombre;
        this.pisHectareaje = pisHectareaje;
        this.pisActiva = pisActiva;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.ctaCostoDirecto = ctaCostoDirecto;
        this.ctaCostoIndirecto = ctaCostoIndirecto;
        this.ctaCostoTransferencia = ctaCostoTransferencia;
        this.ctaCostoProductoTerminado = ctaCostoProductoTerminado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInsertaPiscina = usrFechaInsertaPiscina;
    }

    public String getCtaCostoVenta() {
        return ctaCostoVenta;
    }

    public void setCtaCostoVenta(String ctaCostoVenta) {
        this.ctaCostoVenta = ctaCostoVenta;
    }

    public String getCtaCostoDirecto() {
        return ctaCostoDirecto;
    }

    public void setCtaCostoDirecto(String ctaCostoDirecto) {
        this.ctaCostoDirecto = ctaCostoDirecto;
    }

    public String getCtaCostoIndirecto() {
        return ctaCostoIndirecto;
    }

    public void setCtaCostoIndirecto(String ctaCostoIndirecto) {
        this.ctaCostoIndirecto = ctaCostoIndirecto;
    }

    public String getCtaCostoTransferencia() {
        return ctaCostoTransferencia;
    }

    public void setCtaCostoTransferencia(String ctaCostoTransferencia) {
        this.ctaCostoTransferencia = ctaCostoTransferencia;
    }

    public String getCtaCostoProductoTerminado() {
        return ctaCostoProductoTerminado;
    }

    public void setCtaCostoProductoTerminado(String ctaCostoProductoTerminado) {
        this.ctaCostoProductoTerminado = ctaCostoProductoTerminado;
    }

    public Boolean getPisActiva() {
        return pisActiva;
    }

    public void setPisActiva(Boolean pisActiva) {
        this.pisActiva = pisActiva;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public BigDecimal getPisHectareaje() {
        return pisHectareaje;
    }

    public void setPisHectareaje(BigDecimal pisHectareaje) {
        this.pisHectareaje = pisHectareaje;
    }

    public String getPisNombre() {
        return pisNombre;
    }

    public void setPisNombre(String pisNombre) {
        this.pisNombre = pisNombre;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
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

    public String getUsrFechaInsertaPiscina() {
        return usrFechaInsertaPiscina;
    }

    public void setUsrFechaInsertaPiscina(String usrFechaInsertaPiscina) {
        this.usrFechaInsertaPiscina = usrFechaInsertaPiscina;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

}
