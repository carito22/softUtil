package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "con_contable_motivo_anulacion", schema = "contabilidad")
public class ConContableMotivoAnulacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ConContableMotivoAnulacionPK conContableMotivoAnulacionPK;
	@Column(name = "anu_comentario")
	private String anuComentario;
	@JoinColumns({ @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa"),
			@JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo"),
			@JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo"),
			@JoinColumn(name = "con_numero", referencedColumnName = "con_numero") })
	@ManyToOne(optional = false)
	private ConContable conContable;

	public ConContableMotivoAnulacion() {
	}

	public ConContableMotivoAnulacion(ConContableMotivoAnulacionPK conContableMotivoAnulacionPK) {
		this.conContableMotivoAnulacionPK = conContableMotivoAnulacionPK;
	}

	public ConContableMotivoAnulacion(ConContableMotivoAnulacionPK conContableMotivoAnulacionPK, String anuComentario) {
		this.conContableMotivoAnulacionPK = conContableMotivoAnulacionPK;
		this.anuComentario = anuComentario;
	}

	public ConContableMotivoAnulacion(String anuEmpresa, String anuPeriodo, String anuTipo, String anuNumero) {
		this.conContableMotivoAnulacionPK = new ConContableMotivoAnulacionPK(anuEmpresa, anuPeriodo, anuTipo,
				anuNumero);
	}

	public ConContableMotivoAnulacionPK getConContableMotivoAnulacionPK() {
		return conContableMotivoAnulacionPK;
	}

	public void setConContableMotivoAnulacionPK(ConContableMotivoAnulacionPK conContableMotivoAnulacionPK) {
		this.conContableMotivoAnulacionPK = conContableMotivoAnulacionPK;
	}

	public String getAnuComentario() {
		return anuComentario;
	}

	public void setAnuComentario(String anuComentario) {
		this.anuComentario = anuComentario;
	}

	public ConContable getConContable() {
		return conContable;
	}

	public void setConContable(ConContable conContable) {
		this.conContable = conContable;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conContableMotivoAnulacionPK != null ? conContableMotivoAnulacionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConContableMotivoAnulacion)) {
			return false;
		}
		ConContableMotivoAnulacion other = (ConContableMotivoAnulacion) object;
		if ((this.conContableMotivoAnulacionPK == null && other.conContableMotivoAnulacionPK != null)
				|| (this.conContableMotivoAnulacionPK != null
						&& !this.conContableMotivoAnulacionPK.equals(other.conContableMotivoAnulacionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConContableMotivoAnulacion[ conContableMotivoAnulacionPK="
				+ conContableMotivoAnulacionPK + " ]";
	}

}
