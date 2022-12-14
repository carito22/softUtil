package ec.com.todocompu.ShrimpSoftUtils.cartera.report;

import java.math.BigDecimal;

public class ReporteListadoCobros {

	private String codigoCP;
	private String desde;
	private String hasta;
	private String cliente;
	////// DETALLE
	private String cobNumeroSistema;
	private String cobFecha;
	private String cobCliente;
	private java.math.BigDecimal cobValor;
	private String cobObservaciones;
	private Boolean cobPendiente;
	private Boolean cobAnulado;

	public ReporteListadoCobros() {
	}

	public ReporteListadoCobros(String desde, String hasta, String cliente, String cobNumeroSistema, String cobFecha,
			String cobCliente, BigDecimal cobValor, String cobObservaciones, Boolean cobPendiente, Boolean cobAnulado) {
		this.desde = desde;
		this.hasta = hasta;
		this.cliente = cliente;
		this.cobNumeroSistema = cobNumeroSistema;
		this.cobFecha = cobFecha;
		this.cobCliente = cobCliente;
		this.cobValor = cobValor;
		this.cobObservaciones = cobObservaciones;
		this.cobPendiente = cobPendiente;
		this.cobAnulado = cobAnulado;
	}

	public String getCodigoCP() {
		return codigoCP;
	}

	public void setCodigoCP(String codigoCP) {
		this.codigoCP = codigoCP;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Boolean getCobAnulado() {
		return cobAnulado;
	}

	public void setCobAnulado(Boolean cobAnulado) {
		this.cobAnulado = cobAnulado;
	}

	public String getCobCliente() {
		return cobCliente;
	}

	public void setCobCliente(String cobCliente) {
		this.cobCliente = cobCliente;
	}

	public String getCobFecha() {
		return cobFecha;
	}

	public void setCobFecha(String cobFecha) {
		this.cobFecha = cobFecha;
	}

	public String getCobNumeroSistema() {
		return cobNumeroSistema;
	}

	public void setCobNumeroSistema(String cobNumeroSistema) {
		this.cobNumeroSistema = cobNumeroSistema;
	}

	public String getCobObservaciones() {
		return cobObservaciones;
	}

	public void setCobObservaciones(String cobObservaciones) {
		this.cobObservaciones = cobObservaciones;
	}

	public Boolean getCobPendiente() {
		return cobPendiente;
	}

	public void setCobPendiente(Boolean cobPendiente) {
		this.cobPendiente = cobPendiente;
	}

	public BigDecimal getCobValor() {
		return cobValor;
	}

	public void setCobValor(BigDecimal cobValor) {
		this.cobValor = cobValor;
	}

	public String getDesde() {
		return desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public String getHasta() {
		return hasta;
	}

	public void setHasta(String hasta) {
		this.hasta = hasta;
	}
}
