/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos Duque
 */
@Entity
public class InvFunMovimientosSerieTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "mvto_movimiento")
    private String mvtoMovimiento;

    @Column(name = "mvto_empresa")
    private String mvtoEmpresa;

    @Column(name = "mvto_periodo")
    private String mvtoPeriodo;

    @Column(name = "mvto_numero")
    private String mvtoNumero;

    @Column(name = "mvto_motivo")
    private String mvtoMotivo;

    @Column(name = "mvto_serie")
    private String mvtoSerie;

    @Column(name = "mvto_producto")
    private String mvtoProducto;
    
    @Column(name = "mvto_tipo_comprobante")
    private String mvtoTipoComprobante;

    public InvFunMovimientosSerieTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMvtoMovimiento() {
        return mvtoMovimiento;
    }

    public void setMvtoMovimiento(String mvtoMovimiento) {
        this.mvtoMovimiento = mvtoMovimiento;
    }

    public String getMvtoEmpresa() {
        return mvtoEmpresa;
    }

    public void setMvtoEmpresa(String mvtoEmpresa) {
        this.mvtoEmpresa = mvtoEmpresa;
    }

    public String getMvtoPeriodo() {
        return mvtoPeriodo;
    }

    public void setMvtoPeriodo(String mvtoPeriodo) {
        this.mvtoPeriodo = mvtoPeriodo;
    }

    public String getMvtoNumero() {
        return mvtoNumero;
    }

    public void setMvtoNumero(String mvtoNumero) {
        this.mvtoNumero = mvtoNumero;
    }

    public String getMvtoMotivo() {
        return mvtoMotivo;
    }

    public void setMvtoMotivo(String mvtoMotivo) {
        this.mvtoMotivo = mvtoMotivo;
    }

    public String getMvtoSerie() {
        return mvtoSerie;
    }

    public void setMvtoSerie(String mvtoSerie) {
        this.mvtoSerie = mvtoSerie;
    }

    public String getMvtoProducto() {
        return mvtoProducto;
    }

    public void setMvtoProducto(String mvtoProducto) {
        this.mvtoProducto = mvtoProducto;
    }

    public String getMvtoTipoComprobante() {
        return mvtoTipoComprobante;
    }

    public void setMvtoTipoComprobante(String mvtoTipoComprobante) {
        this.mvtoTipoComprobante = mvtoTipoComprobante;
    }

}
