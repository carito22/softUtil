package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;
import java.util.Date;

public class SisPeriodoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String perEmpresa;
	private String perCodigo;
	private String perDetalle;
	private String perDesde;
	private String perHasta;
	private Date perDesdeDate;
	private Date perHastaDate;
	private Boolean perCerrado;
	private String empCodigo;
	private String usrInsertaPeriodo;
	private String usrFechaInsertaPeriodo;

	public SisPeriodoTO() {
	}

	public SisPeriodoTO(String perEmpresa, String perCodigo, String perDetalle, String perDesde, String perHasta,
			Boolean perCerrado, String empCodigo, String usrInsertaPeriodo, String usrFechaInsertaPeriodo) {
		this.perEmpresa = perEmpresa;
		this.perCodigo = perCodigo;
		this.perDetalle = perDetalle;
		this.perDesde = perDesde;
		this.perHasta = perHasta;
		this.perCerrado = perCerrado;
		this.empCodigo = empCodigo;
		this.usrInsertaPeriodo = usrInsertaPeriodo;
		this.usrFechaInsertaPeriodo = usrFechaInsertaPeriodo;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public Boolean getPerCerrado() {
		return perCerrado;
	}

	public void setPerCerrado(Boolean perCerrado) {
		this.perCerrado = perCerrado;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getPerDesde() {
		return perDesde;
	}

	public void setPerDesde(String perDesde) {
		this.perDesde = perDesde;
	}

	public Date getPerDesdeDate() {
		return perDesdeDate;
	}

	public void setPerDesdeDate(Date perDesdeDate) {
		this.perDesdeDate = perDesdeDate;
	}

	public Date getPerHastaDate() {
		return perHastaDate;
	}

	public void setPerHastaDate(Date perHastaDate) {
		this.perHastaDate = perHastaDate;
	}

	public String getPerDetalle() {
		return perDetalle;
	}

	public void setPerDetalle(String perDetalle) {
		this.perDetalle = perDetalle;
	}

	public String getPerEmpresa() {
		return perEmpresa;
	}

	public void setPerEmpresa(String perEmpresa) {
		this.perEmpresa = perEmpresa;
	}

	public String getPerHasta() {
		return perHasta;
	}

	public void setPerHasta(String perHasta) {
		this.perHasta = perHasta;
	}

	public String getUsrFechaInsertaPeriodo() {
		return usrFechaInsertaPeriodo;
	}

	public void setUsrFechaInsertaPeriodo(String usrFechaInsertaPeriodo) {
		this.usrFechaInsertaPeriodo = usrFechaInsertaPeriodo;
	}

	public String getUsrInsertaPeriodo() {
		return usrInsertaPeriodo;
	}

	public void setUsrInsertaPeriodo(String usrInsertaPeriodo) {
		this.usrInsertaPeriodo = usrInsertaPeriodo;
	}
}
