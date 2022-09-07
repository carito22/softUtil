package ec.com.todocompu.ShrimpSoftUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MensajeTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Boolean correcto;
	private String mensaje;
	private String fechaCreacion;
	private String compra;
	private String venta;
	private String consumo;
	private String transferencia;
	private String contable;
	private List<DetalleError> listaErrores;
	private Throwable ex;

	private List<String> listaErrores1 = new ArrayList<String>();
	private List<String> listaMensajes = new ArrayList<String>();
	private Map<String, Object> map = new HashMap<String, Object>();
	private Exception exeption;

	public MensajeTO() {
	}

	public MensajeTO(Boolean correcto, String mensaje, String fechaCreacion) {
		this.correcto = correcto;
		this.mensaje = mensaje;
		this.fechaCreacion = fechaCreacion;
	}

	public MensajeTO(Boolean correcto, String mensaje, String fechaCreacion, Exception exeption) {
		this.correcto = correcto;
		this.mensaje = mensaje;
		this.fechaCreacion = fechaCreacion;
		this.exeption = exeption;
	}

	public MensajeTO(Boolean correcto, String mensaje, String fechaCreacion, String compra, String venta,
			String consumo, String transferencia, String contable, List<DetalleError> listaErrores, Throwable ex) {
		this.correcto = correcto;
		this.mensaje = mensaje;
		this.fechaCreacion = fechaCreacion;
		this.compra = compra;
		this.venta = venta;
		this.consumo = consumo;
		this.transferencia = transferencia;
		this.contable = contable;
		this.listaErrores = listaErrores;
		this.ex = ex;
	}

	public MensajeTO(Boolean correcto, String mensaje, String fechaCreacion, String compra, String venta,
			String consumo, String transferencia, String contable, List<DetalleError> listaErrores, Throwable ex,
			List<String> listaErrores1, List<String> listaMensajes, Map<String, Object> map, Exception exeption) {
		this.correcto = correcto;
		this.mensaje = mensaje;
		this.fechaCreacion = fechaCreacion;
		this.compra = compra;
		this.venta = venta;
		this.consumo = consumo;
		this.transferencia = transferencia;
		this.contable = contable;
		this.listaErrores = listaErrores;
		this.ex = ex;
		this.listaErrores1 = listaErrores1;
		this.listaMensajes = listaMensajes;
		this.map = map;
		this.exeption = exeption;
	}

	public List<String> getListaErrores1() {
		return listaErrores1;
	}

	public void setListaErrores1(List<String> listaErrores1) {
		this.listaErrores1 = listaErrores1;
	}

	public List<String> getListaMensajes() {
		return listaMensajes;
	}

	public void setListaMensajes(List<String> listaMensajes) {
		this.listaMensajes = listaMensajes;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Exception getExeption() {
		return exeption;
	}

	public void setExeption(Exception exeption) {
		this.exeption = exeption;
	}

	public String getCompra() {
		return compra;
	}

	public void setCompra(String compra) {
		this.compra = compra;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public String getContable() {
		return contable;
	}

	public void setContable(String contable) {
		this.contable = contable;
	}

	public Boolean getCorrecto() {
		return correcto;
	}

	public void setCorrecto(Boolean correcto) {
		this.correcto = correcto;
	}

	public Throwable getEx() {
		return ex;
	}

	public void setEx(Throwable ex) {
		this.ex = ex;
	}

	public String getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public List<DetalleError> getListaErrores() {
		return listaErrores;
	}

	public void setListaErrores(List<DetalleError> listaErrores) {
		this.listaErrores = listaErrores;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(String transferencia) {
		this.transferencia = transferencia;
	}

	public String getVenta() {
		return venta;
	}

	public void setVenta(String venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return this.mensaje;
	}
}
