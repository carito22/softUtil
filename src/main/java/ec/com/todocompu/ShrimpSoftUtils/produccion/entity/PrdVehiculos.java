package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prd_vehiculos", schema = "produccion")
public class PrdVehiculos implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected PrdVehiculosPK prdVehiculosPK;
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
	private BigDecimal vehCompraValor;
	@Column(name = "veh_compra_comision")
	private BigDecimal vehCompraComision;
	@Column(name = "veh_compra_multas_ctg")
	private BigDecimal vehCompraMultasCtg;
	@Column(name = "veh_compra_multas_ant")
	private BigDecimal vehCompraMultasAnt;
	@Column(name = "veh_venta_valor")
	private BigDecimal vehVentaValor;
	@Column(name = "veh_venta_comision")
	private BigDecimal vehVentaComision;
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
	@JoinColumns({ @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa"),
			@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector"),
			@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero") })
	@ManyToOne(optional = false)
	private PrdPiscina prdPiscina;

	public PrdVehiculos() {
	}

	public PrdVehiculos(PrdVehiculosPK prdVehiculosPK) {
		this.prdVehiculosPK = prdVehiculosPK;
	}

	public PrdVehiculos(String vehEmpresa, String vehEstablecimiento, String vehPlaca) {
		this.prdVehiculosPK = new PrdVehiculosPK(vehEmpresa, vehEstablecimiento, vehPlaca);
	}

	public PrdVehiculosPK getPrdVehiculosPK() {
		return prdVehiculosPK;
	}

	public void setPrdVehiculosPK(PrdVehiculosPK prdVehiculosPK) {
		this.prdVehiculosPK = prdVehiculosPK;
	}

	public String getVehMarca() {
		return vehMarca;
	}

	public void setVehMarca(String vehMarca) {
		this.vehMarca = vehMarca;
	}

	public String getVehModelo() {
		return vehModelo;
	}

	public void setVehModelo(String vehModelo) {
		this.vehModelo = vehModelo;
	}

	public String getVehColor() {
		return vehColor;
	}

	public void setVehColor(String vehColor) {
		this.vehColor = vehColor;
	}

	public String getVehAnio() {
		return vehAnio;
	}

	public void setVehAnio(String vehAnio) {
		this.vehAnio = vehAnio;
	}

	public String getVehMotor() {
		return vehMotor;
	}

	public void setVehMotor(String vehMotor) {
		this.vehMotor = vehMotor;
	}

	public String getVehChasis() {
		return vehChasis;
	}

	public void setVehChasis(String vehChasis) {
		this.vehChasis = vehChasis;
	}

	public String getVehOrigen() {
		return vehOrigen;
	}

	public void setVehOrigen(String vehOrigen) {
		this.vehOrigen = vehOrigen;
	}

	public String getVehTipo() {
		return vehTipo;
	}

	public void setVehTipo(String vehTipo) {
		this.vehTipo = vehTipo;
	}

	public String getVehTonelaje() {
		return vehTonelaje;
	}

	public void setVehTonelaje(String vehTonelaje) {
		this.vehTonelaje = vehTonelaje;
	}

	public String getVehCilindraje() {
		return vehCilindraje;
	}

	public void setVehCilindraje(String vehCilindraje) {
		this.vehCilindraje = vehCilindraje;
	}

	public String getVehCombustible() {
		return vehCombustible;
	}

	public void setVehCombustible(String vehCombustible) {
		this.vehCombustible = vehCombustible;
	}

	public String getVehTipoServicio() {
		return vehTipoServicio;
	}

	public void setVehTipoServicio(String vehTipoServicio) {
		this.vehTipoServicio = vehTipoServicio;
	}

	public String getVehObservaciones() {
		return vehObservaciones;
	}

	public void setVehObservaciones(String vehObservaciones) {
		this.vehObservaciones = vehObservaciones;
	}

	public BigDecimal getVehCompraValor() {
		return vehCompraValor;
	}

	public void setVehCompraValor(BigDecimal vehCompraValor) {
		this.vehCompraValor = vehCompraValor;
	}

	public BigDecimal getVehCompraComision() {
		return vehCompraComision;
	}

	public void setVehCompraComision(BigDecimal vehCompraComision) {
		this.vehCompraComision = vehCompraComision;
	}

	public BigDecimal getVehCompraMultasCtg() {
		return vehCompraMultasCtg;
	}

	public void setVehCompraMultasCtg(BigDecimal vehCompraMultasCtg) {
		this.vehCompraMultasCtg = vehCompraMultasCtg;
	}

	public BigDecimal getVehCompraMultasAnt() {
		return vehCompraMultasAnt;
	}

	public void setVehCompraMultasAnt(BigDecimal vehCompraMultasAnt) {
		this.vehCompraMultasAnt = vehCompraMultasAnt;
	}

	public BigDecimal getVehVentaValor() {
		return vehVentaValor;
	}

	public void setVehVentaValor(BigDecimal vehVentaValor) {
		this.vehVentaValor = vehVentaValor;
	}

	public BigDecimal getVehVentaComision() {
		return vehVentaComision;
	}

	public void setVehVentaComision(BigDecimal vehVentaComision) {
		this.vehVentaComision = vehVentaComision;
	}

	public String getVehMatriculadoANombreDe() {
		return vehMatriculadoANombreDe;
	}

	public void setVehMatriculadoANombreDe(String vehMatriculadoANombreDe) {
		this.vehMatriculadoANombreDe = vehMatriculadoANombreDe;
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

	public String getVehProveedorDireccion() {
		return vehProveedorDireccion;
	}

	public void setVehProveedorDireccion(String vehProveedorDireccion) {
		this.vehProveedorDireccion = vehProveedorDireccion;
	}

	public String getVehProveedorTelefono() {
		return vehProveedorTelefono;
	}

	public void setVehProveedorTelefono(String vehProveedorTelefono) {
		this.vehProveedorTelefono = vehProveedorTelefono;
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

	public String getVehClienteDireccion() {
		return vehClienteDireccion;
	}

	public void setVehClienteDireccion(String vehClienteDireccion) {
		this.vehClienteDireccion = vehClienteDireccion;
	}

	public String getVehClienteTelefono() {
		return vehClienteTelefono;
	}

	public void setVehClienteTelefono(String vehClienteTelefono) {
		this.vehClienteTelefono = vehClienteTelefono;
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

	public String getVehPrimerTraspasoDireccion() {
		return vehPrimerTraspasoDireccion;
	}

	public void setVehPrimerTraspasoDireccion(String vehPrimerTraspasoDireccion) {
		this.vehPrimerTraspasoDireccion = vehPrimerTraspasoDireccion;
	}

	public String getVehPrimerTraspasoTelefono() {
		return vehPrimerTraspasoTelefono;
	}

	public void setVehPrimerTraspasoTelefono(String vehPrimerTraspasoTelefono) {
		this.vehPrimerTraspasoTelefono = vehPrimerTraspasoTelefono;
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

	public String getVehSegundoTraspasoDireccion() {
		return vehSegundoTraspasoDireccion;
	}

	public void setVehSegundoTraspasoDireccion(String vehSegundoTraspasoDireccion) {
		this.vehSegundoTraspasoDireccion = vehSegundoTraspasoDireccion;
	}

	public String getVehSegundoTraspasoTelefono() {
		return vehSegundoTraspasoTelefono;
	}

	public void setVehSegundoTraspasoTelefono(String vehSegundoTraspasoTelefono) {
		this.vehSegundoTraspasoTelefono = vehSegundoTraspasoTelefono;
	}

	public PrdPiscina getPrdPiscina() {
		return prdPiscina;
	}

	public void setPrdPiscina(PrdPiscina prdPiscina) {
		this.prdPiscina = prdPiscina;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (prdVehiculosPK != null ? prdVehiculosPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdVehiculos)) {
			return false;
		}
		PrdVehiculos other = (PrdVehiculos) object;
		if ((this.prdVehiculosPK == null && other.prdVehiculosPK != null)
				|| (this.prdVehiculosPK != null && !this.prdVehiculosPK.equals(other.prdVehiculosPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdVehiculos[ prdVehiculosPK=" + prdVehiculosPK + " ]";
	}

}
