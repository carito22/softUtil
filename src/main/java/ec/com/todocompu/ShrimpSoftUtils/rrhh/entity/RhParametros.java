package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rh_parametros", schema = "recursoshumanos")
public class RhParametros implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer parSecuencial;
	private Date parDesde;
	private Date parHasta;
	private BigDecimal parIessPorcentajeAporteIndividual;
	private BigDecimal parIessPorcentajeAporteExtendido;
	private BigDecimal parIessPorcentajeAportePatronal;
        private BigDecimal parIessPorcentajeFondoReserva;
	private BigDecimal parIessPorcentajeIece;
	private BigDecimal parIessPorcentajeSecap;
	private BigDecimal parSalarioMinimoVital;
        private RhRelacionTrabajo parRelacionTrabajo;
        private Boolean parDerechoXiiiSueldo;
        private Boolean parDerechoXivSueldo;

	public RhParametros() {
	}

	public RhParametros(Integer parSecuencial) {
		this.parSecuencial = parSecuencial;
	}

	public RhParametros(Integer parSecuencial, Date parDesde, BigDecimal parIessPorcentajeAporteIndividual,
			BigDecimal parIessPorcentajeAporteExtendido, BigDecimal parIessPorcentajeAportePatronal,
			BigDecimal parIessPorcentajeIece, BigDecimal parIessPorcentajeSecap, BigDecimal parSalarioMinimoVital) {
		this.parSecuencial = parSecuencial;
		this.parDesde = parDesde;
		this.parIessPorcentajeAporteIndividual = parIessPorcentajeAporteIndividual;
		this.parIessPorcentajeAporteExtendido = parIessPorcentajeAporteExtendido;
		this.parIessPorcentajeAportePatronal = parIessPorcentajeAportePatronal;
		this.parIessPorcentajeIece = parIessPorcentajeIece;
		this.parIessPorcentajeSecap = parIessPorcentajeSecap;
		this.parSalarioMinimoVital = parSalarioMinimoVital;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "par_secuencial")
	public Integer getParSecuencial() {
		return parSecuencial;
	}

	public void setParSecuencial(Integer parSecuencial) {
		this.parSecuencial = parSecuencial;
	}

	@Column(name = "par_desde")
	public Date getParDesde() {
		return parDesde;
	}

	public void setParDesde(Date parDesde) {
		this.parDesde = parDesde;
	}

	@Column(name = "par_hasta")
	public Date getParHasta() {
		return parHasta;
	}

	public void setParHasta(Date parHasta) {
		this.parHasta = parHasta;
	}

	@Column(name = "par_iess_porcentaje_aporte_individual")
	public BigDecimal getParIessPorcentajeAporteIndividual() {
		return parIessPorcentajeAporteIndividual;
	}

	public void setParIessPorcentajeAporteIndividual(BigDecimal parIessPorcentajeAporteIndividual) {
		this.parIessPorcentajeAporteIndividual = parIessPorcentajeAporteIndividual;
	}

	@Column(name = "par_iess_porcentaje_aporte_extendido")
	public BigDecimal getParIessPorcentajeAporteExtendido() {
		return parIessPorcentajeAporteExtendido;
	}

	public void setParIessPorcentajeAporteExtendido(BigDecimal parIessPorcentajeAporteExtendido) {
		this.parIessPorcentajeAporteExtendido = parIessPorcentajeAporteExtendido;
	}

	@Column(name = "par_iess_porcentaje_aporte_patronal")
	public BigDecimal getParIessPorcentajeAportePatronal() {
		return parIessPorcentajeAportePatronal;
	}

	public void setParIessPorcentajeAportePatronal(BigDecimal parIessPorcentajeAportePatronal) {
		this.parIessPorcentajeAportePatronal = parIessPorcentajeAportePatronal;
	}

	@Column(name = "par_iess_porcentaje_iece")
	public BigDecimal getParIessPorcentajeIece() {
		return parIessPorcentajeIece;
	}

	public void setParIessPorcentajeIece(BigDecimal parIessPorcentajeIece) {
		this.parIessPorcentajeIece = parIessPorcentajeIece;
	}

	@Column(name = "par_iess_porcentaje_secap")
	public BigDecimal getParIessPorcentajeSecap() {
		return parIessPorcentajeSecap;
	}

	public void setParIessPorcentajeSecap(BigDecimal parIessPorcentajeSecap) {
		this.parIessPorcentajeSecap = parIessPorcentajeSecap;
	}

	@Column(name = "par_salario_minimo_vital")
	public BigDecimal getParSalarioMinimoVital() {
		return parSalarioMinimoVital;
	}

	public void setParSalarioMinimoVital(BigDecimal parSalarioMinimoVital) {
		this.parSalarioMinimoVital = parSalarioMinimoVital;
	}

        @Column(name = "par_iess_porcentaje_fondo_reserva")
        public BigDecimal getParIessPorcentajeFondoReserva() {
            return parIessPorcentajeFondoReserva;
        }

        public void setParIessPorcentajeFondoReserva(BigDecimal parIessPorcentajeFondoReserva) {
            this.parIessPorcentajeFondoReserva = parIessPorcentajeFondoReserva;
        }

        @Column(name = "par_derecho_xiii_sueldo")
        public Boolean getParDerechoXiiiSueldo() {
            return parDerechoXiiiSueldo;
        }

        public void setParDerechoXiiiSueldo(Boolean parDerechoXiiiSueldo) {
            this.parDerechoXiiiSueldo = parDerechoXiiiSueldo;
        }

        @Column(name = "par_derecho_xiv_sueldo")
        public Boolean getParDerechoXivSueldo() {
            return parDerechoXivSueldo;
        }

        public void setParDerechoXivSueldo(Boolean parDerechoXivSueldo) {
            this.parDerechoXivSueldo = parDerechoXivSueldo;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (parSecuencial != null ? parSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhParametros)) {
			return false;
		}
		RhParametros other = (RhParametros) object;
		if ((this.parSecuencial == null && other.parSecuencial != null)
				|| (this.parSecuencial != null && !this.parSecuencial.equals(other.parSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhParametros[ parSecuencial=" + parSecuencial + " ]";
	}

        @JoinColumn(name = "par_relacion_trabajo", referencedColumnName = "rt_codigo")
        @ManyToOne
        public RhRelacionTrabajo getParRelacionTrabajo() {
            return parRelacionTrabajo;
        }

        public void setParRelacionTrabajo(RhRelacionTrabajo parRelacionTrabajo) {
            this.parRelacionTrabajo = parRelacionTrabajo;
        }
}
