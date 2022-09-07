/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author charly
 */
@Entity
public class AnxListadoCompraElectronicaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id") 
	private Integer id;

	@Column(name = "comp_periodo")
	private String compPeriodo;

	@Column(name = "comp_motivo")
	private String compMotivo;

	@Column(name = "comp_numero")
	private String compNumero;

	@Column(name = "comp_proveedor_razon_social")
	private String compProveedorRazonSocial;

	@Column(name = "comp_retencion_numero")
	private String compRetencionNumero;

	@Column(name = "comp_retencion_fecha_emision")
	private String compRetencionFechaEmision;

	@Column(name = "comp_autorizacion_fecha")
	private String compAutorizacionFecha;

	@Column(name = "comp_autorizacion_numero")
	private String compAutorizacionNumero;

	@Column(name = "email")
	private Boolean email;

	@Column(name = "email_enviado")
	private Boolean emailEnviado;

	@Column(name = "email_entregado")
	private Boolean emailEntregado;

	@Column(name = "email_leido")
	private Boolean emailLeido;

	@Column(name = "email_rebotado")
	private Boolean emailRebotado;

	public AnxListadoCompraElectronicaTO() {

	}

        public AnxListadoCompraElectronicaTO(Integer id, String compPeriodo, String compMotivo, String compNumero, String compProveedorRazonSocial, String compRetencionNumero, String compRetencionFechaEmision, String compAutorizacionFecha, String compAutorizacionNumero, Boolean email, Boolean emailEnviado, Boolean emailEntregado, Boolean emailLeido, Boolean emailRebotado) {
            this.id = id;
            this.compPeriodo = compPeriodo;
            this.compMotivo = compMotivo;
            this.compNumero = compNumero;
            this.compProveedorRazonSocial = compProveedorRazonSocial;
            this.compRetencionNumero = compRetencionNumero;
            this.compRetencionFechaEmision = compRetencionFechaEmision;
            this.compAutorizacionFecha = compAutorizacionFecha;
            this.compAutorizacionNumero = compAutorizacionNumero;
            this.email = email;
            this.emailEnviado = emailEnviado;
            this.emailEntregado = emailEntregado;
            this.emailLeido = emailLeido;
            this.emailRebotado = emailRebotado;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCompPeriodo() {
            return compPeriodo;
        }

        public void setCompPeriodo(String compPeriodo) {
            this.compPeriodo = compPeriodo;
        }

        public String getCompMotivo() {
            return compMotivo;
        }

        public void setCompMotivo(String compMotivo) {
            this.compMotivo = compMotivo;
        }

        public String getCompNumero() {
            return compNumero;
        }

        public void setCompNumero(String compNumero) {
            this.compNumero = compNumero;
        }

        public String getCompProveedorRazonSocial() {
            return compProveedorRazonSocial;
        }

        public void setCompProveedorRazonSocial(String compProveedorRazonSocial) {
            this.compProveedorRazonSocial = compProveedorRazonSocial;
        }

        public String getCompRetencionNumero() {
            return compRetencionNumero;
        }

        public void setCompRetencionNumero(String compRetencionNumero) {
            this.compRetencionNumero = compRetencionNumero;
        }

        public String getCompRetencionFechaEmision() {
            return compRetencionFechaEmision;
        }

        public void setCompRetencionFechaEmision(String compRetencionFechaEmision) {
            this.compRetencionFechaEmision = compRetencionFechaEmision;
        }

        public String getCompAutorizacionFecha() {
            return compAutorizacionFecha;
        }

        public void setCompAutorizacionFecha(String compAutorizacionFecha) {
            this.compAutorizacionFecha = compAutorizacionFecha;
        }

        public String getCompAutorizacionNumero() {
            return compAutorizacionNumero;
        }

        public void setCompAutorizacionNumero(String compAutorizacionNumero) {
            this.compAutorizacionNumero = compAutorizacionNumero;
        }

        public Boolean getEmail() {
            return email;
        }

        public void setEmail(Boolean email) {
            this.email = email;
        }

        public Boolean getEmailEnviado() {
            return emailEnviado;
        }

        public void setEmailEnviado(Boolean emailEnviado) {
            this.emailEnviado = emailEnviado;
        }

        public Boolean getEmailEntregado() {
            return emailEntregado;
        }

        public void setEmailEntregado(Boolean emailEntregado) {
            this.emailEntregado = emailEntregado;
        }

        public Boolean getEmailLeido() {
            return emailLeido;
        }

        public void setEmailLeido(Boolean emailLeido) {
            this.emailLeido = emailLeido;
        }

        public Boolean getEmailRebotado() {
            return emailRebotado;
        }

        public void setEmailRebotado(Boolean emailRebotado) {
            this.emailRebotado = emailRebotado;
        }

}