package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prd_corrida_detalle", schema = "produccion")
public class PrdCorridaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long detSecuencia;
	private PrdCorrida prdCorridaDestino;
	private PrdCorrida prdCorridaOrigen;
	private BigDecimal detPorcentaje;

	public PrdCorridaDetalle() {
	}

	public PrdCorridaDetalle(Long detSecuencia, PrdCorrida prdCorridaDestino, PrdCorrida prdCorridaOrigen,
			BigDecimal detPorcentaje) {
		this.detSecuencia = detSecuencia;
		this.prdCorridaDestino = prdCorridaDestino;
		this.prdCorridaOrigen = prdCorridaOrigen;
		this.detPorcentaje = detPorcentaje;
	}

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "det_secuencial")
	public Long getDetSecuencia() {
		return detSecuencia;
	}

	public void setDetSecuencia(Long detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

	@JoinColumns({ @JoinColumn(name = "det_corrida_destino_empresa", referencedColumnName = "cor_empresa"),
			@JoinColumn(name = "det_corrida_destino_sector", referencedColumnName = "cor_sector"),
			@JoinColumn(name = "det_corrida_destino_piscina", referencedColumnName = "cor_piscina"),
			@JoinColumn(name = "det_corrida_destino_numero", referencedColumnName = "cor_numero") })
	@ManyToOne(optional = true)
	public PrdCorrida getPrdCorridaDestino() {
		return prdCorridaDestino;
	}

	public void setPrdCorridaDestino(PrdCorrida prdCorridaDestino) {
		this.prdCorridaDestino = prdCorridaDestino;
	}

	@JoinColumns({ @JoinColumn(name = "det_corrida_origen_empresa", referencedColumnName = "cor_empresa"),
			@JoinColumn(name = "det_corrida_origen_sector", referencedColumnName = "cor_sector"),
			@JoinColumn(name = "det_corrida_origen_piscina", referencedColumnName = "cor_piscina"),
			@JoinColumn(name = "det_corrida_origen_numero", referencedColumnName = "cor_numero") })
	@ManyToOne(optional = true)
	public PrdCorrida getPrdCorridaOrigen() {
		return prdCorridaOrigen;
	}

	public void setPrdCorridaOrigen(PrdCorrida prdCorridaOrigen) {
		this.prdCorridaOrigen = prdCorridaOrigen;
	}

	@Column(name = "det_porcentaje")
	public BigDecimal getDetPorcentaje() {
		return detPorcentaje;
	}

	public void setDetPorcentaje(BigDecimal detPorcentaje) {
		this.detPorcentaje = detPorcentaje;
	}

}
