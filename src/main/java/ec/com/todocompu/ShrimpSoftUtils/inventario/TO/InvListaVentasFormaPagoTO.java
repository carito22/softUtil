/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvListaVentasFormaPagoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "fc_secuencial")
	private Integer fpSecuencial;

	@Column(name = "fc_detalle")
	private String fpDetalle;

	@Column(name = "fc_tipo_principal")
	private String fpTipoPrincipal;

	@Column(name = "fc_inactivo")
	private Boolean fpInactivo;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "cta_codigo")
	private String ctaCodigo;

        public InvListaVentasFormaPagoTO() {
        }

        public InvListaVentasFormaPagoTO(Integer fpSecuencial, String fpDetalle, String fpTipoPrincipal, Boolean fpInactivo, String secCodigo, String ctaCodigo) {
            this.fpSecuencial = fpSecuencial;
            this.fpDetalle = fpDetalle;
            this.fpTipoPrincipal = fpTipoPrincipal;
            this.fpInactivo = fpInactivo;
            this.secCodigo = secCodigo;
            this.ctaCodigo = ctaCodigo;
        }

        public Integer getFpSecuencial() {
            return fpSecuencial;
        }

        public void setFpSecuencial(Integer fpSecuencial) {
            this.fpSecuencial = fpSecuencial;
        }

        public String getFpDetalle() {
            return fpDetalle;
        }

        public void setFpDetalle(String fpDetalle) {
            this.fpDetalle = fpDetalle;
        }

        public String getFpTipoPrincipal() {
            return fpTipoPrincipal;
        }

        public void setFpTipoPrincipal(String fpTipoPrincipal) {
            this.fpTipoPrincipal = fpTipoPrincipal;
        }

        public Boolean getFpInactivo() {
            return fpInactivo;
        }

        public void setFpInactivo(Boolean fpInactivo) {
            this.fpInactivo = fpInactivo;
        }

        public String getSecCodigo() {
            return secCodigo;
        }

        public void setSecCodigo(String secCodigo) {
            this.secCodigo = secCodigo;
        }

        public String getCtaCodigo() {
            return ctaCodigo;
        }

        public void setCtaCodigo(String ctaCodigo) {
            this.ctaCodigo = ctaCodigo;
        }
}
