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
@Table(name = "inv_compras_motivo_anulacion", schema = "inventario")
public class InvComprasMotivoAnulacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "anu_secuencial")
	private Integer anuSecuencial;

	@Column(name = "anu_comentario")
	private String anuComentario;

	@JoinColumns({ @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa"),
			@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo"),
			@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo"),
			@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero") })
	@ManyToOne(optional = false)
	private InvCompras invCompras;

	public InvComprasMotivoAnulacion() {
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

	public InvCompras getInvCompras() {
		return invCompras;
	}

	public void setInvCompras(InvCompras invCompras) {
		this.invCompras = invCompras;
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
		InvComprasMotivoAnulacion other = (InvComprasMotivoAnulacion) obj;
		if (anuSecuencial == null) {
			if (other.anuSecuencial != null)
				return false;
		} else if (!anuSecuencial.equals(other.anuSecuencial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvComprasMotivoAnulacion[ invComprasMotivoAnulacionPK=" + anuSecuencial + " ]";
	}

}
