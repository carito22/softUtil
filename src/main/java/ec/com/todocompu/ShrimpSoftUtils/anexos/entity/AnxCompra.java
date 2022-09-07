package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_compra", schema = "anexo")
@XmlRootElement
public class AnxCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AnxCompraPK anxCompraPK;
    @Column(name = "comp_autorizacion")
    private String compAutorizacion;
    @Column(name = "comp_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date compFechaEmision;
    @Column(name = "comp_fecha_caduca")
    @Temporal(TemporalType.DATE)
    private Date compFechaCaduca;
    @Column(name = "comp_fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Date compFechaRecepcion;
    @Column(name = "comp_base0")
    private BigDecimal compBase0;
    @Column(name = "comp_baseimponible")
    private BigDecimal compBaseimponible;
    @Column(name = "comp_basenoobjetoiva")
    private BigDecimal compBasenoobjetoiva;
    @Column(name = "comp_montoice")
    private BigDecimal compMontoice;
    @Column(name = "comp_montoiva")
    private BigDecimal compMontoiva;
    @Column(name = "comp_baseivabienes")
    private BigDecimal compBaseivabienes;
    @Column(name = "comp_baseivaservicios")
    private BigDecimal compBaseivaservicios;
    @Column(name = "comp_baseivaserviciosprofesionales")
    private BigDecimal compBaseivaserviciosprofesionales;
    @Column(name = "comp_porcentajebienes")
    private BigDecimal compPorcentajebienes;
    @Column(name = "comp_porcentajeservicios")
    private BigDecimal compPorcentajeservicios;
    @Column(name = "comp_porcentajeserviciosprofesionales")
    private BigDecimal compPorcentajeserviciosprofesionales;
    @Column(name = "comp_valorbienes")
    private BigDecimal compValorbienes;
    @Column(name = "comp_valorservicios")
    private BigDecimal compValorservicios;
    @Column(name = "comp_valorserviciosprofesionales")
    private BigDecimal compValorserviciosprofesionales;
    @Column(name = "comp_retencion_empresa")
    private String compRetencionEmpresa;
    @Column(name = "comp_retencion_numero")
    private String compRetencionNumero;
    @Column(name = "comp_retencion_autorizacion")
    private String compRetencionAutorizacion;
    @Column(name = "comp_retencion_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date compRetencionFechaEmision;
    @Column(name = "comp_modificado_documento_empresa")
    private String compModificadoDocumentoEmpresa;
    @Column(name = "comp_modificado_documento_tipo")
    private String compModificadoDocumentoTipo;
    @Column(name = "comp_modificado_documento_numero")
    private String compModificadoDocumentoNumero;
    @Column(name = "comp_modificado_autorizacion")
    private String compModificadoAutorizacion;
    @Column(name = "ret_impresa")
    private Boolean retImpresa;
    @Column(name = "ret_entregada")
    private Boolean retEntregada;
    @Column(name = "ret_electronica")
    private boolean retElectronica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anxCompra")
    private List<AnxCompraReembolso> anxCompraReembolsoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anxCompra")
    private List<AnxCompraDividendo> anxCompraDividendoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anxCompra")
    private List<AnxCompraFormaPago> anxCompraFormaPagoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anxCompra")
    private List<AnxCompraElectronica> anxCompraElectronicaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "anxCompra")
    private List<AnxCompraDetalle> anxCompraDetalleList;
    @JoinColumn(name = "comp_sustentotributario", referencedColumnName = "sus_codigo")
    @ManyToOne(optional = false)
    private AnxSustento compSustentotributario;
    @Column(name = "comp_clave_acceso_externa", updatable = false)
    private String compClaveAccesoExterna;
    @Column(name = "fecha_ultima_validacion_sri")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaValidacionSri;

    public AnxCompra() {
    }

    public AnxCompra(AnxCompraPK anxCompraPK) {
        this.anxCompraPK = anxCompraPK;
    }

    public AnxCompra(AnxCompraPK anxCompraPK, boolean retElectronica) {
        this.anxCompraPK = anxCompraPK;
        this.retElectronica = retElectronica;
    }

    public AnxCompra(String compEmpresa, String compPeriodo, String compMotivo, String compNumero) {
        this.anxCompraPK = new AnxCompraPK(compEmpresa, compPeriodo, compMotivo, compNumero);
    }

    public AnxCompraPK getAnxCompraPK() {
        return anxCompraPK;
    }

    public void setAnxCompraPK(AnxCompraPK anxCompraPK) {
        this.anxCompraPK = anxCompraPK;
    }

    public String getCompAutorizacion() {
        return compAutorizacion;
    }

    public void setCompAutorizacion(String compAutorizacion) {
        this.compAutorizacion = compAutorizacion;
    }

    public Date getCompFechaEmision() {
        return compFechaEmision;
    }

    public void setCompFechaEmision(Date compFechaEmision) {
        this.compFechaEmision = compFechaEmision;
    }

    public Date getCompFechaCaduca() {
        return compFechaCaduca;
    }

    public void setCompFechaCaduca(Date compFechaCaduca) {
        this.compFechaCaduca = compFechaCaduca;
    }

    public Date getCompFechaRecepcion() {
        return compFechaRecepcion;
    }

    public void setCompFechaRecepcion(Date compFechaRecepcion) {
        this.compFechaRecepcion = compFechaRecepcion;
    }

    public BigDecimal getCompBase0() {
        return compBase0;
    }

    public void setCompBase0(BigDecimal compBase0) {
        this.compBase0 = compBase0;
    }

    public BigDecimal getCompBaseimponible() {
        return compBaseimponible;
    }

    public void setCompBaseimponible(BigDecimal compBaseimponible) {
        this.compBaseimponible = compBaseimponible;
    }

    public BigDecimal getCompBasenoobjetoiva() {
        return compBasenoobjetoiva;
    }

    public void setCompBasenoobjetoiva(BigDecimal compBasenoobjetoiva) {
        this.compBasenoobjetoiva = compBasenoobjetoiva;
    }

    public BigDecimal getCompMontoice() {
        return compMontoice;
    }

    public void setCompMontoice(BigDecimal compMontoice) {
        this.compMontoice = compMontoice;
    }

    public BigDecimal getCompMontoiva() {
        return compMontoiva;
    }

    public void setCompMontoiva(BigDecimal compMontoiva) {
        this.compMontoiva = compMontoiva;
    }

    public BigDecimal getCompBaseivabienes() {
        return compBaseivabienes;
    }

    public void setCompBaseivabienes(BigDecimal compBaseivabienes) {
        this.compBaseivabienes = compBaseivabienes;
    }

    public BigDecimal getCompBaseivaservicios() {
        return compBaseivaservicios;
    }

    public void setCompBaseivaservicios(BigDecimal compBaseivaservicios) {
        this.compBaseivaservicios = compBaseivaservicios;
    }

    public BigDecimal getCompBaseivaserviciosprofesionales() {
        return compBaseivaserviciosprofesionales;
    }

    public void setCompBaseivaserviciosprofesionales(BigDecimal compBaseivaserviciosprofesionales) {
        this.compBaseivaserviciosprofesionales = compBaseivaserviciosprofesionales;
    }

    public BigDecimal getCompPorcentajebienes() {
        return compPorcentajebienes;
    }

    public void setCompPorcentajebienes(BigDecimal compPorcentajebienes) {
        this.compPorcentajebienes = compPorcentajebienes;
    }

    public BigDecimal getCompPorcentajeservicios() {
        return compPorcentajeservicios;
    }

    public void setCompPorcentajeservicios(BigDecimal compPorcentajeservicios) {
        this.compPorcentajeservicios = compPorcentajeservicios;
    }

    public BigDecimal getCompPorcentajeserviciosprofesionales() {
        return compPorcentajeserviciosprofesionales;
    }

    public void setCompPorcentajeserviciosprofesionales(BigDecimal compPorcentajeserviciosprofesionales) {
        this.compPorcentajeserviciosprofesionales = compPorcentajeserviciosprofesionales;
    }

    public BigDecimal getCompValorbienes() {
        return compValorbienes;
    }

    public void setCompValorbienes(BigDecimal compValorbienes) {
        this.compValorbienes = compValorbienes;
    }

    public BigDecimal getCompValorservicios() {
        return compValorservicios;
    }

    public void setCompValorservicios(BigDecimal compValorservicios) {
        this.compValorservicios = compValorservicios;
    }

    public BigDecimal getCompValorserviciosprofesionales() {
        return compValorserviciosprofesionales;
    }

    public void setCompValorserviciosprofesionales(BigDecimal compValorserviciosprofesionales) {
        this.compValorserviciosprofesionales = compValorserviciosprofesionales;
    }

    public String getCompRetencionEmpresa() {
        return compRetencionEmpresa;
    }

    public void setCompRetencionEmpresa(String compRetencionEmpresa) {
        this.compRetencionEmpresa = compRetencionEmpresa;
    }

    public String getCompRetencionNumero() {
        return compRetencionNumero;
    }

    public void setCompRetencionNumero(String compRetencionNumero) {
        this.compRetencionNumero = compRetencionNumero;
    }

    public String getCompRetencionAutorizacion() {
        return compRetencionAutorizacion;
    }

    public void setCompRetencionAutorizacion(String compRetencionAutorizacion) {
        this.compRetencionAutorizacion = compRetencionAutorizacion;
    }

    public Date getCompRetencionFechaEmision() {
        return compRetencionFechaEmision;
    }

    public void setCompRetencionFechaEmision(Date compRetencionFechaEmision) {
        this.compRetencionFechaEmision = compRetencionFechaEmision;
    }

    public String getCompModificadoDocumentoEmpresa() {
        return compModificadoDocumentoEmpresa;
    }

    public void setCompModificadoDocumentoEmpresa(String compModificadoDocumentoEmpresa) {
        this.compModificadoDocumentoEmpresa = compModificadoDocumentoEmpresa;
    }

    public String getCompModificadoDocumentoTipo() {
        return compModificadoDocumentoTipo;
    }

    public void setCompModificadoDocumentoTipo(String compModificadoDocumentoTipo) {
        this.compModificadoDocumentoTipo = compModificadoDocumentoTipo;
    }

    public String getCompModificadoDocumentoNumero() {
        return compModificadoDocumentoNumero;
    }

    public void setCompModificadoDocumentoNumero(String compModificadoDocumentoNumero) {
        this.compModificadoDocumentoNumero = compModificadoDocumentoNumero;
    }

    public String getCompModificadoAutorizacion() {
        return compModificadoAutorizacion;
    }

    public void setCompModificadoAutorizacion(String compModificadoAutorizacion) {
        this.compModificadoAutorizacion = compModificadoAutorizacion;
    }

    public Boolean getRetImpresa() {
        return retImpresa;
    }

    public void setRetImpresa(Boolean retImpresa) {
        this.retImpresa = retImpresa;
    }

    public Boolean getRetEntregada() {
        return retEntregada;
    }

    public void setRetEntregada(Boolean retEntregada) {
        this.retEntregada = retEntregada;
    }

    public boolean getRetElectronica() {
        return retElectronica;
    }

    public void setRetElectronica(boolean retElectronica) {
        this.retElectronica = retElectronica;
    }

    public List<AnxCompraReembolso> getAnxCompraReembolsoList() {
        return anxCompraReembolsoList;
    }

    public void setAnxCompraReembolsoList(List<AnxCompraReembolso> anxCompraReembolsoList) {
        this.anxCompraReembolsoList = anxCompraReembolsoList;
    }

    public List<AnxCompraDividendo> getAnxCompraDividendoList() {
        return anxCompraDividendoList;
    }

    public void setAnxCompraDividendoList(List<AnxCompraDividendo> anxCompraDividendoList) {
        this.anxCompraDividendoList = anxCompraDividendoList;
    }

    public List<AnxCompraFormaPago> getAnxCompraFormaPagoList() {
        return anxCompraFormaPagoList;
    }

    public void setAnxCompraFormaPagoList(List<AnxCompraFormaPago> anxCompraFormaPagoList) {
        this.anxCompraFormaPagoList = anxCompraFormaPagoList;
    }

    public List<AnxCompraElectronica> getAnxCompraElectronicaList() {
        return anxCompraElectronicaList;
    }

    public void setAnxCompraElectronicaList(List<AnxCompraElectronica> anxCompraElectronicaList) {
        this.anxCompraElectronicaList = anxCompraElectronicaList;
    }

    public List<AnxCompraDetalle> getAnxCompraDetalleList() {
        return anxCompraDetalleList;
    }

    public void setAnxCompraDetalleList(List<AnxCompraDetalle> anxCompraDetalleList) {
        this.anxCompraDetalleList = anxCompraDetalleList;
    }

    public AnxSustento getCompSustentotributario() {
        return compSustentotributario;
    }

    public void setCompSustentotributario(AnxSustento compSustentotributario) {
        this.compSustentotributario = compSustentotributario;
    }

    public String getCompClaveAccesoExterna() {
        return compClaveAccesoExterna;
    }

    public void setCompClaveAccesoExterna(String compClaveAccesoExterna) {
        this.compClaveAccesoExterna = compClaveAccesoExterna;
    }

    public Date getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(Date fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (anxCompraPK != null ? anxCompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof AnxCompra)) {
            return false;
        }
        AnxCompra other = (AnxCompra) object;
        if ((this.anxCompraPK == null && other.anxCompraPK != null)
                || (this.anxCompraPK != null && !this.anxCompraPK.equals(other.anxCompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anexos.entity.AnxCompra[ anxCompraPK=" + anxCompraPK + " ]";
    }

}
