package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inv_transferencias_motivo_anulacion", schema = "inventario")
public class InvTransferenciasMotivoAnulacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "anu_secuencial")
	private Integer anuSecuencial;

	@Column(name = "anu_comentario")
	private String anuComentario;

	@JoinColumns({ @JoinColumn(name = "trans_empresa", referencedColumnName = "trans_empresa"),
			@JoinColumn(name = "trans_periodo", referencedColumnName = "trans_periodo"),
			@JoinColumn(name = "trans_motivo", referencedColumnName = "trans_motivo"),
			@JoinColumn(name = "trans_numero", referencedColumnName = "trans_numero") })
	@ManyToOne(optional = false)
	private InvTransferencias invTransferencias;

	public InvTransferenciasMotivoAnulacion() {
	}

	public Integer getAnuSecuencial() {
		return anuSecuencial;
	}

	public void setAnuSecuencial(Integer anuSecuencial) {
		this.anuSecuencial = anuSecuencial;
	}

	public String getAnuComentario() {
		return anuComentario;
	}

	public void setAnuComentario(String anuComentario) {
		this.anuComentario = anuComentario;
	}

	public InvTransferencias getInvTransferencias() {
		return invTransferencias;
	}

	public void setInvTransferencias(InvTransferencias invTransferencias) {
		this.invTransferencias = invTransferencias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anuSecuencial == null) ? 0 : anuSecuencial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvTransferenciasMotivoAnulacion other = (InvTransferenciasMotivoAnulacion) obj;
		if (anuSecuencial == null) {
			if (other.anuSecuencial != null)
				return false;
		} else if (!anuSecuencial.equals(other.anuSecuencial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvTransferenciasMotivoAnulacion[ invTransferenciasMotivoAnulacionPK=" + anuSecuencial
				+ " ]";
	}

}
