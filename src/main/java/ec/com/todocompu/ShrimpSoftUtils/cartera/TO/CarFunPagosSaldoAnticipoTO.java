/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */

@Entity
public class CarFunPagosSaldoAnticipoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "ant_periodo")
	private String antPeriodo;

	@Column(name = "ant_tipo")
	private String antTipo;

	@Column(name = "ant_numero")
	private String antNumero;

	@Column(name = "ant_sector")
	private String antSector;
        
	@Column(name = "ant_centro_costo")
	private String antCentroCosto;

	@Column(name = "ant_fecha")
	private String antFecha;

	@Column(name = "ant_valor")
	private BigDecimal antValor;

	@Column(name = "ant_proveedor_codigo")
	private String antProveedorCodigo;
        
	@Column(name = "ant_proveedor_identificacion")
	private String antProveedorIdentificacion;

	@Column(name = "ant_proveedor_razon_social")
	private String antProveedorRazonSocial;
        
        @Column(name = "ant_pendiente")
	private boolean antPendiente;
        
	@Column(name = "ant_anulado")
	private boolean antAnulado;
        
	@Column(name = "ant_reversado")
	private boolean antReversado;
        
        @Column(name = "ant_bloqueado")
	private boolean antBloqueado;

	public CarFunPagosSaldoAnticipoTO() {
	}

	public CarFunPagosSaldoAnticipoTO(Integer id, String antPeriodo, String antTipo, String antNumero, String antSector,
			String antFecha, BigDecimal antValor, String antProveedorCodigo, String antProveedorRazonSocial) {
		super();
		this.id = id;
		this.antPeriodo = antPeriodo;
		this.antTipo = antTipo;
		this.antNumero = antNumero;
		this.antSector = antSector;
		this.antFecha = antFecha;
		this.antValor = antValor;
		this.antProveedorCodigo = antProveedorCodigo;
		this.antProveedorRazonSocial = antProveedorRazonSocial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAntNumero() {
		return antNumero;
	}

	public void setAntNumero(String antNumero) {
		this.antNumero = antNumero;
	}

	public String getAntPeriodo() {
		return antPeriodo;
	}

	public void setAntPeriodo(String antPeriodo) {
		this.antPeriodo = antPeriodo;
	}

	public String getAntTipo() {
		return antTipo;
	}

	public void setAntTipo(String antTipo) {
		this.antTipo = antTipo;
	}

	public BigDecimal getAntValor() {
		return antValor;
	}

	public void setAntValor(BigDecimal antValor) {
		this.antValor = antValor;
	}

	public String getAntSector() {
		return antSector;
	}

	public void setAntSector(String antSector) {
		this.antSector = antSector;
	}

	public String getAntFecha() {
		return antFecha;
	}

	public void setAntFecha(String antFecha) {
		this.antFecha = antFecha;
	}

	public String getAntProveedorCodigo() {
		return antProveedorCodigo;
	}

	public void setAntProveedorCodigo(String antProveedorCodigo) {
		this.antProveedorCodigo = antProveedorCodigo;
	}

        public String getAntProveedorRazonSocial() {
            return antProveedorRazonSocial;
        }

        public void setAntProveedorRazonSocial(String antProveedorRazonSocial) {
            this.antProveedorRazonSocial = antProveedorRazonSocial;
        }

        public boolean isAntPendiente() {
            return antPendiente;
        }

        public void setAntPendiente(boolean antPendiente) {
            this.antPendiente = antPendiente;
        }

        public boolean isAntAnulado() {
            return antAnulado;
        }

        public void setAntAnulado(boolean antAnulado) {
            this.antAnulado = antAnulado;
        }

        public boolean isAntReversado() {
            return antReversado;
        }

        public void setAntReversado(boolean antReversado) {
            this.antReversado = antReversado;
        }

        public boolean isAntBloqueado() {
            return antBloqueado;
        }

        public void setAntBloqueado(boolean antBloqueado) {
            this.antBloqueado = antBloqueado;
        }

        public String getAntCentroCosto() {
            return antCentroCosto;
        }

        public void setAntCentroCosto(String antCentroCosto) {
            this.antCentroCosto = antCentroCosto;
        }

        public String getAntProveedorIdentificacion() {
            return antProveedorIdentificacion;
        }

        public void setAntProveedorIdentificacion(String antProveedorIdentificacion) {
            this.antProveedorIdentificacion = antProveedorIdentificacion;
        }

}
