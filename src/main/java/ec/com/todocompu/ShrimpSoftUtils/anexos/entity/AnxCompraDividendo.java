package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_compra_dividendo", schema = "anexo")
@XmlRootElement
public class AnxCompraDividendo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "div_secuencial")
	private Integer divSecuencial;
	@Column(name = "div_fecha_pago")
	@Temporal(TemporalType.DATE)
	private Date divFechaPago;
	@Column(name = "div_ir_asociado")
	private BigDecimal divIrAsociado;
	@Column(name = "div_anio_utilidades")
	private String divAnioUtilidades;
	@Column(name = "con_codigo")
	private String conCodigo;
	@JoinColumns({ @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa"),
			@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo"),
			@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo"),
			@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero") })
	@ManyToOne(optional = false)
	private AnxCompra anxCompra;

	public AnxCompraDividendo() {
	}

	public AnxCompraDividendo(Integer divSecuencial) {
		this.divSecuencial = divSecuencial;
	}

	public AnxCompraDividendo(Integer divSecuencial, Date divFechaPago, BigDecimal divIrAsociado,
			String divAnioUtilidades) {
		this.divSecuencial = divSecuencial;
		this.divFechaPago = divFechaPago;
		this.divIrAsociado = divIrAsociado;
		this.divAnioUtilidades = divAnioUtilidades;
	}

	public Integer getDivSecuencial() {
		return divSecuencial;
	}

	public void setDivSecuencial(Integer divSecuencial) {
		this.divSecuencial = divSecuencial;
	}

	public Date getDivFechaPago() {
		return divFechaPago;
	}

	public void setDivFechaPago(Date divFechaPago) {
		this.divFechaPago = divFechaPago;
	}

	public BigDecimal getDivIrAsociado() {
		return divIrAsociado;
	}

	public void setDivIrAsociado(BigDecimal divIrAsociado) {
		this.divIrAsociado = divIrAsociado;
	}

	public String getDivAnioUtilidades() {
		return divAnioUtilidades;
	}

	public void setDivAnioUtilidades(String divAnioUtilidades) {
		this.divAnioUtilidades = divAnioUtilidades;
	}

	public String getConCodigo() {
		return conCodigo;
	}

	public void setConCodigo(String conCodigo) {
		this.conCodigo = conCodigo;
	}

	public AnxCompra getAnxCompra() {
		return anxCompra;
	}

	public void setAnxCompra(AnxCompra anxCompra) {
		this.anxCompra = anxCompra;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (divSecuencial != null ? divSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxCompraDividendo)) {
			return false;
		}
		AnxCompraDividendo other = (AnxCompraDividendo) object;
		if ((this.divSecuencial == null && other.divSecuencial != null)
				|| (this.divSecuencial != null && !this.divSecuencial.equals(other.divSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxCompraDividendo[ divSecuencial=" + divSecuencial + " ]";
	}

}
