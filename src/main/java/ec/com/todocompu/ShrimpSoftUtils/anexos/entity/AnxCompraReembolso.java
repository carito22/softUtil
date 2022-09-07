package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_compra_reembolso", schema = "anexo")
@XmlRootElement
public class AnxCompraReembolso implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "reemb_secuencial")
	private Integer reembSecuencial;
	@Column(name = "reemb_documento_empresa")
	private String reembDocumentoEmpresa;
	@Column(name = "reemb_documento_proveedor")
	private String reembDocumentoProveedor;
	@Column(name = "reemb_documento_tipo")
	private String reembDocumentoTipo;
	@Column(name = "reemb_documento_numero")
	private String reembDocumentoNumero;
	@Column(name = "reemb_fechaemision")
	@Temporal(TemporalType.DATE)
	private Date reembFechaemision;
	@Column(name = "reemb_autorizacion")
	private String reembAutorizacion;
	@Column(name = "reemb_baseimponible")
	private BigDecimal reembBaseimponible;
	@Column(name = "reemb_baseimpgrav")
	private BigDecimal reembBaseimpgrav;
	@Column(name = "reemb_basenograiva")
	private BigDecimal reembBasenograiva;
	@Column(name = "reemb_montoice")
	private BigDecimal reembMontoice;
	@Column(name = "reemb_montoiva")
	private BigDecimal reembMontoiva;
	@Column(name = "prov_empresa")
	private String provEmpresa;
	@Column(name = "prov_codigo")
	private String provCodigo;
	@JoinColumns({ @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa"),
			@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo"),
			@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo"),
			@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero") })
	@ManyToOne(optional = false)
	private AnxCompra anxCompra;

	public AnxCompraReembolso() {
	}

	public AnxCompraReembolso(Integer reembSecuencial) {
		this.reembSecuencial = reembSecuencial;
	}

	public AnxCompraReembolso(Integer reembSecuencial, String reembDocumentoEmpresa, String reembDocumentoProveedor,
			String reembDocumentoTipo, String reembDocumentoNumero, Date reembFechaemision, String reembAutorizacion,
			BigDecimal reembBaseimponible, BigDecimal reembBaseimpgrav, BigDecimal reembBasenograiva,
			BigDecimal reembMontoice, BigDecimal reembMontoiva, String provEmpresa, String provCodigo) {
		this.reembSecuencial = reembSecuencial;
		this.reembDocumentoEmpresa = reembDocumentoEmpresa;
		this.reembDocumentoProveedor = reembDocumentoProveedor;
		this.reembDocumentoTipo = reembDocumentoTipo;
		this.reembDocumentoNumero = reembDocumentoNumero;
		this.reembFechaemision = reembFechaemision;
		this.reembAutorizacion = reembAutorizacion;
		this.reembBaseimponible = reembBaseimponible;
		this.reembBaseimpgrav = reembBaseimpgrav;
		this.reembBasenograiva = reembBasenograiva;
		this.reembMontoice = reembMontoice;
		this.reembMontoiva = reembMontoiva;
		this.provEmpresa = provEmpresa;
		this.provCodigo = provCodigo;
	}

	public Integer getReembSecuencial() {
		return reembSecuencial;
	}

	public void setReembSecuencial(Integer reembSecuencial) {
		this.reembSecuencial = reembSecuencial;
	}

	public String getReembDocumentoEmpresa() {
		return reembDocumentoEmpresa;
	}

	public void setReembDocumentoEmpresa(String reembDocumentoEmpresa) {
		this.reembDocumentoEmpresa = reembDocumentoEmpresa;
	}

	public String getReembDocumentoProveedor() {
		return reembDocumentoProveedor;
	}

	public void setReembDocumentoProveedor(String reembDocumentoProveedor) {
		this.reembDocumentoProveedor = reembDocumentoProveedor;
	}

	public String getReembDocumentoTipo() {
		return reembDocumentoTipo;
	}

	public void setReembDocumentoTipo(String reembDocumentoTipo) {
		this.reembDocumentoTipo = reembDocumentoTipo;
	}

	public String getReembDocumentoNumero() {
		return reembDocumentoNumero;
	}

	public void setReembDocumentoNumero(String reembDocumentoNumero) {
		this.reembDocumentoNumero = reembDocumentoNumero;
	}

	public Date getReembFechaemision() {
		return reembFechaemision;
	}

	public void setReembFechaemision(Date reembFechaemision) {
		this.reembFechaemision = reembFechaemision;
	}

	public String getReembAutorizacion() {
		return reembAutorizacion;
	}

	public void setReembAutorizacion(String reembAutorizacion) {
		this.reembAutorizacion = reembAutorizacion;
	}

	public BigDecimal getReembBaseimponible() {
		return reembBaseimponible;
	}

	public void setReembBaseimponible(BigDecimal reembBaseimponible) {
		this.reembBaseimponible = reembBaseimponible;
	}

	public BigDecimal getReembBaseimpgrav() {
		return reembBaseimpgrav;
	}

	public void setReembBaseimpgrav(BigDecimal reembBaseimpgrav) {
		this.reembBaseimpgrav = reembBaseimpgrav;
	}

	public BigDecimal getReembBasenograiva() {
		return reembBasenograiva;
	}

	public void setReembBasenograiva(BigDecimal reembBasenograiva) {
		this.reembBasenograiva = reembBasenograiva;
	}

	public BigDecimal getReembMontoice() {
		return reembMontoice;
	}

	public void setReembMontoice(BigDecimal reembMontoice) {
		this.reembMontoice = reembMontoice;
	}

	public BigDecimal getReembMontoiva() {
		return reembMontoiva;
	}

	public void setReembMontoiva(BigDecimal reembMontoiva) {
		this.reembMontoiva = reembMontoiva;
	}

	public String getProvEmpresa() {
		return provEmpresa;
	}

	public void setProvEmpresa(String provEmpresa) {
		this.provEmpresa = provEmpresa;
	}

	public String getProvCodigo() {
		return provCodigo;
	}

	public void setProvCodigo(String provCodigo) {
		this.provCodigo = provCodigo;
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
		hash += (reembSecuencial != null ? reembSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxCompraReembolso)) {
			return false;
		}
		AnxCompraReembolso other = (AnxCompraReembolso) object;
		if ((this.reembSecuencial == null && other.reembSecuencial != null)
				|| (this.reembSecuencial != null && !this.reembSecuencial.equals(other.reembSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxCompraReembolso[ reembSecuencial=" + reembSecuencial + " ]";
	}
}
