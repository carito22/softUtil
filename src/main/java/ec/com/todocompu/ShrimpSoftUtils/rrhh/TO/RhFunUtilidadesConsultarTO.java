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
public class RhFunUtilidadesConsultarTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "uti_categoria")
	private String utiCategoria;

	@Column(name = "uti_sector")
	private String utiSector;

	@Column(name = "uti_id")
	private String utiId;

	@Column(name = "uti_nombres")
	private String utiNombres;

	@Column(name = "uti_apellidos")
	private String utiApellidos;

	@Column(name = "uti_genero")
	private Character utiGenero;

	@Column(name = "uti_fecha_ingreso")
	private String utiFechaIngreso;

	@Column(name = "uti_cargo")
	private String utiCargo;

	@Column(name = "uti_dias_laborados")
	private Short utiDiasLaborados;

	@Column(name = "uti_valor_utilidades")
	private java.math.BigDecimal utiValorUtilidades;
        
	@Column(name = "uti_impuesto_renta")
	private java.math.BigDecimal utiImpuestoRenta;

	@Column(name = "uti_forma_pago")
	private String utiFormaPago;
        
	@Column(name = "uti_documento")
	private String utiDocumento;
        
	@Column(name = "uti_observaciones")
	private String utiObservaciones;

	@Column(name = "uti_periodo")
	private String utiPeriodo;

	@Column(name = "uti_tipo")
	private String utiTipo;

	@Column(name = "uti_numero")
	private String utiNumero;

	public RhFunUtilidadesConsultarTO() {
	}

	public RhFunUtilidadesConsultarTO(String utiCategoria, String utiSector, String utiId, String utiNombres,
			String utiApellidos, Character utiGenero, String utiFechaIngreso, String utiCargo,
			Short utiDiasLaborados, BigDecimal utiValorUtilidades,
			String utiFormaPago, String utiPeriodo, String utiTipo, String utiNumero, Integer id) {
		this.utiCategoria = utiCategoria;
		this.utiSector = utiSector;
		this.utiId = utiId;
		this.utiNombres = utiNombres;
		this.utiApellidos = utiApellidos;
		this.utiGenero = utiGenero;
		this.utiFechaIngreso = utiFechaIngreso;
		this.utiCargo = utiCargo;
		this.utiDiasLaborados = utiDiasLaborados;
		this.utiValorUtilidades = utiValorUtilidades;
		this.utiFormaPago = utiFormaPago;
		this.utiPeriodo = utiPeriodo;
		this.utiTipo = utiTipo;
		this.utiNumero = utiNumero;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUtiCategoria() {
		return utiCategoria;
	}

	public void setUtiCategoria(String utiCategoria) {
		this.utiCategoria = utiCategoria;
	}

	public String getUtiSector() {
		return utiSector;
	}

	public void setUtiSector(String utiSector) {
		this.utiSector = utiSector;
	}

	public String getUtiId() {
		return utiId;
	}

	public void setUtiId(String utiId) {
		this.utiId = utiId;
	}

	public String getUtiNombres() {
		return utiNombres;
	}

	public void setUtiNombres(String utiNombres) {
		this.utiNombres = utiNombres;
	}

	public String getUtiApellidos() {
		return utiApellidos;
	}

	public void setUtiApellidos(String utiApellidos) {
		this.utiApellidos = utiApellidos;
	}

	public Character getUtiGenero() {
		return utiGenero;
	}

	public void setUtiGenero(Character utiGenero) {
		this.utiGenero = utiGenero;
	}

	public String getUtiFechaIngreso() {
		return utiFechaIngreso;
	}

	public void setUtiFechaIngreso(String utiFechaIngreso) {
		this.utiFechaIngreso = utiFechaIngreso;
	}

	public String getUtiCargo() {
		return utiCargo;
	}

	public void setUtiCargo(String utiCargo) {
		this.utiCargo = utiCargo;
	}

	public Short getUtiDiasLaborados() {
		return utiDiasLaborados;
	}

	public void setUtiDiasLaborados(Short utiDiasLaborados) {
		this.utiDiasLaborados = utiDiasLaborados;
	}

	public BigDecimal getUtiValorUtilidades() {
		return utiValorUtilidades;
	}

	public void setUtiValorUtilidades(BigDecimal utiValorUtilidades) {
		this.utiValorUtilidades = utiValorUtilidades;
	}

	public String getUtiFormaPago() {
		return utiFormaPago;
	}

	public void setUtiFormaPago(String utiFormaPago) {
		this.utiFormaPago = utiFormaPago;
	}

        public String getUtiDocumento() {
            return utiDocumento;
        }

        public void setUtiDocumento(String utiDocumento) {
            this.utiDocumento = utiDocumento;
        }

        public String getUtiObservaciones() {
            return utiObservaciones;
        }

        public void setUtiObservaciones(String utiObservaciones) {
            this.utiObservaciones = utiObservaciones;
        }

	public String getUtiPeriodo() {
		return utiPeriodo;
	}

	public void setUtiPeriodo(String utiPeriodo) {
		this.utiPeriodo = utiPeriodo;
	}

	public String getUtiTipo() {
		return utiTipo;
	}

	public void setUtiTipo(String utiTipo) {
		this.utiTipo = utiTipo;
	}

	public String getUtiNumero() {
		return utiNumero;
	}

	public void setUtiNumero(String utiNumero) {
		this.utiNumero = utiNumero;
	}

        public BigDecimal getUtiImpuestoRenta() {
            return utiImpuestoRenta;
        }

        public void setUtiImpuestoRenta(BigDecimal utiImpuestoRenta) {
            this.utiImpuestoRenta = utiImpuestoRenta;
        }

}
