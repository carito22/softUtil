package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Andres Guachisaca
 */
@Entity
public class InvListaConsultaTransferenciaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "trans_status")
	private String transStatus;

	@Column(name = "trans_fecha")
	private String transFecha;

	@Column(name = "trans_observaciones")
	private String transObservaciones;

	@Column(name = "trans_numero")
	private String transNumero;

	public InvListaConsultaTransferenciaTO() {
	}

	public InvListaConsultaTransferenciaTO(String transStatus, String transFecha, String transObservaciones,
			String transNumero, Integer id) {
		this.transStatus = transStatus;
		this.transFecha = transFecha;
		this.transObservaciones = transObservaciones;
		this.transNumero = transNumero;
		this.id = id;
	}

	public String getTransFecha() {
		return transFecha;
	}

	public void setTransFecha(String transFecha) {
		this.transFecha = transFecha;
	}

	public String getTransNumero() {
		return transNumero;
	}

	public void setTransNumero(String transNumero) {
		this.transNumero = transNumero;
	}

	public String getTransObservaciones() {
		return transObservaciones;
	}

	public void setTransObservaciones(String transObservaciones) {
		this.transObservaciones = transObservaciones;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
