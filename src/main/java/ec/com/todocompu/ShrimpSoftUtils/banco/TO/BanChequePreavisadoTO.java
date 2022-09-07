/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanChequePreavisadoTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "chq_secuencial")
	private String chqSecuencial;

	@Column(name = "chq_tipo_registro")
	private String chqTipoRegistro;

	@Column(name = "chq_beneficiario_codigo")
	private String chqBeneficiarioCodigo;

	@Column(name = "chq_beneficiario_tipo_id")
	private String chqBeneficiarioTipoId;

	@Column(name = "chq_beneficiario_numero_id")
	private String chqBeneficiarioNumeroId;

	@Column(name = "chq_beneficiario_nombre")
	private String chqBeneficiarioNombre;

	@Column(name = "chq_forma_pago")
	private String chqFormaPago;

	@Column(name = "chq_codigo_pais")
	private String chqCodigoPais;

	@Column(name = "chq_codigo_banco")
	private String chqCodigoBanco;

	@Column(name = "chq_cuenta_tipo")
	private String chqCuentaTipo;

	@Column(name = "chq_cuenta_numero")
	private String chqCuentaNumero;

	@Column(name = "chq_cheque_numero")
	private String chqChequeNumero;

	@Column(name = "chq_cheque_moneda")
	private String chqChequeMoneda;

	@Column(name = "chq_cheque_valor")
	private String chqChequeValor;

	@Column(name = "chq_referencia")
	private String chqReferencia;

	@Column(name = "chq_codigo_servicio")
	private String chqCodigoServicio;

	@Column(name = "chq_cheque_tipo")
	private String chqChequeTipo;

	@Column(name = "chq_codigo_empresa")
	private String chqCodigoEmpresa;

	@Column(name = "chq_fecha_revision")
	private String chqFechaRevision;

	public BanChequePreavisadoTO() {
	}

	public BanChequePreavisadoTO(String chqTipoRegistro, String chqSecuencial, String chqBeneficiarioCodigo,
			String chqBeneficiarioTipoId, String chqBeneficiarioNumeroId, String chqBeneficiarioNombre,
			String chqFormaPago, String chqCodigoPais, String chqCodigoBanco, String chqCuentaTipo,
			String chqCuentaNumero, String chqChequeNumero, String chqChequeMoneda, String chqChequeValor,
			String chqReferencia, String chqCodigoServicio, String chqChequeTipo, String chqCodigoEmpresa,
			String chqFechaRevision, Integer id) {
		this.chqTipoRegistro = chqTipoRegistro;
		this.chqSecuencial = chqSecuencial;
		this.chqBeneficiarioCodigo = chqBeneficiarioCodigo;
		this.chqBeneficiarioTipoId = chqBeneficiarioTipoId;
		this.chqBeneficiarioNumeroId = chqBeneficiarioNumeroId;
		this.chqBeneficiarioNombre = chqBeneficiarioNombre;
		this.chqFormaPago = chqFormaPago;
		this.chqCodigoPais = chqCodigoPais;
		this.chqCodigoBanco = chqCodigoBanco;
		this.chqCuentaTipo = chqCuentaTipo;
		this.chqCuentaNumero = chqCuentaNumero;
		this.chqChequeNumero = chqChequeNumero;
		this.chqChequeMoneda = chqChequeMoneda;
		this.chqChequeValor = chqChequeValor;
		this.chqReferencia = chqReferencia;
		this.chqCodigoServicio = chqCodigoServicio;
		this.chqChequeTipo = chqChequeTipo;
		this.chqCodigoEmpresa = chqCodigoEmpresa;
		this.chqFechaRevision = chqFechaRevision;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChqBeneficiarioCodigo() {
		return chqBeneficiarioCodigo;
	}

	public void setChqBeneficiarioCodigo(String chqBeneficiarioCodigo) {
		this.chqBeneficiarioCodigo = chqBeneficiarioCodigo;
	}

	public String getChqBeneficiarioNombre() {
		return chqBeneficiarioNombre;
	}

	public void setChqBeneficiarioNombre(String chqBeneficiarioNombre) {
		this.chqBeneficiarioNombre = chqBeneficiarioNombre;
	}

	public String getChqBeneficiarioNumeroId() {
		return chqBeneficiarioNumeroId;
	}

	public void setChqBeneficiarioNumeroId(String chqBeneficiarioNumeroId) {
		this.chqBeneficiarioNumeroId = chqBeneficiarioNumeroId;
	}

	public String getChqBeneficiarioTipoId() {
		return chqBeneficiarioTipoId;
	}

	public void setChqBeneficiarioTipoId(String chqBeneficiarioTipoId) {
		this.chqBeneficiarioTipoId = chqBeneficiarioTipoId;
	}

	public String getChqChequeMoneda() {
		return chqChequeMoneda;
	}

	public void setChqChequeMoneda(String chqChequeMoneda) {
		this.chqChequeMoneda = chqChequeMoneda;
	}

	public String getChqChequeNumero() {
		return chqChequeNumero;
	}

	public void setChqChequeNumero(String chqChequeNumero) {
		this.chqChequeNumero = chqChequeNumero;
	}

	public String getChqChequeTipo() {
		return chqChequeTipo;
	}

	public void setChqChequeTipo(String chqChequeTipo) {
		this.chqChequeTipo = chqChequeTipo;
	}

	public String getChqChequeValor() {
		return chqChequeValor;
	}

	public void setChqChequeValor(String chqChequeValor) {
		this.chqChequeValor = chqChequeValor;
	}

	public String getChqCodigoBanco() {
		return chqCodigoBanco;
	}

	public void setChqCodigoBanco(String chqCodigoBanco) {
		this.chqCodigoBanco = chqCodigoBanco;
	}

	public String getChqCodigoEmpresa() {
		return chqCodigoEmpresa;
	}

	public void setChqCodigoEmpresa(String chqCodigoEmpresa) {
		this.chqCodigoEmpresa = chqCodigoEmpresa;
	}

	public String getChqCodigoPais() {
		return chqCodigoPais;
	}

	public void setChqCodigoPais(String chqCodigoPais) {
		this.chqCodigoPais = chqCodigoPais;
	}

	public String getChqCodigoServicio() {
		return chqCodigoServicio;
	}

	public void setChqCodigoServicio(String chqCodigoServicio) {
		this.chqCodigoServicio = chqCodigoServicio;
	}

	public String getChqCuentaNumero() {
		return chqCuentaNumero;
	}

	public void setChqCuentaNumero(String chqCuentaNumero) {
		this.chqCuentaNumero = chqCuentaNumero;
	}

	public String getChqCuentaTipo() {
		return chqCuentaTipo;
	}

	public void setChqCuentaTipo(String chqCuentaTipo) {
		this.chqCuentaTipo = chqCuentaTipo;
	}

	public String getChqFechaRevision() {
		return chqFechaRevision;
	}

	public void setChqFechaRevision(String chqFechaRevision) {
		this.chqFechaRevision = chqFechaRevision;
	}

	public String getChqFormaPago() {
		return chqFormaPago;
	}

	public void setChqFormaPago(String chqFormaPago) {
		this.chqFormaPago = chqFormaPago;
	}

	public String getChqReferencia() {
		return chqReferencia;
	}

	public void setChqReferencia(String chqReferencia) {
		this.chqReferencia = chqReferencia;
	}

	public String getChqSecuencial() {
		return chqSecuencial;
	}

	public void setChqSecuencial(String chqSecuencial) {
		this.chqSecuencial = chqSecuencial;
	}

	public String getChqTipoRegistro() {
		return chqTipoRegistro;
	}

	public void setChqTipoRegistro(String chqTipoRegistro) {
		this.chqTipoRegistro = chqTipoRegistro;
	}
}
