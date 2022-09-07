package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhListaDetalleBonosLoteTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "dbl_fecha")
	private String dblFecha;
	@Column(name = "dbl_id")
	private String dblId;
	@Column(name = "dbl_nombres")
	private String dblNombres;
	@Column(name = "dbl_valor")
	private BigDecimal dblValor;
	@Column(name = "dbl_forma_pago_detalle")
	private String dblFormaPagoDetalle;
	@Column(name = "dbl_documento")
	private String dblDocumento;
	@Column(name = "dbl_observaciones")
	private String dblObservaciones;

	public RhListaDetalleBonosLoteTO() {
	}

	public RhListaDetalleBonosLoteTO(String dblFecha, String dblId, String dblNombres, BigDecimal dblValor,
			String dblFormaPagoDetalle, String dblDocumento, String dblObservaciones, Integer id) {
		this.dblFecha = dblFecha;
		this.dblId = dblId;
		this.dblNombres = dblNombres;
		this.dblValor = dblValor;
		this.dblFormaPagoDetalle = dblFormaPagoDetalle;
		this.dblDocumento = dblDocumento;
		this.dblObservaciones = dblObservaciones;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDblDocumento() {
		return dblDocumento;
	}

	public void setDblDocumento(String dblDocumento) {
		this.dblDocumento = dblDocumento;
	}

	public String getDblFecha() {
		return dblFecha;
	}

	public void setDblFecha(String dblFecha) {
		this.dblFecha = dblFecha;
	}

	public String getDblFormaPagoDetalle() {
		return dblFormaPagoDetalle;
	}

	public void setDblFormaPagoDetalle(String dblFormaPagoDetalle) {
		this.dblFormaPagoDetalle = dblFormaPagoDetalle;
	}

	public String getDblId() {
		return dblId;
	}

	public void setDblId(String dblId) {
		this.dblId = dblId;
	}

	public String getDblNombres() {
		return dblNombres;
	}

	public void setDblNombres(String dblNombres) {
		this.dblNombres = dblNombres;
	}

	public String getDblObservaciones() {
		return dblObservaciones;
	}

	public void setDblObservaciones(String dblObservaciones) {
		this.dblObservaciones = dblObservaciones;
	}

	public BigDecimal getDblValor() {
		return dblValor;
	}

	public void setDblValor(BigDecimal dblValor) {
		this.dblValor = dblValor;
	}
}
