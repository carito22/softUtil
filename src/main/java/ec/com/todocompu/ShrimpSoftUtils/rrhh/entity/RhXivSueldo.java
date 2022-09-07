package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "rh_xiv_sueldo", schema = "recursoshumanos")
public class RhXivSueldo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer xivSecuencial;
	private Date xivDesde;
	private Date xivHasta;
	private Integer xivDiasLaboradosEmpleado;
	private BigDecimal xivBaseImponible;
	private Integer xivDiasCalculados;
	private java.math.BigDecimal xivSalarioMinimoVital;
	private BigDecimal xivValor;
	private String xivDocumento;
	private String xivObservaciones;
	private String xivCodigoMinisterial;
	private boolean xivAuxiliar;
	private String empCargo;
	private BigDecimal empSueldo;
	private Date empFechaIngreso;
	private PrdSector prdSector;
	private ConCuentas conCuentas;
	private ConContable conContable;
	private RhEmpleado rhEmpleado;

	public RhXivSueldo() {
	}

	public RhXivSueldo(Integer xivSecuencial) {
		this.xivSecuencial = xivSecuencial;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "xiv_secuencial")
	public Integer getXivSecuencial() {
		return xivSecuencial;
	}

	public void setXivSecuencial(Integer xivSecuencial) {
		this.xivSecuencial = xivSecuencial;
	}

	@Column(name = "xiv_desde")
	public Date getXivDesde() {
		return xivDesde;
	}

	public void setXivDesde(Date xivDesde) {
		this.xivDesde = xivDesde;
	}

	@Column(name = "xiv_hasta")
	public Date getXivHasta() {
		return xivHasta;
	}

	public void setXivHasta(Date xivHasta) {
		this.xivHasta = xivHasta;
	}

	@Column(name = "xiv_dias_laborados_empleado")
	public Integer getXivDiasLaboradosEmpleado() {
		return xivDiasLaboradosEmpleado;
	}

	public void setXivDiasLaboradosEmpleado(Integer xivDiasLaboradosEmpleado) {
		this.xivDiasLaboradosEmpleado = xivDiasLaboradosEmpleado;
	}

	@Column(name = "xiv_base_imponible")
	public BigDecimal getXivBaseImponible() {
		return xivBaseImponible;
	}

	public void setXivBaseImponible(BigDecimal xivBaseImponible) {
		this.xivBaseImponible = xivBaseImponible;
	}

	@Column(name = "xiv_valor")
	public BigDecimal getXivValor() {
		return xivValor;
	}

	public void setXivValor(BigDecimal xivValor) {
		this.xivValor = xivValor;
	}

	@Column(name = "xiv_documento")
	public String getXivDocumento() {
		return xivDocumento;
	}

	public void setXivDocumento(String xivDocumento) {
		this.xivDocumento = xivDocumento;
	}

	@Column(name = "xiv_observaciones")
	public String getXivObservaciones() {
		return xivObservaciones;
	}

	public void setXivObservaciones(String xivObservaciones) {
		this.xivObservaciones = xivObservaciones;
	}

	@Column(name = "xiv_codigo_ministerial")
	public String getXivCodigoMinisterial() {
		return xivCodigoMinisterial;
	}

	public void setXivCodigoMinisterial(String xivCodigoMinisterial) {
		this.xivCodigoMinisterial = xivCodigoMinisterial;
	}

	@Column(name = "xiv_auxiliar")
	public boolean isXivAuxiliar() {
		return xivAuxiliar;
	}

	public void setXivAuxiliar(boolean xivAuxiliar) {
		this.xivAuxiliar = xivAuxiliar;
	}

	@Column(name = "emp_cargo")
	public String getEmpCargo() {
		return empCargo;
	}

	public void setEmpCargo(String empCargo) {
		this.empCargo = empCargo;
	}

	@Column(name = "emp_sueldo")
	public BigDecimal getEmpSueldo() {
		return empSueldo;
	}

	public void setEmpSueldo(BigDecimal empSueldo) {
		this.empSueldo = empSueldo;
	}

	@Column(name = "emp_fecha_ingreso")
	public Date getEmpFechaIngreso() {
		return empFechaIngreso;
	}

	public void setEmpFechaIngreso(Date empFechaIngreso) {
		this.empFechaIngreso = empFechaIngreso;
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
        @JsonIgnore
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

        @Column(name = "xiv_dias_calculados")
        public Integer getXivDiasCalculados() {
            return xivDiasCalculados;
        }

        public void setXivDiasCalculados(Integer xivDiasCalculados) {
            this.xivDiasCalculados = xivDiasCalculados;
        }

        @Column(name = "xiv_salario_minimo_vital")
        public BigDecimal getXivSalarioMinimoVital() {
            return xivSalarioMinimoVital;
        }

        public void setXivSalarioMinimoVital(BigDecimal xivSalarioMinimoVital) {
            this.xivSalarioMinimoVital = xivSalarioMinimoVital;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (xivSecuencial != null ? xivSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhXivSueldo)) {
			return false;
		}
		RhXivSueldo other = (RhXivSueldo) object;
		if ((this.xivSecuencial == null && other.xivSecuencial != null)
				|| (this.xivSecuencial != null && !this.xivSecuencial.equals(other.xivSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhXivSueldo[ xivSecuencial=" + xivSecuencial + " ]";
	}
}
