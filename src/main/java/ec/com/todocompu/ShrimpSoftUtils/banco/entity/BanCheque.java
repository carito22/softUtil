package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ban_cheque", schema = "banco")
public class BanCheque implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "chq_secuencia")
	private Long chqSecuencia;
	@Column(name = "chq_beneficiario")
	private String chqBeneficiario;
	@Column(name = "chq_cantidad")
	private String chqCantidad;
	@Column(name = "chq_ciudad")
	private String chqCiudad;
	@Column(name = "chq_fecha")
	@Temporal(TemporalType.DATE)
	private Date chqFecha;
	@Column(name = "chq_cruzado")
	private Boolean chqCruzado;
	@Column(name = "chq_impreso")
	private boolean chqImpreso;
	@Column(name = "chq_impreso_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date chqImpresoFecha;
	@Column(name = "chq_revisado")
	private boolean chqRevisado;
	@Column(name = "chq_revisado_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date chqRevisadoFecha;
	@Column(name = "chq_revisado_observacion")
	private String chqRevisadoObservacion;
	@Column(name = "chq_entregado")
	private boolean chqEntregado;
	@Column(name = "chq_entregado_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date chqEntregadoFecha;
	@Column(name = "chq_entregado_observacion")
	private String chqEntregadoObservacion;
	@Column(name = "chq_reversado")
	private Boolean chqReversado;
	@Column(name = "chq_reversado_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date chqReversadoFecha;
	@Column(name = "chq_reversado_observacion")
	private String chqReversadoObservacion;
	@Column(name = "chq_anulado")
	private Boolean chqAnulado;
	@Column(name = "chq_anulado_fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date chqAnuladoFecha;
	@Column(name = "chq_anulado_observacion")
	private String chqAnuladoObservacion;
	@Column(name = "chq_no_es_cheque")
	private Boolean chqNoEsCheque;
	@Column(name = "conc_empresa")
	private String concEmpresa;
	@Column(name = "conc_cuenta_contable")
	private String concCuentaContable;
	@Column(name = "conc_codigo")
	private String concCodigo;
	@Column(name = "conc_categoria")
	private String concCategoria;
	@Column(name = "det_secuencia")
	private long detSecuencia;

	public BanCheque() {
	}

	public BanCheque(Long chqSecuencia) {
		this.chqSecuencia = chqSecuencia;
	}

	public BanCheque(Long chqSecuencia, String chqBeneficiario, String chqCantidad, String chqCiudad, Date chqFecha,
			boolean chqImpreso, boolean chqRevisado, boolean chqEntregado, long detSecuencia) {
		this.chqSecuencia = chqSecuencia;
		this.chqBeneficiario = chqBeneficiario;
		this.chqCantidad = chqCantidad;
		this.chqCiudad = chqCiudad;
		this.chqFecha = chqFecha;
		this.chqImpreso = chqImpreso;
		this.chqRevisado = chqRevisado;
		this.chqEntregado = chqEntregado;
		this.detSecuencia = detSecuencia;
	}

	public Long getChqSecuencia() {
		return chqSecuencia;
	}

	public void setChqSecuencia(Long chqSecuencia) {
		this.chqSecuencia = chqSecuencia;
	}

	public String getChqBeneficiario() {
		return chqBeneficiario;
	}

	public void setChqBeneficiario(String chqBeneficiario) {
		this.chqBeneficiario = chqBeneficiario;
	}

	public String getChqCantidad() {
		return chqCantidad;
	}

	public void setChqCantidad(String chqCantidad) {
		this.chqCantidad = chqCantidad;
	}

	public String getChqCiudad() {
		return chqCiudad;
	}

	public void setChqCiudad(String chqCiudad) {
		this.chqCiudad = chqCiudad;
	}

	public Date getChqFecha() {
		return chqFecha;
	}

	public void setChqFecha(Date chqFecha) {
		this.chqFecha = chqFecha;
	}

	public Boolean getChqCruzado() {
		return chqCruzado;
	}

	public void setChqCruzado(Boolean chqCruzado) {
		this.chqCruzado = chqCruzado;
	}

	public boolean getChqImpreso() {
		return chqImpreso;
	}

	public void setChqImpreso(boolean chqImpreso) {
		this.chqImpreso = chqImpreso;
	}

	public Date getChqImpresoFecha() {
		return chqImpresoFecha;
	}

	public void setChqImpresoFecha(Date chqImpresoFecha) {
		this.chqImpresoFecha = chqImpresoFecha;
	}

	public boolean getChqRevisado() {
		return chqRevisado;
	}

	public void setChqRevisado(boolean chqRevisado) {
		this.chqRevisado = chqRevisado;
	}

	public Date getChqRevisadoFecha() {
		return chqRevisadoFecha;
	}

	public void setChqRevisadoFecha(Date chqRevisadoFecha) {
		this.chqRevisadoFecha = chqRevisadoFecha;
	}

	public String getChqRevisadoObservacion() {
		return chqRevisadoObservacion;
	}

	public void setChqRevisadoObservacion(String chqRevisadoObservacion) {
		this.chqRevisadoObservacion = chqRevisadoObservacion;
	}

	public boolean getChqEntregado() {
		return chqEntregado;
	}

	public void setChqEntregado(boolean chqEntregado) {
		this.chqEntregado = chqEntregado;
	}

	public Date getChqEntregadoFecha() {
		return chqEntregadoFecha;
	}

	public void setChqEntregadoFecha(Date chqEntregadoFecha) {
		this.chqEntregadoFecha = chqEntregadoFecha;
	}

	public String getChqEntregadoObservacion() {
		return chqEntregadoObservacion;
	}

	public void setChqEntregadoObservacion(String chqEntregadoObservacion) {
		this.chqEntregadoObservacion = chqEntregadoObservacion;
	}

	public Boolean getChqReversado() {
		return chqReversado;
	}

	public void setChqReversado(Boolean chqReversado) {
		this.chqReversado = chqReversado;
	}

	public Date getChqReversadoFecha() {
		return chqReversadoFecha;
	}

	public void setChqReversadoFecha(Date chqReversadoFecha) {
		this.chqReversadoFecha = chqReversadoFecha;
	}

	public String getChqReversadoObservacion() {
		return chqReversadoObservacion;
	}

	public void setChqReversadoObservacion(String chqReversadoObservacion) {
		this.chqReversadoObservacion = chqReversadoObservacion;
	}

	public Boolean getChqAnulado() {
		return chqAnulado;
	}

	public void setChqAnulado(Boolean chqAnulado) {
		this.chqAnulado = chqAnulado;
	}

	public Date getChqAnuladoFecha() {
		return chqAnuladoFecha;
	}

	public void setChqAnuladoFecha(Date chqAnuladoFecha) {
		this.chqAnuladoFecha = chqAnuladoFecha;
	}

	public String getChqAnuladoObservacion() {
		return chqAnuladoObservacion;
	}

	public void setChqAnuladoObservacion(String chqAnuladoObservacion) {
		this.chqAnuladoObservacion = chqAnuladoObservacion;
	}

	public Boolean getChqNoEsCheque() {
		return chqNoEsCheque;
	}

	public void setChqNoEsCheque(Boolean chqNoEsCheque) {
		this.chqNoEsCheque = chqNoEsCheque;
	}

	public String getConcEmpresa() {
		return concEmpresa;
	}

	public void setConcEmpresa(String concEmpresa) {
		this.concEmpresa = concEmpresa;
	}

	public String getConcCuentaContable() {
		return concCuentaContable;
	}

	public void setConcCuentaContable(String concCuentaContable) {
		this.concCuentaContable = concCuentaContable;
	}

	public String getConcCodigo() {
		return concCodigo;
	}

	public void setConcCodigo(String concCodigo) {
		this.concCodigo = concCodigo;
	}

	public long getDetSecuencia() {
		return detSecuencia;
	}

	public void setDetSecuencia(long detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

        public String getConcCategoria() {
            return concCategoria;
        }

        public void setConcCategoria(String concCategoria) {
            this.concCategoria = concCategoria;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (chqSecuencia != null ? chqSecuencia.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof BanCheque)) {
			return false;
		}
		BanCheque other = (BanCheque) object;
		if ((this.chqSecuencia == null && other.chqSecuencia != null)
				|| (this.chqSecuencia != null && !this.chqSecuencia.equals(other.chqSecuencia))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "banco.entity.BanCheque[ chqSecuencia=" + chqSecuencia + " ]";
	}

}
