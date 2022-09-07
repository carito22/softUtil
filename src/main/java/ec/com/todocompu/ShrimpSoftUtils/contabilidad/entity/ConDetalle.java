package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPiscina;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;

@Entity
@Table(name = "con_detalle", schema = "contabilidad")
public class ConDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long detSecuencia;
	private String detDocumento;
	private char detDebitoCredito;
	private BigDecimal detValor;
	private BigDecimal detSaldo;
	private boolean detGenerado;
	private String detReferencia;
	private String detObservaciones;
	private int detOrden;
	private PrdSector prdSector;
	private PrdPiscina prdPiscina;
	private ConCuentas conCuentas;
	private ConContable conContable;

	public ConDetalle() {
	}

	public ConDetalle(Long detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

	public ConDetalle(Long detSecuencia, char detDebitoCredito, BigDecimal detValor, BigDecimal detSaldo,
			boolean detGenerado, int detOrden, PrdSector prdSector) {
		this.detSecuencia = detSecuencia;
		this.detDebitoCredito = detDebitoCredito;
		this.detValor = detValor;
		this.detSaldo = detSaldo;
		this.detGenerado = detGenerado;
		this.detOrden = detOrden;
		this.prdSector = prdSector;
	}

	public ConDetalle(Long detSecuencia, String detDocumento, char detDebitoCredito, BigDecimal detValor,
			BigDecimal detSaldo, boolean detGenerado, String detReferencia, String detObservaciones, int detOrden,
			PrdSector prdSector, PrdPiscina prdPiscina, ConCuentas conCuentas, ConContable conContable) {
		this.detSecuencia = detSecuencia;
		this.detDocumento = detDocumento;
		this.detDebitoCredito = detDebitoCredito;
		this.detValor = detValor;
		this.detSaldo = detSaldo;
		this.detGenerado = detGenerado;
		this.detReferencia = detReferencia;
		this.detObservaciones = detObservaciones;
		this.detOrden = detOrden;
		this.prdSector = prdSector;
		this.prdPiscina = prdPiscina;
		this.conCuentas = conCuentas;
		this.conContable = conContable;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencia")
	public Long getDetSecuencia() {
		return detSecuencia;
	}

	public void setDetSecuencia(Long detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

	@Column(name = "det_documento")
	public String getDetDocumento() {
		return detDocumento;
	}

	public void setDetDocumento(String detDocumento) {
		this.detDocumento = detDocumento;
	}

	@Column(name = "det_debito_credito")
	public char getDetDebitoCredito() {
		return detDebitoCredito;
	}

	public void setDetDebitoCredito(char detDebitoCredito) {
		this.detDebitoCredito = detDebitoCredito;
	}

	@Column(name = "det_valor")
	public BigDecimal getDetValor() {
		return detValor;
	}

	public void setDetValor(BigDecimal detValor) {
		this.detValor = detValor;
	}

	@Column(name = "det_saldo", insertable = false, updatable = false)
	public BigDecimal getDetSaldo() {
		return detSaldo;
	}

	public void setDetSaldo(BigDecimal detSaldo) {
		this.detSaldo = detSaldo;
	}

	@Column(name = "det_generado")
	public boolean getDetGenerado() {
		return detGenerado;
	}

	public void setDetGenerado(boolean detGenerado) {
		this.detGenerado = detGenerado;
	}

	@Column(name = "det_referencia")
	public String getDetReferencia() {
		return detReferencia;
	}

	public void setDetReferencia(String detReferencia) {
		this.detReferencia = detReferencia;
	}

	@Column(name = "det_observaciones")
	public String getDetObservaciones() {
		return detObservaciones;
	}

	public void setDetObservaciones(String detObservaciones) {
		this.detObservaciones = detObservaciones;
	}

	@Column(name = "det_orden")
	public int getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(int detOrden) {
		this.detOrden = detOrden;
	}

	@JoinColumns({ @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa"),
			@JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo") })
	@ManyToOne(optional = false)
	public PrdSector getPrdSector() {
		return prdSector;
	}

	public void setPrdSector(PrdSector prdSector) {
		this.prdSector = prdSector;
	}

	@JoinColumns({ @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa"),
			@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector"),
			@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero") })
	@ManyToOne
	public PrdPiscina getPrdPiscina() {
		return prdPiscina;
	}

	public void setPrdPiscina(PrdPiscina prdPiscina) {
		this.prdPiscina = prdPiscina;
	}

	@JoinColumns({ @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa"),
			@JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo") })
	@ManyToOne(optional = false)
	public ConCuentas getConCuentas() {
		return conCuentas;
	}

	public void setConCuentas(ConCuentas conCuentas) {
		this.conCuentas = conCuentas;
	}

	@JoinColumns({ @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa"),
			@JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo"),
			@JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo"),
			@JoinColumn(name = "con_numero", referencedColumnName = "con_numero") })
	@ManyToOne(optional = false)
	public ConContable getConContable() {
		return conContable;
	}

	public void setConContable(ConContable conContable) {
		this.conContable = conContable;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (detSecuencia != null ? detSecuencia.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConDetalle)) {
			return false;
		}
		ConDetalle other = (ConDetalle) object;
		if ((this.detSecuencia == null && other.detSecuencia != null)
				|| (this.detSecuencia != null && !this.detSecuencia.equals(other.detSecuencia))) {
			return false;
		}
		return true;
	}

        @Override
        public String toString() {
            return "ConDetalle{" + "detSecuencia=" + detSecuencia + ", detDocumento=" + detDocumento + ", detDebitoCredito=" + detDebitoCredito + ", detValor=" + detValor + ", detSaldo=" + detSaldo + ", detGenerado=" + detGenerado + ", detReferencia=" + detReferencia + ", detObservaciones=" + detObservaciones + ", detOrden=" + detOrden + ", prdSector=" + prdSector + ", prdPiscina=" + prdPiscina + ", conCuentas=" + conCuentas + ", conContable=" + conContable + '}';
        }
}
