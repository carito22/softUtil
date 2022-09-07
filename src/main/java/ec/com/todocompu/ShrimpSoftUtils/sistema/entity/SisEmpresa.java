package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Basic;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sis_empresa", schema = "sistemaweb")
public class SisEmpresa implements Serializable {

        private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_codigo")
	private String empCodigo;
	@Column(name = "emp_ruc")
	private String empRuc;
	@Column(name = "emp_nombre")
	private String empNombre;
	@Column(name = "emp_razon_social")
	private String empRazonSocial;
	@Column(name = "emp_direccion")
	private String empDireccion;
	@Column(name = "emp_ciudad")
	private String empCiudad;
	@Column(name = "emp_telefono")
	private String empTelefono;
	@Column(name = "emp_celular")
	private String empCelular;
	@Column(name = "emp_email")
	private String empEmail;
	@Column(name = "emp_clave", insertable = false, updatable = false)
	private String empClave;
	
	@Column(name = "emp_activa")
	private Boolean empActiva;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta_empresa")
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInsertaEmpresa;
        
        @Basic(optional = false)
        @NotNull
        @Size(min = 1, max = 2147483647)
        @Column(name = "emp_pais")
        private String empPais;
        
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empCodigo")
	private List<SisGrupo> sisGrupoList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empCodigo")
	private List<SisEmpresaParametros> sisEmpresaParametrosList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empCodigo")
	private List<SisPermiso> sisPermisoList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empCodigo")
	private List<SisPeriodo> sisPeriodoList;

	public SisEmpresa() {
	}

	public SisEmpresa(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public SisEmpresa(String empCodigo, String usrCodigo) {
		this.empCodigo = empCodigo;
		this.usrCodigo = usrCodigo;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getEmpRuc() {
		return empRuc;
	}

	public void setEmpRuc(String empRuc) {
		this.empRuc = empRuc;
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

	public String getEmpDireccion() {
		return empDireccion;
	}

	public void setEmpDireccion(String empDireccion) {
		this.empDireccion = empDireccion;
	}

	public String getEmpCiudad() {
		return empCiudad;
	}

	public void setEmpCiudad(String empCiudad) {
		this.empCiudad = empCiudad;
	}

	public String getEmpTelefono() {
		return empTelefono;
	}

	public void setEmpTelefono(String empTelefono) {
		this.empTelefono = empTelefono;
	}

        public String getEmpCelular() {
            return empCelular;
        }

        public void setEmpCelular(String empCelular) {
            this.empCelular = empCelular;
        }

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpClave() {
		return empClave;
	}

	public void setEmpClave(String empClave) {
		this.empClave = empClave;
	}

        public Boolean getEmpActiva() {
		return empActiva;
	}

	public void setEmpActiva(Boolean empActiva) {
		this.empActiva = empActiva;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Date getUsrFechaInsertaEmpresa() {
		return usrFechaInsertaEmpresa;
	}

	public void setUsrFechaInsertaEmpresa(Date usrFechaInsertaEmpresa) {
		this.usrFechaInsertaEmpresa = usrFechaInsertaEmpresa;
	}

	@JsonIgnore
	public List<SisGrupo> getSisGrupoList() {
		return sisGrupoList;
	}

	public void setSisGrupoList(List<SisGrupo> sisGrupoList) {
		this.sisGrupoList = sisGrupoList;
	}

	@JsonIgnore
	public List<SisEmpresaParametros> getSisEmpresaParametrosList() {
		return sisEmpresaParametrosList;
	}

	public void setSisEmpresaParametrosList(List<SisEmpresaParametros> sisEmpresaParametrosList) {
		this.sisEmpresaParametrosList = sisEmpresaParametrosList;
	}

	@JsonIgnore
	public List<SisPermiso> getSisPermisoList() {
		return sisPermisoList;
	}

	public void setSisPermisoList(List<SisPermiso> sisPermisoList) {
		this.sisPermisoList = sisPermisoList;
	}

	@JsonIgnore
	public List<SisPeriodo> getSisPeriodoList() {
		return sisPeriodoList;
	}

	public void setSisPeriodoList(List<SisPeriodo> sisPeriodoList) {
		this.sisPeriodoList = sisPeriodoList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (empCodigo != null ? empCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SisEmpresa)) {
			return false;
		}
		SisEmpresa other = (SisEmpresa) object;
		if ((this.empCodigo == null && other.empCodigo != null)
				|| (this.empCodigo != null && !this.empCodigo.equals(other.empCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "sistemaWeb.entity.SisEmpresa[ empCodigo=" + empCodigo + " ]";
	}

        public String getEmpPais() {
            return empPais;
        }

        public void setEmpPais(String empPais) {
            this.empPais = empPais;
        }

    }
