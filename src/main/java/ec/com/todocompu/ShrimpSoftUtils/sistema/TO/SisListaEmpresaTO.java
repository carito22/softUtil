package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SisListaEmpresaTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_codigo")
	private String empCodigo;
	@Column(name = "emp_ruc")
	private String empRuc;
	@Column(name = "emp_razon_social")
	private String empRazonSocial;
	@Column(name = "emp_nombre")
	private String empNombre;
	@Column(name = "emp_direccion")
	private String empDireccion;
	@Column(name = "emp_telefono")
	private String empTelefono;
	@Column(name = "emp_pais")
	private String empPais;
	@Column(name = "emp_ciudad")
	private String empCiudad;
	@Column(name = "par_gerente")
	private String parGerente;
	@Column(name = "par_gerente_id")
	private String parGerenteId;
	private String empContador;
	private String empContadorRuc;
	@Column(name = "par_actividad")
	private String parActividad;
	@Column(name = "par_escoger_precio_por")
	private String parEscogerPrecioPor;
	@Column(name = "par_obligado_llevar_contabilidad")
	private Boolean parObligadoLlevarContabilidad;
	@Column(name = "det_equipo")
	private String detEquipo;
	@Column(name = "par_resolucion_contribuyente_especial")
	private String parResolucionContribuyenteEspecia;
	@Column(name = "par_ruta_reportes")
	private String parRutaReportes;
	@Column(name = "par_ruta_logo")
	private String parRutaLogo;
	@Column(name = "emp_email")
	private String empEmail;
	@Column(name = "emp_clave")
	private String empClave;
	@Column(name = "par_web_documentos_electronicos")
	private String parWebDocumentosElectronicos;
	@Column(name = "par_obligado_emitir_documentos_electronicos")
	private boolean parObligadoEmitirDocumentosElectronicos;
	@Column(name = "par_obligado_registrar_liquidacion_pesca")
	private boolean parObligadoRegistrarLiquidacionPesca;

	public SisListaEmpresaTO() {
	}

	public String getParWebDocumentosElectronicos() {
		return parWebDocumentosElectronicos;
	}

	public void setParWebDocumentosElectronicos(String parWebDocumentosElectronicos) {
		this.parWebDocumentosElectronicos = parWebDocumentosElectronicos;
	}

	public String getEmpClave() {
		return empClave;
	}

	public void setEmpClave(String empClave) {
		this.empClave = empClave;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getDetEquipo() {
		return detEquipo;
	}

	public void setDetEquipo(String detEquipo) {
		this.detEquipo = detEquipo;
	}

        public String getEmpPais() {
            return empPais;
        }

        public void setEmpPais(String empPais) {
            this.empPais = empPais;
        }

	public String getEmpCiudad() {
		return empCiudad;
	}

	public void setEmpCiudad(String empCiudad) {
		this.empCiudad = empCiudad;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getEmpContador() {
		return empContador;
	}

	public void setEmpContador(String empContador) {
		this.empContador = empContador;
	}

	public String getEmpContadorRuc() {
		return empContadorRuc;
	}

	public void setEmpContadorRuc(String empContadorRuc) {
		this.empContadorRuc = empContadorRuc;
	}

	public String getEmpDireccion() {
		return empDireccion;
	}

	public void setEmpDireccion(String empDireccion) {
		this.empDireccion = empDireccion;
	}

	public String getEmpNombre() {
		return empNombre;
	}

	public void setEmpNombre(String empNombre) {
		this.empNombre = empNombre;
	}

	public String getEmpRazonSocial() {
		return empRazonSocial;
	}

	public void setEmpRazonSocial(String empRazonSocial) {
		this.empRazonSocial = empRazonSocial;
	}

	public String getEmpRuc() {
		return empRuc;
	}

	public void setEmpRuc(String empRuc) {
		this.empRuc = empRuc;
	}

	public String getEmpTelefono() {
		return empTelefono;
	}

	public void setEmpTelefono(String empTelefono) {
		this.empTelefono = empTelefono;
	}

	public String getParActividad() {
		return parActividad;
	}

	public void setParActividad(String parActividad) {
		this.parActividad = parActividad;
	}

	public String getParEscogerPrecioPor() {
		return parEscogerPrecioPor;
	}

	public void setParEscogerPrecioPor(String parEscogerPrecioPor) {
		this.parEscogerPrecioPor = parEscogerPrecioPor;
	}

	public String getParGerente() {
		return parGerente;
	}

	public void setParGerente(String parGerente) {
		this.parGerente = parGerente;
	}

	public String getParGerenteId() {
		return parGerenteId;
	}

	public void setParGerenteId(String parGerenteId) {
		this.parGerenteId = parGerenteId;
	}

	public Boolean getParObligadoLlevarContabilidad() {
		return parObligadoLlevarContabilidad;
	}

	public void setParObligadoLlevarContabilidad(Boolean parObligadoLlevarContabilidad) {
		this.parObligadoLlevarContabilidad = parObligadoLlevarContabilidad;
	}

	public String getParResolucionContribuyenteEspecia() {
		return parResolucionContribuyenteEspecia;
	}

	public void setParResolucionContribuyenteEspecia(String parResolucionContribuyenteEspecia) {
		this.parResolucionContribuyenteEspecia = parResolucionContribuyenteEspecia;
	}

        public boolean isParObligadoEmitirDocumentosElectronicos() {
            return parObligadoEmitirDocumentosElectronicos;
        }

        public void setParObligadoEmitirDocumentosElectronicos(boolean parObligadoEmitirDocumentosElectronicos) {
            this.parObligadoEmitirDocumentosElectronicos = parObligadoEmitirDocumentosElectronicos;
        }

        public boolean isParObligadoRegistrarLiquidacionPesca() {
            return parObligadoRegistrarLiquidacionPesca;
        }

        public void setParObligadoRegistrarLiquidacionPesca(boolean parObligadoRegistrarLiquidacionPesca) {
            this.parObligadoRegistrarLiquidacionPesca = parObligadoRegistrarLiquidacionPesca;
        }

        public String getParRutaReportes() {
            return parRutaReportes;
        }

        public void setParRutaReportes(String parRutaReportes) {
            this.parRutaReportes = parRutaReportes;
        }

        public String getParRutaLogo() {
            return parRutaLogo;
        }

        public void setParRutaLogo(String parRutaLogo) {
            this.parRutaLogo = parRutaLogo;
        }

	@Override
	public String toString() {
		return empNombre;
	}
}
