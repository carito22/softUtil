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
public class AnxListaRetencionesTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "ret_sustentotributario")
	private String retSustentoTributario;

	@Column(name = "ret_proveedor_tipo")
	private String retProveedorTipo;

	@Column(name = "ret_proveedor_id")
	private String retProveedorId;
        
	@Column(name = "ret_proveedor_extranjero_tipo")
	private String retProveedorExtranjeroTipo;

	@Column(name = "ret_proveedor_nombre")
	private String retProveedorNombre;

	@Column(name = "ret_proveedor_direccion")
	private String retProveedorDireccion;

	@Column(name = "ret_proveedor_ciudad")
	private String retProveedorCiudad;

	@Column(name = "ret_proveedor_relacionado")
	private String retProveedorRelacionado;

	@Column(name = "ret_documento_tipo")
	private String retDocumentoTipo;

	@Column(name = "ret_documento_nombre")
	private String retDocumentoNombre;

	@Column(name = "ret_documento_autorizacion")
	private String retDocumentoAutorizacion;

	@Column(name = "ret_documento_numero")
	private String retDocumentoNumero;

	@Column(name = "ret_comprafecha")
	private String retCompraFecha;

	@Column(name = "ret_comprabase0")
	private java.math.BigDecimal retCompraBase0;

	@Column(name = "ret_comprabaseimponible")
	private java.math.BigDecimal retCompraBaseImponible;

	@Column(name = "ret_comprabaseexenta")
	private java.math.BigDecimal retCompraBaseExenta;

	@Column(name = "ret_compramontoice")
	private java.math.BigDecimal retCompraMontoIce;

	//Aqui
	@Column(name = "ret_iva_vigente")
	private java.math.BigDecimal retIvavigente;
	
	
	@Column(name = "ret_compramontoiva")
	private java.math.BigDecimal retCompraMontoIva;

	@Column(name = "ret_retencionautorizacion")
	private String retRetencionAutorizacion;

	@Column(name = "ret_retencionnumero")
	private String retRetencionNumero;

	@Column(name = "ret_retencionfecha")
	private String retRetencionFecha;

	@Column(name = "ret_valorretenidoir")
	private java.math.BigDecimal retValorRetenidoIr;

	@Column(name = "ret_valorbienes10")
	private java.math.BigDecimal retValorBienes10;

	@Column(name = "ret_valorservicios20")
	private java.math.BigDecimal retValorServicios20;

	@Column(name = "ret_valorbienes30")
	private java.math.BigDecimal retValorBienes30;

	@Column(name = "ret_valorservicios50")
	private java.math.BigDecimal retValorServicios50;
        
	@Column(name = "ret_valorservicios70")
	private java.math.BigDecimal retValorServicios70;

	@Column(name = "ret_valorserviciosprofesionales")
	private java.math.BigDecimal retValorServiciosProfesionales;

	@Column(name = "ret_valorretenidoiva")
	private java.math.BigDecimal retValorRetenidoIva;

	@Column(name = "ret_totalretenido")
	private java.math.BigDecimal retTotalRetenido;

	@Column(name = "ret_modificado_documento_tipo")
	private String retModificadoDocumentoTipo;

	@Column(name = "ret_modificado_documento_numero")
	private String retModificadoDocumentonumero;

	@Column(name = "ret_modificado_autorizacion")
	private String retModificadoAutorizacion;

	@Column(name = "ret_llavecompra")
	private String retLlaveCompra;

	@Column(name = "ret_llavecontable")
	private String retLlaveContable;

	public AnxListaRetencionesTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getRetCompraBaseExenta() {
		return retCompraBaseExenta;
	}

	public void setRetCompraBaseExenta(BigDecimal retCompraBaseExenta) {
		this.retCompraBaseExenta = retCompraBaseExenta;
	}

	public BigDecimal getRetCompraMontoIce() {
		return retCompraMontoIce;
	}

	public void setRetCompraMontoIce(BigDecimal retCompraMontoIce) {
		this.retCompraMontoIce = retCompraMontoIce;
	}

	public String getRetProveedorRelacionado() {
		return retProveedorRelacionado;
	}

	public void setRetProveedorRelacionado(String retProveedorRelacionado) {
		this.retProveedorRelacionado = retProveedorRelacionado;
	}

	public BigDecimal getRetValorBienes10() {
		return retValorBienes10;
	}

	public void setRetValorBienes10(BigDecimal retValorBienes10) {
		this.retValorBienes10 = retValorBienes10;
	}

	public BigDecimal getRetValorBienes20() {
		return retValorServicios20;
	}

	public void setRetValorBienes20(BigDecimal retValorBienes20) {
		this.retValorServicios20 = retValorBienes20;
	}

	public BigDecimal getRetCompraBase0() {
		return retCompraBase0;
	}

	public void setRetCompraBase0(BigDecimal retCompraBase0) {
		this.retCompraBase0 = retCompraBase0;
	}

	public BigDecimal getRetCompraBaseImponible() {
		return retCompraBaseImponible;
	}

	public void setRetCompraBaseImponible(BigDecimal retCompraBaseImponible) {
		this.retCompraBaseImponible = retCompraBaseImponible;
	}

	public String getRetCompraFecha() {
		return retCompraFecha;
	}

	public void setRetCompraFecha(String retCompraFecha) {
		this.retCompraFecha = retCompraFecha;
	}

	
	
	

	public java.math.BigDecimal getRetIvavigente() {
		return retIvavigente;
	}

	public void setRetIvavigente(java.math.BigDecimal retIvavigente) {
		this.retIvavigente = retIvavigente;
	}

	public BigDecimal getRetCompraMontoIva() {
		return retCompraMontoIva;
	}

	public void setRetCompraMontoIva(BigDecimal retCompraMontoIva) {
		this.retCompraMontoIva = retCompraMontoIva;
	}

	public String getRetDocumentoAutorizacion() {
		return retDocumentoAutorizacion;
	}

	public void setRetDocumentoAutorizacion(String retDocumentoAutorizacion) {
		this.retDocumentoAutorizacion = retDocumentoAutorizacion;
	}

	public String getRetDocumentoNombre() {
		return retDocumentoNombre;
	}

	public void setRetDocumentoNombre(String retDocumentoNombre) {
		this.retDocumentoNombre = retDocumentoNombre;
	}

	public String getRetDocumentoNumero() {
		return retDocumentoNumero;
	}

	public void setRetDocumentoNumero(String retDocumentoNumero) {
		this.retDocumentoNumero = retDocumentoNumero;
	}

	public String getRetDocumentoTipo() {
		return retDocumentoTipo;
	}

	public void setRetDocumentoTipo(String retDocumentoTipo) {
		this.retDocumentoTipo = retDocumentoTipo;
	}

	public String getRetLlaveCompra() {
		return retLlaveCompra;
	}

	public void setRetLlaveCompra(String retLlaveCompra) {
		this.retLlaveCompra = retLlaveCompra;
	}

	public String getRetLlaveContable() {
		return retLlaveContable;
	}

	public void setRetLlaveContable(String retLlaveContable) {
		this.retLlaveContable = retLlaveContable;
	}

	public String getRetProveedorCiudad() {
		return retProveedorCiudad;
	}

	public void setRetProveedorCiudad(String retProveedorCiudad) {
		this.retProveedorCiudad = retProveedorCiudad;
	}

	public String getRetProveedorDireccion() {
		return retProveedorDireccion;
	}

	public void setRetProveedorDireccion(String retProveedorDireccion) {
		this.retProveedorDireccion = retProveedorDireccion;
	}

	public String getRetProveedorId() {
		return retProveedorId;
	}

	public void setRetProveedorId(String retProveedorId) {
		this.retProveedorId = retProveedorId;
	}

	public String getRetProveedorNombre() {
		return retProveedorNombre;
	}

	public void setRetProveedorNombre(String retProveedorNombre) {
		this.retProveedorNombre = retProveedorNombre;
	}

	public String getRetProveedorTipo() {
		return retProveedorTipo;
	}

	public void setRetProveedorTipo(String retProveedorTipo) {
		this.retProveedorTipo = retProveedorTipo;
	}

	public String getRetRetencionAutorizacion() {
		return retRetencionAutorizacion;
	}

	public void setRetRetencionAutorizacion(String retRetencionAutorizacion) {
		this.retRetencionAutorizacion = retRetencionAutorizacion;
	}

	public String getRetRetencionFecha() {
		return retRetencionFecha;
	}

	public void setRetRetencionFecha(String retRetencionFecha) {
		this.retRetencionFecha = retRetencionFecha;
	}

	public String getRetRetencionNumero() {
		return retRetencionNumero;
	}

	public void setRetRetencionNumero(String retRetencionNumero) {
		this.retRetencionNumero = retRetencionNumero;
	}

	public String getRetSustentoTributario() {
		return retSustentoTributario;
	}

	public void setRetSustentoTributario(String retSustentoTributario) {
		this.retSustentoTributario = retSustentoTributario;
	}

	public BigDecimal getRetTotalRetenido() {
		return retTotalRetenido;
	}

	public void setRetTotalRetenido(BigDecimal retTotalRetenido) {
		this.retTotalRetenido = retTotalRetenido;
	}

	public BigDecimal getRetValorRetenidoIr() {
		return retValorRetenidoIr;
	}

	public void setRetValorRetenidoIr(BigDecimal retValorRetenidoIr) {
		this.retValorRetenidoIr = retValorRetenidoIr;
	}

	public BigDecimal getRetValorRetenidoIva() {
		return retValorRetenidoIva;
	}

	public void setRetValorRetenidoIva(BigDecimal retValorRetenidoIva) {
		this.retValorRetenidoIva = retValorRetenidoIva;
	}

        public BigDecimal getRetValorServicios20() {
            return retValorServicios20;
        }

        public void setRetValorServicios20(BigDecimal retValorServicios20) {
            this.retValorServicios20 = retValorServicios20;
        }

        public BigDecimal getRetValorBienes30() {
            return retValorBienes30;
        }

        public void setRetValorBienes30(BigDecimal retValorBienes30) {
            this.retValorBienes30 = retValorBienes30;
        }

        public BigDecimal getRetValorServicios50() {
            return retValorServicios50;
        }

        public void setRetValorServicios50(BigDecimal retValorServicios50) {
            this.retValorServicios50 = retValorServicios50;
        }

        public BigDecimal getRetValorServicios70() {
            return retValorServicios70;
        }

        public void setRetValorServicios70(BigDecimal retValorServicios70) {
            this.retValorServicios70 = retValorServicios70;
        }

	public BigDecimal getRetValorServiciosProfesionales() {
		return retValorServiciosProfesionales;
	}

	public void setRetValorServiciosProfesionales(BigDecimal retValorServiciosProfesionales) {
		this.retValorServiciosProfesionales = retValorServiciosProfesionales;
	}

	public String getRetModificadoAutorizacion() {
		return retModificadoAutorizacion;
	}

	public void setRetModificadoAutorizacion(String retModificadoAutorizacion) {
		this.retModificadoAutorizacion = retModificadoAutorizacion;
	}

	public String getRetModificadoDocumentoTipo() {
		return retModificadoDocumentoTipo;
	}

	public void setRetModificadoDocumentoTipo(String retModificadoDocumentoTipo) {
		this.retModificadoDocumentoTipo = retModificadoDocumentoTipo;
	}

	public String getRetModificadoDocumentonumero() {
		return retModificadoDocumentonumero;
	}

	public void setRetModificadoDocumentonumero(String retModificadoDocumentonumero) {
		this.retModificadoDocumentonumero = retModificadoDocumentonumero;
	}

        public String getRetProveedorExtranjeroTipo() {
            return retProveedorExtranjeroTipo;
        }

        public void setRetProveedorExtranjeroTipo(String retProveedorExtranjeroTipo) {
            this.retProveedorExtranjeroTipo = retProveedorExtranjeroTipo;
        }

}
