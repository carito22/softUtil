/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

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
 * @author Usuario1
 */
@Entity
@Table(name = "inv_cliente_contrato_tipo", schema = "inventario")
public class InvClienteContratoTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvClienteContratoTipoPK invClienteContratoTipoPK;
    @Column(name = "cli_descripcion")
    private String cliDescripcion;
    @Column(name = "cli_inactivo")
    private Boolean cliInactivo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    @Column(name = "cli_dias_credito")
    private Integer cliDiasCredito;

    public InvClienteContratoTipo() {
    }

    public InvClienteContratoTipo(InvClienteContratoTipoPK invClienteContratoTipoPK) {
        this.invClienteContratoTipoPK = invClienteContratoTipoPK;
    }

    public InvClienteContratoTipo(InvClienteContratoTipoPK invClienteContratoTipoPK, String cliDescripcion) {
        this.invClienteContratoTipoPK = invClienteContratoTipoPK;
        this.cliDescripcion = cliDescripcion;
    }

    public InvClienteContratoTipo(String cliCodigo, String cliEmpresa) {
        this.invClienteContratoTipoPK = new InvClienteContratoTipoPK(cliCodigo, cliEmpresa);
    }

    public InvClienteContratoTipoPK getInvClienteContratoTipoPK() {
        return invClienteContratoTipoPK;
    }

    public void setInvClienteContratoTipoPK(InvClienteContratoTipoPK invClienteContratoTipoPK) {
        this.invClienteContratoTipoPK = invClienteContratoTipoPK;
    }

    public String getCliDescripcion() {
        return cliDescripcion;
    }

    public void setCliDescripcion(String cliDescripcion) {
        this.cliDescripcion = cliDescripcion;
    }

    public Boolean getCliInactivo() {
        return cliInactivo;
    }

    public void setCliInactivo(Boolean cliInactivo) {
        this.cliInactivo = cliInactivo;
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

    public Integer getCliDiasCredito() {
        return cliDiasCredito;
    }

    public void setCliDiasCredito(Integer cliDiasCredito) {
        this.cliDiasCredito = cliDiasCredito;
    }

}
