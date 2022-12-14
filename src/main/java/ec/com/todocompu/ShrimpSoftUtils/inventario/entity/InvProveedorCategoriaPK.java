package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProveedorCategoriaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "pc_empresa")
	private String pcEmpresa;
	@Column(name = "pc_codigo")
	private String pcCodigo;

	public InvProveedorCategoriaPK() {
	}

	public InvProveedorCategoriaPK(String pcEmpresa, String pcCodigo) {
		this.pcEmpresa = pcEmpresa;
		this.pcCodigo = pcCodigo;
	}

	public String getPcEmpresa() {
		return pcEmpresa;
	}

	public void setPcEmpresa(String pcEmpresa) {
		this.pcEmpresa = pcEmpresa;
	}

	public String getPcCodigo() {
		return pcCodigo;
	}

	public void setPcCodigo(String pcCodigo) {
		this.pcCodigo = pcCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (pcEmpresa != null ? pcEmpresa.hashCode() : 0);
		hash += (pcCodigo != null ? pcCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProveedorCategoriaPK)) {
			return false;
		}
		InvProveedorCategoriaPK other = (InvProveedorCategoriaPK) object;
		if ((this.pcEmpresa == null && other.pcEmpresa != null)
				|| (this.pcEmpresa != null && !this.pcEmpresa.equals(other.pcEmpresa))) {
			return false;
		}
		if ((this.pcCodigo == null && other.pcCodigo != null)
				|| (this.pcCodigo != null && !this.pcCodigo.equals(other.pcCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProveedorCategoriaPK[ pcEmpresa=" + pcEmpresa + ", pcCodigo=" + pcCodigo + " ]";
	}

}
