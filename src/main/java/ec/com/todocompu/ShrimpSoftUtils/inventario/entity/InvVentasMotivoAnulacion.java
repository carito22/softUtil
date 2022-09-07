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
@Table(name = "inv_ventas_motivo_anulacion", schema = "inventario")
public class InvVentasMotivoAnulacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "anu_secuencial")
	private Integer anuSecuencial;

	@Column(name = "anu_comentario")
	private String anuComentario;

	@JoinColumns({ @JoinColumn(name = "vta_empresa", referencedColumnName = "vta_empresa"),
			@JoinColumn(name = "vta_periodo", referencedColumnName = "vta_periodo"),
			@JoinColumn(name = "vta_motivo", referencedColumnName = "vta_motivo"),
			@JoinColumn(name = "vta_numero", referencedColumnName = "vta_numero") })
	@ManyToOne(optional = false)
	private InvVentas invVentas;

	public InvVentasMotivoAnulacion() {
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

	public InvVentas getInvVentas() {
		return invVentas;
	}

	public void setInvVentas(InvVentas invVentas) {
		this.invVentas = invVentas;
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
		InvVentasMotivoAnulacion other = (InvVentasMotivoAnulacion) obj;
		if (anuSecuencial == null) {
			if (other.anuSecuencial != null)
				return false;
		} else if (!anuSecuencial.equals(other.anuSecuencial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvVentasMotivoAnulacion[ invVentasMotivoAnulacionPK=" + anuSecuencial + " ]";
	}

}
