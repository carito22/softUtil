/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author misayo
 */
@Entity
public class AnxListaRetencionVentaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tt_codigo")
	private String ttCodigo;

	@Column(name = "cli_id_numero")
	private String cliId;

	@Column(name = "vta_documento_tipo")
	private String vtaDocumentoTipo;

	@Column(name = "n_retenciones")
	private BigInteger nRetenciones;

	@Column(name = "ven_basenoobjetoiva")
	private BigDecimal venBaseNoObjetoIva;

	@Column(name = "ven_base0")
	private BigDecimal venBase0;

	@Column(name = "ven_baseimponible")
	private BigDecimal venBaseImponible;

	@Column(name = "ven_montoiva")
	private BigDecimal venMontoIva;

	@Column(name = "ven_valorretenidoiva")
	private BigDecimal venValorRetenidoIva;

	@Column(name = "ven_valorretenidorenta")
	private BigDecimal venValorRetenidoRenta;

	public AnxListaRetencionVentaTO() {
	}

	public AnxListaRetencionVentaTO(String ttCodigo, String cliId, String vtaDocumentoTipo, BigInteger nRetenciones,
			BigDecimal venBaseNoObjetoIva, BigDecimal venBase0, BigDecimal venBaseImponible, BigDecimal venMontoIva,
			BigDecimal venValorRetenidoIva, BigDecimal venValorRetenidoRenta) {
		this.ttCodigo = ttCodigo;
		this.cliId = cliId;
		this.vtaDocumentoTipo = vtaDocumentoTipo;
		this.nRetenciones = nRetenciones;
		this.venBaseNoObjetoIva = venBaseNoObjetoIva;
		this.venBase0 = venBase0;
		this.venBaseImponible = venBaseImponible;
		this.venMontoIva = venMontoIva;
		this.venValorRetenidoIva = venValorRetenidoIva;
		this.venValorRetenidoRenta = venValorRetenidoRenta;
	}

	public String getCliId() {
		return cliId;
	}

	public void setCliId(String cliId) {
		this.cliId = cliId;
	}

	public BigInteger getnRetenciones() {
		return nRetenciones;
	}

	public void setnRetenciones(BigInteger nRetenciones) {
		this.nRetenciones = nRetenciones;
	}

	public String getTtCodigo() {
		return ttCodigo;
	}

	public void setTtCodigo(String ttCodigo) {
		this.ttCodigo = ttCodigo;
	}

	public BigDecimal getVenBase0() {
		return venBase0;
	}

	public void setVenBase0(BigDecimal venBase0) {
		this.venBase0 = venBase0;
	}

	public BigDecimal getVenBaseImponible() {
		return venBaseImponible;
	}

	public void setVenBaseImponible(BigDecimal venBaseImponible) {
		this.venBaseImponible = venBaseImponible;
	}

	public BigDecimal getVenBaseNoObjetoIva() {
		return venBaseNoObjetoIva;
	}

	public void setVenBaseNoObjetoIva(BigDecimal venBaseNoObjetoIva) {
		this.venBaseNoObjetoIva = venBaseNoObjetoIva;
	}

	public BigDecimal getVenMontoIva() {
		return venMontoIva;
	}

	public void setVenMontoIva(BigDecimal venMontoIva) {
		this.venMontoIva = venMontoIva;
	}

	public BigDecimal getVenValorRetenidoIva() {
		return venValorRetenidoIva;
	}

	public void setVenValorRetenidoIva(BigDecimal venValorRetenidoIva) {
		this.venValorRetenidoIva = venValorRetenidoIva;
	}

	public BigDecimal getVenValorRetenidoRenta() {
		return venValorRetenidoRenta;
	}

	public void setVenValorRetenidoRenta(BigDecimal venValorRetenidoRenta) {
		this.venValorRetenidoRenta = venValorRetenidoRenta;
	}

	public String getVtaDocumentoTipo() {
		return vtaDocumentoTipo;
	}

	public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
		this.vtaDocumentoTipo = vtaDocumentoTipo;
	}

}
