/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvConsumosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cons_empresa")
    private String consEmpresa;

    @Column(name = "cons_periodo")
    private String consPeriodo;

    @Column(name = "cons_motivo")
    private String consMotivo;

    @Column(name = "cons_numero")
    private String consNumero;

    @Column(name = "cons_referencia")
    private String consReferencia;

    @Column(name = "cons_fecha")
    private String consFecha;

    @Column(name = "cons_observaciones")
    private String consObservaciones;

    @Column(name = "cons_pendiente")
    private Boolean consPendiente;

    @Column(name = "cons_revisado")
    private Boolean consRevisado;

    @Column(name = "cons_anulado")
    private Boolean consAnulado;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "bod_empresa")
    private String bodEmpresa;

    @Column(name = "bod_codigo")
    private String bodCodigo;

    @Column(name = "cli_empresa")
    private String cliEmpresa;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "prov_empresa")
    private String provEmpresa;

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "emp_empresa")
    private String empEmpresa;

    @Column(name = "emp_id")
    private String empId;

    @Column(name = "pro_empresa")
    private String proEmpresa;

    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;

    @Column(name = "pro_cantidad")
    private BigDecimal proCantidad;

    public InvConsumosTO() {
    }

    public InvConsumosTO(String consEmpresa, String consPeriodo, String consMotivo, String consNumero,
            String consReferencia, String consFecha, String consObservaciones, Boolean consPendiente,
            Boolean consRevisado, Boolean consAnulado, String usrCodigo, String usrFechaInserta) {
        this.consEmpresa = consEmpresa;
        this.consPeriodo = consPeriodo;
        this.consMotivo = consMotivo;
        this.consNumero = consNumero;
        this.consReferencia = consReferencia;
        this.consFecha = consFecha;
        this.consObservaciones = consObservaciones;
        this.consPendiente = consPendiente;
        this.consRevisado = consRevisado;
        this.consAnulado = consAnulado;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Boolean getConsAnulado() {
        return consAnulado;
    }

    public void setConsAnulado(Boolean consAnulado) {
        this.consAnulado = consAnulado;
    }

    public String getConsEmpresa() {
        return consEmpresa;
    }

    public void setConsEmpresa(String consEmpresa) {
        this.consEmpresa = consEmpresa;
    }

    public String getConsFecha() {
        return consFecha;
    }

    public void setConsFecha(String consFecha) {
        this.consFecha = consFecha;
    }

    public String getConsMotivo() {
        return consMotivo;
    }

    public void setConsMotivo(String consMotivo) {
        this.consMotivo = consMotivo;
    }

    public String getConsNumero() {
        return consNumero;
    }

    public void setConsNumero(String consNumero) {
        this.consNumero = consNumero;
    }

    public String getConsObservaciones() {
        return consObservaciones;
    }

    public void setConsObservaciones(String consObservaciones) {
        this.consObservaciones = consObservaciones;
    }

    public Boolean getConsPendiente() {
        return consPendiente;
    }

    public void setConsPendiente(Boolean consPendiente) {
        this.consPendiente = consPendiente;
    }

    public String getConsPeriodo() {
        return consPeriodo;
    }

    public void setConsPeriodo(String consPeriodo) {
        this.consPeriodo = consPeriodo;
    }

    public String getConsReferencia() {
        return consReferencia;
    }

    public void setConsReferencia(String consReferencia) {
        this.consReferencia = consReferencia;
    }

    public Boolean getConsRevisado() {
        return consRevisado;
    }

    public void setConsRevisado(Boolean consRevisado) {
        this.consRevisado = consRevisado;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getBodEmpresa() {
        return bodEmpresa;
    }

    public void setBodEmpresa(String bodEmpresa) {
        this.bodEmpresa = bodEmpresa;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    @Override
    public String toString() {
        return this.consEmpresa + " " + this.consPeriodo + " " + this.consMotivo + " " + this.consNumero + " "
                + this.consFecha + " " + this.consObservaciones + " " + this.consPendiente + " " + this.consRevisado
                + " " + this.consAnulado + " " + this.usrCodigo + " " + this.usrFechaInserta;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getProvEmpresa() {
        return provEmpresa;
    }

    public void setProvEmpresa(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getEmpEmpresa() {
        return empEmpresa;
    }

    public void setEmpEmpresa(String empEmpresa) {
        this.empEmpresa = empEmpresa;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public BigDecimal getProCantidad() {
        return proCantidad;
    }

    public void setProCantidad(BigDecimal proCantidad) {
        this.proCantidad = proCantidad;
    }

}
