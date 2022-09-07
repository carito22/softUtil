/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Trabajo
 */
@Entity
public class PrdConsumosDetalladoProductosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "consumo_motivo")
    private String consumoMotivo;
    @Column(name = "consumo_sector")
    private String consumoSector;
    @Column(name = "consumo_piscina")
    private String consumoPiscina;
    @Column(name = "consumo_producto")
    private String consumoProducto;
    @Column(name = "consumo_codigo")
    private String consumoCodigo;
    @Column(name = "consumo_medida")
    private String consumoMedida;
    @Column(name = "consumo_cantidad")
    private BigDecimal consumoCantidad;
    @Column(name = "consumo_ec_codigo")
    private String consumoEcCodigo;
    @Column(name = "consumo_costo_total")
    private BigDecimal consumoCostoTotal;//cantidad x valor promedio de consumo detalle

    public PrdConsumosDetalladoProductosTO() {
    }

    public PrdConsumosDetalladoProductosTO(Integer id, String consumoMotivo, String consumoSector, String consumoPiscina, String consumoProducto, String consumoCodigo, String consumoMedida, BigDecimal consumoCantidad) {
        this.id = id;
        this.consumoMotivo = consumoMotivo;
        this.consumoSector = consumoSector;
        this.consumoPiscina = consumoPiscina;
        this.consumoProducto = consumoProducto;
        this.consumoCodigo = consumoCodigo;
        this.consumoMedida = consumoMedida;
        this.consumoCantidad = consumoCantidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsumoMotivo() {
        return consumoMotivo;
    }

    public void setConsumoMotivo(String consumoMotivo) {
        this.consumoMotivo = consumoMotivo;
    }

    public String getConsumoSector() {
        return consumoSector;
    }

    public void setConsumoSector(String consumoSector) {
        this.consumoSector = consumoSector;
    }

    public String getConsumoPiscina() {
        return consumoPiscina;
    }

    public void setConsumoPiscina(String consumoPiscina) {
        this.consumoPiscina = consumoPiscina;
    }

    public String getConsumoProducto() {
        return consumoProducto;
    }

    public void setConsumoProducto(String consumoProducto) {
        this.consumoProducto = consumoProducto;
    }

    public String getConsumoCodigo() {
        return consumoCodigo;
    }

    public void setConsumoCodigo(String consumoCodigo) {
        this.consumoCodigo = consumoCodigo;
    }

    public String getConsumoMedida() {
        return consumoMedida;
    }

    public void setConsumoMedida(String consumoMedida) {
        this.consumoMedida = consumoMedida;
    }

    public BigDecimal getConsumoCantidad() {
        return consumoCantidad;
    }

    public void setConsumoCantidad(BigDecimal consumoCantidad) {
        this.consumoCantidad = consumoCantidad;
    }

    public String getConsumoEcCodigo() {
        return consumoEcCodigo;
    }

    public void setConsumoEcCodigo(String consumoEcCodigo) {
        this.consumoEcCodigo = consumoEcCodigo;
    }

    public BigDecimal getConsumoCostoTotal() {
        return consumoCostoTotal;
    }

    public void setConsumoCostoTotal(BigDecimal consumoCostoTotal) {
        this.consumoCostoTotal = consumoCostoTotal;
    }

}
