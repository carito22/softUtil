package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhListaRolSaldoEmpleadoDetalladoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String sedConcepto;
	private String sedDetalle;
	private String sedCp;
	private String sedCc;
	private String sedFecha;
	private BigDecimal sedValor;
	private String sedObservaciones;
	private String sedContable;

	public RhListaRolSaldoEmpleadoDetalladoTO() {
	}

	public RhListaRolSaldoEmpleadoDetalladoTO(String sedConcepto, String sedDetalle, String sedCp, String sedCc,
			String sedFecha, BigDecimal sedValor, String sedObservaciones, String sedContable, Integer id) {
		this.sedConcepto = sedConcepto;
		this.sedDetalle = sedDetalle;
		this.sedCp = sedCp;
		this.sedCc = sedCc;
		this.sedFecha = sedFecha;
		this.sedValor = sedValor;
		this.sedObservaciones = sedObservaciones;
		this.sedContable = sedContable;
		this.id = id;
	}

	@Id
	@Column(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "sed_cc")
	public String getSedCc() {
		return sedCc;
	}

	public void setSedCc(String sedCc) {
		this.sedCc = sedCc;
	}

	@Column(name = "sed_concepto")
	public String getSedConcepto() {
		return sedConcepto;
	}

	public void setSedConcepto(String sedConcepto) {
		this.sedConcepto = sedConcepto;
	}

	@Column(name = "sed_contable")
	public String getSedContable() {
		return sedContable;
	}

	public void setSedContable(String sedContable) {
		this.sedContable = sedContable;
	}

	@Column(name = "sed_cp")
	public String getSedCp() {
		return sedCp;
	}

	public void setSedCp(String sedCp) {
		this.sedCp = sedCp;
	}

	@Column(name = "sed_detalle")
	public String getSedDetalle() {
		return sedDetalle;
	}

	public void setSedDetalle(String sedDetalle) {
		this.sedDetalle = sedDetalle;
	}

	@Column(name = "sed_fecha")
	public String getSedFecha() {
		return sedFecha;
	}

	public void setSedFecha(String sedFecha) {
		this.sedFecha = sedFecha;
	}

	@Column(name = "sed_observaciones")
	public String getSedObservaciones() {
		return sedObservaciones;
	}

	public void setSedObservaciones(String sedObservaciones) {
		this.sedObservaciones = sedObservaciones;
	}

	@Column(name = "sed_valor")
	public BigDecimal getSedValor() {
		return sedValor;
	}

	public void setSedValor(BigDecimal sedValor) {
		this.sedValor = sedValor;
	}

	@Override
	public String toString() {
		return "RhListaRolSaldoEmpleadoDetalladoTO [id=" + id + ", sedConcepto=" + sedConcepto + ", sedDetalle="
				+ sedDetalle + ", sedCp=" + sedCp + ", sedCc=" + sedCc + ", sedFecha=" + sedFecha + ", sedValor="
				+ sedValor + ", sedObservaciones=" + sedObservaciones + ", sedContable=" + sedContable + "]";
	}

}
