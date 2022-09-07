/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.report;

import java.math.BigDecimal;

/**
 *
 * @author Andres Guachisaca
 */
public class ReporteObjetoAnexo {
	private String empCodigo;
	private String perCodigo;
	private String motCodigo;
	private String compNumero;
	private String comSustentotributario;
	private String comAutorizacion;
	private String comEmisionAutorizacion;
	private String comCaduca;
	private java.math.BigDecimal comBase0;
	private java.math.BigDecimal comBaseimponible;
	private java.math.BigDecimal comBasenoobjetoiva;
	private java.math.BigDecimal comMontoice;
	private java.math.BigDecimal comMontoiva;
	private String comConcepto;
	private String comConceptoNombre;
	private java.math.BigDecimal comConceptoBase0;
	private java.math.BigDecimal comConceptoBaseImponible;
	private java.math.BigDecimal comConceptoBaseNoObjetoIva;
	private java.math.BigDecimal comConceptoPorcentaje;
	private java.math.BigDecimal comConceptoValorRetenido;
	private String comRetencionnumero;
	private String comRetencionautorizacion;
	private String comRetencionfechaemision;
	private String comModificadotipodocumento;
	private String comModificadodocumento;
	private String comModificadoautorizacion;
	private String usrInsertaCompras;
	private String usrFechaInsertaCompras;
	private java.math.BigDecimal valorRetencion;

	private String nombreProveedor;
	private String direccionProveedor;
	private String ciudad;

	private String rucCompra;
	private String nombreTipoDocumento;
	private String numeroDocumentoCompra;
	private String fechaCompra;

	// reembolsos
	private Integer reembSecuencial;
	private String reembDocumentoTipo;
	private String reembDocumentoNumero;
	private String reembFechaemision;
	private String reembAutorizacion;
	private BigDecimal reembBaseimponible;
	private BigDecimal reembBaseimpgrav;
	private BigDecimal reembBasenograiva;
	private BigDecimal reembMontoice;
	private BigDecimal reembMontoiva;
	private String provEmpresa;
	private String provCodigo;
	private String compEmpresa;
	private String compPeriodo;
	private String compMotivo;
	private String auxDocTipo_Abreviatura;
	private String auxProvRazonSocial;
	private String auxProvRUC;

	public ReporteObjetoAnexo() {
	}

	public ReporteObjetoAnexo(String empCodigo, String perCodigo, String motCodigo, String compNumero,
			String comSustentotributario, String comAutorizacion, String comEmisionAutorizacion, String comCaduca,
			BigDecimal comBase0, BigDecimal comBaseimponible, BigDecimal comBasenoobjetoiva, BigDecimal comMontoice,
			BigDecimal comMontoiva, String comConcepto, String comConceptoNombre, BigDecimal comConceptoBase0,
			BigDecimal comConceptoBaseImponible, BigDecimal comConceptoBaseNoObjetoIva,
			BigDecimal comConceptoPorcentaje, BigDecimal comConceptoValorRetenido, String comRetencionnumero,
			String comRetencionautorizacion, String comRetencionfechaemision, String comModificadotipodocumento,
			String comModificadotipodocumentoDetalle, String comModificadodocumento, String comModificadoautorizacion,
			String usrInsertaCompras, String usrFechaInsertaCompras, BigDecimal valorRetencion, String nombreProveedor,
			String direccionProveedor, String ciudad, String rucCompra, String nombreTipoDocumento,
			String numeroDocumentoCompra, String fechaCompra, Integer reembSecuencial, String reembDocumentoTipo,
			String reembDocumentoNumero, String reembFechaemision, String reembAutorizacion,
			BigDecimal reembBaseimponible, BigDecimal reembBaseimpgrav, BigDecimal reembBasenograiva,
			BigDecimal reembMontoice, BigDecimal reembMontoiva, String provEmpresa, String provCodigo,
			String compEmpresa, String compPeriodo, String compMotivo, String auxDocTipo_Abreviatura,
			String auxProvRazonSocial, String auxProvRUC) {
		this.empCodigo = empCodigo;
		this.perCodigo = perCodigo;
		this.motCodigo = motCodigo;
		this.compNumero = compNumero;
		this.comSustentotributario = comSustentotributario;
		this.comAutorizacion = comAutorizacion;
		this.comEmisionAutorizacion = comEmisionAutorizacion;
		this.comCaduca = comCaduca;
		this.comBase0 = comBase0;
		this.comBaseimponible = comBaseimponible;
		this.comBasenoobjetoiva = comBasenoobjetoiva;
		this.comMontoice = comMontoice;
		this.comMontoiva = comMontoiva;
		this.comConcepto = comConcepto;
		this.comConceptoNombre = comConceptoNombre;
		this.comConceptoBase0 = comConceptoBase0;
		this.comConceptoBaseImponible = comConceptoBaseImponible;
		this.comConceptoBaseNoObjetoIva = comConceptoBaseNoObjetoIva;
		this.comConceptoPorcentaje = comConceptoPorcentaje;
		this.comConceptoValorRetenido = comConceptoValorRetenido;
		this.comRetencionnumero = comRetencionnumero;
		this.comRetencionautorizacion = comRetencionautorizacion;
		this.comRetencionfechaemision = comRetencionfechaemision;
		this.comModificadotipodocumento = comModificadotipodocumento;
		this.comModificadodocumento = comModificadodocumento;
		this.comModificadoautorizacion = comModificadoautorizacion;
		this.usrInsertaCompras = usrInsertaCompras;
		this.usrFechaInsertaCompras = usrFechaInsertaCompras;
		this.valorRetencion = valorRetencion;
		this.nombreProveedor = nombreProveedor;
		this.direccionProveedor = direccionProveedor;
		this.ciudad = ciudad;
		this.rucCompra = rucCompra;
		this.nombreTipoDocumento = nombreTipoDocumento;
		this.numeroDocumentoCompra = numeroDocumentoCompra;
		this.fechaCompra = fechaCompra;
		this.reembSecuencial = reembSecuencial;
		this.reembDocumentoTipo = reembDocumentoTipo;
		this.reembDocumentoNumero = reembDocumentoNumero;
		this.reembFechaemision = reembFechaemision;
		this.reembAutorizacion = reembAutorizacion;
		this.reembBaseimponible = reembBaseimponible;
		this.reembBaseimpgrav = reembBaseimpgrav;
		this.reembBasenograiva = reembBasenograiva;
		this.reembMontoice = reembMontoice;
		this.reembMontoiva = reembMontoiva;
		this.provEmpresa = provEmpresa;
		this.provCodigo = provCodigo;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.auxDocTipo_Abreviatura = auxDocTipo_Abreviatura;
		this.auxProvRazonSocial = auxProvRazonSocial;
		this.auxProvRUC = auxProvRUC;
	}

	public Integer getReembSecuencial() {
		return reembSecuencial;
	}

	public void setReembSecuencial(Integer reembSecuencial) {
		this.reembSecuencial = reembSecuencial;
	}

	public String getReembDocumentoTipo() {
		return reembDocumentoTipo;
	}

	public void setReembDocumentoTipo(String reembDocumentoTipo) {
		this.reembDocumentoTipo = reembDocumentoTipo;
	}

	public String getReembDocumentoNumero() {
		return reembDocumentoNumero;
	}

	public void setReembDocumentoNumero(String reembDocumentoNumero) {
		this.reembDocumentoNumero = reembDocumentoNumero;
	}

	public String getReembFechaemision() {
		return reembFechaemision;
	}

	public void setReembFechaemision(String reembFechaemision) {
		this.reembFechaemision = reembFechaemision;
	}

	public String getReembAutorizacion() {
		return reembAutorizacion;
	}

	public void setReembAutorizacion(String reembAutorizacion) {
		this.reembAutorizacion = reembAutorizacion;
	}

	public BigDecimal getReembBaseimponible() {
		return reembBaseimponible;
	}

	public void setReembBaseimponible(BigDecimal reembBaseimponible) {
		this.reembBaseimponible = reembBaseimponible;
	}

	public BigDecimal getReembBaseimpgrav() {
		return reembBaseimpgrav;
	}

	public void setReembBaseimpgrav(BigDecimal reembBaseimpgrav) {
		this.reembBaseimpgrav = reembBaseimpgrav;
	}

	public BigDecimal getReembBasenograiva() {
		return reembBasenograiva;
	}

	public void setReembBasenograiva(BigDecimal reembBasenograiva) {
		this.reembBasenograiva = reembBasenograiva;
	}

	public BigDecimal getReembMontoice() {
		return reembMontoice;
	}

	public void setReembMontoice(BigDecimal reembMontoice) {
		this.reembMontoice = reembMontoice;
	}

	public BigDecimal getReembMontoiva() {
		return reembMontoiva;
	}

	public void setReembMontoiva(BigDecimal reembMontoiva) {
		this.reembMontoiva = reembMontoiva;
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

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getAuxDocTipo_Abreviatura() {
		return auxDocTipo_Abreviatura;
	}

	public void setAuxDocTipo_Abreviatura(String auxDocTipo_Abreviatura) {
		this.auxDocTipo_Abreviatura = auxDocTipo_Abreviatura;
	}

        public String getAuxProvRazonSocial() {
            return auxProvRazonSocial;
        }

        public void setAuxProvRazonSocial(String auxProvRazonSocial) {
            this.auxProvRazonSocial = auxProvRazonSocial;
        }

	public String getAuxProvRUC() {
		return auxProvRUC;
	}

	public void setAuxProvRUC(String auxProvRUC) {
		this.auxProvRUC = auxProvRUC;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getComAutorizacion() {
		return comAutorizacion;
	}

	public void setComAutorizacion(String comAutorizacion) {
		this.comAutorizacion = comAutorizacion;
	}

	public BigDecimal getComBase0() {
		return comBase0;
	}

	public void setComBase0(BigDecimal comBase0) {
		this.comBase0 = comBase0;
	}

	public BigDecimal getComBaseimponible() {
		return comBaseimponible;
	}

	public void setComBaseimponible(BigDecimal comBaseimponible) {
		this.comBaseimponible = comBaseimponible;
	}

	public BigDecimal getComBasenoobjetoiva() {
		return comBasenoobjetoiva;
	}

	public void setComBasenoobjetoiva(BigDecimal comBasenoobjetoiva) {
		this.comBasenoobjetoiva = comBasenoobjetoiva;
	}

	public String getComCaduca() {
		return comCaduca;
	}

	public void setComCaduca(String comCaduca) {
		this.comCaduca = comCaduca;
	}

	public String getComConcepto() {
		return comConcepto;
	}

	public void setComConcepto(String comConcepto) {
		this.comConcepto = comConcepto;
	}

	public BigDecimal getComConceptoBase0() {
		return comConceptoBase0;
	}

	public void setComConceptoBase0(BigDecimal comConceptoBase0) {
		this.comConceptoBase0 = comConceptoBase0;
	}

	public BigDecimal getComConceptoBaseImponible() {
		return comConceptoBaseImponible;
	}

	public void setComConceptoBaseImponible(BigDecimal comConceptoBaseImponible) {
		this.comConceptoBaseImponible = comConceptoBaseImponible;
	}

	public BigDecimal getComConceptoBaseNoObjetoIva() {
		return comConceptoBaseNoObjetoIva;
	}

	public void setComConceptoBaseNoObjetoIva(BigDecimal comConceptoBaseNoObjetoIva) {
		this.comConceptoBaseNoObjetoIva = comConceptoBaseNoObjetoIva;
	}

	public String getComConceptoNombre() {
		return comConceptoNombre;
	}

	public void setComConceptoNombre(String comConceptoNombre) {
		this.comConceptoNombre = comConceptoNombre;
	}

	public BigDecimal getComConceptoPorcentaje() {
		return comConceptoPorcentaje;
	}

	public void setComConceptoPorcentaje(BigDecimal comConceptoPorcentaje) {
		this.comConceptoPorcentaje = comConceptoPorcentaje;
	}

	public BigDecimal getComConceptoValorRetenido() {
		return comConceptoValorRetenido;
	}

	public void setComConceptoValorRetenido(BigDecimal comConceptoValorRetenido) {
		this.comConceptoValorRetenido = comConceptoValorRetenido;
	}

	public String getComEmisionAutorizacion() {
		return comEmisionAutorizacion;
	}

	public void setComEmisionAutorizacion(String comEmisionAutorizacion) {
		this.comEmisionAutorizacion = comEmisionAutorizacion;
	}

	public String getComModificadoautorizacion() {
		return comModificadoautorizacion;
	}

	public void setComModificadoautorizacion(String comModificadoautorizacion) {
		this.comModificadoautorizacion = comModificadoautorizacion;
	}

	public String getComModificadodocumento() {
		return comModificadodocumento;
	}

	public void setComModificadodocumento(String comModificadodocumento) {
		this.comModificadodocumento = comModificadodocumento;
	}

	public String getComModificadotipodocumento() {
		return comModificadotipodocumento;
	}

	public void setComModificadotipodocumento(String comModificadotipodocumento) {
		this.comModificadotipodocumento = comModificadotipodocumento;
	}

	public BigDecimal getComMontoice() {
		return comMontoice;
	}

	public void setComMontoice(BigDecimal comMontoice) {
		this.comMontoice = comMontoice;
	}

	public BigDecimal getComMontoiva() {
		return comMontoiva;
	}

	public void setComMontoiva(BigDecimal comMontoiva) {
		this.comMontoiva = comMontoiva;
	}

	public String getComRetencionautorizacion() {
		return comRetencionautorizacion;
	}

	public void setComRetencionautorizacion(String comRetencionautorizacion) {
		this.comRetencionautorizacion = comRetencionautorizacion;
	}

	public String getComRetencionfechaemision() {
		return comRetencionfechaemision;
	}

	public void setComRetencionfechaemision(String comRetencionfechaemision) {
		this.comRetencionfechaemision = comRetencionfechaemision;
	}

	public String getComRetencionnumero() {
		return comRetencionnumero;
	}

	public void setComRetencionnumero(String comRetencionnumero) {
		this.comRetencionnumero = comRetencionnumero;
	}

	public String getComSustentotributario() {
		return comSustentotributario;
	}

	public void setComSustentotributario(String comSustentotributario) {
		this.comSustentotributario = comSustentotributario;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getDireccionProveedor() {
		return direccionProveedor;
	}

	public void setDireccionProveedor(String direccionProveedor) {
		this.direccionProveedor = direccionProveedor;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getMotCodigo() {
		return motCodigo;
	}

	public void setMotCodigo(String motCodigo) {
		this.motCodigo = motCodigo;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getNombreTipoDocumento() {
		return nombreTipoDocumento;
	}

	public void setNombreTipoDocumento(String nombreTipoDocumento) {
		this.nombreTipoDocumento = nombreTipoDocumento;
	}

	public String getNumeroDocumentoCompra() {
		return numeroDocumentoCompra;
	}

	public void setNumeroDocumentoCompra(String numeroDocumentoCompra) {
		this.numeroDocumentoCompra = numeroDocumentoCompra;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getRucCompra() {
		return rucCompra;
	}

	public void setRucCompra(String rucCompra) {
		this.rucCompra = rucCompra;
	}

	public String getUsrFechaInsertaCompras() {
		return usrFechaInsertaCompras;
	}

	public void setUsrFechaInsertaCompras(String usrFechaInsertaCompras) {
		this.usrFechaInsertaCompras = usrFechaInsertaCompras;
	}

	public String getUsrInsertaCompras() {
		return usrInsertaCompras;
	}

	public void setUsrInsertaCompras(String usrInsertaCompras) {
		this.usrInsertaCompras = usrInsertaCompras;
	}

	public BigDecimal getValorRetencion() {
		return valorRetencion;
	}

	public void setValorRetencion(BigDecimal valorRetencion) {
		this.valorRetencion = valorRetencion;
	}
}
