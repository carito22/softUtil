package ec.com.todocompu.ShrimpSoftUtils;

import java.io.Serializable;
import java.util.List;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConContableTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConDetalleTO;

public class RetornoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String[] columnas = null;
	private List<String> columnasFaltantes = null;
	private Object[][] datos = {};
	private String mensaje;

	private List<String> mensajeConError;
	private ConContableTO conContableTO;
	private List<ConDetalleTO> conDetalleTO;

	public RetornoTO() {
	}

	public String[] getColumnas() {
		return columnas;
	}

	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	public List<String> getColumnasFaltantes() {
		return columnasFaltantes;
	}

	public void setColumnasFaltantes(List<String> columnasFaltantes) {
		this.columnasFaltantes = columnasFaltantes;
	}

	public Object[][] getDatos() {
		return datos;
	}

	public void setDatos(Object[][] datos) {
		this.datos = datos;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<String> getMensajeConError() {
		return mensajeConError;
	}

	public void setMensajeConError(List<String> mensajeConError) {
		this.mensajeConError = mensajeConError;
	}

	public ConContableTO getConContableTO() {
		return conContableTO;
	}

	public void setConContableTO(ConContableTO conContableTO) {
		this.conContableTO = conContableTO;
	}

	public List<ConDetalleTO> getConDetalleTO() {
		return conDetalleTO;
	}

	public void setConDetalleTO(List<ConDetalleTO> conDetalleTO) {
		this.conDetalleTO = conDetalleTO;
	}

}
