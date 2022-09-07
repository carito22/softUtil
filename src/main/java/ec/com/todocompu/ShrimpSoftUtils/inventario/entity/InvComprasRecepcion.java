package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "inv_compras_recepcion", schema = "inventario")
public class InvComprasRecepcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "recep_secuencial")
	private Long recep_secuencial;
	@Column(name = "recep_fecha")
	@Temporal(TemporalType.DATE)
	private Date recepFecha;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@JoinColumns({ @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa"),
			@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo"),
			@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo"),
			@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero") })
	@ManyToOne(optional = false)
	private InvCompras invCompras;

	public InvComprasRecepcion() {
	}

	public InvComprasRecepcion(Long recep_secuencial, Date recepFecha, String usrEmpresa, String usrCodigo,
			Date usrFechaInserta, InvCompras invCompras) {
		this.recep_secuencial = recep_secuencial;
		this.recepFecha = recepFecha;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
		this.invCompras = invCompras;
	}

	public Long getRecep_secuencial() {
		return recep_secuencial;
	}

	public void setRecep_secuencial(Long recep_secuencial) {
		this.recep_secuencial = recep_secuencial;
	}

	public Date getRecepFecha() {
		return recepFecha;
	}

	public void setRecepFecha(Date recepFecha) {
		this.recepFecha = recepFecha;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Date getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(Date usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
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
		result = prime * result + ((recep_secuencial == null) ? 0 : recep_secuencial.hashCode());
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
		InvComprasRecepcion other = (InvComprasRecepcion) obj;
		if (recep_secuencial == null) {
			if (other.recep_secuencial != null)
				return false;
		} else if (!recep_secuencial.equals(other.recep_secuencial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InvComprasRecepcion [recep_secuencial=" + recep_secuencial + "]";
	}

}
