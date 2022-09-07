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
@Table(name = "rh_vacaciones", schema = "recursoshumanos")
public class RhVacaciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "vac_secuencial")
	private Integer vacSecuencial;
	@Column(name = "vac_desde")
	@Temporal(TemporalType.DATE)
	private Date vacDesde;
	@Column(name = "vac_hasta")
	@Temporal(TemporalType.DATE)
	private Date vacHasta;
	@Column(name = "vac_gozadas")
	private boolean vacGozadas;
	@Column(name = "vac_gozadas_desde")
	@Temporal(TemporalType.DATE)
	private Date vacGozadasDesde;
	@Column(name = "vac_gozadas_hasta")
	@Temporal(TemporalType.DATE)
	private Date vacGozadasHasta;
	@Column(name = "vac_valor")
	private BigDecimal vacValor;
	@Column(name = "vac_forma_pago")
	private String vacFormaPago;
	@Column(name = "vac_auxiliar")
	private boolean vacAuxiliar;
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

	public RhVacaciones() {
	}

	public RhVacaciones(Integer vacSecuencial) {
		this.vacSecuencial = vacSecuencial;
	}

	public RhVacaciones(Integer vacSecuencial, Date vacDesde, Date vacHasta, boolean vacGozadas, BigDecimal vacValor,
			String vacFormaPago, boolean vacAuxiliar, String secEmpresa, String secCodigo, String conEmpresa,
			String conPeriodo, String conTipo, String conNumero) {
		this.vacSecuencial = vacSecuencial;
		this.vacDesde = vacDesde;
		this.vacHasta = vacHasta;
		this.vacGozadas = vacGozadas;
		this.vacValor = vacValor;
		this.vacFormaPago = vacFormaPago;
		this.vacAuxiliar = vacAuxiliar;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.conEmpresa = conEmpresa;
		this.conPeriodo = conPeriodo;
		this.conTipo = conTipo;
		this.conNumero = conNumero;
	}

	public Integer getVacSecuencial() {
		return vacSecuencial;
	}

	public void setVacSecuencial(Integer vacSecuencial) {
		this.vacSecuencial = vacSecuencial;
	}

	public Date getVacDesde() {
		return vacDesde;
	}

	public void setVacDesde(Date vacDesde) {
		this.vacDesde = vacDesde;
	}

	public Date getVacHasta() {
		return vacHasta;
	}

	public void setVacHasta(Date vacHasta) {
		this.vacHasta = vacHasta;
	}

	public boolean getVacGozadas() {
		return vacGozadas;
	}

	public void setVacGozadas(boolean vacGozadas) {
		this.vacGozadas = vacGozadas;
	}

	public Date getVacGozadasDesde() {
		return vacGozadasDesde;
	}

	public void setVacGozadasDesde(Date vacGozadasDesde) {
		this.vacGozadasDesde = vacGozadasDesde;
	}

	public Date getVacGozadasHasta() {
		return vacGozadasHasta;
	}

	public void setVacGozadasHasta(Date vacGozadasHasta) {
		this.vacGozadasHasta = vacGozadasHasta;
	}

	public BigDecimal getVacValor() {
		return vacValor;
	}

	public void setVacValor(BigDecimal vacValor) {
		this.vacValor = vacValor;
	}

	public String getVacFormaPago() {
		return vacFormaPago;
	}

	public void setVacFormaPago(String vacFormaPago) {
		this.vacFormaPago = vacFormaPago;
	}

	public boolean getVacAuxiliar() {
		return vacAuxiliar;
	}

	public void setVacAuxiliar(boolean vacAuxiliar) {
		this.vacAuxiliar = vacAuxiliar;
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
		hash += (vacSecuencial != null ? vacSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhVacaciones)) {
			return false;
		}
		RhVacaciones other = (RhVacaciones) object;
		if ((this.vacSecuencial == null && other.vacSecuencial != null)
				|| (this.vacSecuencial != null && !this.vacSecuencial.equals(other.vacSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhVacaciones[ vacSecuencial=" + vacSecuencial + " ]";
	}
}
