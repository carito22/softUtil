package ec.com.todocompu.ShrimpSoftUtils.caja.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "caj_vales_numeracion", schema = "caja")
public class CajValesNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected CajValesNumeracionPK cajValesNumeracionPK;
	@Column(name = "num_secuencia")
	private String numSecuencia;

	public CajValesNumeracion() {
	}

	public CajValesNumeracion(CajValesNumeracionPK cajValesNumeracionPK) {
		this.cajValesNumeracionPK = cajValesNumeracionPK;
	}

	public CajValesNumeracion(CajValesNumeracionPK cajValesNumeracionPK, String numSecuencia) {
		this.cajValesNumeracionPK = cajValesNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public CajValesNumeracion(String numEmpresa, String numPeriodo, String numMotivo) {
		this.cajValesNumeracionPK = new CajValesNumeracionPK(numEmpresa, numPeriodo, numMotivo);
	}

	public CajValesNumeracionPK getCajValesNumeracionPK() {
		return cajValesNumeracionPK;
	}

	public void setCajValesNumeracionPK(CajValesNumeracionPK cajValesNumeracionPK) {
		this.cajValesNumeracionPK = cajValesNumeracionPK;
	}

	public String getNumSecuencia() {
		return numSecuencia;
	}

	public void setNumSecuencia(String numSecuencia) {
		this.numSecuencia = numSecuencia;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cajValesNumeracionPK != null ? cajValesNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CajValesNumeracion)) {
			return false;
		}
		CajValesNumeracion other = (CajValesNumeracion) object;
		if ((this.cajValesNumeracionPK == null && other.cajValesNumeracionPK != null)
				|| (this.cajValesNumeracionPK != null
						&& !this.cajValesNumeracionPK.equals(other.cajValesNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "caja.entity.CajValesNumeracion[ cajValesNumeracionPK=" + cajValesNumeracionPK + " ]";
	}

}
