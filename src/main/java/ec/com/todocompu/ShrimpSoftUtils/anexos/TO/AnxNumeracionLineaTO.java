package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxNumeracionLineaTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "aut_numero")
	private String numeroAutorizacion;
	@Column(name = "aut_lineas")
	private Integer numeroLineas;
	@Column(name = "aut_formato_pos")
	private boolean formatoPOS;
	@Column(name = "aut_mostrar_dialogo_impresion")
	private boolean mostrarDialogoImpresion;
	@Column(name = "aut_documento_electronico")
	private boolean numeroDocumentoElectronico;
	@Column(name = "aut_ambiente_produccion")
	private boolean numeroAmbienteProduccion;
	@Column(name = "aut_autorizacion_automatica")
	private boolean autAutorizacionAutomatica;

	public AnxNumeracionLineaTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isNumeroAmbienteProduccion() {
		return numeroAmbienteProduccion;
	}

	public void setNumeroAmbienteProduccion(boolean numeroAmbienteProduccion) {
		this.numeroAmbienteProduccion = numeroAmbienteProduccion;
	}

	public boolean isNumeroDocumentoElectronico() {
		return numeroDocumentoElectronico;
	}

	public void setNumeroDocumentoElectronico(boolean numeroDocumentoElectronico) {
		this.numeroDocumentoElectronico = numeroDocumentoElectronico;
	}

	public boolean isFormatoPOS() {
		return formatoPOS;
	}

	public void setFormatoPOS(boolean formatoPOS) {
		this.formatoPOS = formatoPOS;
	}

        public boolean isMostrarDialogoImpresion() {
            return mostrarDialogoImpresion;
        }

        public void setMostrarDialogoImpresion(boolean mostrarDialogoImpresion) {
            this.mostrarDialogoImpresion = mostrarDialogoImpresion;
        }

	public String getNumeroAutorizacion() {
		return numeroAutorizacion;
	}

	public void setNumeroAutorizacion(String numeroAutorizacion) {
		this.numeroAutorizacion = numeroAutorizacion;
	}

	public Integer getNumeroLineas() {
		return numeroLineas;
	}

	public void setNumeroLineas(Integer numeroLineas) {
		this.numeroLineas = numeroLineas;
	}

        public boolean isAutAutorizacionAutomatica() {
            return autAutorizacionAutomatica;
        }

        public void setAutAutorizacionAutomatica(boolean autAutorizacionAutomatica) {
            this.autAutorizacionAutomatica = autAutorizacionAutomatica;
        }
        
}
