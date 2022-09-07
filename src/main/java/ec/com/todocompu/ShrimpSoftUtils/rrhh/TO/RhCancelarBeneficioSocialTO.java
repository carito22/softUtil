
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhCancelarBeneficioSocialTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
	private Boolean empCancelarXiiiSueldoMensualmente;
	@Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
	private Boolean empCancelarXivSueldoMensualmente;
	@Column(name = "emp_cancelar_fondo_reserva_mensualmente")
	private Boolean empCancelarFondoReservaMensualmente;

	public RhCancelarBeneficioSocialTO() {
	}

	public RhCancelarBeneficioSocialTO(Boolean empCancelarXiiiSueldoMensualmente,
			Boolean empCancelarXivSueldoMensualmente, Boolean empCancelarFondoReservaMensualmente) {
		this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
		this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
		this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
	}

	public Boolean getEmpCancelarFondoReservaMensualmente() {
		return empCancelarFondoReservaMensualmente;
	}

	public void setEmpCancelarFondoReservaMensualmente(Boolean empCancelarFondoReservaMensualmente) {
		this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
	}

	public Boolean getEmpCancelarXiiiSueldoMensualmente() {
		return empCancelarXiiiSueldoMensualmente;
	}

	public void setEmpCancelarXiiiSueldoMensualmente(Boolean empCancelarXiiiSueldoMensualmente) {
		this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
	}

	public Boolean getEmpCancelarXivSueldoMensualmente() {
		return empCancelarXivSueldoMensualmente;
	}

	public void setEmpCancelarXivSueldoMensualmente(Boolean empCancelarXivSueldoMensualmente) {
		this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
	}

}
