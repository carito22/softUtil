package ec.com.todocompu.ShrimpSoftUtils.inventario.report;

import java.io.Serializable;
import java.math.BigDecimal;

public class ReporteConsumoDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	private String consEmpresa;
	private String consPeriodo;
	private String consMotivo;
	private String consNumero;
	private String consFecha;
	private String consObservaciones;
	private String consReferencia;
	private Boolean consPendiente;
	private Boolean consRevisado;
	private Boolean consAnulado;
	private String usrCodigo;
	private String usrFechaInserta;

	private Integer secuencial;
	private String codigoBodega;
	private String codigoProducto;
	// private BigDecimal detCantidadCaja;
	private String nombreProducto;
	private BigDecimal cantidadProducto;
	private BigDecimal costoProducto;
	private String medidaDetalle;
	private String codigoCP;
	private String codigoCC;

	public ReporteConsumoDetalle() {
	}

	public BigDecimal getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(BigDecimal cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

        public BigDecimal getCostoProducto() {
            return costoProducto;
        }

        public void setCostoProducto(BigDecimal costoProducto) {
            this.costoProducto = costoProducto;
        }

	public String getCodigoBodega() {
		return codigoBodega;
	}

	public void setCodigoBodega(String codigoBodega) {
		this.codigoBodega = codigoBodega;
	}

	public String getCodigoCC() {
		return codigoCC;
	}

	public void setCodigoCC(String codigoCC) {
		this.codigoCC = codigoCC;
	}

	public String getCodigoCP() {
		return codigoCP;
	}

	public void setCodigoCP(String codigoCP) {
		this.codigoCP = codigoCP;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Boolean getConsAnulado() {
		return consAnulado;
	}

	public void setConsAnulado(Boolean consAnulado) {
		this.consAnulado = consAnulado;
	}

	public String getConsEmpresa() {
		return consEmpresa;
	}

	public void setConsEmpresa(String consEmpresa) {
		this.consEmpresa = consEmpresa;
	}

	public String getConsFecha() {
		return consFecha;
	}

	public void setConsFecha(String consFecha) {
		this.consFecha = consFecha;
	}

	public String getConsMotivo() {
		return consMotivo;
	}

	public void setConsMotivo(String consMotivo) {
		this.consMotivo = consMotivo;
	}

	public String getConsNumero() {
		return consNumero;
	}

	public void setConsNumero(String consNumero) {
		this.consNumero = consNumero;
	}

	public String getConsObservaciones() {
		return consObservaciones;
	}

	public void setConsObservaciones(String consObservaciones) {
		this.consObservaciones = consObservaciones;
	}

	public Boolean getConsPendiente() {
		return consPendiente;
	}

	public void setConsPendiente(Boolean consPendiente) {
		this.consPendiente = consPendiente;
	}

	public String getConsPeriodo() {
		return consPeriodo;
	}

	public void setConsPeriodo(String consPeriodo) {
		this.consPeriodo = consPeriodo;
	}

	public Boolean getConsRevisado() {
		return consRevisado;
	}

	public void setConsRevisado(Boolean consRevisado) {
		this.consRevisado = consRevisado;
	}

	public String getMedidaDetalle() {
		return medidaDetalle;
	}

	public void setMedidaDetalle(String medidaDetalle) {
		this.medidaDetalle = medidaDetalle;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getSecuencial() {
		return secuencial;
	}

	public void setSecuencial(Integer secuencial) {
		this.secuencial = secuencial;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

        public String getConsReferencia() {
            return consReferencia;
        }

        public void setConsReferencia(String consReferencia) {
            this.consReferencia = consReferencia;
        }
        
}
