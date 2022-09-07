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
 * @author Andres Guachisaca
 */
@Entity
public class InvVentaMotivoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "vm_codigo")
    private String vmCodigo;

    @Column(name = "vm_empresa")
    private String vmEmpresa;

    @Column(name = "vm_detalle")
    private String vmDetalle;

    @Column(name = "vm_forma_contabilizar")
    private String vmFormaContabilizar;

    @Column(name = "vm_forma_imprimir")
    private String vmFormaImprimir;

    @Column(name = "vm_inactivo")
    private Boolean vmInactivo;

    @Column(name = "tip_codigo")
    private String tipCodigo;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "tc_codigo")
    private String tcCodigo;

    @Column(name = "vm_exigir_liquidacion")
    private Boolean vmExigirLiquidacion;
    
    @Column(name = "vm_exigir_bodega")
    private Boolean vmExigirBodega;
    
    public InvVentaMotivoTO() {
    }

    public InvVentaMotivoTO(String vmEmpresa, String vmCodigo, String vmDetalle, String vmFormaContabilizar,
            String vmFormaImprimir, Boolean vmInactivo, String tipCodigo, String usrCodigo, String usrFechaInserta) {
        this.vmEmpresa = vmEmpresa;
        this.vmCodigo = vmCodigo;
        this.vmDetalle = vmDetalle;
        this.vmFormaContabilizar = vmFormaContabilizar;
        this.vmFormaImprimir = vmFormaImprimir;
        this.vmInactivo = vmInactivo;
        this.tipCodigo = tipCodigo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getVmFormaImprimir() {
        return vmFormaImprimir;
    }

    public void setVmFormaImprimir(String vmFormaImprimir) {
        this.vmFormaImprimir = vmFormaImprimir;
    }

    public String getVmFormaContabilizar() {
        return vmFormaContabilizar;
    }

    public void setVmFormaContabilizar(String vmFormaContabilizar) {
        this.vmFormaContabilizar = vmFormaContabilizar;
    }

    public String getVmEmpresa() {
        return vmEmpresa;
    }

    public void setVmEmpresa(String vmEmpresa) {
        this.vmEmpresa = vmEmpresa;
    }

    public String getVmCodigo() {
        return vmCodigo;
    }

    public void setVmCodigo(String vmCodigo) {
        this.vmCodigo = vmCodigo;
    }

    public String getVmDetalle() {
        return vmDetalle;
    }

    public void setVmDetalle(String vmDetalle) {
        this.vmDetalle = vmDetalle;
    }

    public Boolean getVmInactivo() {
        return vmInactivo;
    }

    public void setVmInactivo(Boolean vmInactivo) {
        this.vmInactivo = vmInactivo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getTcCodigo() {
        return tcCodigo;
    }

    public void setTcCodigo(String tcCodigo) {
        this.tcCodigo = tcCodigo;
    }

    public Boolean getVmExigirLiquidacion() {
        return vmExigirLiquidacion;
    }

    public void setVmExigirLiquidacion(Boolean vmExigirLiquidacion) {
        this.vmExigirLiquidacion = vmExigirLiquidacion;
    }

    public Boolean getVmExigirBodega() {
        return vmExigirBodega;
    }

    public void setVmExigirBodega(Boolean vmExigirBodega) {
        this.vmExigirBodega = vmExigirBodega;
    }   
    
}
