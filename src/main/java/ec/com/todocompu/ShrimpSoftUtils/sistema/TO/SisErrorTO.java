package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;
import java.sql.Timestamp;

public class SisErrorTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String tipoError;
	private String clase;
	private int linea;
	private String metodo;
	private Timestamp fecha;
	private String exception;
	private String usuario;
	private String mensaje;
	private String mac;
	private String empresa;
	private String email;
	private String telefono;

	public SisErrorTO() {
	}

	public SisErrorTO(String tipoError, String clase, int linea, String metodo, Timestamp fecha, String exception,
			String usuario, String mensaje, String mac, String empresa) {
		this.tipoError = tipoError;
		this.clase = clase;
		this.linea = linea;
		this.metodo = metodo;
		this.fecha = fecha;
		this.exception = exception;
		this.usuario = usuario;
		this.mensaje = mensaje;
		this.mac = mac;
		this.empresa = empresa;
	}

	public String getTipoError() {
		return tipoError;
	}

	public void setTipoError(String tipoError) {
		this.tipoError = tipoError;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

}
