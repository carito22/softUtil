package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

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

@Entity
@Table(name = "rh_salario_digno", schema = "recursoshumanos")
public class RhSalarioDigno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "sdig_secuencial")
	private Integer sdigSecuencial;
	@Column(name = "sdig_desde")
	@Temporal(TemporalType.DATE)
	private Date sdigDesde;
	@Column(name = "sdig_hasta")
	@Temporal(TemporalType.DATE)
	private Date sdigHasta;
	@Column(name = "sdig_valor")
	private BigDecimal sdigValor;
	@Column(name = "sdig_forma_pago")
	private String sdigFormaPago;
	@Column(name = "sdig_auxiliar")
	private boolean sdigAuxiliar;
	@Column(name = "sec_empresa")
	private String secEmpresa;
	@Column(name = "sec_codigo")
	private String secCodigo;
	@Column(name = "con_empresa")
	private String conEmpresa;
	@Column(name = "con_periodo")
	private String conPeriodo;
	@Column(name = "con_tipo")
	private String conTipo;
	@Column(name = "con_numero")
	private String conNumero;
	@JoinColumns({ @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa"),
			@JoinColumn(name = "emp_id", referencedColumnName = "emp_id") })
	@ManyToOne(optional = false)
	private RhEmpleado rhEmpleado;

	public RhSalarioDigno() {
	}

	public RhSalarioDigno(Integer sdigSecuencial) {
		this.sdigSecuencial = sdigSecuencial;
	}

	public RhSalarioDigno(Integer sdigSecuencial, Date sdigDesde, Date sdigHasta, BigDecimal sdigValor,
			String sdigFormaPago, boolean sdigAuxiliar, String secEmpresa, String secCodigo, String conEmpresa,
			String conPeriodo, String conTipo, String conNumero) {
		this.sdigSecuencial = sdigSecuencial;
		this.sdigDesde = sdigDesde;
		this.sdigHasta = sdigHasta;
		this.sdigValor = sdigValor;
		this.sdigFormaPago = sdigFormaPago;
		this.sdigAuxiliar = sdigAuxiliar;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.conEmpresa = conEmpresa;
		this.conPeriodo = conPeriodo;
		this.conTipo = conTipo;
		this.conNumero = conNumero;
	}

	public Integer getSdigSecuencial() {
		return sdigSecuencial;
	}

	public void setSdigSecuencial(Integer sdigSecuencial) {
		this.sdigSecuencial = sdigSecuencial;
	}

	public Date getSdigDesde() {
		return sdigDesde;
	}

	public void setSdigDesde(Date sdigDesde) {
		this.sdigDesde = sdigDesde;
	}

	public Date getSdigHasta() {
		return sdigHasta;
	}

	public void setSdigHasta(Date sdigHasta) {
		this.sdigHasta = sdigHasta;
	}

	public BigDecimal getSdigValor() {
		return sdigValor;
	}

	public void setSdigValor(BigDecimal sdigValor) {
		this.sdigValor = sdigValor;
	}

	public String getSdigFormaPago() {
		return sdigFormaPago;
	}

	public void setSdigFormaPago(String sdigFormaPago) {
		this.sdigFormaPago = sdigFormaPago;
	}

	public boolean getSdigAuxiliar() {
		return sdigAuxiliar;
	}

	public void setSdigAuxiliar(boolean sdigAuxiliar) {
		this.sdigAuxiliar = sdigAuxiliar;
	}

	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getConEmpresa() {
		return conEmpresa;
	}

	public void setConEmpresa(String conEmpresa) {
		this.conEmpresa = conEmpresa;
	}

	public String getConPeriodo() {
		return conPeriodo;
	}

	public void setConPeriodo(String conPeriodo) {
		this.conPeriodo = conPeriodo;
	}

	public String getConTipo() {
		return conTipo;
	}

	public void setConTipo(String conTipo) {
		this.conTipo = conTipo;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public RhEmpleado getRhEmpleado() {
		return rhEmpleado;
	}

	public void setRhEmpleado(RhEmpleado rhEmpleado) {
		this.rhEmpleado = rhEmpleado;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sdigSecuencial != null ? sdigSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhSalarioDigno)) {
			return false;
		}
		RhSalarioDigno other = (RhSalarioDigno) object;
		if ((this.sdigSecuencial == null && other.sdigSecuencial != null)
				|| (this.sdigSecuencial != null && !this.sdigSecuencial.equals(other.sdigSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhSalarioDigno[ sdigSecuencial=" + sdigSecuencial + " ]";
	}
}
