package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sis_suceso", schema = "sistemaweb")
public class SisSuceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(allocationSize = 1, name = "SIS_SUCESO_ID_GENERATOR", sequenceName = "SISTEMAWEB.SIS_SUCESO_SUS_SECUENCIA_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIS_SUCESO_ID_GENERATOR")
	@Column(name = "sus_secuencia")
	private Integer susSecuencia;
	@Column(name = "sus_tabla")
	private String susTabla;
	@Column(name = "sus_clave")
	private String susClave;
	@Column(name = "sus_suceso")
	private String susSuceso;
	@Column(name = "sus_detalle")
	private String susDetalle;
	@Column(name = "det_empresa")
	private String detEmpresa;
	@Column(name = "sus_mac")
	private String susMac;
	@Column(name = "sus_fecha", insertable = false, updatable = false)
	private Timestamp susFecha;
	@JoinColumns({ @JoinColumn(name = "det_usuario", referencedColumnName = "usr_codigo") })
	@ManyToOne
	private SisUsuario sisUsuario;

	public SisSuceso() {
	}

	public SisSuceso(Integer susSecuencia) {
		this.susSecuencia = susSecuencia;
	}

	public Integer getSusSecuencia() {
		return susSecuencia;
	}

	public void setSusSecuencia(Integer susSecuencia) {
		this.susSecuencia = susSecuencia;
	}

	public String getSusTabla() {
		return susTabla;
	}

	public void setSusTabla(String susTabla) {
		this.susTabla = susTabla;
	}

	public String getSusClave() {
		return susClave;
	}

	public void setSusClave(String susClave) {
		this.susClave = susClave;
	}

	public String getSusSuceso() {
		return susSuceso;
	}

	public void setSusSuceso(String susSuceso) {
		this.susSuceso = susSuceso;
	}

	public String getSusDetalle() {
		return susDetalle;
	}

	public void setSusDetalle(String susDetalle) {
		this.susDetalle = susDetalle;
	}

	public String getSusMac() {
		return susMac;
	}

	public void setSusMac(String susMac) {
		this.susMac = susMac;
	}

	public Date getSusFecha() {
		return susFecha;
	}

	public void setSusFecha(Timestamp susFecha) {
		this.susFecha = susFecha;
	}

        public String getDetEmpresa() {
            return detEmpresa;
        }

        public void setDetEmpresa(String detEmpresa) {
            this.detEmpresa = detEmpresa;
        }

        public SisUsuario getSisUsuario() {
            return sisUsuario;
        }

        public void setSisUsuario(SisUsuario sisUsuario) {
            this.sisUsuario = sisUsuario;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (susSecuencia != null ? susSecuencia.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof SisSuceso)) {
			return false;
		}
		SisSuceso other = (SisSuceso) object;
		if ((this.susSecuencia == null && other.susSecuencia != null)
				|| (this.susSecuencia != null && !this.susSecuencia.equals(other.susSecuencia))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "sistemaWeb.entity.SisSuceso[ susSecuencia=" + susSecuencia + " ]";
	}

}
