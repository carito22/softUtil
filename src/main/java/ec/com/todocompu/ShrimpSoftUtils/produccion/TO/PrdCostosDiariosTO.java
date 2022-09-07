package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdCostosDiariosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "costo_sector")
    private String costoSector;
    @Column(name = "costo_producto")
    private String costoProducto;
    @Column(name = "costo_codigo")
    private String costoCodigo;
    @Column(name = "costo_medida")
    private String costoMedida;
    @Column(name = "costo_piscina")
    private String costoPiscina;
    @Column(name = "costo_cantidad")
    private BigDecimal costoCantidad;

    public PrdCostosDiariosTO() {
    }

    public PrdCostosDiariosTO(Integer id, String costoSector, String costoProducto, String costoCodigo, String costoMedida, BigDecimal costoCantidad) {
        this.id = id;
        this.costoSector = costoSector;
        this.costoProducto = costoProducto;
        this.costoCodigo = costoCodigo;
        this.costoMedida = costoMedida;
        this.costoCantidad = costoCantidad;
    }

    public PrdCostosDiariosTO(String costoProducto, String costoCodigo, String costoMedida, BigDecimal costoCantidad, Integer id) {
        this.costoProducto = costoProducto;
        this.costoCodigo = costoCodigo;
        this.costoMedida = costoMedida;
        this.costoCantidad = costoCantidad;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCostoSector() {
        return costoSector;
    }

    public void setCostoSector(String costoSector) {
        this.costoSector = costoSector;
    }

    public BigDecimal getCostoCantidad() {
        return costoCantidad;
    }

    public void setCostoCantidad(BigDecimal costoCantidad) {
        this.costoCantidad = costoCantidad;
    }

    public String getCostoCodigo() {
        return costoCodigo;
    }

    public void setCostoCodigo(String costoCodigo) {
        this.costoCodigo = costoCodigo;
    }

    public String getCostoMedida() {
        return costoMedida;
    }

    public void setCostoMedida(String costoMedida) {
        this.costoMedida = costoMedida;
    }

    public String getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(String costoProducto) {
        this.costoProducto = costoProducto;
    }

    public String getCostoPiscina() {
        return costoPiscina;
    }

    public void setCostoPiscina(String costoPiscina) {
        this.costoPiscina = costoPiscina;
    }

}
