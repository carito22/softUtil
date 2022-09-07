/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdLiquidacionTallaTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "talla_empresa")
	private String tallaEmpresa;

	@Column(name = "talla_codigo")
	private String tallaCodigo;

	@Column(name = "talla_detalle")
	private String tallaDetalle;
        
	@Column(name = "talla_descripcion")
	private String tallaDescripcion;

	@Column(name = "talla_unidad_medida")
	private String tallaUnidadMedida;

	@Column(name = "talla_inactivo")
	private Boolean tallaInactivo;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public PrdLiquidacionTallaTO() {
	}

	public PrdLiquidacionTallaTO(String tallaEmpresa, String tallaCodigo, String tallaDetalle, String tallaUnidadMedida, Boolean tallaInactivo,
			String usrCodigo, String usrFechaInserta) {
		this.tallaEmpresa = tallaEmpresa;
		this.tallaCodigo = tallaCodigo;
		this.tallaDetalle = tallaDetalle;
		this.tallaUnidadMedida = tallaUnidadMedida;
		this.tallaInactivo = tallaInactivo;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getTallaCodigo() {
		return tallaCodigo;
	}

	public void setTallaCodigo(String tallaCodigo) {
		this.tallaCodigo = tallaCodigo;
	}

	public String getTallaDetalle() {
		return tallaDetalle;
	}

	public void setTallaDetalle(String tallaDetalle) {
		this.tallaDetalle = tallaDetalle;
	}

	public String getTallaEmpresa() {
		return tallaEmpresa;
	}

	public void setTallaEmpresa(String tallaEmpresa) {
		this.tallaEmpresa = tallaEmpresa;
	}

        public String getTallaUnidadMedida() {
            return tallaUnidadMedida;
        }

        public void setTallaUnidadMedida(String tallaUnidadMedida) {
            this.tallaUnidadMedida = tallaUnidadMedida;
        }

	public Boolean getTallaInactivo() {
		return tallaInactivo;
	}

	public void setTallaInactivo(Boolean tallaInactivo) {
		this.tallaInactivo = tallaInactivo;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

    public String getTallaDescripcion() {
        return tallaDescripcion;
    }

    public void setTallaDescripcion(String tallaDescripcion) {
        this.tallaDescripcion = tallaDescripcion;
    }

}
