/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxCompraTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "comp_empresa")
    private String empCodigo;

    @Column(name = "comp_periodo")
    private String perCodigo;

    @Column(name = "comp_motivo")
    private String motCodigo;

    @Column(name = "comp_numero")
    private String compNumero;

    @Column(name = "comp_sustentotributario")
    private String compSustentotributario;

    @Column(name = "comp_autorizacion")
    private String compAutorizacion;

    @Column(name = "comp_fecha_emision")
    private String compEmision;

    @Column(name = "comp_fecha_caduca")
    private String compCaduca;

    @Column(name = "comp_base0")
    private java.math.BigDecimal compBase0;

    @Column(name = "comp_baseimponible")
    private java.math.BigDecimal compBaseimponible;

    @Column(name = "comp_basenoobjetoiva")
    private java.math.BigDecimal compBasenoobjetoiva;

    @Column(name = "comp_montoice")
    private java.math.BigDecimal compMontoice;

    @Column(name = "comp_montoiva")
    private java.math.BigDecimal compMontoiva;

    @Column(name = "comp_baseivabienes")
    private java.math.BigDecimal compBaseivabienes;

    @Column(name = "comp_baseivaservicios")
    private java.math.BigDecimal compBaseivaservicios;

    @Column(name = "comp_baseivaserviciosprofesionales")
    private java.math.BigDecimal compBaseivaserviciosprofesionales;

    @Column(name = "comp_porcentajebienes")
    private java.math.BigDecimal compPorcentajebienes;

    @Column(name = "comp_porcentajeservicios")
    private java.math.BigDecimal compPorcentajeservicios;

    @Column(name = "comp_porcentajeserviciosprofesionales")
    private java.math.BigDecimal compPorcentajeserviciosprofesionales;

    @Column(name = "comp_valorbienes")
    private java.math.BigDecimal compValorbienes;

    @Column(name = "comp_valorservicios")
    private java.math.BigDecimal compValorservicios;

    @Column(name = "comp_valorserviciosprofesionales")
    private java.math.BigDecimal compValorserviciosprofesionales;

    @Column(name = "comp_retencion_numero")
    private String compRetencionNumero;

    // @Column(name = "comp_numero")
    private String compRetencionClaveAcceso;

    @Column(name = "comp_retencion_autorizacion")
    private String compRetencionAutorizacion;

    @Column(name = "comp_retencion_fecha_emision")
    private String compRetencionFechaEmision;

    @Column(name = "comp_modificado_documento_tipo")
    private String compModificadoDocumentoTipo;

    @Column(name = "comp_modificado_documento_numero")
    private String compModificadoDocumentoNumero;

    @Column(name = "comp_modificado_autorizacion")
    private String compModificadoAutorizacion;

    @Column(name = "comp_clave_acceso_externa")
    private String compClaveAccesoExterna;
    /*
	 * anxCompra.setCompModificadoDocumentoTipo(anxCompraTO.
	 * getCompModificadotipodocumento());
	 * anxCompra.setCompModificadoDocumentoNumero(anxCompraTO.
	 * getCompModificadodocumento());
	 * anxCompra.setCompModificadoAutorizacion(anxCompraTO.
	 * getCompModificadoautorizacion());
     */
    private java.math.BigDecimal valorRetencion;
    private Boolean retImpreso;
    private Boolean retEntregado;
    private Boolean retElectronica;
    private Boolean retAmbienteProduccion;
    private Boolean retMostrarDialogoImpresion;

    @Column(name = "fecha_ultima_validacion_sri")
    private String fechaUltimaValidacionSri;

    public AnxCompraTO() {
    }

    public String getCompAutorizacion() {
        return compAutorizacion;
    }

    public void setCompAutorizacion(String compAutorizacion) {
        this.compAutorizacion = compAutorizacion;
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

    public BigDecimal getCompBasenoobjetoiva() {
        return compBasenoobjetoiva;
    }

    public void setCompBasenoobjetoiva(BigDecimal compBasenoobjetoiva) {
        this.compBasenoobjetoiva = compBasenoobjetoiva;
    }

    public String getCompCaduca() {
        return compCaduca;
    }

    public void setCompCaduca(String compCaduca) {
        this.compCaduca = compCaduca;
    }

    public String getCompEmision() {
        return compEmision;
    }

    public void setCompEmision(String compEmision) {
        this.compEmision = compEmision;
    }

    public String getCompModificadoAutorizacion() {
        return compModificadoAutorizacion;
    }

    public void setCompModificadoAutorizacion(String compModificadoAutorizacion) {
        this.compModificadoAutorizacion = compModificadoAutorizacion;
    }

    public String getCompModificadoDocumentoNumero() {
        return compModificadoDocumentoNumero;
    }

    public void setCompModificadoDocumentoNumero(String compModificadoDocumentoNumero) {
        this.compModificadoDocumentoNumero = compModificadoDocumentoNumero;
    }

    public String getCompModificadoDocumentoTipo() {
        return compModificadoDocumentoTipo;
    }

    public void setCompModificadoDocumentoTipo(String compModificadoDocumentoTipo) {
        this.compModificadoDocumentoTipo = compModificadoDocumentoTipo;
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

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
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

    public String getCompRetencionAutorizacion() {
        return compRetencionAutorizacion;
    }

    public void setCompRetencionAutorizacion(String compRetencionAutorizacion) {
        this.compRetencionAutorizacion = compRetencionAutorizacion;
    }

    public String getCompRetencionClaveAcceso() {
        return compRetencionClaveAcceso;
    }

    public void setCompRetencionClaveAcceso(String compRetencionClaveAcceso) {
        this.compRetencionClaveAcceso = compRetencionClaveAcceso;
    }

    public String getCompRetencionFechaEmision() {
        return compRetencionFechaEmision;
    }

    public void setCompRetencionFechaEmision(String compRetencionFechaEmision) {
        this.compRetencionFechaEmision = compRetencionFechaEmision;
    }

    public String getCompRetencionNumero() {
        return compRetencionNumero;
    }

    public void setCompRetencionNumero(String compRetencionNumero) {
        this.compRetencionNumero = compRetencionNumero;
    }

    public String getCompSustentotributario() {
        return compSustentotributario;
    }

    public void setCompSustentotributario(String compSustentotributario) {
        this.compSustentotributario = compSustentotributario;
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

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getMotCodigo() {
        return motCodigo;
    }

    public void setMotCodigo(String motCodigo) {
        this.motCodigo = motCodigo;
    }

    public String getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(String perCodigo) {
        this.perCodigo = perCodigo;
    }

    public Boolean getRetElectronica() {
        return retElectronica;
    }

    public void setRetElectronica(Boolean retElectronica) {
        this.retElectronica = retElectronica;
    }

    public Boolean getRetEntregado() {
        return retEntregado;
    }

    public void setRetEntregado(Boolean retEntregado) {
        this.retEntregado = retEntregado;
    }

    public Boolean getRetImpreso() {
        return retImpreso;
    }

    public void setRetImpreso(Boolean retImpreso) {
        this.retImpreso = retImpreso;
    }

    public BigDecimal getValorRetencion() {
        return valorRetencion;
    }

    public void setValorRetencion(BigDecimal valorRetencion) {
        this.valorRetencion = valorRetencion;
    }

    public Boolean getRetAmbienteProduccion() {
        return retAmbienteProduccion;
    }

    public void setRetAmbienteProduccion(Boolean retAmbienteProduccion) {
        this.retAmbienteProduccion = retAmbienteProduccion;
    }

    public Boolean getRetMostrarDialogoImpresion() {
        return retMostrarDialogoImpresion;
    }

    public void setRetMostrarDialogoImpresion(Boolean retMostrarDialogoImpresion) {
        this.retMostrarDialogoImpresion = retMostrarDialogoImpresion;
    }

    public String getCompClaveAccesoExterna() {
        return compClaveAccesoExterna;
    }

    public void setCompClaveAccesoExterna(String compClaveAccesoExterna) {
        this.compClaveAccesoExterna = compClaveAccesoExterna;
    }

    public String getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(String fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    @Override
    public String toString() {
        return this.empCodigo + " " + this.perCodigo + " " + this.motCodigo + " " + this.compNumero + " "
                + this.compSustentotributario + " " + this.compAutorizacion + " " + this.compCaduca + " "
                + this.compBase0 + " " + this.compBaseimponible + " " + this.compBasenoobjetoiva + " "
                + this.compMontoice + " " + this.compMontoiva + " " + this.compBaseivabienes + " "
                + this.compBaseivaservicios + " " + this.compBaseivaserviciosprofesionales + " "
                + this.compPorcentajebienes + " " + this.compPorcentajeservicios + " "
                + this.compPorcentajeserviciosprofesionales + " " + this.compValorbienes + " " + this.compValorservicios
                + " " + this.compValorserviciosprofesionales + " " + this.compRetencionNumero + " "
                + this.compRetencionAutorizacion + " " + this.compRetencionFechaEmision + " "
                + this.compModificadoDocumentoTipo + " " + this.compModificadoDocumentoNumero + " "
                + this.compModificadoAutorizacion;
    }
}
