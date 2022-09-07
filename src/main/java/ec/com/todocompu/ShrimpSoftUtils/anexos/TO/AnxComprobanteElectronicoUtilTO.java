
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.RespuestaComprobante;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.recepcion.RespuestaSolicitud;

public class AnxComprobanteElectronicoUtilTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private RespuestaComprobante respuestaComprobante;
	private RespuestaSolicitud respuestaSolicitud;
	private byte[] eXml;
	private String mensaje;

	public AnxComprobanteElectronicoUtilTO() {
	}

	
	public AnxComprobanteElectronicoUtilTO(RespuestaComprobante respuestaComprobante,
			RespuestaSolicitud respuestaSolicitud, byte[] eXml, String mensaje) {
		this.respuestaComprobante = respuestaComprobante;
		this.respuestaSolicitud = respuestaSolicitud;
		this.eXml = eXml;
		this.mensaje = mensaje;
	}


	public byte[] geteXml() {
		return eXml;
	}

	public void seteXml(byte[] eXml) {
		this.eXml = eXml;
	}

	public RespuestaComprobante getRespuestaComprobante() {
		return respuestaComprobante;
	}

	public void setRespuestaComprobante(RespuestaComprobante respuestaComprobante) {
		this.respuestaComprobante = respuestaComprobante;
	}

	public RespuestaSolicitud getRespuestaSolicitud() {
		return respuestaSolicitud;
	}

	public void setRespuestaSolicitud(RespuestaSolicitud respuestaSolicitud) {
		this.respuestaSolicitud = respuestaSolicitud;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
