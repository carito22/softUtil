package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

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

@Entity
@Table(name = "anx_compra_detalle", schema = "anexo")
public class AnxCompraDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencial")
	private Integer detSecuencial;
	@Column(name = "det_base0")
	private BigDecimal detBase0;
	@Column(name = "det_baseimponible")
	private BigDecimal detBaseimponible;
	@Column(name = "det_basenoobjetoiva")
	private BigDecimal detBasenoobjetoiva;
	@Column(name = "det_porcentaje")
	private BigDecimal detPorcentaje;
	@Column(name = "det_valorretenido")
	private BigDecimal detValorretenido;
	@Column(name = "det_orden")
	private int detOrden;
        @Column(name = "det_concepto")
	private String detConcepto;
	@JoinColumns({ @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa"),
			@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo"),
			@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo"),
			@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero") })
	@ManyToOne(optional = false)
	private AnxCompra anxCompra;

	public AnxCompraDetalle() {
	}

	public AnxCompraDetalle(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public BigDecimal getDetBase0() {
		return detBase0;
	}

	public void setDetBase0(BigDecimal detBase0) {
		this.detBase0 = detBase0;
	}

	public BigDecimal getDetBaseimponible() {
		return detBaseimponible;
	}

	public void setDetBaseimponible(BigDecimal detBaseimponible) {
		this.detBaseimponible = detBaseimponible;
	}

	public BigDecimal getDetBasenoobjetoiva() {
		return detBasenoobjetoiva;
	}

	public void setDetBasenoobjetoiva(BigDecimal detBasenoobjetoiva) {
		this.detBasenoobjetoiva = detBasenoobjetoiva;
	}

	public BigDecimal getDetPorcentaje() {
		return detPorcentaje;
	}

	public void setDetPorcentaje(BigDecimal detPorcentaje) {
		this.detPorcentaje = detPorcentaje;
	}

	public BigDecimal getDetValorretenido() {
		return detValorretenido;
	}

	public void setDetValorretenido(BigDecimal detValorretenido) {
		this.detValorretenido = detValorretenido;
	}

	public int getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(int detOrden) {
		this.detOrden = detOrden;
	}

	public String getDetConcepto() {
		return detConcepto;
	}

	public void setDetConcepto(String detConcepto) {
		this.detConcepto = detConcepto;
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
		hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxCompraDetalle)) {
			return false;
		}
		AnxCompraDetalle other = (AnxCompraDetalle) object;
		if ((this.detSecuencial == null && other.detSecuencial != null)
				|| (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxCompraDetalle[ detSecuencial=" + detSecuencial + " ]";
	}

}
