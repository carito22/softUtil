package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhFunXiiiSueldoCalcularTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "xiii_id")
	private String xiiiId;
	@Column(name = "xiii_nombres")
	private String xiiiNombres;
	@Column(name = "xiii_apellidos")
	private String xiiiApellidos;
	@Column(name = "xiii_genero")
	private Character xiiiGenero;
	@Column(name = "xiii_fecha_ingreso")
	private String xiiiFechaIngreso;
	@Column(name = "xiii_cargo")
	private String xiiiCargo;
	@Column(name = "xiii_total_ingresos")
	private BigDecimal xiiiTotalIngresos;
	@Column(name = "xiii_dias_laborados")
	private Integer xiiiDiasLaborados;
	@Column(name = "xiii_valor_xiii_sueldo")
	private BigDecimal xiiiValorXiiiSueldo;
	@Column(name = "xiii_categoria")
	private String xiiiCategoria;
	@Column(name = "xiii_cuenta")
	private String xiiiCuenta;
	@Column(name = "xiii_sector")
	private String xiiiSector;
	private Boolean estado;

	public RhFunXiiiSueldoCalcularTO() {
	}

	public RhFunXiiiSueldoCalcularTO(Integer id, String xiiiId, String xiiiNombres, String xiiiApellidos,
			Character xiiiGenero, String xiiiFechaIngreso, String xiiiCargo, BigDecimal xiiiTotalIngresos,
			Integer xiiiDiasLaborados, BigDecimal xiiiValorXiiiSueldo, String xiiiCategoria, String xiiiCuenta,
			String xiiiSector, Boolean estado) {
		this.id = id;
		this.xiiiId = xiiiId;
		this.xiiiNombres = xiiiNombres;
		this.xiiiApellidos = xiiiApellidos;
		this.xiiiGenero = xiiiGenero;
		this.xiiiFechaIngreso = xiiiFechaIngreso;
		this.xiiiCargo = xiiiCargo;
		this.xiiiTotalIngresos = xiiiTotalIngresos;
		this.xiiiDiasLaborados = xiiiDiasLaborados;
		this.xiiiValorXiiiSueldo = xiiiValorXiiiSueldo;
		this.xiiiCategoria = xiiiCategoria;
		this.xiiiCuenta = xiiiCuenta;
		this.xiiiSector = xiiiSector;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXiiiId() {
		return xiiiId;
	}

	public void setXiiiId(String xiiiId) {
		this.xiiiId = xiiiId;
	}

	public String getXiiiNombres() {
		return xiiiNombres;
	}

	public void setXiiiNombres(String xiiiNombres) {
		this.xiiiNombres = xiiiNombres;
	}

	public String getXiiiApellidos() {
		return xiiiApellidos;
	}

	public void setXiiiApellidos(String xiiiApellidos) {
		this.xiiiApellidos = xiiiApellidos;
	}

	public Character getXiiiGenero() {
		return xiiiGenero;
	}

	public void setXiiiGenero(Character xiiiGenero) {
		this.xiiiGenero = xiiiGenero;
	}

	public String getXiiiFechaIngreso() {
		return xiiiFechaIngreso;
	}

	public void setXiiiFechaIngreso(String xiiiFechaIngreso) {
		this.xiiiFechaIngreso = xiiiFechaIngreso;
	}

	public String getXiiiCargo() {
		return xiiiCargo;
	}

	public void setXiiiCargo(String xiiiCargo) {
		this.xiiiCargo = xiiiCargo;
	}

	public BigDecimal getXiiiTotalIngresos() {
		return xiiiTotalIngresos;
	}

	public void setXiiiTotalIngresos(BigDecimal xiiiTotalIngresos) {
		this.xiiiTotalIngresos = xiiiTotalIngresos;
	}

	public Integer getXiiiDiasLaborados() {
		return xiiiDiasLaborados;
	}

	public void setXiiiDiasLaborados(Integer xiiiDiasLaborados) {
		this.xiiiDiasLaborados = xiiiDiasLaborados;
	}

	public BigDecimal getXiiiValorXiiiSueldo() {
		return xiiiValorXiiiSueldo;
	}

	public void setXiiiValorXiiiSueldo(BigDecimal xiiiValorXiiiSueldo) {
		this.xiiiValorXiiiSueldo = xiiiValorXiiiSueldo;
	}

	public String getXiiiCategoria() {
		return xiiiCategoria;
	}

	public void setXiiiCategoria(String xiiiCategoria) {
		this.xiiiCategoria = xiiiCategoria;
	}

	public String getXiiiCuenta() {
		return xiiiCuenta;
	}

	public void setXiiiCuenta(String xiiiCuenta) {
		this.xiiiCuenta = xiiiCuenta;
	}

	public String getXiiiSector() {
		return xiiiSector;
	}

	public void setXiiiSector(String xiiiSector) {
		this.xiiiSector = xiiiSector;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

}
