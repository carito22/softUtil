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
public class RhListaConsolidadoBonosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "cbv_categoria")
	private String cbvCategoria;

	@Column(name = "cbv_id")
	private String cbvId;

	@Column(name = "cbv_nombres")
	private String cbvNombres;

	@Column(name = "cbv_horas_extras")
	private BigDecimal cbvHorasExtras;

	@Column(name = "cbv_horas_extras_100")
	private BigDecimal cbvHorasExtras100;

	@Column(name = "cbv_bonos")
	private BigDecimal cbvBonos;

	@Column(name = "cbv_bonos_nd")
	private BigDecimal cbvBonosND;

	@Column(name = "cbv_bono_fijo")
	private BigDecimal cbvBonoFijo;

	@Column(name = "cbv_bono_fijo_nd")
	private BigDecimal cbvBonoFijoND;

	@Column(name = "cbv_total")
	private BigDecimal cbvTotal;

	public RhListaConsolidadoBonosTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

        public BigDecimal getCbvHorasExtras() {
            return cbvHorasExtras;
        }

        public void setCbvHorasExtras(BigDecimal cbvHorasExtras) {
            this.cbvHorasExtras = cbvHorasExtras;
        }

        public BigDecimal getCbvHorasExtras100() {
            return cbvHorasExtras100;
        }

        public void setCbvHorasExtras100(BigDecimal cbvHorasExtras100) {
            this.cbvHorasExtras100 = cbvHorasExtras100;
        }

	public BigDecimal getCbvBonoFijo() {
		return cbvBonoFijo;
	}

	public void setCbvBonoFijo(BigDecimal cbvBonoFijo) {
		this.cbvBonoFijo = cbvBonoFijo;
	}

	public BigDecimal getCbvBonoFijoND() {
		return cbvBonoFijoND;
	}

	public void setCbvBonoFijoND(BigDecimal cbvBonoFijoND) {
		this.cbvBonoFijoND = cbvBonoFijoND;
	}

	public BigDecimal getCbvBonos() {
		return cbvBonos;
	}

	public void setCbvBonos(BigDecimal cbvBonos) {
		this.cbvBonos = cbvBonos;
	}

	public BigDecimal getCbvBonosND() {
		return cbvBonosND;
	}

	public void setCbvBonosND(BigDecimal cbvBonosND) {
		this.cbvBonosND = cbvBonosND;
	}

	public String getCbvCategoria() {
		return cbvCategoria;
	}

	public void setCbvCategoria(String cbvCategoria) {
		this.cbvCategoria = cbvCategoria;
	}

	public String getCbvId() {
		return cbvId;
	}

	public void setCbvId(String cbvId) {
		this.cbvId = cbvId;
	}

	public String getCbvNombres() {
		return cbvNombres;
	}

	public void setCbvNombres(String cbvNombres) {
		this.cbvNombres = cbvNombres;
	}

	public BigDecimal getCbvTotal() {
		return cbvTotal;
	}

	public void setCbvTotal(BigDecimal cbvTotal) {
		this.cbvTotal = cbvTotal;
	}

}
