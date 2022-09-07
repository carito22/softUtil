package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_tipocomprobante", schema = "anexo")
@XmlRootElement
public class AnxTipocomprobante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "tc_codigo")
	private String tcCodigo;
	@Column(name = "tc_descripcion")
	private String tcDescripcion;
	@Column(name = "tc_transaccion")
	private String tcTransaccion;
	@Column(name = "tc_sustento")
	private String tcSustento;
	@Column(name = "tc_abreviatura")
	private String tcAbreviatura;
	@Column(name = "tc_reporte")
	private String tcReporte;
	@OneToMany(mappedBy = "tcCodigo")
	private List<AnxAnulados> anxAnuladosList;

	public AnxTipocomprobante() {
	}

	public AnxTipocomprobante(String tcCodigo) {
		this.tcCodigo = tcCodigo;
	}

	public String getTcCodigo() {
		return tcCodigo;
	}

	public void setTcCodigo(String tcCodigo) {
		this.tcCodigo = tcCodigo;
	}

	public String getTcDescripcion() {
		return tcDescripcion;
	}

	public void setTcDescripcion(String tcDescripcion) {
		this.tcDescripcion = tcDescripcion;
	}

	public String getTcTransaccion() {
		return tcTransaccion;
	}

	public void setTcTransaccion(String tcTransaccion) {
		this.tcTransaccion = tcTransaccion;
	}

	public String getTcSustento() {
		return tcSustento;
	}

	public void setTcSustento(String tcSustento) {
		this.tcSustento = tcSustento;
	}

	public String getTcAbreviatura() {
		return tcAbreviatura;
	}

	public void setTcAbreviatura(String tcAbreviatura) {
		this.tcAbreviatura = tcAbreviatura;
	}

	public String getTcReporte() {
		return tcReporte;
	}

	public void setTcReporte(String tcReporte) {
		this.tcReporte = tcReporte;
	}

	public List<AnxAnulados> getAnxAnuladosList() {
		return anxAnuladosList;
	}

	public void setAnxAnuladosList(List<AnxAnulados> anxAnuladosList) {
		this.anxAnuladosList = anxAnuladosList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tcCodigo != null ? tcCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxTipocomprobante)) {
			return false;
		}
		AnxTipocomprobante other = (AnxTipocomprobante) object;
		if ((this.tcCodigo == null && other.tcCodigo != null)
				|| (this.tcCodigo != null && !this.tcCodigo.equals(other.tcCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxTipocomprobante[ tcCodigo=" + tcCodigo + " ]";
	}

}
