/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mario Ramos Duque
 */
@Entity
@Table(name = "sis_configuracion_compras", schema = "sistemaweb")
public class SisConfiguracionCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SisConfiguracionComprasPK sisConfiguracionComprasPK;
    @Column(name = "conf_motivo_permitido")
    private String confMotivoPermitido;
    @Column(name = "conf_bodega_permitida")
    private String confBodegaPermitida;
    @Column(name = "conf_sector_permitido")
    private String confSectorPermitido;
    @Column(name = "conf_cambiar_fecha")
    private boolean confCambiarFecha;
    @Column(name = "conf_permitir_pendiente")
    private boolean confPermitirPendiente;
    @Column(name = "conf_secuencial_facturas")
    private String confSecuencialFacturas;
    @Column(name = "conf_secuencial_retenciones")
    private String confSecuencialRetenciones;
    @Column(name = "conf_firma_digital_nombre")
    private String confFirmaDigitalNombre;
    @Column(name = "conf_firma_digital_clave")
    private String confFirmaDigitalClave;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "conf_modificar_precio")
    private boolean confModificarPrecio;
    @Column(name = "conf_documento_permitido")
    private String confDocumentoPermitido;

    @Column(name = "conf_forma_pago")
    private String confFormaPago;

    public SisConfiguracionCompras() {
    }

    public SisConfiguracionComprasPK getSisConfiguracionComprasPK() {
        return sisConfiguracionComprasPK;
    }

    public void setSisConfiguracionComprasPK(SisConfiguracionComprasPK sisConfiguracionComprasPK) {
        this.sisConfiguracionComprasPK = sisConfiguracionComprasPK;
    }

    public String getConfMotivoPermitido() {
        return confMotivoPermitido;
    }

    public void setConfMotivoPermitido(String confMotivoPermitido) {
        this.confMotivoPermitido = confMotivoPermitido;
    }

    public String getConfBodegaPermitida() {
        return confBodegaPermitida;
    }

    public void setConfBodegaPermitida(String confBodegaPermitida) {
        this.confBodegaPermitida = confBodegaPermitida;
    }

    public String getConfSectorPermitido() {
        return confSectorPermitido;
    }

    public void setConfSectorPermitido(String confSectorPermitido) {
        this.confSectorPermitido = confSectorPermitido;
    }

    public boolean isConfCambiarFecha() {
        return confCambiarFecha;
    }

    public void setConfCambiarFecha(boolean confCambiarFecha) {
        this.confCambiarFecha = confCambiarFecha;
    }

    public boolean isConfPermitirPendiente() {
        return confPermitirPendiente;
    }

    public void setConfPermitirPendiente(boolean confPermitirPendiente) {
        this.confPermitirPendiente = confPermitirPendiente;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getConfSecuencialFacturas() {
        return confSecuencialFacturas;
    }

    public void setConfSecuencialFacturas(String confSecuencialFacturas) {
        this.confSecuencialFacturas = confSecuencialFacturas;
    }

    public String getConfSecuencialRetenciones() {
        return confSecuencialRetenciones;
    }

    public void setConfSecuencialRetenciones(String confSecuencialRetenciones) {
        this.confSecuencialRetenciones = confSecuencialRetenciones;
    }

    public String getConfFirmaDigitalNombre() {
        return confFirmaDigitalNombre;
    }

    public void setConfFirmaDigitalNombre(String confFirmaDigitalNombre) {
        this.confFirmaDigitalNombre = confFirmaDigitalNombre;
    }

    public String getConfFirmaDigitalClave() {
        return confFirmaDigitalClave;
    }

    public void setConfFirmaDigitalClave(String confFirmaDigitalClave) {
        this.confFirmaDigitalClave = confFirmaDigitalClave;
    }

    public boolean isConfModificarPrecio() {
        return confModificarPrecio;
    }

    public void setConfModificarPrecio(boolean confModificarPrecio) {
        this.confModificarPrecio = confModificarPrecio;
    }

    public String getConfDocumentoPermitido() {
        return confDocumentoPermitido;
    }

    public void setConfDocumentoPermitido(String confDocumentoPermitido) {
        this.confDocumentoPermitido = confDocumentoPermitido;
    }

    public String getConfFormaPago() {
        return confFormaPago;
    }

    public void setConfFormaPago(String confFormaPago) {
        this.confFormaPago = confFormaPago;
    }

}
