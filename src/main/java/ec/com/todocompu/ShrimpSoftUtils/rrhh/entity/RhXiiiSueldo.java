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
@Table(name = "rh_xiii_sueldo", schema = "recursoshumanos")
public class RhXiiiSueldo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer xiiiSecuencial;
	private Date xiiiDesde;
	private Date xiiiHasta;
	private Integer xiiiDiasLaborados;
	private BigDecimal xiiiBaseImponible;
	private BigDecimal xiiiValor;
	private String xiiiDocumento;
	private String xiiiObservaciones;
	private String xiiiCodigoMinisterial;
	private boolean xiiiAuxiliar;
	private String empCargo;
	private Date empFechaIngreso;
	private PrdSector prdSector;
	private ConCuentas conCuentas;
	private ConContable conContable;
	private RhEmpleado rhEmpleado;

	public RhXiiiSueldo() {
	}

	public RhXiiiSueldo(Integer xiiiSecuencial) {
		this.xiiiSecuencial = xiiiSecuencial;
	}

	public RhXiiiSueldo(Integer xiiiSecuencial, Date xiiiDesde, Date xiiiHasta, Integer xiiiDiasLaborados,
			BigDecimal xiiiBaseImponible, BigDecimal xiiiValor, String xiiiDocumento, String xiiiObservaciones,
			String xiiiCodigoMinisterial, boolean xiiiAuxiliar, String empCargo, Date empFechaIngreso,
			PrdSector prdSector, ConCuentas conCuentas, ConContable conContable, RhEmpleado rhEmpleado) {
		this.xiiiSecuencial = xiiiSecuencial;
		this.xiiiDesde = xiiiDesde;
		this.xiiiHasta = xiiiHasta;
		this.xiiiDiasLaborados = xiiiDiasLaborados;
		this.xiiiBaseImponible = xiiiBaseImponible;
		this.xiiiValor = xiiiValor;
		this.xiiiDocumento = xiiiDocumento;
		this.xiiiObservaciones = xiiiObservaciones;
		this.xiiiCodigoMinisterial = xiiiCodigoMinisterial;
		this.xiiiAuxiliar = xiiiAuxiliar;
		this.empCargo = empCargo;
		this.empFechaIngreso = empFechaIngreso;
		this.prdSector = prdSector;
		this.conCuentas = conCuentas;
		this.conContable = conContable;
		this.rhEmpleado = rhEmpleado;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "xiii_secuencial")
	public Integer getXiiiSecuencial() {
		return xiiiSecuencial;
	}

	public void setXiiiSecuencial(Integer xiiiSecuencial) {
		this.xiiiSecuencial = xiiiSecuencial;
	}

	@Column(name = "xiii_desde")
	public Date getXiiiDesde() {
		return xiiiDesde;
	}

	public void setXiiiDesde(Date xiiiDesde) {
		this.xiiiDesde = xiiiDesde;
	}

	@Column(name = "xiii_hasta")
	public Date getXiiiHasta() {
		return xiiiHasta;
	}

	public void setXiiiHasta(Date xiiiHasta) {
		this.xiiiHasta = xiiiHasta;
	}

	@Column(name = "xiii_dias_laborados")
	public Integer getXiiiDiasLaborados() {
		return xiiiDiasLaborados;
	}

	public void setXiiiDiasLaborados(Integer xiiiDiasLaborados) {
		this.xiiiDiasLaborados = xiiiDiasLaborados;
	}

	@Column(name = "xiii_base_imponible")
	public BigDecimal getXiiiBaseImponible() {
		return xiiiBaseImponible;
	}

	public void setXiiiBaseImponible(BigDecimal xiiiBaseImponible) {
		this.xiiiBaseImponible = xiiiBaseImponible;
	}

	@Column(name = "xiii_valor")
	public BigDecimal getXiiiValor() {
		return xiiiValor;
	}

	public void setXiiiValor(BigDecimal xiiiValor) {
		this.xiiiValor = xiiiValor;
	}

	@Column(name = "xiii_documento")
	public String getXiiiDocumento() {
		return xiiiDocumento;
	}

	public void setXiiiDocumento(String xiiiDocumento) {
		this.xiiiDocumento = xiiiDocumento;
	}

	@Column(name = "xiii_observaciones")
	public String getXiiiObservaciones() {
		return xiiiObservaciones;
	}

	public void setXiiiObservaciones(String xiiiObservaciones) {
		this.xiiiObservaciones = xiiiObservaciones;
	}

	@Column(name = "xiii_codigo_ministerial")
	public String getXiiiCodigoMinisterial() {
		return xiiiCodigoMinisterial;
	}

	public void setXiiiCodigoMinisterial(String xiiiCodigoMinisterial) {
		this.xiiiCodigoMinisterial = xiiiCodigoMinisterial;
	}

	@Column(name = "xiii_auxiliar")
	public boolean isXiiiAuxiliar() {
		return xiiiAuxiliar;
	}

	public void setXiiiAuxiliar(boolean xiiiAuxiliar) {
		this.xiiiAuxiliar = xiiiAuxiliar;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (xiiiSecuencial != null ? xiiiSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhXiiiSueldo)) {
			return false;
		}
		RhXiiiSueldo other = (RhXiiiSueldo) object;
		if ((this.xiiiSecuencial == null && other.xiiiSecuencial != null)
				|| (this.xiiiSecuencial != null && !this.xiiiSecuencial.equals(other.xiiiSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhXiiiSueldo[ xiiiSecuencial=" + xiiiSecuencial + " ]";
	}
}
