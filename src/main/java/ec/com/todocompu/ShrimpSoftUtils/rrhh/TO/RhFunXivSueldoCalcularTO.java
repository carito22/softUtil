/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */

@Entity
public class RhFunXivSueldoCalcularTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "xiv_id")
	private String xivId;

	@Column(name = "xiv_nombres")
	private String xivNombres;

	@Column(name = "xiv_apellidos")
	private String xivApellidos;

	@Column(name = "xiv_genero")
	private Character xivGenero;

	@Column(name = "xiv_fecha_ingreso")
	private String xivFechaIngreso;

	@Column(name = "xiv_cargo")
	private String xivCargo;

	@Column(name = "xiv_total_ingresos")
	private java.math.BigDecimal xivTotalIngresos;

	@Column(name = "xiv_dias_laborados")
	private Integer xivDiasLaborados;

	@Column(name = "xiv_valor_xiv_sueldo")
	private java.math.BigDecimal xivValorXivSueldo;

	@Column(name = "xiv_categoria")
	private String xivCategoria;

	@Column(name = "xiv_cuenta")
	private String xivCuenta;

	@Column(name = "xiv_sector")
	private String xivSector;
        
        @Column(name = "xiv_salario_minimo_vital")
	private java.math.BigDecimal xivSalarioMinimoVital;

	private boolean estado;

	public RhFunXivSueldoCalcularTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getXivApellidos() {
		return xivApellidos;
	}

	public void setXivApellidos(String xivApellidos) {
		this.xivApellidos = xivApellidos;
	}

	public String getXivCargo() {
		return xivCargo;
	}

	public void setXivCargo(String xivCargo) {
		this.xivCargo = xivCargo;
	}

	public String getXivCategoria() {
		return xivCategoria;
	}

	public void setXivCategoria(String xivCategoria) {
		this.xivCategoria = xivCategoria;
	}

	public String getXivCuenta() {
		return xivCuenta;
	}

	public void setXivCuenta(String xivCuenta) {
		this.xivCuenta = xivCuenta;
	}

	public Integer getXivDiasLaborados() {
		return xivDiasLaborados;
	}

	public void setXivDiasLaborados(Integer xivDiasLaborados) {
		this.xivDiasLaborados = xivDiasLaborados;
	}

	public String getXivFechaIngreso() {
		return xivFechaIngreso;
	}

	public void setXivFechaIngreso(String xivFechaIngreso) {
		this.xivFechaIngreso = xivFechaIngreso;
	}

	public Character getXivGenero() {
		return xivGenero;
	}

	public void setXivGenero(Character xivGenero) {
		this.xivGenero = xivGenero;
	}

	public String getXivId() {
		return xivId;
	}

	public void setXivId(String xivId) {
		this.xivId = xivId;
	}

	public String getXivNombres() {
		return xivNombres;
	}

	public void setXivNombres(String xivNombres) {
		this.xivNombres = xivNombres;
	}

	public String getXivSector() {
		return xivSector;
	}

	public void setXivSector(String xivSector) {
		this.xivSector = xivSector;
	}

	public BigDecimal getXivTotalIngresos() {
		return xivTotalIngresos;
	}

	public void setXivTotalIngresos(BigDecimal xivTotalIngresos) {
		this.xivTotalIngresos = xivTotalIngresos;
	}

	public BigDecimal getXivValorXivSueldo() {
		return xivValorXivSueldo;
	}

	public void setXivValorXivSueldo(BigDecimal xivValorXivSueldo) {
		this.xivValorXivSueldo = xivValorXivSueldo;
	}

        public BigDecimal getXivSalarioMinimoVital() {
            return xivSalarioMinimoVital;
        }

        public void setXivSalarioMinimoVital(BigDecimal xivSalarioMinimoVital) {
            this.xivSalarioMinimoVital = xivSalarioMinimoVital;
        }

}
