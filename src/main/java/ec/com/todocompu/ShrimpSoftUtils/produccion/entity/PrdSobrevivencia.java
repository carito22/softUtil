package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "prd_sobrevivencia", schema = "produccion")
public class PrdSobrevivencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "sob_codigo")
	private Integer sobCodigo;
	@Column(name = "sob_dias_desde")
	private int sobDiasDesde;
	@Column(name = "sob_dias_hasta")
	private int sobDiasHasta;
	@Column(name = "sob_sobrevivencia")
	private BigDecimal sobSobrevivencia;
	@Column(name = "sob_alimentacion")
	private BigDecimal sobAlimentacion;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@JoinColumns({ @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa"),
			@JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo") })
	@ManyToOne(optional = false)
	private PrdSector prdSector;

	public PrdSobrevivencia() {
	}

	public PrdSobrevivencia(Integer sobCodigo) {
		this.sobCodigo = sobCodigo;
	}

	public PrdSobrevivencia(Integer sobCodigo, int sobDiasDesde, int sobDiasHasta, BigDecimal sobSobrevivencia,
			BigDecimal sobAlimentacion, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.sobCodigo = sobCodigo;
		this.sobDiasDesde = sobDiasDesde;
		this.sobDiasHasta = sobDiasHasta;
		this.sobSobrevivencia = sobSobrevivencia;
		this.sobAlimentacion = sobAlimentacion;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public Integer getSobCodigo() {
		return sobCodigo;
	}

	public void setSobCodigo(Integer sobCodigo) {
		this.sobCodigo = sobCodigo;
	}

	public int getSobDiasDesde() {
		return sobDiasDesde;
	}

	public void setSobDiasDesde(int sobDiasDesde) {
		this.sobDiasDesde = sobDiasDesde;
	}

	public int getSobDiasHasta() {
		return sobDiasHasta;
	}

	public void setSobDiasHasta(int sobDiasHasta) {
		this.sobDiasHasta = sobDiasHasta;
	}

	public BigDecimal getSobSobrevivencia() {
		return sobSobrevivencia;
	}

	public void setSobSobrevivencia(BigDecimal sobSobrevivencia) {
		this.sobSobrevivencia = sobSobrevivencia;
	}

	public BigDecimal getSobAlimentacion() {
		return sobAlimentacion;
	}

	public void setSobAlimentacion(BigDecimal sobAlimentacion) {
		this.sobAlimentacion = sobAlimentacion;
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

	public PrdSector getPrdSector() {
		return prdSector;
	}

	public void setPrdSector(PrdSector prdSector) {
		this.prdSector = prdSector;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sobCodigo != null ? sobCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdSobrevivencia)) {
			return false;
		}
		PrdSobrevivencia other = (PrdSobrevivencia) object;
		if ((this.sobCodigo == null && other.sobCodigo != null)
				|| (this.sobCodigo != null && !this.sobCodigo.equals(other.sobCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdSobrevivencia[ sobCodigo=" + sobCodigo + " ]";
	}

}
