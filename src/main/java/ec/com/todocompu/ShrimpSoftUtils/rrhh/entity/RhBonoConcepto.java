package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rh_bono_concepto", schema = "recursoshumanos")
public class RhBonoConcepto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "bc_secuencial")
	private Integer bcSecuencial;
	@Column(name = "bc_detalle")
	private String bcDetalle;
	@Column(name = "bc_valor")
	private BigDecimal bcValor;
	@Column(name = "bc_valor_fijo")
	private boolean bcValorFijo;
	@Column(name = "bc_inactivo")
	private boolean bcInactivo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;

	public RhBonoConcepto() {
	}

	public RhBonoConcepto(Integer bcSecuencial) {
		this.bcSecuencial = bcSecuencial;
	}

	public RhBonoConcepto(Integer bcSecuencial, String bcDetalle, BigDecimal bcValor, boolean bcValorFijo,
			boolean bcInactivo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.bcSecuencial = bcSecuencial;
		this.bcDetalle = bcDetalle;
		this.bcValor = bcValor;
		this.bcValorFijo = bcValorFijo;
		this.bcInactivo = bcInactivo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public Integer getBcSecuencial() {
		return bcSecuencial;
	}

	public void setBcSecuencial(Integer bcSecuencial) {
		this.bcSecuencial = bcSecuencial;
	}

	public String getBcDetalle() {
		return bcDetalle;
	}

	public void setBcDetalle(String bcDetalle) {
		this.bcDetalle = bcDetalle;
	}

	public BigDecimal getBcValor() {
		return bcValor;
	}

	public void setBcValor(BigDecimal bcValor) {
		this.bcValor = bcValor;
	}

	public boolean getBcValorFijo() {
		return bcValorFijo;
	}

	public void setBcValorFijo(boolean bcValorFijo) {
		this.bcValorFijo = bcValorFijo;
	}

	public boolean getBcInactivo() {
		return bcInactivo;
	}

	public void setBcInactivo(boolean bcInactivo) {
		this.bcInactivo = bcInactivo;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (bcSecuencial != null ? bcSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhBonoConcepto)) {
			return false;
		}
		RhBonoConcepto other = (RhBonoConcepto) object;
		if ((this.bcSecuencial == null && other.bcSecuencial != null)
				|| (this.bcSecuencial != null && !this.bcSecuencial.equals(other.bcSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhBonoConcepto[ bcSecuencial=" + bcSecuencial + " ]";
	}
}
