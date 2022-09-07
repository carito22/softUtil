package ec.com.todocompu.ShrimpSoftUtils.caja.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CajValesConceptosPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "conc_empresa")
	private String concEmpresa;
	@Column(name = "conc_codigo")
	private String concCodigo;

	public CajValesConceptosPK() {
	}

	public CajValesConceptosPK(String concEmpresa, String concCodigo) {
		this.concEmpresa = concEmpresa;
		this.concCodigo = concCodigo;
	}

	public String getConcEmpresa() {
		return concEmpresa;
	}

	public void setConcEmpresa(String concEmpresa) {
		this.concEmpresa = concEmpresa;
	}

	public String getConcCodigo() {
		return concCodigo;
	}

	public void setConcCodigo(String concCodigo) {
		this.concCodigo = concCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (concEmpresa != null ? concEmpresa.hashCode() : 0);
		hash += (concCodigo != null ? concCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CajValesConceptosPK)) {
			return false;
		}
		CajValesConceptosPK other = (CajValesConceptosPK) object;
		if ((this.concEmpresa == null && other.concEmpresa != null)
				|| (this.concEmpresa != null && !this.concEmpresa.equals(other.concEmpresa))) {
			return false;
		}
		if ((this.concCodigo == null && other.concCodigo != null)
				|| (this.concCodigo != null && !this.concCodigo.equals(other.concCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "caja.entity.CajValesConceptosPK[ concEmpresa=" + concEmpresa + ", concCodigo=" + concCodigo + " ]";
	}

}
