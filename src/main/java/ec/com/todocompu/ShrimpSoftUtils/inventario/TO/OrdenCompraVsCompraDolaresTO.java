/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class OrdenCompraVsCompraDolaresTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ocvsc_oc_sector")
    private String ocSector;

    @Column(name = "ocvsc_oc_motivo")
    private String ocMotivo;

    @Column(name = "ocvsc_oc_numero")
    private String ocNumero;

    @Column(name = "ocvsc_oc_fecha_emision")
    private String ocFechaEmision;

    @Column(name = "ocvsc_oc_empresa")
    private String ocEmpresa;

    @Column(name = "ocvsc_oc_monto_total")
    private BigDecimal ocMontoTotal;

    @Column(name = "ocvsc_comp_total")
    private BigDecimal compTotal;

    public OrdenCompraVsCompraDolaresTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    public String getOcFechaEmision() {
        return ocFechaEmision;
    }

    public void setOcFechaEmision(String ocFechaEmision) {
        this.ocFechaEmision = ocFechaEmision;
    }

    public String getOcEmpresa() {
        return ocEmpresa;
    }

    public void setOcEmpresa(String ocEmpresa) {
        this.ocEmpresa = ocEmpresa;
    }

    public BigDecimal getOcMontoTotal() {
        return ocMontoTotal;
    }

    public void setOcMontoTotal(BigDecimal ocMontoTotal) {
        this.ocMontoTotal = ocMontoTotal;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

}
