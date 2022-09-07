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
 * @author CarolValdiviezo
 */
@Entity
public class InvPedidosReporteComprasImbTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "rep_empresa")
    private String repEmpresa;
    @Column(name = "rep_periodo")
    private String repPeriodo;
    @Column(name = "rep_motivo")
    private String repMotivo;
    @Column(name = "rep_numero")
    private String repNumero;
    @Column(name = "rep_fecha")
    private String repFecha;
    @Column(name = "rep_pro_nombre")
    private String repProNombre;
    @Column(name = "rep_pro_codigo_principal")
    private String repProCodigoPrincipal;
    @Column(name = "rep_proveedor")
    private String repProveedor;
    @Column(name = "rep_contable")
    private String repContable;
    @Column(name = "rep_total")
    private BigDecimal repTotal;

    public InvPedidosReporteComprasImbTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRepEmpresa() {
        return repEmpresa;
    }

    public void setRepEmpresa(String repEmpresa) {
        this.repEmpresa = repEmpresa;
    }

    public String getRepPeriodo() {
        return repPeriodo;
    }

    public void setRepPeriodo(String repPeriodo) {
        this.repPeriodo = repPeriodo;
    }

    public String getRepMotivo() {
        return repMotivo;
    }

    public void setRepMotivo(String repMotivo) {
        this.repMotivo = repMotivo;
    }

    public String getRepNumero() {
        return repNumero;
    }

    public void setRepNumero(String repNumero) {
        this.repNumero = repNumero;
    }

    public String getRepFecha() {
        return repFecha;
    }

    public void setRepFecha(String repFecha) {
        this.repFecha = repFecha;
    }

    public String getRepProNombre() {
        return repProNombre;
    }

    public void setRepProNombre(String repProNombre) {
        this.repProNombre = repProNombre;
    }

    public String getRepProCodigoPrincipal() {
        return repProCodigoPrincipal;
    }

    public void setRepProCodigoPrincipal(String repProCodigoPrincipal) {
        this.repProCodigoPrincipal = repProCodigoPrincipal;
    }

    public String getRepProveedor() {
        return repProveedor;
    }

    public void setRepProveedor(String repProveedor) {
        this.repProveedor = repProveedor;
    }

    public BigDecimal getRepTotal() {
        return repTotal;
    }

    public void setRepTotal(BigDecimal repTotal) {
        this.repTotal = repTotal;
    }

    public String getRepContable() {
        return repContable;
    }

    public void setRepContable(String repContable) {
        this.repContable = repContable;
    }

}
