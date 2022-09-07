/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhAnticipoCabeceraTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	// @Column(name = "veh_empresa")
	private String empCodigo;

	// @Column(name = "veh_empresa")
	private String antFecha;

	// @Column(name = "veh_empresa")
	private String antFormasPago;

	// @Column(name = "veh_empresa")
	private String antMotivo;

	// @Column(name = "veh_empresa")
	private String conDetDocumento;

	// @Column(name = "veh_empresa")
	private String conObservaciones;

	// @Column(name = "veh_empresa")
	private Boolean reversar;

	// @Column(name = "veh_empresa")
	private String usrInsertaAnticipo;

	public RhAnticipoCabeceraTO() {
	}

	public RhAnticipoCabeceraTO(String empCodigo, String antFecha, String antMotivo, String conObservaciones,
			Boolean reversar, String usrInsertaAnticipo) {
		this.empCodigo = empCodigo;
		this.antFecha = antFecha;
		this.antMotivo = antMotivo;
		this.conObservaciones = conObservaciones;
		this.reversar = reversar;
		this.usrInsertaAnticipo = usrInsertaAnticipo;
	}

	public RhAnticipoCabeceraTO(String empCodigo, String antFecha, String antFormasPago, String antMotivo,
			String conDetDocumento, String conObservaciones, Boolean reversar, String usrInsertaAnticipo) {
		this.empCodigo = empCodigo;
		this.antFecha = antFecha;
		this.antFormasPago = antFormasPago;
		this.antMotivo = antMotivo;
		this.conDetDocumento = conDetDocumento;
		this.conObservaciones = conObservaciones;
		this.reversar = reversar;
		this.usrInsertaAnticipo = usrInsertaAnticipo;
	}

	public String getAntFecha() {
		return antFecha;
	}

	public void setAntFecha(String antFecha) {
		this.antFecha = antFecha;
	}

	public String getAntFormasPago() {
		return antFormasPago;
	}

	public void setAntFormasPago(String antFormasPago) {
		this.antFormasPago = antFormasPago;
	}

	public String getAntMotivo() {
		return antMotivo;
	}

	public void setAntMotivo(String antMotivo) {
		this.antMotivo = antMotivo;
	}

	public String getConDetDocumento() {
		return conDetDocumento;
	}

	public void setConDetDocumento(String conDetDocumento) {
		this.conDetDocumento = conDetDocumento;
	}

	public String getConObservaciones() {
		return conObservaciones;
	}

	public void setConObservaciones(String conObservaciones) {
		this.conObservaciones = conObservaciones;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public Boolean getReversar() {
		return reversar;
	}

	public void setReversar(Boolean reversar) {
		this.reversar = reversar;
	}

	public String getUsrInsertaAnticipo() {
		return usrInsertaAnticipo;
	}

	public void setUsrInsertaAnticipo(String usrInsertaAnticipo) {
		this.usrInsertaAnticipo = usrInsertaAnticipo;
	}
}
