/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanChequeTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "chq_secuencia")
	private Long chqSecuencia;

	@Column(name = "chq_beneficiario")
	private String chqBeneficiario;

	@Column(name = "chq_cantidad")
	private String chqCantidad;

	@Column(name = "chq_ciudad")
	private String chqCiudad;

	@Column(name = "chq_fecha")
	private String chqFecha;

	@Column(name = "chq_cruzado")
	private boolean chqCruzado;

	@Column(name = "chq_impreso")
	private boolean chqImpreso;

	@Column(name = "chq_impreso_fecha")
	private String chqImpresoFecha;

	@Column(name = "chq_revisado")
	private boolean chqRevisado;

	@Column(name = "chq_revisado_fecha")
	private String chqRevisadoFecha;

	@Column(name = "chq_revisado_observacion")
	private String chqRevisadoObservacion;

	@Column(name = "chq_entregado")
	private boolean chqEntregado;

	@Column(name = "chq_entregado_fecha")
	private String chqEntregadoFecha;

	@Column(name = "chq_entregado_observacion")
	private String chqEntregadoObservacion;

	@Column(name = "chq_reversado")
	private boolean chqReversado;

	@Column(name = "chq_reversado_fecha")
	private String chqReversadoFecha;

	@Column(name = "chq_reversado_observacion")
	private String chqReversadoObservacion;

	@Column(name = "chq_anulado")
	private boolean chqAnulado;

	@Column(name = "chq_anulado_fecha")
	private String chqAnuladooFecha;

	@Column(name = "chq_anulado_observacion")
	private String chqAnuladoObservacion;

	@Column(name = "chq_no_es_cheque")
	private boolean chqNoCheque;

	@Column(name = "conc_empresa")
	private String concEmpresa;

	@Column(name = "conc_cuenta_contable")
	private String concCuentaContable;

	@Column(name = "conc_codigo")
	private String concCodigo;

	@Column(name = "conc_categoria")
	private String concCategoria;

	@Column(name = "det_secuencia")
	private Long detSecuencia;

	public BanChequeTO() {
	}

	public BanChequeTO(Long chqSecuencia, String chqBeneficiario, String chqCantidad, String chqCiudad, String chqFecha,
			boolean chqCruzado, boolean chqImpreso, String chqImpresoFecha, boolean chqRevisado,
			String chqRevisadoFecha, String chqRevisadoObservacion, boolean chqEntregado, String chqEntregadoFecha,
			String chqEntregadoObservacion, boolean chqReversado, String chqReversadoFecha,
			String chqReversadoObservacion, boolean chqAnulado, String chqAnuladooFecha, String chqAnuladoObservacion,
                        boolean chqNoCheque, String concEmpresa, String concCuentaContable, String concCodigo, String concCategoria, Long detSecuencia) {
		this.chqSecuencia = chqSecuencia;
		this.chqBeneficiario = chqBeneficiario;
		this.chqCantidad = chqCantidad;
		this.chqCiudad = chqCiudad;
		this.chqFecha = chqFecha;
		this.chqCruzado = chqCruzado;
		this.chqImpreso = chqImpreso;
		this.chqImpresoFecha = chqImpresoFecha;
		this.chqRevisado = chqRevisado;
		this.chqRevisadoFecha = chqRevisadoFecha;
		this.chqRevisadoObservacion = chqRevisadoObservacion;
		this.chqEntregado = chqEntregado;
		this.chqEntregadoFecha = chqEntregadoFecha;
		this.chqEntregadoObservacion = chqEntregadoObservacion;
		this.chqReversado = chqReversado;
		this.chqReversadoFecha = chqReversadoFecha;
		this.chqReversadoObservacion = chqReversadoObservacion;
		this.chqAnulado = chqAnulado;
		this.chqAnuladooFecha = chqAnuladooFecha;
		this.chqAnuladoObservacion = chqAnuladoObservacion;
		this.chqNoCheque = chqNoCheque;
		this.concEmpresa = concEmpresa;
		this.concCuentaContable = concCuentaContable;
		this.concCodigo = concCodigo;
		this.concCategoria = concCategoria;
		this.detSecuencia = detSecuencia;

	}

	public String getChqImpresoFecha() {
		return chqImpresoFecha;
	}

	public void setChqImpresoFecha(String chqImpresoFecha) {
		this.chqImpresoFecha = chqImpresoFecha;
	}

	public String getChqRevisadoFecha() {
		return chqRevisadoFecha;
	}

	public void setChqRevisadoFecha(String chqRevisadoFecha) {
		this.chqRevisadoFecha = chqRevisadoFecha;
	}

	public String getChqEntregadoFecha() {
		return chqEntregadoFecha;
	}

	public void setChqEntregadoFecha(String chqEntregadoFecha) {
		this.chqEntregadoFecha = chqEntregadoFecha;
	}

	public boolean isChqReversado() {
		return chqReversado;
	}

	public void setChqReversado(boolean chqReversado) {
		this.chqReversado = chqReversado;
	}

	public String getChqReversadoFecha() {
		return chqReversadoFecha;
	}

	public void setChqReversadoFecha(String chqReversadoFecha) {
		this.chqReversadoFecha = chqReversadoFecha;
	}

	public String getChqReversadoObservacion() {
		return chqReversadoObservacion;
	}

	public void setChqReversadoObservacion(String chqReversadoObservacion) {
		this.chqReversadoObservacion = chqReversadoObservacion;
	}

	public boolean getChqAnulado() {
		return chqAnulado;
	}

	public void setChqAnulado(boolean chqAnulado) {
		this.chqAnulado = chqAnulado;
	}

	public String getChqAnuladooFecha() {
		return chqAnuladooFecha;
	}

	public void setChqAnuladooFecha(String chqAnuladooFecha) {
		this.chqAnuladooFecha = chqAnuladooFecha;
	}

	public String getChqAnuladoObservacion() {
		return chqAnuladoObservacion;
	}

	public void setChqAnuladoObservacion(String chqAnuladoObservacion) {
		this.chqAnuladoObservacion = chqAnuladoObservacion;
	}

	public String getChqBeneficiario() {
		return chqBeneficiario;
	}

	public void setChqBeneficiario(String chqBeneficiario) {
		this.chqBeneficiario = chqBeneficiario;
	}

	public String getChqCantidad() {
		return chqCantidad;
	}

	public void setChqCantidad(String chqCantidad) {
		this.chqCantidad = chqCantidad;
	}

	public String getChqCiudad() {
		return chqCiudad;
	}

	public void setChqCiudad(String chqCiudad) {
		this.chqCiudad = chqCiudad;
	}

	public boolean isChqCruzado() {
		return chqCruzado;
	}

	public void setChqCruzado(boolean chqCruzado) {
		this.chqCruzado = chqCruzado;
	}

	public boolean isChqEntregado() {
		return chqEntregado;
	}

	public void setChqEntregado(boolean chqEntregado) {
		this.chqEntregado = chqEntregado;
	}

	public String getChqEntregadoObservacion() {
		return chqEntregadoObservacion;
	}

	public void setChqEntregadoObservacion(String chqEntregadoObservacion) {
		this.chqEntregadoObservacion = chqEntregadoObservacion;
	}

	public String getChqFecha() {
		return chqFecha;
	}

	public void setChqFecha(String chqFecha) {
		this.chqFecha = chqFecha;
	}

	public boolean isChqImpreso() {
		return chqImpreso;
	}

	public void setChqImpreso(boolean chqImpreso) {
		this.chqImpreso = chqImpreso;
	}

	public boolean isChqNoCheque() {
		return chqNoCheque;
	}

	public void setChqNoCheque(boolean chqNoCheque) {
		this.chqNoCheque = chqNoCheque;
	}

	public boolean isChqRevisado() {
		return chqRevisado;
	}

	public void setChqRevisado(boolean chqRevisado) {
		this.chqRevisado = chqRevisado;
	}

	public String getChqRevisadoObservacion() {
		return chqRevisadoObservacion;
	}

	public void setChqRevisadoObservacion(String chqRevisadoObservacion) {
		this.chqRevisadoObservacion = chqRevisadoObservacion;
	}

	public Long getChqSecuencia() {
		return chqSecuencia;
	}

	public void setChqSecuencia(Long chqSecuencia) {
		this.chqSecuencia = chqSecuencia;
	}

	public String getConcCodigo() {
		return concCodigo;
	}

	public void setConcCodigo(String concCodigo) {
		this.concCodigo = concCodigo;
	}

	public String getConcCuentaContable() {
		return concCuentaContable;
	}

	public void setConcCuentaContable(String concCuentaContable) {
		this.concCuentaContable = concCuentaContable;
	}

	public String getConcEmpresa() {
		return concEmpresa;
	}

	public void setConcEmpresa(String concEmpresa) {
		this.concEmpresa = concEmpresa;
	}

        public String getConcCategoria() {
            return concCategoria;
        }

        public void setConcCategoria(String concCategoria) {
            this.concCategoria = concCategoria;
        }

	public Long getDetSecuencia() {
		return detSecuencia;
	}

	public void setDetSecuencia(Long detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

}
