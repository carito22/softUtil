package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ec.com.todocompu.ShrimpSoftUtils.UtilsDate;

@Entity
@Table(name = "prd_presupuesto_pesca", schema = "produccion")
public class PrdPresupuestoPesca implements Serializable {
	private static final long serialVersionUID = 1L;

	protected PrdPresupuestoPescaPK prdPresupuestoPescaPK;
	private Date presuFecha;
	private String presuObservaciones;
	private boolean presuPendiente;
	private boolean presuAnulado;
	private BigDecimal presuGramosPromedio;
	private BigDecimal presuBiomasaEstimada;
	private BigDecimal presuTotalVenta;
	private PrdPiscina prdPiscina;
	private List<PrdPresupuestoPescaDetalle> prdPresupuestoPescaDetalleList;
	private String usrEmpresa;
	private String usrCodigo;
	private Timestamp usrFechaInserta;

	public PrdPresupuestoPesca() {
	}

	public PrdPresupuestoPesca(PrdPresupuestoPescaPK prdPresupuestoPescaPK) {
		this.prdPresupuestoPescaPK = prdPresupuestoPescaPK;
	}

	public PrdPresupuestoPesca(PrdPresupuestoPescaPK prdPresupuestoPescaPK, Date presuFecha, String presuObservaciones,
			boolean presuPendiente, boolean presuAnulado, BigDecimal presuGramosPromedio,
			BigDecimal presuBiomasaEstimada, BigDecimal presuTotalVenta, PrdPiscina prdPiscina,
			List<PrdPresupuestoPescaDetalle> prdPresupuestoPescaDetalleList, String usrEmpresa, String usrCodigo,
			Timestamp usrFechaInserta) {
		this.prdPresupuestoPescaPK = prdPresupuestoPescaPK;
		this.presuFecha = presuFecha;
		this.presuObservaciones = presuObservaciones;
		this.presuPendiente = presuPendiente;
		this.presuAnulado = presuAnulado;
		this.presuGramosPromedio = presuGramosPromedio;
		this.presuBiomasaEstimada = presuBiomasaEstimada;
		this.presuTotalVenta = presuTotalVenta;
		this.prdPiscina = prdPiscina;
		this.prdPresupuestoPescaDetalleList = prdPresupuestoPescaDetalleList;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	@EmbeddedId
	public PrdPresupuestoPescaPK getPrdPresupuestoPescaPK() {
		return prdPresupuestoPescaPK;
	}

	public void setPrdPresupuestoPescaPK(PrdPresupuestoPescaPK prdPresupuestoPescaPK) {
		this.prdPresupuestoPescaPK = prdPresupuestoPescaPK;
	}

	@Column(name = "presu_fecha")
	public Date getPresuFecha() {
		return presuFecha;
	}

	public String presuFechaFormato() {
		if (presuFecha != null)
			return UtilsDate.fechaFormatoString(presuFecha, "yyyy-MM-dd");
		return "";
	}

	public void setPresuFecha(Date presuFecha) {
		this.presuFecha = presuFecha;
	}

	@Column(name = "presu_observaciones")
	public String getPresuObservaciones() {
		return presuObservaciones;
	}

	public void setPresuObservaciones(String presuObservaciones) {
		this.presuObservaciones = presuObservaciones;
	}

	@Column(name = "presu_pendiente")
	public boolean isPresuPendiente() {
		return presuPendiente;
	}

	public void setPresuPendiente(boolean presuPendiente) {
		this.presuPendiente = presuPendiente;
	}

	@Column(name = "presu_anulado")
	public boolean isPresuAnulado() {
		return presuAnulado;
	}

	public void setPresuAnulado(boolean presuAnulado) {
		this.presuAnulado = presuAnulado;
	}

	@Column(name = "presu_gramos_promedio")
	public BigDecimal getPresuGramosPromedio() {
		return presuGramosPromedio;
	}

	public void setPresuGramosPromedio(BigDecimal presuGramosPromedio) {
		this.presuGramosPromedio = presuGramosPromedio;
	}

	@Column(name = "presu_biomasa_estimada")
	public BigDecimal getPresuBiomasaEstimada() {
		return presuBiomasaEstimada;
	}

	public void setPresuBiomasaEstimada(BigDecimal presuBiomasaEstimada) {
		this.presuBiomasaEstimada = presuBiomasaEstimada;
	}

	@Column(name = "presu_total_venta")
	public BigDecimal getPresuTotalVenta() {
		return presuTotalVenta;
	}

	public void setPresuTotalVenta(BigDecimal presuTotalVenta) {
		this.presuTotalVenta = presuTotalVenta;
	}

	@JoinColumns({ @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa"),
			@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector"),
			@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero") })
	@ManyToOne(optional = false)
	public PrdPiscina getPrdPiscina() {
		return prdPiscina;
	}

	public void setPrdPiscina(PrdPiscina prdPiscina) {
		this.prdPiscina = prdPiscina;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "prdPresupuestoPesca")
	public List<PrdPresupuestoPescaDetalle> getPrdPresupuestoPescaDetalleList() {
		return prdPresupuestoPescaDetalleList;
	}

	public void setPrdPresupuestoPescaDetalleList(List<PrdPresupuestoPescaDetalle> prdPresupuestoPescaDetalleList) {
		this.prdPresupuestoPescaDetalleList = prdPresupuestoPescaDetalleList;
	}

	@Column(name = "usr_empresa")
	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	@Column(name = "usr_codigo")
	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	public Timestamp getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(Timestamp usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	@Override
	public String toString() {
		return "PrdPresupuestoPesca [prdPresupuestoPescaPK=" + prdPresupuestoPescaPK + "]";
	}

}
