/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdVehiculosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "veh_empresa")
	private String vehEmpresa;

	// @Column(name = "")
	private String vehCentroProduccion;

	@Column(name = "veh_establecimiento")
	private String vehEstablecimiento;

	@Column(name = "veh_placa")
	private String vehPlaca;

	@Column(name = "veh_marca")
	private String vehMarca;

	@Column(name = "veh_modelo")
	private String vehModelo;

	@Column(name = "veh_color")
	private String vehColor;

	@Column(name = "veh_anio")
	private String vehAnio;

	@Column(name = "veh_motor")
	private String vehMotor;

	@Column(name = "veh_chasis")
	private String vehChasis;

	@Column(name = "veh_origen")
	private String vehOrigen;

	@Column(name = "veh_tipo")
	private String vehTipo;

	@Column(name = "veh_tonelaje")
	private String vehTonelaje;

	@Column(name = "veh_cilindraje")
	private String vehCilindraje;

	@Column(name = "veh_combustible")
	private String vehCombustible;

	@Column(name = "veh_tipo_servicio")
	private String vehTipoServicio;

	@Column(name = "veh_observaciones")
	private String vehObservaciones;

	@Column(name = "veh_compra_valor")
	private java.math.BigDecimal vehCompraValor;

	@Column(name = "veh_compra_comision")
	private java.math.BigDecimal vehCompraComision;

	@Column(name = "veh_compra_multas_ctg")
	private java.math.BigDecimal vehCompraMultasCtg;

	@Column(name = "veh_compra_multas_ant")
	private java.math.BigDecimal vehCompraMultasAnt;

	@Column(name = "veh_venta_valor")
	private java.math.BigDecimal vehVentaValor;

	@Column(name = "veh_venta_comision")
	private java.math.BigDecimal vehVentaComision;

	@Column(name = "veh_matriculado_a_nombre_de")
	private String vehMatriculadoANombreDe;

	@Column(name = "veh_proveedor_id")
	private String vehProveedorId;

	@Column(name = "veh_proveedor_nombre")
	private String vehProveedorNombre;

	@Column(name = "veh_proveedor_direccion")
	private String vehProveedorDireccion;

	@Column(name = "veh_proveedor_telefono")
	private String vehProveedorTelefono;

	@Column(name = "veh_cliente_id")
	private String vehClienteId;

	@Column(name = "veh_cliente_nombre")
	private String vehClienteNombre;

	@Column(name = "veh_cliente_direccion")
	private String vehClienteDireccion;

	@Column(name = "veh_cliente_telefono")
	private String vehClienteTelefono;

	@Column(name = "veh_primer_traspaso_id")
	private String vehPrimerTraspasoId;

	@Column(name = "veh_primer_traspaso_nombre")
	private String vehPrimerTraspasoNombre;

	@Column(name = "veh_primer_traspaso_direccion")
	private String vehPrimerTraspasoDireccion;

	@Column(name = "veh_primer_traspaso_telefono")
	private String vehPrimerTraspasoTelefono;

	@Column(name = "veh_segundo_traspaso_id")
	private String vehSegundoTraspasoId;

	@Column(name = "veh_segundo_traspaso_nombre")
	private String vehSegundoTraspasoNombre;

	@Column(name = "veh_segundo_traspaso_direccion")
	private String vehSegundoTraspasoDireccion;

	@Column(name = "veh_segundo_traspaso_telefono")
	private String vehSegundoTraspasoTelefono;

	public PrdVehiculosTO() {
	}

	public PrdVehiculosTO(String vehEmpresa, String vehCentroProduccion, String vehEstablecimiento, String vehPlaca,
			String vehMarca, String vehModelo, String vehColor, String vehAnio, String vehMotor, String vehChasis,
			String vehOrigen, String vehTipo, String vehTonelaje, String vehCilindraje, String vehCombustible,
			String vehTipoServicio, String vehObservaciones, BigDecimal vehCompraValor, BigDecimal vehCompraComision,
			BigDecimal vehCompraMultasCtg, BigDecimal vehCompraMultasAnt, BigDecimal vehVentaValor,
			BigDecimal vehVentaComision, String vehMatriculadoANombreDe, String vehProveedorId,
			String vehProveedorNombre, String vehProveedorDireccion, String vehProveedorTelefono, String vehClienteId,
			String vehClienteNombre, String vehClienteDireccion, String vehClienteTelefono, String vehPrimerTraspasoId,
			String vehPrimerTraspasoNombre, String vehPrimerTraspasoDireccion, String vehPrimerTraspasoTelefono,
			String vehSegundoTraspasoId, String vehSegundoTraspasoNombre, String vehSegundoTraspasoDireccion,
			String vehSegundoTraspasoTelefono) {
		this.vehEmpresa = vehEmpresa;
		this.vehCentroProduccion = vehCentroProduccion;
		this.vehEstablecimiento = vehEstablecimiento;
		this.vehPlaca = vehPlaca;
		this.vehMarca = vehMarca;
		this.vehModelo = vehModelo;
		this.vehColor = vehColor;
		this.vehAnio = vehAnio;
		this.vehMotor = vehMotor;
		this.vehChasis = vehChasis;
		this.vehOrigen = vehOrigen;
		this.vehTipo = vehTipo;
		this.vehTonelaje = vehTonelaje;
		this.vehCilindraje = vehCilindraje;
		this.vehCombustible = vehCombustible;
		this.vehTipoServicio = vehTipoServicio;
		this.vehObservaciones = vehObservaciones;
		this.vehCompraValor = vehCompraValor;
		this.vehCompraComision = vehCompraComision;
		this.vehCompraMultasCtg = vehCompraMultasCtg;
		this.vehCompraMultasAnt = vehCompraMultasAnt;
		this.vehVentaValor = vehVentaValor;
		this.vehVentaComision = vehVentaComision;
		this.vehMatriculadoANombreDe = vehMatriculadoANombreDe;
		this.vehProveedorId = vehProveedorId;
		this.vehProveedorNombre = vehProveedorNombre;
		this.vehProveedorDireccion = vehProveedorDireccion;
		this.vehProveedorTelefono = vehProveedorTelefono;
		this.vehClienteId = vehClienteId;
		this.vehClienteNombre = vehClienteNombre;
		this.vehClienteDireccion = vehClienteDireccion;
		this.vehClienteTelefono = vehClienteTelefono;
		this.vehPrimerTraspasoId = vehPrimerTraspasoId;
		this.vehPrimerTraspasoNombre = vehPrimerTraspasoNombre;
		this.vehPrimerTraspasoDireccion = vehPrimerTraspasoDireccion;
		this.vehPrimerTraspasoTelefono = vehPrimerTraspasoTelefono;
		this.vehSegundoTraspasoId = vehSegundoTraspasoId;
		this.vehSegundoTraspasoNombre = vehSegundoTraspasoNombre;
		this.vehSegundoTraspasoDireccion = vehSegundoTraspasoDireccion;
		this.vehSegundoTraspasoTelefono = vehSegundoTraspasoTelefono;
	}

	public String getVehAnio() {
		return vehAnio;
	}

	public void setVehAnio(String vehAnio) {
		this.vehAnio = vehAnio;
	}

	public String getVehCentroProduccion() {
		return vehCentroProduccion;
	}

	public void setVehCentroProduccion(String vehCentroProduccion) {
		this.vehCentroProduccion = vehCentroProduccion;
	}

	public String getVehChasis() {
		return vehChasis;
	}

	public void setVehChasis(String vehChasis) {
		this.vehChasis = vehChasis;
	}

	public String getVehCilindraje() {
		return vehCilindraje;
	}

	public void setVehCilindraje(String vehCilindraje) {
		this.vehCilindraje = vehCilindraje;
	}

	public String getVehClienteDireccion() {
		return vehClienteDireccion;
	}

	public void setVehClienteDireccion(String vehClienteDireccion) {
		this.vehClienteDireccion = vehClienteDireccion;
	}

	public String getVehClienteId() {
		return vehClienteId;
	}

	public void setVehClienteId(String vehClienteId) {
		this.vehClienteId = vehClienteId;
	}

	public String getVehClienteNombre() {
		return vehClienteNombre;
	}

	public void setVehClienteNombre(String vehClienteNombre) {
		this.vehClienteNombre = vehClienteNombre;
	}

	public String getVehClienteTelefono() {
		return vehClienteTelefono;
	}

	public void setVehClienteTelefono(String vehClienteTelefono) {
		this.vehClienteTelefono = vehClienteTelefono;
	}

	public String getVehColor() {
		return vehColor;
	}

	public void setVehColor(String vehColor) {
		this.vehColor = vehColor;
	}

	public String getVehCombustible() {
		return vehCombustible;
	}

	public void setVehCombustible(String vehCombustible) {
		this.vehCombustible = vehCombustible;
	}

	public BigDecimal getVehCompraComision() {
		return vehCompraComision;
	}

	public void setVehCompraComision(BigDecimal vehCompraComision) {
		this.vehCompraComision = vehCompraComision;
	}

	public BigDecimal getVehCompraMultasAnt() {
		return vehCompraMultasAnt;
	}

	public void setVehCompraMultasAnt(BigDecimal vehCompraMultasAnt) {
		this.vehCompraMultasAnt = vehCompraMultasAnt;
	}

	public BigDecimal getVehCompraMultasCtg() {
		return vehCompraMultasCtg;
	}

	public void setVehCompraMultasCtg(BigDecimal vehCompraMultasCtg) {
		this.vehCompraMultasCtg = vehCompraMultasCtg;
	}

	public BigDecimal getVehCompraValor() {
		return vehCompraValor;
	}

	public void setVehCompraValor(BigDecimal vehCompraValor) {
		this.vehCompraValor = vehCompraValor;
	}

	public String getVehEmpresa() {
		return vehEmpresa;
	}

	public void setVehEmpresa(String vehEmpresa) {
		this.vehEmpresa = vehEmpresa;
	}

	public String getVehEstablecimiento() {
		return vehEstablecimiento;
	}

	public void setVehEstablecimiento(String vehEstablecimiento) {
		this.vehEstablecimiento = vehEstablecimiento;
	}

	public String getVehMarca() {
		return vehMarca;
	}

	public void setVehMarca(String vehMarca) {
		this.vehMarca = vehMarca;
	}

	public String getVehMatriculadoANombreDe() {
		return vehMatriculadoANombreDe;
	}

	public void setVehMatriculadoANombreDe(String vehMatriculadoANombreDe) {
		this.vehMatriculadoANombreDe = vehMatriculadoANombreDe;
	}

	public String getVehModelo() {
		return vehModelo;
	}

	public void setVehModelo(String vehModelo) {
		this.vehModelo = vehModelo;
	}

	public String getVehMotor() {
		return vehMotor;
	}

	public void setVehMotor(String vehMotor) {
		this.vehMotor = vehMotor;
	}

	public String getVehObservaciones() {
		return vehObservaciones;
	}

	public void setVehObservaciones(String vehObservaciones) {
		this.vehObservaciones = vehObservaciones;
	}

	public String getVehOrigen() {
		return vehOrigen;
	}

	public void setVehOrigen(String vehOrigen) {
		this.vehOrigen = vehOrigen;
	}

	public String getVehPlaca() {
		return vehPlaca;
	}

	public void setVehPlaca(String vehPlaca) {
		this.vehPlaca = vehPlaca;
	}

	public String getVehPrimerTraspasoDireccion() {
		return vehPrimerTraspasoDireccion;
	}

	public void setVehPrimerTraspasoDireccion(String vehPrimerTraspasoDireccion) {
		this.vehPrimerTraspasoDireccion = vehPrimerTraspasoDireccion;
	}

	public String getVehPrimerTraspasoId() {
		return vehPrimerTraspasoId;
	}

	public void setVehPrimerTraspasoId(String vehPrimerTraspasoId) {
		this.vehPrimerTraspasoId = vehPrimerTraspasoId;
	}

	public String getVehPrimerTraspasoNombre() {
		return vehPrimerTraspasoNombre;
	}

	public void setVehPrimerTraspasoNombre(String vehPrimerTraspasoNombre) {
		this.vehPrimerTraspasoNombre = vehPrimerTraspasoNombre;
	}

	public String getVehPrimerTraspasoTelefono() {
		return vehPrimerTraspasoTelefono;
	}

	public void setVehPrimerTraspasoTelefono(String vehPrimerTraspasoTelefono) {
		this.vehPrimerTraspasoTelefono = vehPrimerTraspasoTelefono;
	}

	public String getVehProveedorDireccion() {
		return vehProveedorDireccion;
	}

	public void setVehProveedorDireccion(String vehProveedorDireccion) {
		this.vehProveedorDireccion = vehProveedorDireccion;
	}

	public String getVehProveedorId() {
		return vehProveedorId;
	}

	public void setVehProveedorId(String vehProveedorId) {
		this.vehProveedorId = vehProveedorId;
	}

	public String getVehProveedorNombre() {
		return vehProveedorNombre;
	}

	public void setVehProveedorNombre(String vehProveedorNombre) {
		this.vehProveedorNombre = vehProveedorNombre;
	}

	public String getVehProveedorTelefono() {
		return vehProveedorTelefono;
	}

	public void setVehProveedorTelefono(String vehProveedorTelefono) {
		this.vehProveedorTelefono = vehProveedorTelefono;
	}

	public String getVehSegundoTraspasoDireccion() {
		return vehSegundoTraspasoDireccion;
	}

	public void setVehSegundoTraspasoDireccion(String vehSegundoTraspasoDireccion) {
		this.vehSegundoTraspasoDireccion = vehSegundoTraspasoDireccion;
	}

	public String getVehSegundoTraspasoId() {
		return vehSegundoTraspasoId;
	}

	public void setVehSegundoTraspasoId(String vehSegundoTraspasoId) {
		this.vehSegundoTraspasoId = vehSegundoTraspasoId;
	}

	public String getVehSegundoTraspasoNombre() {
		return vehSegundoTraspasoNombre;
	}

	public void setVehSegundoTraspasoNombre(String vehSegundoTraspasoNombre) {
		this.vehSegundoTraspasoNombre = vehSegundoTraspasoNombre;
	}

	public String getVehSegundoTraspasoTelefono() {
		return vehSegundoTraspasoTelefono;
	}

	public void setVehSegundoTraspasoTelefono(String vehSegundoTraspasoTelefono) {
		this.vehSegundoTraspasoTelefono = vehSegundoTraspasoTelefono;
	}

	public String getVehTipo() {
		return vehTipo;
	}

	public void setVehTipo(String vehTipo) {
		this.vehTipo = vehTipo;
	}

	public String getVehTipoServicio() {
		return vehTipoServicio;
	}

	public void setVehTipoServicio(String vehTipoServicio) {
		this.vehTipoServicio = vehTipoServicio;
	}

	public String getVehTonelaje() {
		return vehTonelaje;
	}

	public void setVehTonelaje(String vehTonelaje) {
		this.vehTonelaje = vehTonelaje;
	}

	public BigDecimal getVehVentaComision() {
		return vehVentaComision;
	}

	public void setVehVentaComision(BigDecimal vehVentaComision) {
		this.vehVentaComision = vehVentaComision;
	}

	public BigDecimal getVehVentaValor() {
		return vehVentaValor;
	}

	public void setVehVentaValor(BigDecimal vehVentaValor) {
		this.vehVentaValor = vehVentaValor;
	}
}
