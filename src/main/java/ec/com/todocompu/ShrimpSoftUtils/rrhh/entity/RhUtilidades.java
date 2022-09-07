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

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConCuentas;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;

@Entity
@Table(name = "rh_utilidades", schema = "recursoshumanos")
public class RhUtilidades implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer utiSecuencial;
	private Date utiDesde;
	private Date utiHasta;
	private Integer utiDiasLaborados;
	private BigDecimal utiValorPersonal;
	private BigDecimal utiValorCargas;
	private BigDecimal utiValorTotal;
	private BigDecimal utiImpuestoRenta;
	private String utiCodigoMinisterial;
	private String utiDocumento;
	private String utiObservaciones;
	private boolean utiAuxiliar;
	private String empCargo;
	private Date empFechaIngreso;
	private int empCargasFamiliares;
	private PrdSector prdSector;
	private ConCuentas conCuentas;
	private ConContable conContable;
	private RhEmpleado rhEmpleado;

	public RhUtilidades() {
	}

	public RhUtilidades(Integer utiSecuencial) {
		this.utiSecuencial = utiSecuencial;
	}

	public RhUtilidades(Integer utiSecuencial, Date utiDesde, Date utiHasta, Integer utiDiasLaborados,
			BigDecimal utiValorPersonal, BigDecimal utiValorCargas, BigDecimal utiValorTotal,
			String utiCodigoMinisterial, String utiDocumento, String utiObservaciones, boolean utiAuxiliar,
			String empCargo, Date empFechaIngreso, int empCargasFamiliares, PrdSector prdSector, ConCuentas conCuentas,
			ConContable conContable, RhEmpleado rhEmpleado) {
		this.utiSecuencial = utiSecuencial;
		this.utiDesde = utiDesde;
		this.utiHasta = utiHasta;
		this.utiDiasLaborados = utiDiasLaborados;
		this.utiValorPersonal = utiValorPersonal;
		this.utiValorCargas = utiValorCargas;
		this.utiValorTotal = utiValorTotal;
		this.utiCodigoMinisterial = utiCodigoMinisterial;
		this.utiDocumento = utiDocumento;
		this.utiObservaciones = utiObservaciones;
		this.utiAuxiliar = utiAuxiliar;
		this.empCargo = empCargo;
		this.empFechaIngreso = empFechaIngreso;
		this.empCargasFamiliares = empCargasFamiliares;
		this.prdSector = prdSector;
		this.conCuentas = conCuentas;
		this.conContable = conContable;
		this.rhEmpleado = rhEmpleado;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "uti_secuencial")
	public Integer getUtiSecuencial() {
		return utiSecuencial;
	}

	public void setUtiSecuencial(Integer utiSecuencial) {
		this.utiSecuencial = utiSecuencial;
	}

	@Column(name = "uti_desde")
	public Date getUtiDesde() {
		return utiDesde;
	}

	public void setUtiDesde(Date utiDesde) {
		this.utiDesde = utiDesde;
	}

	@Column(name = "uti_hasta")
	public Date getUtiHasta() {
		return utiHasta;
	}

	public void setUtiHasta(Date utiHasta) {
		this.utiHasta = utiHasta;
	}

	@Column(name = "uti_dias_laborados")
	public Integer getUtiDiasLaborados() {
		return utiDiasLaborados;
	}

	public void setUtiDiasLaborados(Integer utiDiasLaborados) {
		this.utiDiasLaborados = utiDiasLaborados;
	}

	@Column(name = "uti_valor_personal")
	public BigDecimal getUtiValorPersonal() {
		return utiValorPersonal;
	}

	public void setUtiValorPersonal(BigDecimal utiValorPersonal) {
		this.utiValorPersonal = utiValorPersonal;
	}

	@Column(name = "uti_valor_cargas")
	public BigDecimal getUtiValorCargas() {
		return utiValorCargas;
	}

	public void setUtiValorCargas(BigDecimal utiValorCargas) {
		this.utiValorCargas = utiValorCargas;
	}

        @Column(name = "uti_impuesto_renta")
        public BigDecimal getUtiImpuestoRenta() {
            return utiImpuestoRenta;
        }

        public void setUtiImpuestoRenta(BigDecimal utiImpuestoRenta) {
            this.utiImpuestoRenta = utiImpuestoRenta;
        }

	@Column(name = "uti_valor_total")
	public BigDecimal getUtiValorTotal() {
		return utiValorTotal;
	}

	public void setUtiValorTotal(BigDecimal utiValorTotal) {
		this.utiValorTotal = utiValorTotal;
	}

	@Column(name = "uti_codigo_ministerial")
	public String getUtiCodigoMinisterial() {
		return utiCodigoMinisterial;
	}

	public void setUtiCodigoMinisterial(String utiCodigoMinisterial) {
		this.utiCodigoMinisterial = utiCodigoMinisterial;
	}

	@Column(name = "uti_documento")
	public String getUtiDocumento() {
		return utiDocumento;
	}

	public void setUtiDocumento(String utiDocumento) {
		this.utiDocumento = utiDocumento;
	}

	@Column(name = "uti_observaciones")
	public String getUtiObservaciones() {
		return utiObservaciones;
	}

	public void setUtiObservaciones(String utiObservaciones) {
		this.utiObservaciones = utiObservaciones;
	}

	@Column(name = "uti_auxiliar")
	public boolean isUtiAuxiliar() {
		return utiAuxiliar;
	}

	public void setUtiAuxiliar(boolean utiAuxiliar) {
		this.utiAuxiliar = utiAuxiliar;
	}

	@Column(name = "emp_cargo")
	public String getEmpCargo() {
		return empCargo;
	}

	public void setEmpCargo(String empCargo) {
		this.empCargo = empCargo;
	}

	@Column(name = "emp_fecha_ingreso")
	public Date getEmpFechaIngreso() {
		return empFechaIngreso;
	}

	public void setEmpFechaIngreso(Date empFechaIngreso) {
		this.empFechaIngreso = empFechaIngreso;
	}

	@Column(name = "emp_cargas_familiares")
	public int getEmpCargasFamiliares() {
		return empCargasFamiliares;
	}

	public void setEmpCargasFamiliares(int empCargasFamiliares) {
		this.empCargasFamiliares = empCargasFamiliares;
	}

	@JoinColumns({ @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa"),
			@JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo") })
	@ManyToOne(optional = false)
	public PrdSector getPrdSector() {
		return prdSector;
	}

	public void setPrdSector(PrdSector prdSector) {
		this.prdSector = prdSector;
	}

	@JoinColumns({ @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa"),
			@JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo") })
	@ManyToOne(optional = false)
	public ConCuentas getConCuentas() {
		return conCuentas;
	}

	public void setConCuentas(ConCuentas conCuentas) {
		this.conCuentas = conCuentas;
	}

	@JoinColumns({ @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa"),
			@JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo"),
			@JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo"),
			@JoinColumn(name = "con_numero", referencedColumnName = "con_numero") })
	@ManyToOne(optional = false)
	public ConContable getConContable() {
		return conContable;
	}

	public void setConContable(ConContable conContable) {
		this.conContable = conContable;
	}

	@JoinColumns({ @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa"),
			@JoinColumn(name = "emp_id", referencedColumnName = "emp_id") })
	@ManyToOne(optional = false)
	public RhEmpleado getRhEmpleado() {
		return rhEmpleado;
	}

	public void setRhEmpleado(RhEmpleado rhEmpleado) {
		this.rhEmpleado = rhEmpleado;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (utiSecuencial != null ? utiSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhUtilidades)) {
			return false;
		}
		RhUtilidades other = (RhUtilidades) object;
		if ((this.utiSecuencial == null && other.utiSecuencial != null)
				|| (this.utiSecuencial != null && !this.utiSecuencial.equals(other.utiSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhUtilidades[ utiSecuencial=" + utiSecuencial + " ]";
	}
}
