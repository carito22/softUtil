package ec.com.todocompu.ShrimpSoftUtils.caja.report;

import java.math.BigDecimal;

public class ReporteCajCajaVales {

	private String valePeriodo;
	private String valeMotivo;
	private String valeNumero;
	private String valeFecha;
	private BigDecimal valeValor;
	private String valeBeneficiario;
	private String valeObservaciones;
	private String concEmpresa;
	private String concCodigo;
	private String cajeroNombre;

	public ReporteCajCajaVales() {
	}

	public ReporteCajCajaVales(String valePeriodo, String valeMotivo, String valeNumero, String valeFecha,
			BigDecimal valeValor, String valeBeneficiario, String valeObservaciones, String concEmpresa, String concCodigo,
			String cajeroNombre) {
		this.valePeriodo = valePeriodo;
		this.valeMotivo = valeMotivo;
		this.valeNumero = valeNumero;
		this.valeFecha = valeFecha;
		this.valeValor = valeValor;
		this.valeBeneficiario = valeBeneficiario;
		this.valeObservaciones = valeObservaciones;
		this.concEmpresa = concEmpresa;
		this.concCodigo = concCodigo;
		this.cajeroNombre = cajeroNombre;
	}

	public String getValeBeneficiario() {
		return valeBeneficiario;
	}

	public void setValeBeneficiario(String valeBeneficiario) {
		this.valeBeneficiario = valeBeneficiario;
	}

	public String getValeFecha() {
		return valeFecha;
	}

	public void setValeFecha(String valeFecha) {
		this.valeFecha = valeFecha;
	}

	public String getValeMotivo() {
		return valeMotivo;
	}

	public void setValeMotivo(String valeMotivo) {
		this.valeMotivo = valeMotivo;
	}

	public String getValeNumero() {
		return valeNumero;
	}

	public void setValeNumero(String valeNumero) {
		this.valeNumero = valeNumero;
	}

	public String getValeObservaciones() {
		return valeObservaciones;
	}

	public void setValeObservaciones(String valeObservaciones) {
		this.valeObservaciones = valeObservaciones;
	}

	public String getValePeriodo() {
		return valePeriodo;
	}

	public void setValePeriodo(String valePeriodo) {
		this.valePeriodo = valePeriodo;
	}

	public String getConcCodigo() {
		return concCodigo;
	}

	public void setConcCodigo(String concCodigo) {
		this.concCodigo = concCodigo;
	}

	public String getConcEmpresa() {
		return concEmpresa;
	}

	public void setConcEmpresa(String concEmpresa) {
		this.concEmpresa = concEmpresa;
	}

	public BigDecimal getValeValor() {
		return valeValor;
	}

	public void setValeValor(BigDecimal valeValor) {
		this.valeValor = valeValor;
	}

	public String getCajeroNombre() {
		return cajeroNombre;
	}

	public void setCajeroNombre(String cajeroNombre) {
		this.cajeroNombre = cajeroNombre;
	}
}
