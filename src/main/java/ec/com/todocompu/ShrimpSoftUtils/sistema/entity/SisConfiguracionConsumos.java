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
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "sis_configuracion_consumos", schema = "sistemaweb")
public class SisConfiguracionConsumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SisConfiguracionConsumosPK sisConfiguracionConsumosPK;
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
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public SisConfiguracionConsumos() {
    }

    public SisConfiguracionConsumosPK getSisConfiguracionConsumosPK() {
        return sisConfiguracionConsumosPK;
    }

    public void setSisConfiguracionConsumosPK(SisConfiguracionConsumosPK sisConfiguracionConsumosPK) {
        this.sisConfiguracionConsumosPK = sisConfiguracionConsumosPK;
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

}
