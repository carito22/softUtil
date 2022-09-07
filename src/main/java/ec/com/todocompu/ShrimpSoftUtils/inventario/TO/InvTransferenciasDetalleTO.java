/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaPiscinaTO;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)

public class InvTransferenciasDetalleTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencial;

    // @Column(name = "emp_codigo")
    private Integer detOrden;

    // @Column(name = "emp_codigo")
    private java.math.BigDecimal detCantidad;

    // @Column(name = "emp_codigo")
    private String bodOrigenEmpresa;

    @Column(name = "bod_origen_codigo")
    private String bodOrigenCodigo;

    // @Column(name = "emp_codigo")
    private String bodDestinoEmpresa;

    @Column(name = "bod_destino_codigo")
    private String bodDestinoCodigo;

    // @Column(name = "emp_codigo")
    private String secOrigenEmpresa;

    // @Column(name = "emp_codigo")
    private String secOrigenCodigo;

    // @Column(name = "emp_codigo")
    private String secDestinoEmpresa;

    @Column(name = "sec_destino_codigo")
    private String secDestinoCodigo;

    @Column(name = "pro_empresa")
    private String proEmpresa;

    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;

    @Column(name = "trans_empresa")
    private String transEmpresa;

    @Column(name = "trans_periodo")
    private String transPeriodo;

    @Column(name = "trans_motivo")
    private String transMotivo;

    @Column(name = "trans_numero")
    private String transNumero;
    @Transient
    private List<InvTransferenciaDetalleSeriesTO> invTransferenciaDetalleSeriesListTO;
    @Column(name = "trans_piscina")
    private PrdListaPiscinaTO transPiscinaTo;

    public InvTransferenciasDetalleTO() {
    }

    public InvTransferenciasDetalleTO(Integer detSecuencial, Integer detOrden, java.math.BigDecimal detCantidad,
            String bodOrigenEmpresa, String bodOrigenCodigo, String bodDestinoEmpresa, String bodDestinoCodigo,
            String secOrigenEmpresa, String secOrigenCodigo, String secDestinoEmpresa, String secDestinoCodigo,
            String proEmpresa, String proCodigoPrincipal, String transEmpresa, String transPeriodo, String transMotivo,
            String transNumero) {
        this.detSecuencial = detSecuencial;
        this.detOrden = detOrden;
        this.detCantidad = detCantidad;
        this.bodOrigenEmpresa = bodOrigenEmpresa;
        this.bodOrigenCodigo = bodOrigenCodigo;
        this.bodDestinoEmpresa = bodDestinoEmpresa;
        this.bodDestinoCodigo = bodDestinoCodigo;
        this.secOrigenEmpresa = secOrigenEmpresa;
        this.secOrigenCodigo = secOrigenCodigo;
        this.secDestinoEmpresa = secDestinoEmpresa;
        this.secDestinoCodigo = secDestinoCodigo;
        this.proEmpresa = proEmpresa;
        this.proCodigoPrincipal = proCodigoPrincipal;
        this.transEmpresa = transEmpresa;
        this.transPeriodo = transPeriodo;
        this.transMotivo = transMotivo;
        this.transNumero = transNumero;
    }

    public String getBodDestinoCodigo() {
        return bodDestinoCodigo;
    }

    public void setBodDestinoCodigo(String bodDestinoCodigo) {
        this.bodDestinoCodigo = bodDestinoCodigo;
    }

    public String getBodDestinoEmpresa() {
        return bodDestinoEmpresa;
    }

    public void setBodDestinoEmpresa(String bodDestinoEmpresa) {
        this.bodDestinoEmpresa = bodDestinoEmpresa;
    }

    public String getBodOrigenCodigo() {
        return bodOrigenCodigo;
    }

    public void setBodOrigenCodigo(String bodOrigenCodigo) {
        this.bodOrigenCodigo = bodOrigenCodigo;
    }

    public String getBodOrigenEmpresa() {
        return bodOrigenEmpresa;
    }

    public void setBodOrigenEmpresa(String bodOrigenEmpresa) {
        this.bodOrigenEmpresa = bodOrigenEmpresa;
    }

    public java.math.BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(java.math.BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public Integer getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(Integer detOrden) {
        this.detOrden = detOrden;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public String getSecDestinoCodigo() {
        return secDestinoCodigo;
    }

    public void setSecDestinoCodigo(String secDestinoCodigo) {
        this.secDestinoCodigo = secDestinoCodigo;
    }

    public String getSecDestinoEmpresa() {
        return secDestinoEmpresa;
    }

    public void setSecDestinoEmpresa(String secDestinoEmpresa) {
        this.secDestinoEmpresa = secDestinoEmpresa;
    }

    public String getSecOrigenCodigo() {
        return secOrigenCodigo;
    }

    public void setSecOrigenCodigo(String secOrigenCodigo) {
        this.secOrigenCodigo = secOrigenCodigo;
    }

    public String getSecOrigenEmpresa() {
        return secOrigenEmpresa;
    }

    public void setSecOrigenEmpresa(String secOrigenEmpresa) {
        this.secOrigenEmpresa = secOrigenEmpresa;
    }

    public String getTransEmpresa() {
        return transEmpresa;
    }

    public void setTransEmpresa(String transEmpresa) {
        this.transEmpresa = transEmpresa;
    }

    public String getTransMotivo() {
        return transMotivo;
    }

    public void setTransMotivo(String transMotivo) {
        this.transMotivo = transMotivo;
    }

    public String getTransNumero() {
        return transNumero;
    }

    public void setTransNumero(String transNumero) {
        this.transNumero = transNumero;
    }

    public String getTransPeriodo() {
        return transPeriodo;
    }

    public void setTransPeriodo(String transPeriodo) {
        this.transPeriodo = transPeriodo;
    }

    public List<InvTransferenciaDetalleSeriesTO> getInvTransferenciaDetalleSeriesListTO() {
        return invTransferenciaDetalleSeriesListTO;
    }

    public void setInvTransferenciaDetalleSeriesListTO(List<InvTransferenciaDetalleSeriesTO> invTransferenciaDetalleSeriesListTO) {
        this.invTransferenciaDetalleSeriesListTO = invTransferenciaDetalleSeriesListTO;
    }

    public PrdListaPiscinaTO getTransPiscinaTo() {
        return transPiscinaTo;
    }

    public void setTransPiscinaTo(PrdListaPiscinaTO transPiscinaTo) {
        this.transPiscinaTo = transPiscinaTo;
    }

    @Override
    public String toString() {
        return "InvTransferenciasDetalleTO{" + "detSecuencial=" + detSecuencial + ", detOrden=" + detOrden + ", detCantidad=" + detCantidad + ", bodOrigenEmpresa=" + bodOrigenEmpresa + ", bodOrigenCodigo=" + bodOrigenCodigo + ", bodDestinoEmpresa=" + bodDestinoEmpresa + ", bodDestinoCodigo=" + bodDestinoCodigo + ", secOrigenEmpresa=" + secOrigenEmpresa + ", secOrigenCodigo=" + secOrigenCodigo + ", secDestinoEmpresa=" + secDestinoEmpresa + ", secDestinoCodigo=" + secDestinoCodigo + ", proEmpresa=" + proEmpresa + ", proCodigoPrincipal=" + proCodigoPrincipal + ", transEmpresa=" + transEmpresa + ", transPeriodo=" + transPeriodo + ", transMotivo=" + transMotivo + ", transNumero=" + transNumero + ", transPiscinaTo=" + transPiscinaTo +'}';
    }

}
