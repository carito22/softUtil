package ec.com.todocompu.ShrimpSoftUtils.caja.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "caj_vales", schema = "caja")
public class CajVales implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected CajValesPK cajValesPK;
	@Column(name = "vale_fecha")
	@Temporal(TemporalType.DATE)
	private Date valeFecha;
	@Column(name = "vale_valor")
	private BigDecimal valeValor;
	@Column(name = "vale_anulado")
	private boolean valeAnulado;
	@Column(name = "vale_beneficiario")
	private String valeBeneficiario;
	@Column(name = "vale_observaciones")
	private String valeObservaciones;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@JoinColumns({ @JoinColumn(name = "conc_empresa", referencedColumnName = "conc_empresa"),
			@JoinColumn(name = "conc_codigo", referencedColumnName = "conc_codigo") })
	@ManyToOne(optional = false)
	private CajValesConceptos cajValesConceptos;

	public CajVales() {
	}

	public CajVales(CajValesPK cajValesPK) {
		this.cajValesPK = cajValesPK;
	}

	public CajVales(CajValesPK cajValesPK, Date valeFecha, BigDecimal valeValor, boolean valeAnulado,
			String valeBeneficiario, String valeObservaciones, String usrEmpresa, String usrCodigo,
			Date usrFechaInserta) {
		this.cajValesPK = cajValesPK;
		this.valeFecha = valeFecha;
		this.valeValor = valeValor;
		this.valeAnulado = valeAnulado;
		this.valeBeneficiario = valeBeneficiario;
		this.valeObservaciones = valeObservaciones;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public CajVales(String valeEmpresa, String valePeriodo, String valeMotivo, String valeNumero) {
		this.cajValesPK = new CajValesPK(valeEmpresa, valePeriodo, valeMotivo, valeNumero);
	}

	public CajValesPK getCajValesPK() {
		return cajValesPK;
	}

	public void setCajValesPK(CajValesPK cajValesPK) {
		this.cajValesPK = cajValesPK;
	}

	public Date getValeFecha() {
		return valeFecha;
	}

	public void setValeFecha(Date valeFecha) {
		this.valeFecha = valeFecha;
	}

	public BigDecimal getValeValor() {
		return valeValor;
	}

	public void setValeValor(BigDecimal valeValor) {
		this.valeValor = valeValor;
	}

	public boolean getValeAnulado() {
		return valeAnulado;
	}

	public void setValeAnulado(boolean valeAnulado) {
		this.valeAnulado = valeAnulado;
	}

	public String getValeBeneficiario() {
		return valeBeneficiario;
	}

	public void setValeBeneficiario(String valeBeneficiario) {
		this.valeBeneficiario = valeBeneficiario;
	}

	public String getValeObservaciones() {
		return valeObservaciones;
	}

	public void setValeObservaciones(String valeObservaciones) {
		this.valeObservaciones = valeObservaciones;
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

	public CajValesConceptos getCajValesConceptos() {
		return cajValesConceptos;
	}

	public void setCajValesConceptos(CajValesConceptos cajValesConceptos) {
		this.cajValesConceptos = cajValesConceptos;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cajValesPK != null ? cajValesPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CajVales)) {
			return false;
		}
		CajVales other = (CajVales) object;
		if ((this.cajValesPK == null && other.cajValesPK != null)
				|| (this.cajValesPK != null && !this.cajValesPK.equals(other.cajValesPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "caja.entity.CajVales[ cajValesPK=" + cajValesPK + " ]";
	}

}
