/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxConceptoTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "con_secuencial")
	private Integer conSecuencial;

        @Column(name = "con_codigo")
	private String conCodigo;

	@Column(name = "con_concepto")
	private String conConcepto;

	@Column(name = "con_ingresa_porcentaje")
	private java.math.BigDecimal conPorcentaje;

	@Column(name = "con_fecha_inicio")
	private String fechaInicio;

	@Column(name = "con_fecha_fin")
	private String fechaFin;

	public AnxConceptoTO() {
	}

	public String getConCodigo() {
		return conCodigo;
	}

	public void setConCodigo(String conCodigo) {
		this.conCodigo = conCodigo;
	}

	public String getConConcepto() {
		return conConcepto;
	}

	public void setConConcepto(String conConcepto) {
		this.conConcepto = conConcepto;
	}

	public BigDecimal getConPorcentaje() {
		return conPorcentaje;
	}

	public void setConPorcentaje(BigDecimal conPorcentaje) {
		this.conPorcentaje = conPorcentaje;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

        public Integer getConSecuencial() {
            return conSecuencial;
        }

        public void setConSecuencial(Integer conSecuencial) {
            this.conSecuencial = conSecuencial;
        }
        
}
