package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdProyeccionTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	@Column(name = "rc_empresa")
	private String rcEmpresa;
	@Column(name = "rc_sector")
	private String rcSector;
	@Column(name = "rc_piscina")
	private String rcPiscina;
	@Column(name = "rc_corrida")
	private String rcCorrida;
	@Column(name = "rc_hectareaje")
	private BigDecimal rcHectareaje;
	@Column(name = "rc_fecha_desde")
	private String rcFechaDesde;
	@Column(name = "rc_fecha_siembra")
	private String rcFechaSiembra;
	@Column(name = "rc_fecha_transferencia")
	private String rcFechaTransferencia;
	@Column(name = "rc_edad")
	private Integer rcEdad;
	@Column(name = "rc_dias_secos")
	private Integer rcDiasSecos;
	@Column(name = "rc_numero_larvas")
	private Integer rcNumeroLarvas;
	@Column(name = "rc_densidad")
	private Integer rcDensidad;
	@Column(name = "rc_laboratorio")
	private String rcLaboratorio;
	@Column(name = "rc_nauplio")
	private String rcNauplio;
	@Column(name = "rc_balanceado")
	private BigDecimal rcBalanceado;
	@Column(name = "rc_conversion")
	private BigDecimal rcConversion;
	@Column(name = "rc_sobrevivencia")
	private String rcSobrevivencia;
	@Column(name = "rc_costo_total")
	private BigDecimal rcCostoTotal;
	@Column(name = "rc_costo_total_proyectado")
	private BigDecimal rcCostoTotalProyectado;
	@Column(name = "rc_peso_promedio")
	private BigDecimal rcPesoPromedio;
	@Column(name = "rc_peso_promedio_proyectado")
	private BigDecimal rcPesoPromedioProyectado;
	@Column(name = "rc_biomasa")
	private BigDecimal rcBiomasa;
	@Column(name = "rc_biomasa_proyectada")
	private BigDecimal rcBiomasaProyectada;
	@Column(name = "rc_venta")
	private BigDecimal rcVenta;
	@Column(name = "rc_venta_proyectada")
	private BigDecimal rcVentaProyectada;

	public PrdProyeccionTO() {

	}

	public PrdProyeccionTO(Integer id, String rcEmpresa, String rcSector, String rcPiscina, String rcCorrida,
			BigDecimal rcHectareaje, String rcFechaDesde, String rcFechaSiembra, String rcFechaTransferencia,
			Integer rcEdad, Integer rcDiasSecos, Integer rcNumeroLarvas, Integer rcDensidad, String rcLaboratorio,
			String rcNauplio, BigDecimal rcBalanceado, BigDecimal rcConversion, String rcSobrevivencia,
			BigDecimal rcCostoTotal, BigDecimal rcCostoTotalProyectado, BigDecimal rcPesoPromedio,
			BigDecimal rcPesoPromedioProyectado, BigDecimal rcBiomasa, BigDecimal rcBiomasaProyectada,
			BigDecimal rcVenta, BigDecimal rcVentaProyectada) {
		this.id = id;
		this.rcEmpresa = rcEmpresa;
		this.rcSector = rcSector;
		this.rcPiscina = rcPiscina;
		this.rcCorrida = rcCorrida;
		this.rcHectareaje = rcHectareaje;
		this.rcFechaDesde = rcFechaDesde;
		this.rcFechaSiembra = rcFechaSiembra;
		this.rcFechaTransferencia = rcFechaTransferencia;
		this.rcEdad = rcEdad;
		this.rcDiasSecos = rcDiasSecos;
		this.rcNumeroLarvas = rcNumeroLarvas;
		this.rcDensidad = rcDensidad;
		this.rcLaboratorio = rcLaboratorio;
		this.rcNauplio = rcNauplio;
		this.rcBalanceado = rcBalanceado;
		this.rcConversion = rcConversion;
		this.rcSobrevivencia = rcSobrevivencia;
		this.rcCostoTotal = rcCostoTotal;
		this.rcCostoTotalProyectado = rcCostoTotalProyectado;
		this.rcPesoPromedio = rcPesoPromedio;
		this.rcPesoPromedioProyectado = rcPesoPromedioProyectado;
		this.rcBiomasa = rcBiomasa;
		this.rcBiomasaProyectada = rcBiomasaProyectada;
		this.rcVenta = rcVenta;
		this.rcVentaProyectada = rcVentaProyectada;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRcEmpresa() {
		return rcEmpresa;
	}

	public void setRcEmpresa(String rcEmpresa) {
		this.rcEmpresa = rcEmpresa;
	}

	public String getRcSector() {
		return rcSector;
	}

	public void setRcSector(String rcSector) {
		this.rcSector = rcSector;
	}

	public String getRcPiscina() {
		return rcPiscina;
	}

	public void setRcPiscina(String rcPiscina) {
		this.rcPiscina = rcPiscina;
	}

	public String getRcCorrida() {
		return rcCorrida;
	}

	public void setRcCorrida(String rcCorrida) {
		this.rcCorrida = rcCorrida;
	}

	public BigDecimal getRcHectareaje() {
		return rcHectareaje;
	}

	public void setRcHectareaje(BigDecimal rcHectareaje) {
		this.rcHectareaje = rcHectareaje;
	}

	public String getRcFechaDesde() {
		return rcFechaDesde;
	}

	public void setRcFechaDesde(String rcFechaDesde) {
		this.rcFechaDesde = rcFechaDesde;
	}

	public String getRcFechaSiembra() {
		return rcFechaSiembra;
	}

	public void setRcFechaSiembra(String rcFechaSiembra) {
		this.rcFechaSiembra = rcFechaSiembra;
	}

	public String getRcFechaTransferencia() {
		return rcFechaTransferencia;
	}

	public void setRcFechaTransferencia(String rcFechaTransferencia) {
		this.rcFechaTransferencia = rcFechaTransferencia;
	}

	public Integer getRcEdad() {
		return rcEdad;
	}

	public void setRcEdad(Integer rcEdad) {
		this.rcEdad = rcEdad;
	}

	public Integer getRcDiasSecos() {
		return rcDiasSecos;
	}

	public void setRcDiasSecos(Integer rcDiasSecos) {
		this.rcDiasSecos = rcDiasSecos;
	}

	public Integer getRcNumeroLarvas() {
		return rcNumeroLarvas;
	}

	public void setRcNumeroLarvas(Integer rcNumeroLarvas) {
		this.rcNumeroLarvas = rcNumeroLarvas;
	}

	public Integer getRcDensidad() {
		return rcDensidad;
	}

	public void setRcDensidad(Integer rcDensidad) {
		this.rcDensidad = rcDensidad;
	}

	public String getRcLaboratorio() {
		return rcLaboratorio;
	}

	public void setRcLaboratorio(String rcLaboratorio) {
		this.rcLaboratorio = rcLaboratorio;
	}

	public String getRcNauplio() {
		return rcNauplio;
	}

	public void setRcNauplio(String rcNauplio) {
		this.rcNauplio = rcNauplio;
	}

	public BigDecimal getRcBalanceado() {
		return rcBalanceado;
	}

	public void setRcBalanceado(BigDecimal rcBalanceado) {
		this.rcBalanceado = rcBalanceado;
	}

	public BigDecimal getRcConversion() {
		return rcConversion;
	}

	public void setRcConversion(BigDecimal rcConversion) {
		this.rcConversion = rcConversion;
	}

	public String getRcSobrevivencia() {
		return rcSobrevivencia;
	}

	public void setRcSobrevivencia(String rcSobrevivencia) {
		this.rcSobrevivencia = rcSobrevivencia;
	}

	public BigDecimal getRcCostoTotal() {
		return rcCostoTotal;
	}

	public void setRcCostoTotal(BigDecimal rcCostoTotal) {
		this.rcCostoTotal = rcCostoTotal;
	}

	public BigDecimal getRcCostoTotalProyectado() {
		return rcCostoTotalProyectado;
	}

	public void setRcCostoTotalProyectado(BigDecimal rcCostoTotalProyectado) {
		this.rcCostoTotalProyectado = rcCostoTotalProyectado;
	}

	public BigDecimal getRcPesoPromedio() {
		return rcPesoPromedio;
	}

	public void setRcPesoPromedio(BigDecimal rcPesoPromedio) {
		this.rcPesoPromedio = rcPesoPromedio;
	}

	public BigDecimal getRcPesoPromedioProyectado() {
		return rcPesoPromedioProyectado;
	}

	public void setRcPesoPromedioProyectado(BigDecimal rcPesoPromedioProyectado) {
		this.rcPesoPromedioProyectado = rcPesoPromedioProyectado;
	}

	public BigDecimal getRcBiomasa() {
		return rcBiomasa;
	}

	public void setRcBiomasa(BigDecimal rcBiomasa) {
		this.rcBiomasa = rcBiomasa;
	}

	public BigDecimal getRcBiomasaProyectada() {
		return rcBiomasaProyectada;
	}

	public void setRcBiomasaProyectada(BigDecimal rcBiomasaProyectada) {
		this.rcBiomasaProyectada = rcBiomasaProyectada;
	}

	public BigDecimal getRcVenta() {
		return rcVenta;
	}

	public void setRcVenta(BigDecimal rcVenta) {
		this.rcVenta = rcVenta;
	}

	public BigDecimal getRcVentaProyectada() {
		return rcVentaProyectada;
	}

	public void setRcVentaProyectada(BigDecimal rcVentaProyectada) {
		this.rcVentaProyectada = rcVentaProyectada;
	}

}
