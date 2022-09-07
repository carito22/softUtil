package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sis_permiso", schema = "sistemaweb")
public class SisPermiso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected SisPermisoPK sisPermisoPK;
	@Column(name = "per_item_etiqueta", updatable = false)
	private String perItemEtiqueta;
	@Column(name = "per_url", updatable = false)
	private String perURL;
	@Column(name = "per_icono", updatable = false)
	private String perIcono;
	@Column(name = "per_secuencia", updatable = false)
	private int perSecuencia;
	@Column(name = "per_usuarios")
	private String perUsuarios;
	@JoinColumn(name = "emp_codigo", referencedColumnName = "emp_codigo")
	@ManyToOne
	private SisEmpresa empCodigo;

	public SisPermiso() {
	}

	public SisPermiso(SisPermisoPK sisPermisoPK) {
		this.sisPermisoPK = sisPermisoPK;
	}

	public SisPermiso(SisPermisoPK sisPermisoPK, String perItemEtiqueta, int perSecuencia, String perUsuarios) {
		this.sisPermisoPK = sisPermisoPK;
		this.perItemEtiqueta = perItemEtiqueta;
		this.perSecuencia = perSecuencia;
		this.perUsuarios = perUsuarios;
	}

	public SisPermiso(SisPermisoPK sisPermisoPK, String perItemEtiqueta, String perURL, String perIcono,
			int perSecuencia, String perUsuarios, SisEmpresa empCodigo) {
		this.sisPermisoPK = sisPermisoPK;
		this.perItemEtiqueta = perItemEtiqueta;
		this.perURL = perURL;
		this.perIcono = perIcono;
		this.perSecuencia = perSecuencia;
		this.perUsuarios = perUsuarios;
		this.empCodigo = empCodigo;
	}

	public SisPermiso(String perEmpresa, String perModulo, String perMenu, String perItem) {
		this.sisPermisoPK = new SisPermisoPK(perEmpresa, perModulo, perMenu, perItem);
	}

	public SisPermisoPK getSisPermisoPK() {
		return sisPermisoPK;
	}

	public void setSisPermisoPK(SisPermisoPK sisPermisoPK) {
		this.sisPermisoPK = sisPermisoPK;
	}

	public String getPerItemEtiqueta() {
		return perItemEtiqueta;
	}

	public void setPerItemEtiqueta(String perItemEtiqueta) {
		this.perItemEtiqueta = perItemEtiqueta;
	}

	public String getPerURL() {
		return perURL;
	}

	public void setPerURL(String perURL) {
		this.perURL = perURL;
	}

	public String getPerIcono() {
		return perIcono;
	}

	public void setPerIcono(String perIcono) {
		this.perIcono = perIcono;
	}

	public int getPerSecuencia() {
		return perSecuencia;
	}

	public void setPerSecuencia(int perSecuencia) {
		this.perSecuencia = perSecuencia;
	}

	public String getPerUsuarios() {
		return perUsuarios;
	}

	public void setPerUsuarios(String perUsuarios) {
		this.perUsuarios = perUsuarios;
	}

	public SisEmpresa getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(SisEmpresa empCodigo) {
		this.empCodigo = empCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sisPermisoPK != null ? sisPermisoPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SisPermiso)) {
			return false;
		}
		SisPermiso other = (SisPermiso) object;
		if ((this.sisPermisoPK == null && other.sisPermisoPK != null)
				|| (this.sisPermisoPK != null && !this.sisPermisoPK.equals(other.sisPermisoPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "sistemaWeb.entity.SisPermiso[ sisPermisoPK=" + sisPermisoPK + " ]";
	}

}
