package ec.com.todocompu.ShrimpSoftUtils.rrhh.report;

import java.io.Serializable;
import java.math.BigDecimal;

public class ReporteAnticipoPrestamoXIIISueldo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String comprobante;
	private String fecha;
	private String cedula;
	private String nombres;
	private String cargo;
	private String nombreSector;
	private BigDecimal valor;
	private BigDecimal valorARecibir;
	private BigDecimal impuestoRenta;
	private String formaPago;
	private String nombreCuenta;
	private String referencia;
	private String observaciones;
	private BigDecimal sueldo;
	private Integer diasCalculados;

	public ReporteAnticipoPrestamoXIIISueldo() {
	}

	public ReporteAnticipoPrestamoXIIISueldo(String comprobante, String fecha, String cedula, String nombres, String cargo,
			String nombreSector, BigDecimal valor, String formaPago, String referencia, String observaciones) {
		this.comprobante = comprobante;
		this.fecha = fecha;
		this.cedula = cedula;
		this.nombres = nombres;
		this.cargo = cargo;
		this.nombreSector = nombreSector;
		this.valor = valor;
		this.formaPago = formaPago;
		this.referencia = referencia;
		this.observaciones = observaciones;
	}

	public String getCargo() {
		return cargo;
	}

        public BigDecimal getValorARecibir() {
            return valorARecibir;
        }

        public void setValorARecibir(BigDecimal valorARecibir) {
            this.valorARecibir = valorARecibir;
        }

        public BigDecimal getImpuestoRenta() {
            return impuestoRenta;
        }

        public void setImpuestoRenta(BigDecimal impuestoRenta) {
            this.impuestoRenta = impuestoRenta;
        }

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getComprobante() {
		return comprobante;
	}

	public void setComprobante(String comprobante) {
		this.comprobante = comprobante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getNombreSector() {
		return nombreSector;
	}

	public void setNombreSector(String nombreSector) {
		this.nombreSector = nombreSector;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

        public String getNombreCuenta() {
            return nombreCuenta;
        }

        public void setNombreCuenta(String nombreCuenta) {
            this.nombreCuenta = nombreCuenta;
        }

        public Integer getDiasCalculados() {
            return diasCalculados;
        }

        public void setDiasCalculados(Integer diasCalculados) {
            this.diasCalculados = diasCalculados;
        }

}
