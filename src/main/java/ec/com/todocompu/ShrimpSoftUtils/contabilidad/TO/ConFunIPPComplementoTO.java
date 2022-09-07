package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConFunIPPComplementoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "c_empresa")
	private String empresa;
	@Column(name = "c_periodo")
	private String periodo;
	@Column(name = "c_tipo")
	private String tipo;
	@Column(name = "c_numero")
	private String numero;
	@Column(name = "c_fecha")
	private Date fecha;
	@Column(name = "c_pendiente")
	private boolean pendiente;
	@Column(name = "c_anulado")
	private boolean anulado;

	public ConFunIPPComplementoTO() {
	}

	public ConFunIPPComplementoTO(Integer id, String empresa, String periodo, String tipo, String numero, Date fecha,
			boolean pendiente, boolean anulado) {
		this.id = id;
		this.empresa = empresa;
		this.periodo = periodo;
		this.tipo = tipo;
		this.numero = numero;
		this.fecha = fecha;
		this.pendiente = pendiente;
		this.anulado = anulado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isPendiente() {
		return pendiente;
	}

	public void setPendiente(boolean pendiente) {
		this.pendiente = pendiente;
	}

	public boolean isAnulado() {
		return anulado;
	}

	public void setAnulado(boolean anulado) {
		this.anulado = anulado;
	}

}
