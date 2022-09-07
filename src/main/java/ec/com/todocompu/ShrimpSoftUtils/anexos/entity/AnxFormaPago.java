package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_forma_pago", schema = "anexo")
@XmlRootElement
public class AnxFormaPago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "fp_codigo")
	private String fpCodigo;
	@Column(name = "fp_detalle")
	private String fpDetalle;
	@Column(name = "fp_desde")
	private Date fpDesde;
	@Column(name = "fp_hasta")
	private Date fpHasta;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fpCodigo")
	private List<AnxCompraFormaPago> anxCompraFormaPagoList;

	public AnxFormaPago() {
	}

	public AnxFormaPago(String fpCodigo) {
		this.fpCodigo = fpCodigo;
	}

	public AnxFormaPago(String fpCodigo, String fpDetalle) {
		this.fpCodigo = fpCodigo;
		this.fpDetalle = fpDetalle;
	}

	public String getFpCodigo() {
		return fpCodigo;
	}

	public void setFpCodigo(String fpCodigo) {
		this.fpCodigo = fpCodigo;
	}

	public String getFpDetalle() {
		return fpDetalle;
	}

	public void setFpDetalle(String fpDetalle) {
		this.fpDetalle = fpDetalle;
	}

	public List<AnxCompraFormaPago> getAnxCompraFormaPagoList() {
		return anxCompraFormaPagoList;
	}

	public void setAnxCompraFormaPagoList(List<AnxCompraFormaPago> anxCompraFormaPagoList) {
		this.anxCompraFormaPagoList = anxCompraFormaPagoList;
	}

	public Date getFpDesde() {
		return fpDesde;
	}

	public void setFpDesde(Date fpDesde) {
		this.fpDesde = fpDesde;
	}

	public Date getFpHasta() {
		return fpHasta;
	}

	public void setFpHasta(Date fpHasta) {
		this.fpHasta = fpHasta;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (fpCodigo != null ? fpCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxFormaPago)) {
			return false;
		}
		AnxFormaPago other = (AnxFormaPago) object;
		if ((this.fpCodigo == null && other.fpCodigo != null)
				|| (this.fpCodigo != null && !this.fpCodigo.equals(other.fpCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxFormaPago[ fpCodigo=" + fpCodigo + " ]";
	}

}
