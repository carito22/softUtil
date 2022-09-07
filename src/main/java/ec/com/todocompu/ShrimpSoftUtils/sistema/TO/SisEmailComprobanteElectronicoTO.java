package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;
import java.math.BigDecimal;

public class SisEmailComprobanteElectronicoTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombreEmisor;
	private String emisorSmtpHost;
	private String emisorSmtpPort;
	private String emisorSmtpUserName;
	private String emisorSmtpPassword;
	private String mailEmisor;
	private String claveEmisor;
	private String telefonoEmisor;
	private String direccionEmisor;
	private String rucEmisor;
	private String urlWebDocumentoElectronico;

	private String nombreReceptor;
	private String mailReceptor;
	private String numeroComprobante;
	private String tipoComprobante;
	private String claveAcceso;
	private String empresa;
	private String periodo;
	private String motivo;
	private String numero;
	private BigDecimal valor;

	public SisEmailComprobanteElectronicoTO() {
	}

	public SisEmailComprobanteElectronicoTO(String nombreEmisor, 
                        String emisorSmtpHost, 
                        String emisorSmtpPort, 
                        String emisorSmtpUserName, 
                        String emisorSmtpPassword, 
                        String mailEmisor, String claveEmisor,
			String telefonoEmisor, String direccionEmisor, String rucEmisor, String urlWebDocumentoElectronico,
			String nombreReceptor, String mailReceptor, String numeroComprobante, String tipoComprobante,
			String claveAcceso, String empresa, String periodo, String motivo, String numero, BigDecimal valor) {
		this.nombreEmisor = nombreEmisor;
                
                this.emisorSmtpHost = emisorSmtpHost;
                this.emisorSmtpPort = emisorSmtpPort;
                this.emisorSmtpUserName = emisorSmtpUserName;
                this.emisorSmtpPassword = emisorSmtpPassword;
                
		this.mailEmisor = mailEmisor;
		this.claveEmisor = claveEmisor;
		this.telefonoEmisor = telefonoEmisor;
		this.direccionEmisor = direccionEmisor;
		this.rucEmisor = rucEmisor;
		this.urlWebDocumentoElectronico = urlWebDocumentoElectronico;
		this.nombreReceptor = nombreReceptor;
		this.mailReceptor = mailReceptor;
		this.numeroComprobante = numeroComprobante;
		this.tipoComprobante = tipoComprobante;
		this.claveAcceso = claveAcceso;
		this.empresa = empresa;
		this.periodo = periodo;
		this.motivo = motivo;
		this.numero = numero;
		this.valor = valor;
	}

	public String getDireccionEmisor() {
		return direccionEmisor;
	}

	public void setDireccionEmisor(String direccionEmisor) {
		this.direccionEmisor = direccionEmisor;
	}

        public String getEmisorSmtpHost() {
            return emisorSmtpHost;
        }

        public void setEmisorSmtpHost(String emisorSmtpHost) {
            this.emisorSmtpHost = emisorSmtpHost;
        }

        public String getEmisorSmtpPort() {
            return emisorSmtpPort;
        }

        public void setEmisorSmtpPort(String emisorSmtpPort) {
            this.emisorSmtpPort = emisorSmtpPort;
        }

        public String getEmisorSmtpUserName() {
            return emisorSmtpUserName;
        }

        public void setEmisorSmtpUserName(String emisorSmtpUserName) {
            this.emisorSmtpUserName = emisorSmtpUserName;
        }

        public String getEmisorSmtpPassword() {
            return emisorSmtpPassword;
        }

        public void setEmisorSmtpPassword(String emisorSmtpPassword) {
            this.emisorSmtpPassword = emisorSmtpPassword;
        }

	public String getClaveEmisor() {
		return claveEmisor;
	}

	public void setClaveEmisor(String claveEmisor) {
		this.claveEmisor = claveEmisor;
	}

	public String getNombreEmisor() {
		return nombreEmisor;
	}

	public void setNombreEmisor(String nombreEmisor) {
		this.nombreEmisor = nombreEmisor;
	}

	public String getMailEmisor() {
		return mailEmisor;
	}

	public void setMailEmisor(String mailEmisor) {
		this.mailEmisor = mailEmisor;
	}

	public String getTelefonoEmisor() {
		return telefonoEmisor;
	}

	public void setTelefonoEmisor(String telefonoEmisor) {
		this.telefonoEmisor = telefonoEmisor;
	}

	public String getRucEmisor() {
		return rucEmisor;
	}

	public void setRucEmisor(String rucEmisor) {
		this.rucEmisor = rucEmisor;
	}

	public String getUrlWebDocumentoElectronico() {
		return urlWebDocumentoElectronico;
	}

	public void setUrlWebDocumentoElectronico(String urlWebDocumentoElectronico) {
		this.urlWebDocumentoElectronico = urlWebDocumentoElectronico;
	}

	public String getNombreReceptor() {
		return nombreReceptor;
	}

	public void setNombreReceptor(String nombreReceptor) {
		this.nombreReceptor = nombreReceptor;
	}

	public String getMailReceptor() {
		return mailReceptor;
	}

	public void setMailReceptor(String mailReceptor) {
		this.mailReceptor = mailReceptor;
	}

	public String getNumeroComprobante() {
		return numeroComprobante;
	}

	public void setNumeroComprobante(String numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}

	public String getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public String getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        public String getPeriodo() {
            return periodo;
        }

        public void setPeriodo(String periodo) {
            this.periodo = periodo;
        }

        public String getMotivo() {
            return motivo;
        }

        public void setMotivo(String motivo) {
            this.motivo = motivo;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public BigDecimal getValor() {
            return valor;
        }

        public void setValor(BigDecimal valor) {
            this.valor = valor;
        }

}
