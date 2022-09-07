package ec.com.todocompu.ShrimpSoftUtils.inventario.report;

import java.io.Serializable;
import java.math.BigDecimal;

public class ReporteTransferenciaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	private String transEmpresa;
	private String transPeriodo;
	private String transMotivo;
	private String transNumero;
	private String transFecha;
	private String transObservacion;
	private String usrFechaInsert;
	private String usrCodigo;// usuario que elabora la trasferencia
	private String bodOrigenCodigo;
	private String bodDestinoCodigo;
	private String proCodigoPrincipal;
	private String proNombre;
	private BigDecimal detCantidad;
	private String proMedida;
	private BigDecimal detCostoPromedio;
	private BigDecimal detPrecio1;
	
	private java.math.BigDecimal cantidadCaja;
	private String empaque;
	private String presentacionUnidad;
	private String presentacionCaja;

	public ReporteTransferenciaDetalle() {
	}

	public java.math.BigDecimal getCantidadCaja() {
		return cantidadCaja;
	}



	public void setCantidadCaja(java.math.BigDecimal cantidadCaja) {
		this.cantidadCaja = cantidadCaja;
	}



	public String getEmpaque() {
		return empaque;
	}



	public void setEmpaque(String empaque) {
		this.empaque = empaque;
	}



	public String getPresentacionUnidad() {
		return presentacionUnidad;
	}



	public void setPresentacionUnidad(String presentacionUnidad) {
		this.presentacionUnidad = presentacionUnidad;
	}



	public String getPresentacionCaja() {
		return presentacionCaja;
	}



	public void setPresentacionCaja(String presentacionCaja) {
		this.presentacionCaja = presentacionCaja;
	}



	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getTransFecha() {
		return transFecha;
	}

	public void setTransFecha(String transFecha) {
		this.transFecha = transFecha;
	}

	public String getTransObservacion() {
		return transObservacion;
	}

	public void setTransObservacion(String transObservacion) {
		this.transObservacion = transObservacion;
	}

	public String getUsrFechaInsert() {
		return usrFechaInsert;
	}

	public void setUsrFechaInsert(String usrFechaInsert) {
		this.usrFechaInsert = usrFechaInsert;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}

	public String getProMedida() {
		return proMedida;
	}

	public void setProMedida(String proMedida) {
		this.proMedida = proMedida;
	}

	public void pruebaEstatico() {
	}

	public String getTransEmpresa() {
		return transEmpresa;
	}

	public void setTransEmpresa(String transEmpresa) {
		this.transEmpresa = transEmpresa;
	}

	public String getTransPeriodo() {
		return transPeriodo;
	}

	public void setTransPeriodo(String transPeriodo) {
		this.transPeriodo = transPeriodo;
	}

	public String getTransMotivo() {
		return transMotivo;
	}

	public void setTransMotivo(String transMotivo) {
		this.transMotivo = transMotivo;
	}

	public String getTransNumero() {
		return transNumero;
	}

	public void setTransNumero(String transNumero) {
		this.transNumero = transNumero;
	}

	public String getBodOrigenCodigo() {
		return bodOrigenCodigo;
	}

	public void setBodOrigenCodigo(String bodOrigenCodigo) {
		this.bodOrigenCodigo = bodOrigenCodigo;
	}

	public String getBodDestinoCodigo() {
		return bodDestinoCodigo;
	}

	public void setBodDestinoCodigo(String bodDestinoCodigo) {
		this.bodDestinoCodigo = bodDestinoCodigo;
	}

	public String getProCodigoPrincipal() {
		return proCodigoPrincipal;
	}

	public void setProCodigoPrincipal(String proCodigoPrincipal) {
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	public BigDecimal getDetCantidad() {
		return detCantidad;
	}

	public void setDetCantidad(BigDecimal detCantidad) {
		this.detCantidad = detCantidad;
	}

        public BigDecimal getDetCostoPromedio() {
            return detCostoPromedio;
        }

        public void setDetCostoPromedio(BigDecimal detCostoPromedio) {
            this.detCostoPromedio = detCostoPromedio;
        }

        public BigDecimal getDetPrecio1() {
            return detPrecio1;
        }

        public void setDetPrecio1(BigDecimal detPrecio1) {
            this.detPrecio1 = detPrecio1;
        }
}
