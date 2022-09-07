/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConCuentasTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cta_codigo")
	private String cuentaCodigo;
	@Column(name = "cta_empresa")
	private String empCodigo;
	@Column(name = "cta_detalle")
	private String cuentaDetalle;
	@Column(name = "cta_activo")
	private Boolean cuentaActivo;
	@Column(name = "cta_bloqueada")
	private Boolean cuentaBloqueada;
	@Column(name = "usr_codigo")
	private String usrInsertaCuenta;
	@Column(name = "usr_fecha_inserta")
	private String usrFechaInsertaCuenta;
        
        @Column(name = "cta_relacionada")
	private Boolean ctaRelacionada;
	@Column(name = "cta_grupo_comparativo")
	private String ctaGrupoComparativo;
	@Column(name = "cta_detalle_comparativo")
	private String ctaDetalleComparativo;

	public ConCuentasTO() {
	}

	public ConCuentasTO(String cuentaCodigo, String cuentaDetalle) {
		this.cuentaCodigo = cuentaCodigo;
		this.cuentaDetalle = cuentaDetalle;
	}

	public ConCuentasTO(String empCodigo, String cuentaCodigo, String cuentaDetalle, Boolean cuentaActivo,
			String usrInsertaCuenta, String usrFechaInsertaCuenta) {
		this.empCodigo = empCodigo;
		this.cuentaCodigo = cuentaCodigo;
		this.cuentaDetalle = cuentaDetalle;
		this.cuentaActivo = cuentaActivo;
		this.usrInsertaCuenta = usrInsertaCuenta;
		this.usrFechaInsertaCuenta = usrFechaInsertaCuenta;
	}

	public Boolean getCuentaActivo() {
		return cuentaActivo;
	}

	public void setCuentaActivo(Boolean cuentaActivo) {
		this.cuentaActivo = cuentaActivo;
	}

	public String getCuentaCodigo() {
		return cuentaCodigo;
	}

	public void setCuentaCodigo(String cuentaCodigo) {
		this.cuentaCodigo = cuentaCodigo;
	}

	public String getCuentaDetalle() {
		return cuentaDetalle;
	}

	public void setCuentaDetalle(String cuentaDetalle) {
		this.cuentaDetalle = cuentaDetalle;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getUsrFechaInsertaCuenta() {
		return usrFechaInsertaCuenta;
	}

	public void setUsrFechaInsertaCuenta(String usrFechaInsertaCuenta) {
		this.usrFechaInsertaCuenta = usrFechaInsertaCuenta;
	}

	public String getUsrInsertaCuenta() {
		return usrInsertaCuenta;
	}

	public void setUsrInsertaCuenta(String usrInsertaCuenta) {
		this.usrInsertaCuenta = usrInsertaCuenta;
	}

        public Boolean getCuentaBloqueada() {
            return cuentaBloqueada;
        }

        public void setCuentaBloqueada(Boolean cuentaBloqueada) {
            this.cuentaBloqueada = cuentaBloqueada;
        }

        public Boolean getCtaRelacionada() {
            return ctaRelacionada;
        }

        public void setCtaRelacionada(Boolean ctaRelacionada) {
            this.ctaRelacionada = ctaRelacionada;
        }

        public String getCtaGrupoComparativo() {
            return ctaGrupoComparativo;
        }

        public void setCtaGrupoComparativo(String ctaGrupoComparativo) {
            this.ctaGrupoComparativo = ctaGrupoComparativo;
        }

        public String getCtaDetalleComparativo() {
            return ctaDetalleComparativo;
        }

        public void setCtaDetalleComparativo(String ctaDetalleComparativo) {
            this.ctaDetalleComparativo = ctaDetalleComparativo;
        }

	@Override
	public String toString() {
		return this.cuentaCodigo + " " + this.cuentaDetalle;
	}
}
