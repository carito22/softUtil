package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhFunXiiiSueldoConsultarTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "xiii_categoria")
	private String xiiiCategoria;
	@Column(name = "xiii_sector")
	private String xiiiSector;
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
	@Column(name = "xiii_cargo_iess")
	private String xiiiCargoIess;
	@Column(name = "xiii_total_ingresos")
	private BigDecimal xiiiTotalIngresos;
	@Column(name = "xiii_dias_laborados")
	private Short xiiiDiasLaborados;
	@Column(name = "xiii_valor_xiii_sueldo")
	private BigDecimal xiiiValorXiiiSueldo;
	@Column(name = "xiii_forma_pago")
	private String xiiiFormaPago;
	@Column(name = "xiii_documento")
	private String xiiiDocumento;
	@Column(name = "xiii_codigo_ministerial")
	private String xiiiCodigoMinisterial;
	@Column(name = "xiii_periodo")
	private String xiiiPeriodo;
	@Column(name = "xiii_tipo")
	private String xiiiTipo;
	@Column(name = "xiii_numero")
	private String xiiiNumero;
	@Column(name = "xiii_observaciones")
	private String xiiiObservaciones;

	public RhFunXiiiSueldoConsultarTO() {
	}

        public String getXiiiCargoIess() {
            return xiiiCargoIess;
        }

        public void setXiiiCargoIess(String xiiiCargoIess) {
            this.xiiiCargoIess = xiiiCargoIess;
        }

        public String getXiiiFormaPago() {
            return xiiiFormaPago;
        }

        public void setXiiiFormaPago(String xiiiFormaPago) {
            this.xiiiFormaPago = xiiiFormaPago;
        }

        public String getXiiiDocumento() {
            return xiiiDocumento;
        }

        public void setXiiiDocumento(String xiiiDocumento) {
            this.xiiiDocumento = xiiiDocumento;
        }

        public String getXiiiObservaciones() {
            return xiiiObservaciones;
        }

        public void setXiiiObservaciones(String xiiiObservaciones) {
            this.xiiiObservaciones = xiiiObservaciones;
        }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getXiiiApellidos() {
		return xiiiApellidos;
	}

	public void setXiiiApellidos(String xiiiApellidos) {
		this.xiiiApellidos = xiiiApellidos;
	}

	public String getXiiiCargo() {
		return xiiiCargo;
	}

	public void setXiiiCargo(String xiiiCargo) {
		this.xiiiCargo = xiiiCargo;
	}

	public String getXiiiCategoria() {
		return xiiiCategoria;
	}

	public void setXiiiCategoria(String xiiiCategoria) {
		this.xiiiCategoria = xiiiCategoria;
	}

	public String getXiiiCodigoMinisterial() {
		return xiiiCodigoMinisterial;
	}

	public void setXiiiCodigoMinisterial(String xiiiCodigoMinisterial) {
		this.xiiiCodigoMinisterial = xiiiCodigoMinisterial;
	}

	public Short getXiiiDiasLaborados() {
		return xiiiDiasLaborados;
	}

	public void setXiiiDiasLaborados(Short xiiiDiasLaborados) {
		this.xiiiDiasLaborados = xiiiDiasLaborados;
	}

	public String getXiiiFechaIngreso() {
		return xiiiFechaIngreso;
	}

	public void setXiiiFechaIngreso(String xiiiFechaIngreso) {
		this.xiiiFechaIngreso = xiiiFechaIngreso;
	}

	public Character getXiiiGenero() {
		return xiiiGenero;
	}

	public void setXiiiGenero(Character xiiiGenero) {
		this.xiiiGenero = xiiiGenero;
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

	public String getXiiiNumero() {
		return xiiiNumero;
	}

	public void setXiiiNumero(String xiiiNumero) {
		this.xiiiNumero = xiiiNumero;
	}

	public String getXiiiPeriodo() {
		return xiiiPeriodo;
	}

	public void setXiiiPeriodo(String xiiiPeriodo) {
		this.xiiiPeriodo = xiiiPeriodo;
	}

	public String getXiiiSector() {
		return xiiiSector;
	}

	public void setXiiiSector(String xiiiSector) {
		this.xiiiSector = xiiiSector;
	}

	public String getXiiiTipo() {
		return xiiiTipo;
	}

	public void setXiiiTipo(String xiiiTipo) {
		this.xiiiTipo = xiiiTipo;
	}

	public BigDecimal getXiiiTotalIngresos() {
		return xiiiTotalIngresos;
	}

	public void setXiiiTotalIngresos(BigDecimal xiiiTotalIngresos) {
		this.xiiiTotalIngresos = xiiiTotalIngresos;
	}

	public BigDecimal getXiiiValorXiiiSueldo() {
		return xiiiValorXiiiSueldo;
	}

	public void setXiiiValorXiiiSueldo(BigDecimal xiiiValorXiiiSueldo) {
		this.xiiiValorXiiiSueldo = xiiiValorXiiiSueldo;
	}

}
