/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity

public class OrdenCompraProveedor implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "oc_sector")
    private String ocSector;

    @Column(name = "oc_motivo")
    private String ocMotivo;

    @Column(name = "oc_numero")
    private String ocNumero;

    @Column(name = "oc_fecha_emision")
    private Date ocFechaEmision;

    @Column(name = "oc_fecha_hora_entrega")
    private Timestamp ocFechaHoraEntrega;

    @Column(name = "op_empresa")
    private String opEmpresa;

    @Column(name = "op_sector")
    private String opSector;

    @Column(name = "op_motivo")
    private String opMotivo;

    @Column(name = "op_numero")
    private String opNumero;

    OrdenCompraProveedor() {

    }

    public OrdenCompraProveedor(Integer id, String ocSector, String ocMotivo, String ocNumero, Date ocFechaEmision, Timestamp ocFechaHoraEntrega) {
        this.id = id;
        this.ocSector = ocSector;
        this.ocMotivo = ocMotivo;
        this.ocNumero = ocNumero;
        this.ocFechaEmision = ocFechaEmision;
        this.ocFechaHoraEntrega = ocFechaHoraEntrega;
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

    public Date getOcFechaEmision() {
        return ocFechaEmision;
    }

    public void setOcFechaEmision(Date ocFechaEmision) {
        this.ocFechaEmision = ocFechaEmision;
    }

    public Timestamp getOcFechaHoraEntrega() {
        return ocFechaHoraEntrega;
    }

    public void setOcFechaHoraEntrega(Timestamp ocFechaHoraEntrega) {
        this.ocFechaHoraEntrega = ocFechaHoraEntrega;
    }

    public String getOpEmpresa() {
        return opEmpresa;
    }

    public void setOpEmpresa(String opEmpresa) {
        this.opEmpresa = opEmpresa;
    }

    public String getOpSector() {
        return opSector;
    }

    public void setOpSector(String opSector) {
        this.opSector = opSector;
    }

    public String getOpMotivo() {
        return opMotivo;
    }

    public void setOpMotivo(String opMotivo) {
        this.opMotivo = opMotivo;
    }

    public String getOpNumero() {
        return opNumero;
    }

    public void setOpNumero(String opNumero) {
        this.opNumero = opNumero;
    }

}
