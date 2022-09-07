package ec.com.todocompu.ShrimpSoftUtils.cartera.report;

import java.math.BigDecimal;

public class ReportePagos {
	//////////// CABECEREA
	private String fecha;
	private String proveedor;
	private String id;
	private String nombre;
	private String direccion;
	private String observaciones;
	private String numeroPago;

	//////////// DETALLE 1
	private String periodo;
	private String motivo;
	private String numero;
	private String alterno;
	private String documento;
	private String sector;
	private String fechaDetalle;
	private String vence;
	private java.math.BigDecimal total;
	private java.math.BigDecimal valor;
	private java.math.BigDecimal totalDetalleSuperior;

	//////////// DETALLE 2
	private String forma;
	private String referencia;
	private java.math.BigDecimal valorDetalleInferior;
	private String observacionesDetalleInferior;
	private java.math.BigDecimal totalDetalleInferior;

	//// Detalle Anticipos
	private String antPeriodo;
	private String antTipo;
	private String antNumero;
	private String antFecha;
	private java.math.BigDecimal antValor;
	private java.math.BigDecimal antTotal;

	private java.math.BigDecimal pagSaldoAnterior;
	private java.math.BigDecimal pagValor;
	private java.math.BigDecimal pagSaldoActual;

	public ReportePagos() {
	}

	public ReportePagos(String fecha, String proveedor, String id, String nombre, String direccion,
			String observaciones, String numeroPago, String periodo, String motivo, String numero, String alterno,
			String documento, String sector, String fechaDetalle, String vence, BigDecimal total, BigDecimal valor,
			BigDecimal totalDetalleSuperior, String forma, String referencia, BigDecimal valorDetalleInferior,
			String observacionesDetalleInferior, BigDecimal totalDetalleInferior, String antPeriodo, String antTipo,
			String antNumero, String antFecha, BigDecimal antValor, BigDecimal antTotal, BigDecimal pagSaldoAnterior,
			BigDecimal pagValor, BigDecimal pagSaldoActual) {

		this.fecha = fecha;
		this.proveedor = proveedor;
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.observaciones = observaciones;
		this.numeroPago = numeroPago;
		this.periodo = periodo;
		this.motivo = motivo;
		this.numero = numero;
		this.alterno = alterno;
		this.documento = documento;
		this.sector = sector;
		this.fechaDetalle = fechaDetalle;
		this.vence = vence;
		this.total = total;
		this.valor = valor;
		this.totalDetalleSuperior = totalDetalleSuperior;
		this.forma = forma;
		this.referencia = referencia;
		this.valorDetalleInferior = valorDetalleInferior;
		this.observacionesDetalleInferior = observacionesDetalleInferior;
		this.totalDetalleInferior = totalDetalleInferior;
		this.antPeriodo = antPeriodo;
		this.antTipo = antTipo;
		this.antNumero = antNumero;
		this.antFecha = antFecha;
		this.antValor = antValor;
		this.antTotal = antTotal;
		this.pagSaldoAnterior = pagSaldoAnterior;
		this.pagValor = pagValor;
		this.pagSaldoActual = pagSaldoActual;
	}

	public String getAntPeriodo() {
		return antPeriodo;
	}

	public void setAntPeriodo(String antPeriodo) {
		this.antPeriodo = antPeriodo;
	}

	public String getAntTipo() {
		return antTipo;
	}

	public void setAntTipo(String antTipo) {
		this.antTipo = antTipo;
	}

	public String getAntNumero() {
		return antNumero;
	}

	public void setAntNumero(String antNumero) {
		this.antNumero = antNumero;
	}

	public String getAntFecha() {
		return antFecha;
	}

	public void setAntFecha(String antFecha) {
		this.antFecha = antFecha;
	}

	public java.math.BigDecimal getAntValor() {
		return antValor;
	}

	public void setAntValor(java.math.BigDecimal antValor) {
		this.antValor = antValor;
	}

	public java.math.BigDecimal getAntTotal() {
		return antTotal;
	}

	public void setAntTotal(java.math.BigDecimal antTotal) {
		this.antTotal = antTotal;
	}

	public java.math.BigDecimal getPagSaldoAnterior() {
		return pagSaldoAnterior;
	}

	public void setPagSaldoAnterior(java.math.BigDecimal pagSaldoAnterior) {
		this.pagSaldoAnterior = pagSaldoAnterior;
	}

	public java.math.BigDecimal getPagValor() {
		return pagValor;
	}

	public void setPagValor(java.math.BigDecimal pagValor) {
		this.pagValor = pagValor;
	}

	public java.math.BigDecimal getPagSaldoActual() {
		return pagSaldoActual;
	}

	public void setPagSaldoActual(java.math.BigDecimal pagSaldoActual) {
		this.pagSaldoActual = pagSaldoActual;
	}

	public String getAlterno() {
		return alterno;
	}

	public void setAlterno(String alterno) {
		this.alterno = alterno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFechaDetalle() {
		return fechaDetalle;
	}

	public void setFechaDetalle(String fechaDetalle) {
		this.fechaDetalle = fechaDetalle;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumeroPago() {
		return numeroPago;
	}

	public void setNumeroPago(String numeroPago) {
		this.numeroPago = numeroPago;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getObservacionesDetalleInferior() {
		return observacionesDetalleInferior;
	}

	public void setObservacionesDetalleInferior(String observacionesDetalleInferior) {
		this.observacionesDetalleInferior = observacionesDetalleInferior;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTotalDetalleInferior() {
		return totalDetalleInferior;
	}

	public void setTotalDetalleInferior(BigDecimal totalDetalleInferior) {
		this.totalDetalleInferior = totalDetalleInferior;
	}

	public BigDecimal getTotalDetalleSuperior() {
		return totalDetalleSuperior;
	}

	public void setTotalDetalleSuperior(BigDecimal totalDetalleSuperior) {
		this.totalDetalleSuperior = totalDetalleSuperior;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorDetalleInferior() {
		return valorDetalleInferior;
	}

	public void setValorDetalleInferior(BigDecimal valorDetalleInferior) {
		this.valorDetalleInferior = valorDetalleInferior;
	}

	public String getVence() {
		return vence;
	}

	public void setVence(String vence) {
		this.vence = vence;
	}

	@Override
	public String toString() {
		return this.fecha + " " + this.proveedor + " " + this.id + " " + this.nombre + " " + this.direccion + " "
				+ this.observaciones + " " + this.numeroPago + " " + this.periodo + " " + this.motivo + " "
				+ this.numero + " " + this.alterno + " " + this.documento + " " + this.sector + " " + this.fechaDetalle
				+ " " + this.vence + " " + this.total + " " + this.valor + " " + this.totalDetalleSuperior + " "
				+ this.forma + " " + this.referencia + " " + this.valorDetalleInferior + " "
				+ this.observacionesDetalleInferior + " " + this.totalDetalleInferior;
	}
}
