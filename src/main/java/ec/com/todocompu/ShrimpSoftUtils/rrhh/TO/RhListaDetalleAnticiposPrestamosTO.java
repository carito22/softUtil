/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhListaDetalleAnticiposPrestamosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "dap_tipo")
	private String dapTipo;

	@Column(name = "dap_categoria")
	private String dapCategoria;

	@Column(name = "dap_fecha")
	private String dapFecha;

	@Column(name = "dap_id")
	private String dapId;

	@Column(name = "dap_nombres")
	private String dapNombres;

	@Column(name = "dap_valor")
	private BigDecimal dapValor;

	@Column(name = "dap_reversado")
	private Boolean dapReverso;

	@Column(name = "dap_forma_pago")
	private String dapFormaPago;

	@Column(name = "dap_documento")
	private String dapDocumento;

	@Column(name = "dap_contable")
	private String dapContable;

	@Column(name = "dap_anulado")
	private Boolean dapAnulado;

	@Column(name = "dap_pendiente")
	private Boolean dapPendiente;

	@Column(name = "dap_observaciones")
	private String dapObservaciones;

	public RhListaDetalleAnticiposPrestamosTO() {
	}

	public RhListaDetalleAnticiposPrestamosTO(Integer id, String dapTipo, String dapCategoria, String dapFecha,
			String dapId, String dapNombres, BigDecimal dapValor, Boolean dapReverso, String dapFormaPago,
			String dapDocumento, String dapContable, Boolean dapAnulado, Boolean dapPendiente,
			String dapObservaciones) {
		this.id = id;
		this.dapTipo = dapTipo;
		this.dapCategoria = dapCategoria;
		this.dapFecha = dapFecha;
		this.dapId = dapId;
		this.dapNombres = dapNombres;
		this.dapValor = dapValor;
		this.dapReverso = dapReverso;
		this.dapFormaPago = dapFormaPago;
		this.dapDocumento = dapDocumento;
		this.dapContable = dapContable;
		this.dapAnulado = dapAnulado;
		this.dapPendiente = dapPendiente;
		this.dapObservaciones = dapObservaciones;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getDapAnulado() {
		return dapAnulado;
	}

	public void setDapAnulado(Boolean dapAnulado) {
		this.dapAnulado = dapAnulado;
	}

	public String getDapCategoria() {
		return dapCategoria;
	}

	public void setDapCategoria(String dapCategoria) {
		this.dapCategoria = dapCategoria;
	}

	public String getDapContable() {
		return dapContable;
	}

	public void setDapContable(String dapContable) {
		this.dapContable = dapContable;
	}

	public String getDapDocumento() {
		return dapDocumento;
	}

	public void setDapDocumento(String dapDocumento) {
		this.dapDocumento = dapDocumento;
	}

	public String getDapFecha() {
		return dapFecha;
	}

	public void setDapFecha(String dapFecha) {
		this.dapFecha = dapFecha;
	}

	public String getDapFormaPago() {
		return dapFormaPago;
	}

	public void setDapFormaPago(String dapFormaPago) {
		this.dapFormaPago = dapFormaPago;
	}

	public String getDapId() {
		return dapId;
	}

	public void setDapId(String dapId) {
		this.dapId = dapId;
	}

	public String getDapNombres() {
		return dapNombres;
	}

	public void setDapNombres(String dapNombres) {
		this.dapNombres = dapNombres;
	}

	public String getDapObservaciones() {
		return dapObservaciones;
	}

	public void setDapObservaciones(String dapObservaciones) {
		this.dapObservaciones = dapObservaciones;
	}

	public Boolean getDapReverso() {
		return dapReverso;
	}

	public void setDapReverso(Boolean dapReverso) {
		this.dapReverso = dapReverso;
	}

	public Boolean getDapPendiente() {
		return dapPendiente;
	}

	public void setDapPendiente(Boolean dapPendiente) {
		this.dapPendiente = dapPendiente;
	}

	public String getDapTipo() {
		return dapTipo;
	}

	public void setDapTipo(String dapTipo) {
		this.dapTipo = dapTipo;
	}

	public BigDecimal getDapValor() {
		return dapValor;
	}

	public void setDapValor(BigDecimal dapValor) {
		this.dapValor = dapValor;
	}
}