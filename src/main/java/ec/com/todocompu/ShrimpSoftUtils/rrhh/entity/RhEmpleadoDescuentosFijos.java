package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rh_empleado_descuentos_fijos", schema = "recursoshumanos")
public class RhEmpleadoDescuentosFijos implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer descSecuencial;
	private BigDecimal descValor;
	private RhEmpleado rhEmpleado;
	private RhAnticipoMotivo rhAnticipoMotivo;

	public RhEmpleadoDescuentosFijos() {
	}

	public RhEmpleadoDescuentosFijos(Integer descSecuencial) {
		this.descSecuencial = descSecuencial;
	}

	public RhEmpleadoDescuentosFijos(Integer descSecuencial, BigDecimal descValor) {
		this.descSecuencial = descSecuencial;
		this.descValor = descValor;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "desc_secuencial")
	public Integer getDescSecuencial() {
		return descSecuencial;
	}

	public void setDescSecuencial(Integer descSecuencial) {
		this.descSecuencial = descSecuencial;
	}

	@Column(name = "desc_valor")
	public BigDecimal getDescValor() {
		return descValor;
	}

	public void setDescValor(BigDecimal descValor) {
		this.descValor = descValor;
	}

	@JoinColumns({ @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa"),
			@JoinColumn(name = "emp_id", referencedColumnName = "emp_id") })
	@ManyToOne(optional = false)
	@JsonIgnore
	public RhEmpleado getRhEmpleado() {
		return rhEmpleado;
	}

	public void setRhEmpleado(RhEmpleado rhEmpleado) {
		this.rhEmpleado = rhEmpleado;
	}

	@JoinColumns({ @JoinColumn(name = "mot_empresa", referencedColumnName = "mot_empresa"),
			@JoinColumn(name = "mot_detalle", referencedColumnName = "mot_detalle") })
	@ManyToOne(optional = false)
	public RhAnticipoMotivo getRhAnticipoMotivo() {
		return rhAnticipoMotivo;
	}

	public void setRhAnticipoMotivo(RhAnticipoMotivo rhAnticipoMotivo) {
		this.rhAnticipoMotivo = rhAnticipoMotivo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (descSecuencial != null ? descSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhEmpleadoDescuentosFijos)) {
			return false;
		}
		RhEmpleadoDescuentosFijos other = (RhEmpleadoDescuentosFijos) object;
		if ((this.descSecuencial == null && other.descSecuencial != null)
				|| (this.descSecuencial != null && !this.descSecuencial.equals(other.descSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhEmpleadoDescuentosFijos[ descSecuencial=" + descSecuencial + " ]";
	}
}
