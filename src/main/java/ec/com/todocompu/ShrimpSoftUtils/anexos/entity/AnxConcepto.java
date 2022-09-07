package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_concepto", schema = "anexo")
@XmlRootElement
public class AnxConcepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "con_secuencial")
	private Integer conSecuencial;
	@Column(name = "con_codigo")
	private String conCodigo;
	@Column(name = "con_concepto")
	private String conConcepto;
	@Column(name = "con_porcentaje")
	private BigDecimal conPorcentaje;
	@Column(name = "con_ingresa_porcentaje")
	private Character conIngresaPorcentaje;
	@Column(name = "con_fecha_inicio")
	@Temporal(TemporalType.DATE)
	private Date conFechaInicio;
	@Column(name = "con_fecha_fin")
	@Temporal(TemporalType.DATE)
	private Date conFechaFin;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "conCodigo")
	private List<AnxCompraDividendo> anxCompraDividendoList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "detConcepto")
	private List<AnxCompraDetalle> anxCompraDetalleList;

	public AnxConcepto() {
	}

	public AnxConcepto(String conCodigo) {
		this.conCodigo = conCodigo;
	}

	public String getConCodigo() {
		return conCodigo;
	}

	public void setConCodigo(String conCodigo) {
		this.conCodigo = conCodigo;
	}

	public String getConConcepto() {
		return conConcepto;
	}

	public void setConConcepto(String conConcepto) {
		this.conConcepto = conConcepto;
	}

	public BigDecimal getConPorcentaje() {
		return conPorcentaje;
	}

	public void setConPorcentaje(BigDecimal conPorcentaje) {
		this.conPorcentaje = conPorcentaje;
	}

	public Character getConIngresaPorcentaje() {
		return conIngresaPorcentaje;
	}

	public void setConIngresaPorcentaje(Character conIngresaPorcentaje) {
		this.conIngresaPorcentaje = conIngresaPorcentaje;
	}

	public Date getConFechaInicio() {
		return conFechaInicio;
	}

	public void setConFechaInicio(Date conFechaInicio) {
		this.conFechaInicio = conFechaInicio;
	}

	public Date getConFechaFin() {
		return conFechaFin;
	}

	public void setConFechaFin(Date conFechaFin) {
		this.conFechaFin = conFechaFin;
	}

	public List<AnxCompraDividendo> getAnxCompraDividendoList() {
		return anxCompraDividendoList;
	}

	public void setAnxCompraDividendoList(List<AnxCompraDividendo> anxCompraDividendoList) {
		this.anxCompraDividendoList = anxCompraDividendoList;
	}

	public List<AnxCompraDetalle> getAnxCompraDetalleList() {
		return anxCompraDetalleList;
	}

	public void setAnxCompraDetalleList(List<AnxCompraDetalle> anxCompraDetalleList) {
		this.anxCompraDetalleList = anxCompraDetalleList;
	}

        public Integer getConSecuencial() {
            return conSecuencial;
        }

        public void setConSecuencial(Integer conSecuencial) {
            this.conSecuencial = conSecuencial;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conCodigo != null ? conCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxConcepto)) {
			return false;
		}
		AnxConcepto other = (AnxConcepto) object;
		if ((this.conCodigo == null && other.conCodigo != null)
				|| (this.conCodigo != null && !this.conCodigo.equals(other.conCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxConcepto[ conCodigo=" + conCodigo + " ]";
	}

}
