package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "anx_compra_electronica", schema = "anexo")
@XmlRootElement
public class AnxCompraElectronica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "e_secuencial")
	private Integer eSecuencial;
	@Column(name = "e_tipo_ambiente")
	private String eTipoAmbiente;
	@Column(name = "e_clave_acceso")
	private String eClaveAcceso;
	@Column(name = "e_estado")
	private String eEstado;
	@Column(name = "e_autorizacion_numero")
	private String eAutorizacionNumero;
	@Column(name = "e_autorizacion_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date eAutorizacionFecha;
	@Lob
	@Type(type = "org.hibernate.type.BinaryType")
	@Column(name = "e_xml")
	private byte[] eXml;
	@Column(name = "e_enviado_por_correo")
	private boolean eEnviadoPorCorreo;
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
	private AnxCompra anxCompra;

	public AnxCompraElectronica() {
	}

	public AnxCompraElectronica(Integer eSecuencial) {
		this.eSecuencial = eSecuencial;
	}

	public AnxCompraElectronica(Integer eSecuencial, String eTipoAmbiente, String eClaveAcceso, String eEstado,
			String eAutorizacionNumero, Date eAutorizacionFecha, boolean eEnviadoPorCorreo, String usrEmpresa,
			String usrCodigo, Date usrFechaInserta) {
		this.eSecuencial = eSecuencial;
		this.eTipoAmbiente = eTipoAmbiente;
		this.eClaveAcceso = eClaveAcceso;
		this.eEstado = eEstado;
		this.eAutorizacionNumero = eAutorizacionNumero;
		this.eAutorizacionFecha = eAutorizacionFecha;
		this.eEnviadoPorCorreo = eEnviadoPorCorreo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public Integer getESecuencial() {
		return eSecuencial;
	}

	public void setESecuencial(Integer eSecuencial) {
		this.eSecuencial = eSecuencial;
	}

	public String getETipoAmbiente() {
		return eTipoAmbiente;
	}

	public void setETipoAmbiente(String eTipoAmbiente) {
		this.eTipoAmbiente = eTipoAmbiente;
	}

	public String getEClaveAcceso() {
		return eClaveAcceso;
	}

	public void setEClaveAcceso(String eClaveAcceso) {
		this.eClaveAcceso = eClaveAcceso;
	}

	public String getEEstado() {
		return eEstado;
	}

	public void setEEstado(String eEstado) {
		this.eEstado = eEstado;
	}

	public String getEAutorizacionNumero() {
		return eAutorizacionNumero;
	}

	public void setEAutorizacionNumero(String eAutorizacionNumero) {
		this.eAutorizacionNumero = eAutorizacionNumero;
	}

	public Date getEAutorizacionFecha() {
		return eAutorizacionFecha;
	}

	public void setEAutorizacionFecha(Date eAutorizacionFecha) {
		this.eAutorizacionFecha = eAutorizacionFecha;
	}

	public byte[] getEXml() {
		return eXml;
	}

	public void setEXml(byte[] eXml) {
		this.eXml = eXml;
	}

	public boolean getEEnviadoPorCorreo() {
		return eEnviadoPorCorreo;
	}

	public void setEEnviadoPorCorreo(boolean eEnviadoPorCorreo) {
		this.eEnviadoPorCorreo = eEnviadoPorCorreo;
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

	public AnxCompra getAnxCompra() {
		return anxCompra;
	}

	public void setAnxCompra(AnxCompra anxCompra) {
		this.anxCompra = anxCompra;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (eSecuencial != null ? eSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxCompraElectronica)) {
			return false;
		}
		AnxCompraElectronica other = (AnxCompraElectronica) object;
		if ((this.eSecuencial == null && other.eSecuencial != null)
				|| (this.eSecuencial != null && !this.eSecuencial.equals(other.eSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxCompraElectronica[ eSecuencial=" + eSecuencial + " ]";
	}

}
