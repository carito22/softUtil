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
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConCuentas;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;

@Entity
@Table(name = "rh_anticipo", schema = "recursoshumanos")
public class RhAnticipo implements Serializable {
    
	private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
        @Column(name = "ant_secuencial")
	private Integer antSecuencial;
        @Column(name = "ant_valor")
	private BigDecimal antValor;
        @Column(name = "ant_documento")
	private String antDocumento;
        @Column(name = "ant_observaciones")
	private String antObservaciones;
        @Column(name = "ant_auxiliar")
	private boolean antAuxiliar;
        @JoinColumns({ @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa"),
            @JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo") })
        @ManyToOne(optional = false)
	private PrdSector prdSector;
        @JoinColumns({ @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa"),
            @JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo") })
        @ManyToOne(optional = false)
	private ConCuentas conCuentas;
        @JoinColumns({ @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa"),
			@JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo"),
			@JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo"),
			@JoinColumn(name = "con_numero", referencedColumnName = "con_numero") })
	@ManyToOne(optional = false)
        @JsonIgnore
	private ConContable conContable;
        @JoinColumns({ @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa"),
            @JoinColumn(name = "emp_id", referencedColumnName = "emp_id") })
        @ManyToOne(optional = false)
	private RhEmpleado rhEmpleado;

	public RhAnticipo() {
	}

	public RhAnticipo(Integer antSecuencial) {
		this.antSecuencial = antSecuencial;
	}

	public RhAnticipo(Integer antSecuencial, BigDecimal antValor, String antDocumento, String antObservaciones,
			boolean antAuxiliar, PrdSector prdSector, ConCuentas conCuentas, ConContable conContable,
			RhEmpleado rhEmpleado) {
		this.antSecuencial = antSecuencial;
		this.antValor = antValor;
		this.antDocumento = antDocumento;
		this.antObservaciones = antObservaciones;
		this.antAuxiliar = antAuxiliar;
		this.prdSector = prdSector;
		this.conCuentas = conCuentas;
		this.conContable = conContable;
		this.rhEmpleado = rhEmpleado;
	}

	public Integer getAntSecuencial() {
		return antSecuencial;
	}

	public void setAntSecuencial(Integer antSecuencial) {
		this.antSecuencial = antSecuencial;
	}

	public BigDecimal getAntValor() {
		return antValor;
	}

	public void setAntValor(BigDecimal antValor) {
		this.antValor = antValor;
	}

	public String getAntDocumento() {
		return antDocumento;
	}

	public void setAntDocumento(String antDocumento) {
		this.antDocumento = antDocumento;
	}

	public String getAntObservaciones() {
		return antObservaciones;
	}

	public void setAntObservaciones(String antObservaciones) {
		this.antObservaciones = antObservaciones;
	}

	
	public boolean isAntAuxiliar() {
		return antAuxiliar;
	}

	public void setAntAuxiliar(boolean antAuxiliar) {
		this.antAuxiliar = antAuxiliar;
	}

	public PrdSector getPrdSector() {
		return prdSector;
	}

	public void setPrdSector(PrdSector prdSector) {
		this.prdSector = prdSector;
	}

	public ConCuentas getConCuentas() {
		return conCuentas;
	}

	public void setConCuentas(ConCuentas conCuentas) {
		this.conCuentas = conCuentas;
	}

	
	public ConContable getConContable() {
		return conContable;
	}

	public void setConContable(ConContable conContable) {
		this.conContable = conContable;
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
		hash += (antSecuencial != null ? antSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhAnticipo)) {
			return false;
		}
		RhAnticipo other = (RhAnticipo) object;
		if ((this.antSecuencial == null && other.antSecuencial != null)
				|| (this.antSecuencial != null && !this.antSecuencial.equals(other.antSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhAnticipo[ antSecuencial=" + antSecuencial + " ]";
	}
}
