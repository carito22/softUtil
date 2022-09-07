package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhListaDetalleAnticiposLoteTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "dal_fecha")
	private String dalFecha;
	@Column(name = "dal_id")
	private String dalId;
	@Column(name = "dal_nombres")
	private String dalNombres;
	@Column(name = "dal_valor")
	private BigDecimal dalValor;
	@Column(name = "dal_forma_pago_detalle")
	private String dalFormaPagoDetalle;
	@Column(name = "dal_documento")
	private String dalDocumento;
	@Column(name = "dal_observaciones")
	private String dalObservaciones;

	public RhListaDetalleAnticiposLoteTO() {
	}

	public RhListaDetalleAnticiposLoteTO(String dalFecha, String dalId, String dalNombres, BigDecimal dalValor,
			String dalFormaPagoDetalle, String dalDocumento, String dalObservaciones, Integer id) {
		this.dalFecha = dalFecha;
		this.dalId = dalId;
		this.dalNombres = dalNombres;
		this.dalValor = dalValor;
		this.dalFormaPagoDetalle = dalFormaPagoDetalle;
		this.dalDocumento = dalDocumento;
		this.dalObservaciones = dalObservaciones;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDalDocumento() {
		return dalDocumento;
	}

	public void setDalDocumento(String dalDocumento) {
		this.dalDocumento = dalDocumento;
	}

	public String getDalFecha() {
		return dalFecha;
	}

	public void setDalFecha(String dalFecha) {
		this.dalFecha = dalFecha;
	}

	public String getDalFormaPagoDetalle() {
		return dalFormaPagoDetalle;
	}

	public void setDalFormaPagoDetalle(String dalFormaPagoDetalle) {
		this.dalFormaPagoDetalle = dalFormaPagoDetalle;
	}

	public String getDalId() {
		return dalId;
	}

	public void setDalId(String dalId) {
		this.dalId = dalId;
	}

	public String getDalNombres() {
		return dalNombres;
	}

	public void setDalNombres(String dalNombres) {
		this.dalNombres = dalNombres;
	}

	public String getDalObservaciones() {
		return dalObservaciones;
	}

	public void setDalObservaciones(String dalObservaciones) {
		this.dalObservaciones = dalObservaciones;
	}

	public BigDecimal getDalValor() {
		return dalValor;
	}

	public void setDalValor(BigDecimal dalValor) {
		this.dalValor = dalValor;
	}
}
