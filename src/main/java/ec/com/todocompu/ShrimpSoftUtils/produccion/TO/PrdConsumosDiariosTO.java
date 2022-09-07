package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdConsumosDiariosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "consumo_sector")
    private String consumoSector;
    @Column(name = "consumo_producto")
    private String consumoProducto;
    @Column(name = "consumo_codigo")
    private String consumoCodigo;
    @Column(name = "consumo_medida")
    private String consumoMedida;
    @Column(name = "consumo_piscina")
    private String consumoPiscina;
    @Column(name = "consumo_cantidad")
    private BigDecimal consumoCantidad;

    public PrdConsumosDiariosTO() {
    }

    public PrdConsumosDiariosTO(Integer id, String consumoSector, String consumoProducto, String consumoCodigo, String consumoMedida, BigDecimal consumoCantidad) {
        this.id = id;
        this.consumoSector = consumoSector;
        this.consumoProducto = consumoProducto;
        this.consumoCodigo = consumoCodigo;
        this.consumoMedida = consumoMedida;
        this.consumoCantidad = consumoCantidad;
    }

    public PrdConsumosDiariosTO(String consumoProducto, String consumoCodigo, String consumoMedida, BigDecimal consumoCantidad, Integer id) {
        this.consumoProducto = consumoProducto;
        this.consumoCodigo = consumoCodigo;
        this.consumoMedida = consumoMedida;
        this.consumoCantidad = consumoCantidad;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConsumoSector() {
        return consumoSector;
    }

    public void setConsumoSector(String consumoSector) {
        this.consumoSector = consumoSector;
    }

    public BigDecimal getConsumoCantidad() {
        return consumoCantidad;
    }

    public void setConsumoCantidad(BigDecimal consumoCantidad) {
        this.consumoCantidad = consumoCantidad;
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

    public String getConsumoProducto() {
        return consumoProducto;
    }

    public void setConsumoProducto(String consumoProducto) {
        this.consumoProducto = consumoProducto;
    }

    public String getConsumoPiscina() {
        return consumoPiscina;
    }

    public void setConsumoPiscina(String consumoPiscina) {
        this.consumoPiscina = consumoPiscina;
    }

}
