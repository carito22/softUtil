package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPiscina;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;

@Entity
@Table(name = "rh_bono", schema = "recursoshumanos")
public class RhBono implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer bonoSecuencial;
	private String bonoConcepto;
	private BigDecimal bonoValor;
	private boolean bonoDeducible;
	private String bonoObservacion;
	private boolean bonoAuxiliar;
	private PrdSector prdSector;
	private PrdPiscina prdPiscina;
	private ConContable conContable;
	private RhEmpleado rhEmpleado;

	public RhBono() {
	}

	public RhBono(Integer bonoSecuencial) {
		this.bonoSecuencial = bonoSecuencial;
	}

	public RhBono(Integer bonoSecuencial, String bonoConcepto, BigDecimal bonoValor, boolean bonoDeducible,
			String bonoObservacion, boolean bonoAuxiliar, PrdSector prdSector, PrdPiscina prdPiscina,
			ConContable conContable, RhEmpleado rhEmpleado) {
		this.bonoSecuencial = bonoSecuencial;
		this.bonoConcepto = bonoConcepto;
		this.bonoValor = bonoValor;
		this.bonoDeducible = bonoDeducible;
		this.bonoObservacion = bonoObservacion;
		this.bonoAuxiliar = bonoAuxiliar;
		this.prdSector = prdSector;
		this.prdPiscina = prdPiscina;
		this.conContable = conContable;
		this.rhEmpleado = rhEmpleado;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "bono_secuencial")
	public Integer getBonoSecuencial() {
		return bonoSecuencial;
	}

	public void setBonoSecuencial(Integer bonoSecuencial) {
		this.bonoSecuencial = bonoSecuencial;
	}

	@Column(name = "bono_concepto")
	public String getBonoConcepto() {
		return bonoConcepto;
	}

	public void setBonoConcepto(String bonoConcepto) {
		this.bonoConcepto = bonoConcepto;
	}

	@Column(name = "bono_valor")
	public BigDecimal getBonoValor() {
		return bonoValor;
	}

	public void setBonoValor(BigDecimal bonoValor) {
		this.bonoValor = bonoValor;
	}

	@Column(name = "bono_deducible")
	public boolean isBonoDeducible() {
		return bonoDeducible;
	}

	public void setBonoDeducible(boolean bonoDeducible) {
		this.bonoDeducible = bonoDeducible;
	}

	@Column(name = "bono_observacion")
	public String getBonoObservacion() {
		return bonoObservacion;
	}

	public void setBonoObservacion(String bonoObservacion) {
		this.bonoObservacion = bonoObservacion;
	}

	@Column(name = "bono_auxiliar")
	public boolean isBonoAuxiliar() {
		return bonoAuxiliar;
	}

	public void setBonoAuxiliar(boolean bonoAuxiliar) {
		this.bonoAuxiliar = bonoAuxiliar;
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

	@JoinColumns({ @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa"),
			@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector"),
			@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero") })
	@ManyToOne
	public PrdPiscina getPrdPiscina() {
		return prdPiscina;
	}

	public void setPrdPiscina(PrdPiscina prdPiscina) {
		this.prdPiscina = prdPiscina;
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
		hash += (bonoSecuencial != null ? bonoSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhBono)) {
			return false;
		}
		RhBono other = (RhBono) object;
		if ((this.bonoSecuencial == null && other.bonoSecuencial != null)
				|| (this.bonoSecuencial != null && !this.bonoSecuencial.equals(other.bonoSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhBono[ bonoSecuencial=" + bonoSecuencial + " ]";
	}
}
