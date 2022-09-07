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
@Table(name = "inv_consumos_motivo_anulacion", schema = "inventario")
public class InvConsumosMotivoAnulacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "anu_secuencial")
	private Integer anuSecuencial;

	@Column(name = "anu_comentario")
	private String anuComentario;

	@JoinColumns({ @JoinColumn(name = "cons_empresa", referencedColumnName = "cons_empresa"),
			@JoinColumn(name = "cons_periodo", referencedColumnName = "cons_periodo"),
			@JoinColumn(name = "cons_motivo", referencedColumnName = "cons_motivo"),
			@JoinColumn(name = "cons_numero", referencedColumnName = "cons_numero") })
	@ManyToOne(optional = false)
	private InvConsumos invConsumos;

	public InvConsumosMotivoAnulacion() {
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

	public InvConsumos getInvConsumos() {
		return invConsumos;
	}

	public void setInvConsumos(InvConsumos invConsumos) {
		this.invConsumos = invConsumos;
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
		InvConsumosMotivoAnulacion other = (InvConsumosMotivoAnulacion) obj;
		if (anuSecuencial == null) {
			if (other.anuSecuencial != null)
				return false;
		} else if (!anuSecuencial.equals(other.anuSecuencial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvConsumosMotivoAnulacion[ invConsumosMotivoAnulacionPK=" + anuSecuencial + " ]";
	}

}
