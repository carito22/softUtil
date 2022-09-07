package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhComboFormaPagoBeneficioSocialTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fp_detalle")
	private String fpDetalle;
	@Column(name = "cta_codigo")
	private String ctaCodigo;
	@Column(name = "sec_codigo")
	private String secCodigo;
	@Column(name = "fp_codigo_ministerial")
	private String fpCodigoMinisterial;
        @Column(name = "validar")
	private Boolean validar;

	public RhComboFormaPagoBeneficioSocialTO() {
	}

        public RhComboFormaPagoBeneficioSocialTO(String fpDetalle, String ctaCodigo, String secCodigo, String fpCodigoMinisterial, Boolean validar) {
            this.fpDetalle = fpDetalle;
            this.ctaCodigo = ctaCodigo;
            this.secCodigo = secCodigo;
            this.fpCodigoMinisterial = fpCodigoMinisterial;
            this.validar = validar;
        }

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	public String getFpCodigoMinisterial() {
		return fpCodigoMinisterial;
	}

	public void setFpCodigoMinisterial(String fpCodigoMinisterial) {
		this.fpCodigoMinisterial = fpCodigoMinisterial;
	}

	public String getFpDetalle() {
		return fpDetalle;
	}

	public void setFpDetalle(String fpDetalle) {
		this.fpDetalle = fpDetalle;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

        public Boolean getValidar() {
            return validar;
        }

        public void setValidar(Boolean validar) {
            this.validar = validar;
        }

	@Override
	public String toString() {
		return this.fpDetalle;
	}

}
