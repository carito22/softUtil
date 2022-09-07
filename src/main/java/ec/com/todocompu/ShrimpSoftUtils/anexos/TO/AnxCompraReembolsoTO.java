package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxCompraReembolsoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "reemb_secuencial")
	private Integer reembSecuencial;
	@Column(name = "reemb_documento_tipo")
	private String reembDocumentoTipo;
	@Column(name = "reemb_documento_numero")
	private String reembDocumentoNumero;
	@Column(name = "reemb_fechaemision")
	private String reembFechaemision;
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
	@Column(name = "comp_empresa")
	private String compEmpresa;
	@Column(name = "comp_periodo")
	private String compPeriodo;
	@Column(name = "comp_motivo")
	private String compMotivo;
	@Column(name = "comp_numero")
	private String compNumero;
	@Column(name = "tc_abreviatura")
	private String auxDocTipo_Abreviatura;
	@Column(name = "prov_razon_social")
	private String auxProvRazonSocial;
	@Column(name = "prov_id_numero")
	private String auxProvRUC;

	public AnxCompraReembolsoTO() {
	}

	public AnxCompraReembolsoTO(Integer reembSecuencial, String reembDocumentoTipo, String reembDocumentoNumero,
			String reembFechaemision, String reembAutorizacion, BigDecimal reembBaseimponible,
			BigDecimal reembBaseimpgrav, BigDecimal reembBasenograiva, BigDecimal reembMontoice,
			BigDecimal reembMontoiva, String provEmpresa, String provCodigo, String compEmpresa, String compPeriodo,
			String compMotivo, String compNumero) {
		this.reembSecuencial = reembSecuencial;
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
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getProvCodigo() {
		return provCodigo;
	}

	public void setProvCodigo(String provCodigo) {
		this.provCodigo = provCodigo;
	}

	public String getProvEmpresa() {
		return provEmpresa;
	}

	public void setProvEmpresa(String provEmpresa) {
		this.provEmpresa = provEmpresa;
	}

	public String getReembAutorizacion() {
		return reembAutorizacion;
	}

	public void setReembAutorizacion(String reembAutorizacion) {
		this.reembAutorizacion = reembAutorizacion;
	}

	public BigDecimal getReembBaseimpgrav() {
		return reembBaseimpgrav;
	}

	public void setReembBaseimpgrav(BigDecimal reembBaseimpgrav) {
		this.reembBaseimpgrav = reembBaseimpgrav;
	}

	public BigDecimal getReembBaseimponible() {
		return reembBaseimponible;
	}

	public void setReembBaseimponible(BigDecimal reembBaseimponible) {
		this.reembBaseimponible = reembBaseimponible;
	}

	public BigDecimal getReembBasenograiva() {
		return reembBasenograiva;
	}

	public void setReembBasenograiva(BigDecimal reembBasenograiva) {
		this.reembBasenograiva = reembBasenograiva;
	}

	public String getReembDocumentoNumero() {
		return reembDocumentoNumero;
	}

	public void setReembDocumentoNumero(String reembDocumentoNumero) {
		this.reembDocumentoNumero = reembDocumentoNumero;
	}

	public String getReembDocumentoTipo() {
		return reembDocumentoTipo;
	}

	public void setReembDocumentoTipo(String reembDocumentoTipo) {
		this.reembDocumentoTipo = reembDocumentoTipo;
	}

	public String getReembFechaemision() {
		return reembFechaemision;
	}

	public void setReembFechaemision(String reembFechaemision) {
		this.reembFechaemision = reembFechaemision;
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

	public Integer getReembSecuencial() {
		return reembSecuencial;
	}

	public void setReembSecuencial(Integer reembSecuencial) {
		this.reembSecuencial = reembSecuencial;
	}

	public String getAuxDocTipo_Abreviatura() {
		return auxDocTipo_Abreviatura;
	}

	public void setAuxDocTipo_Abreviatura(String auxDocTipo_Abreviatura) {
		this.auxDocTipo_Abreviatura = auxDocTipo_Abreviatura;
	}

        public String getAuxProvRazonSocial() {
            return auxProvRazonSocial;
        }

        public void setAuxProvRazonSocial(String auxProvRazonSocial) {
            this.auxProvRazonSocial = auxProvRazonSocial;
        }

	public String getAuxProvRUC() {
		return auxProvRUC;
	}

	public void setAuxProvRUC(String auxProvRUC) {
		this.auxProvRUC = auxProvRUC;
	}

}
