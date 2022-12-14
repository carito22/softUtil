package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

public class InvSincronizarTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sCodigo;
	private String sNombre;
	private String sStatus;
	private String sTipo;

	public InvSincronizarTO() {
	}

	public InvSincronizarTO(String sCodigo, String sNombre, String sStatus, String sTipo) {
		this.sCodigo = sCodigo;
		this.sNombre = sNombre;
		this.sStatus = sStatus;
		this.sTipo = sTipo;
	}

	public String getsCodigo() {
		return sCodigo;
	}

	public void setsCodigo(String sCodigo) {
		this.sCodigo = sCodigo;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsStatus() {
		return sStatus;
	}

	public void setsStatus(String sStatus) {
		this.sStatus = sStatus;
	}

	public String getsTipo() {
		return sTipo;
	}

	public void setsTipo(String sTipo) {
		this.sTipo = sTipo;
	}
}