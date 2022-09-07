package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class AnxListaRetencionesPendientesTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "ret_sustentotributario")
	private String retSustentoTributario;
	@Column(name = "ret_proveedor_id_tipo")
	private String retProveedorTipo;
	@Column(name = "ret_proveedor_id_numero")
	private String retProveedorId;
	@Column(name = "ret_proveedor_nombre")
	private String retProveedorNombre;
	@Column(name = "ret_retencionautorizacion")
	private String retRetencionAutorizacion;
	@Column(name = "ret_retencionnumero")
	private String retRetencionNumero;
	@Column(name = "ret_retencionfecha")
	private String retRetencionFecha;
	@Column(name = "ret_ambiente")
	private String retAmbiente;
	@Column(name = "ret_valorretenidoir")
	private BigDecimal retValorRetenidoIr;
	@Column(name = "ret_valorretenidoiva")
	private BigDecimal retValorRetenidoIva;
	@Column(name = "ret_llavecompra")
	private String retLlaveCompra;
	@Column(name = "ret_llavecontable")
	private String retLlaveContable;
	@Column(name = "ret_auxiliar")
	private boolean estado;

	public AnxListaRetencionesPendientesTO() {
	}

	public AnxListaRetencionesPendientesTO(Integer id, String retSustentoTributario, String retProveedorTipo,
			String retProveedorId, String retProveedorNombre, String retRetencionAutorizacion,
			String retRetencionNumero, String retRetencionFecha, String retAmbiente, BigDecimal retValorRetenidoIr,
			BigDecimal retValorRetenidoIva, String retLlaveCompra, String retLlaveContable, boolean estado) {
		this.id = id;
		this.retSustentoTributario = retSustentoTributario;
		this.retProveedorTipo = retProveedorTipo;
		this.retProveedorId = retProveedorId;
		this.retProveedorNombre = retProveedorNombre;
		this.retRetencionAutorizacion = retRetencionAutorizacion;
		this.retRetencionNumero = retRetencionNumero;
		this.retRetencionFecha = retRetencionFecha;
		this.retAmbiente = retAmbiente;
		this.retValorRetenidoIr = retValorRetenidoIr;
		this.retValorRetenidoIva = retValorRetenidoIva;
		this.retLlaveCompra = retLlaveCompra;
		this.retLlaveContable = retLlaveContable;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRetSustentoTributario() {
		return retSustentoTributario;
	}

	public void setRetSustentoTributario(String retSustentoTributario) {
		this.retSustentoTributario = retSustentoTributario;
	}

	public String getRetProveedorTipo() {
		return retProveedorTipo;
	}

	public void setRetProveedorTipo(String retProveedorTipo) {
		this.retProveedorTipo = retProveedorTipo;
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

	public String getRetRetencionAutorizacion() {
		return retRetencionAutorizacion;
	}

	public void setRetRetencionAutorizacion(String retRetencionAutorizacion) {
		this.retRetencionAutorizacion = retRetencionAutorizacion;
	}

	public String getRetRetencionNumero() {
		return retRetencionNumero;
	}

	public void setRetRetencionNumero(String retRetencionNumero) {
		this.retRetencionNumero = retRetencionNumero;
	}

	public String getRetRetencionFecha() {
		return retRetencionFecha;
	}

	public void setRetRetencionFecha(String retRetencionFecha) {
		this.retRetencionFecha = retRetencionFecha;
	}

	public String getRetAmbiente() {
		return retAmbiente;
	}

	public void setRetAmbiente(String retAmbiente) {
		this.retAmbiente = retAmbiente;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
