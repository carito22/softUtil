/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class CarFunPagosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "pag_numero_sistema")
	private String pagNumeroSistema;

	@Column(name = "pag_fecha")
	private String pagFecha;

	@Column(name = "pag_proveedor")
	private String pagProveedor;

	@Column(name = "pag_valor")
	private java.math.BigDecimal pagValor;

	@Column(name = "pag_observaciones") // con_observaciones
	private String pagObservaciones;

	@Column(name = "pag_pendiente")
	private Boolean pagPendiente;

	@Column(name = "pag_anulado")
	private Boolean pagAnulado;
        
	@Column(name = "pag_bloqueado")
	private Boolean pagBloqueado;
        
	@Column(name = "pag_reversado")
	private Boolean pagReversado;

	public CarFunPagosTO() {
	}

	public CarFunPagosTO(String pagNumeroSistema, String pagFecha, String pagProveedor, BigDecimal pagValor,
			String pagObservaciones, Boolean pagPendiente, Boolean pagAnulado, Integer id) {
		this.pagNumeroSistema = pagNumeroSistema;
		this.pagFecha = pagFecha;
		this.pagProveedor = pagProveedor;
		this.pagValor = pagValor;
		this.pagObservaciones = pagObservaciones;
		this.pagPendiente = pagPendiente;
		this.pagAnulado = pagAnulado;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getPagAnulado() {
		return pagAnulado;
	}

	public void setPagAnulado(Boolean pagAnulado) {
		this.pagAnulado = pagAnulado;
	}

	public String getPagFecha() {
		return pagFecha;
	}

	public void setPagFecha(String pagFecha) {
		this.pagFecha = pagFecha;
	}

	public String getPagNumeroSistema() {
		return pagNumeroSistema;
	}

	public void setPagNumeroSistema(String pagNumeroSistema) {
		this.pagNumeroSistema = pagNumeroSistema;
	}

	public String getPagObservaciones() {
		return pagObservaciones;
	}

	public void setPagObservaciones(String pagObservaciones) {
		this.pagObservaciones = pagObservaciones;
	}

	public Boolean getPagPendiente() {
		return pagPendiente;
	}

	public void setPagPendiente(Boolean pagPendiente) {
		this.pagPendiente = pagPendiente;
	}

	public String getPagProveedor() {
		return pagProveedor;
	}

	public void setPagProveedor(String pagProveedor) {
		this.pagProveedor = pagProveedor;
	}

	public BigDecimal getPagValor() {
		return pagValor;
	}

	public void setPagValor(BigDecimal pagValor) {
		this.pagValor = pagValor;
	}

        public Boolean getPagBloqueado() {
            return pagBloqueado;
        }

        public void setPagBloqueado(Boolean pagBloqueado) {
            this.pagBloqueado = pagBloqueado;
        }

        public Boolean getPagReversado() {
            return pagReversado;
        }

        public void setPagReversado(Boolean pagReversado) {
            this.pagReversado = pagReversado;
        }
        
}
