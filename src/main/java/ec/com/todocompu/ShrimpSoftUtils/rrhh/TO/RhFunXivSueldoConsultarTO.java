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
public class RhFunXivSueldoConsultarTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "xiv_categoria")
	private String xivCategoria;

	@Column(name = "xiv_sector")
	private String xivSector;

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
	private Short xivDiasLaborados;

	@Column(name = "xiv_valor_xiv_sueldo")
	private java.math.BigDecimal xivValorXivSueldo;
        
	@Column(name = "xiv_forma_pago")
	private String xivFormaPago;
        
	@Column(name = "xiv_documento")
	private String xivDocumento;
        
	@Column(name = "xiv_codigo_ministerial")
	private Character xivCodigoMinisterial;

	@Column(name = "xiv_periodo")
	private String xivPeriodo;

	@Column(name = "xiv_tipo")
	private String xivTipo;

	@Column(name = "xiv_numero")
	private String xivNumero;
        
	@Column(name = "xiv_observaciones")
	private String xivObservaciones;
        
	public RhFunXivSueldoConsultarTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXivCategoria() {
		return xivCategoria;
	}

	public void setXivCategoria(String xivCategoria) {
		this.xivCategoria = xivCategoria;
	}

	public String getXivSector() {
		return xivSector;
	}

	public void setXivSector(String xivSector) {
		this.xivSector = xivSector;
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

	public String getXivApellidos() {
		return xivApellidos;
	}

	public void setXivApellidos(String xivApellidos) {
		this.xivApellidos = xivApellidos;
	}

	public Character getXivGenero() {
		return xivGenero;
	}

	public void setXivGenero(Character xivGenero) {
		this.xivGenero = xivGenero;
	}

	public String getXivFechaIngreso() {
		return xivFechaIngreso;
	}

	public void setXivFechaIngreso(String xivFechaIngreso) {
		this.xivFechaIngreso = xivFechaIngreso;
	}

        public String getXivFormaPago() {
            return xivFormaPago;
        }

        public void setXivFormaPago(String xivFormaPago) {
            this.xivFormaPago = xivFormaPago;
        }

        public String getXivDocumento() {
            return xivDocumento;
        }

        public void setXivDocumento(String xivDocumento) {
            this.xivDocumento = xivDocumento;
        }

        public String getXivObservaciones() {
            return xivObservaciones;
        }

        public void setXivObservaciones(String xivObservaciones) {
            this.xivObservaciones = xivObservaciones;
        }

	public String getXivCargo() {
		return xivCargo;
	}

	public void setXivCargo(String xivCargo) {
		this.xivCargo = xivCargo;
	}

	public BigDecimal getXivTotalIngresos() {
		return xivTotalIngresos;
	}

	public void setXivTotalIngresos(BigDecimal xivTotalIngresos) {
		this.xivTotalIngresos = xivTotalIngresos;
	}

	public Short getXivDiasLaborados() {
		return xivDiasLaborados;
	}

	public void setXivDiasLaborados(Short xivDiasLaborados) {
		this.xivDiasLaborados = xivDiasLaborados;
	}

	public BigDecimal getXivValorXivSueldo() {
		return xivValorXivSueldo;
	}

	public void setXivValorXivSueldo(BigDecimal xivValorXivSueldo) {
		this.xivValorXivSueldo = xivValorXivSueldo;
	}

	public Character getXivCodigoMinisterial() {
		return xivCodigoMinisterial;
	}

	public void setXivCodigoMinisterial(Character xivCodigoMinisterial) {
		this.xivCodigoMinisterial = xivCodigoMinisterial;
	}

	public String getXivPeriodo() {
		return xivPeriodo;
	}

	public void setXivPeriodo(String xivPeriodo) {
		this.xivPeriodo = xivPeriodo;
	}

	public String getXivTipo() {
		return xivTipo;
	}

	public void setXivTipo(String xivTipo) {
		this.xivTipo = xivTipo;
	}

	public String getXivNumero() {
		return xivNumero;
	}

	public void setXivNumero(String xivNumero) {
		this.xivNumero = xivNumero;
	}

}
