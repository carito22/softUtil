package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConListaConsultaConsumosTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cons_numero")
	private String consNumero;
	@Column(name = "cons_periodo")
	private String consPeriodo;
	@Column(name = "cons_motivo")
	private String consMotivo;
	@Column(name = "cons_fecha")
	private String consFecha;

	public ConListaConsultaConsumosTO() {
	}

	public ConListaConsultaConsumosTO(String consPeriodo, String consMotivo, String consNumero, String consFecha) {
		this.consPeriodo = consPeriodo;
		this.consMotivo = consMotivo;
		this.consNumero = consNumero;
		this.consFecha = consFecha;
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

	public String getConsPeriodo() {
		return consPeriodo;
	}

	public void setConsPeriodo(String consPeriodo) {
		this.consPeriodo = consPeriodo;
	}

}
