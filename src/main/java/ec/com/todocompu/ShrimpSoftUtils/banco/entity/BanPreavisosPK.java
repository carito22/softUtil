package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BanPreavisosPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "pre_empresa")
	private String preEmpresa;
	@Column(name = "pre_cuenta_contable")
	private String preCuentaContable;
	@Column(name = "pre_nombre_archivo_generado")
	private String preNombreArchivoGenerado;

	public BanPreavisosPK() {
	}

	public BanPreavisosPK(String preEmpresa, String preCuentaContable, String preNombreArchivoGenerado) {
		this.preEmpresa = preEmpresa;
		this.preCuentaContable = preCuentaContable;
		this.preNombreArchivoGenerado = preNombreArchivoGenerado;
	}

	public String getPreEmpresa() {
		return preEmpresa;
	}

	public void setPreEmpresa(String preEmpresa) {
		this.preEmpresa = preEmpresa;
	}

	public String getPreCuentaContable() {
		return preCuentaContable;
	}

	public void setPreCuentaContable(String preCuentaContable) {
		this.preCuentaContable = preCuentaContable;
	}

	public String getPreNombreArchivoGenerado() {
		return preNombreArchivoGenerado;
	}

	public void setPreNombreArchivoGenerado(String preNombreArchivoGenerado) {
		this.preNombreArchivoGenerado = preNombreArchivoGenerado;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (preEmpresa != null ? preEmpresa.hashCode() : 0);
		hash += (preCuentaContable != null ? preCuentaContable.hashCode() : 0);
		hash += (preNombreArchivoGenerado != null ? preNombreArchivoGenerado.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof BanPreavisosPK)) {
			return false;
		}
		BanPreavisosPK other = (BanPreavisosPK) object;
		if ((this.preEmpresa == null && other.preEmpresa != null)
				|| (this.preEmpresa != null && !this.preEmpresa.equals(other.preEmpresa))) {
			return false;
		}
		if ((this.preCuentaContable == null && other.preCuentaContable != null)
				|| (this.preCuentaContable != null && !this.preCuentaContable.equals(other.preCuentaContable))) {
			return false;
		}
		if ((this.preNombreArchivoGenerado == null && other.preNombreArchivoGenerado != null)
				|| (this.preNombreArchivoGenerado != null
						&& !this.preNombreArchivoGenerado.equals(other.preNombreArchivoGenerado))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "banco.entity.BanPreavisosPK[ preEmpresa=" + preEmpresa + ", preCuentaContable=" + preCuentaContable
				+ ", preNombreArchivoGenerado=" + preNombreArchivoGenerado + " ]";
	}

}
