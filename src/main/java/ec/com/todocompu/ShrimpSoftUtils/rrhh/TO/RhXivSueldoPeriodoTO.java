/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhXivSueldoPeriodoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "xiv_descripcion")
	private String xivDescripcion;

	@Column(name = "xiv_desde")
	private String xivDesde;

	@Column(name = "xiv_hasta")
	private String xivHasta;

	@Column(name = "xiv_fecha_maxima_pago")
	private String xivFechaMaximaPago;

	@Column(name = "par_salario_minimo_vital")
        private String xivSalarioMinimoVital;

	@Column(name = "xiv_secuencial")
	private Integer periodoSecuencial;

	public RhXivSueldoPeriodoTO() {
	}

        public RhXivSueldoPeriodoTO(String xivDescripcion, String xivDesde, String xivHasta, String xivFechaMaximaPago, String xivSalarioMinimoVital, Integer periodoSecuencial) {
            this.xivDescripcion = xivDescripcion;
            this.xivDesde = xivDesde;
            this.xivHasta = xivHasta;
            this.xivFechaMaximaPago = xivFechaMaximaPago;
            this.xivSalarioMinimoVital = xivSalarioMinimoVital;
            this.periodoSecuencial = periodoSecuencial;
        }

        public Integer getPeriodoSecuencial() {
            return periodoSecuencial;
        }

        public void setPeriodoSecuencial(Integer periodoSecuencial) {
            this.periodoSecuencial = periodoSecuencial;
        }

        public String getXivDescripcion() {
            return xivDescripcion;
        }

        public void setXivDescripcion(String xivDescripcion) {
            this.xivDescripcion = xivDescripcion;
        }

        public String getXivDesde() {
            return xivDesde;
        }

        public void setXivDesde(String xivDesde) {
            this.xivDesde = xivDesde;
        }

        public String getXivFechaMaximaPago() {
            return xivFechaMaximaPago;
        }

        public void setXivFechaMaximaPago(String xivFechaMaximaPago) {
            this.xivFechaMaximaPago = xivFechaMaximaPago;
        }

        public String getXivSalarioMinimoVital() {
            return xivSalarioMinimoVital;
        }

        public void setXivSalarioMinimoVital(String xivSalarioMinimoVital) {
            this.xivSalarioMinimoVital = xivSalarioMinimoVital;
        }

        public String getXivHasta() {
            return xivHasta;
        }

        public void setXivHasta(String xivHasta) {
            this.xivHasta = xivHasta;
        }

	@Override
	public String toString() {
		return this.xivDescripcion;
        }

}
