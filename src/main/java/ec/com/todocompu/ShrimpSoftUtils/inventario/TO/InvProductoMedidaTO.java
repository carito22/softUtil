/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvProductoMedidaTO implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    @Column(name = "med_empresa")
    private String medEmpresa;

    @Column(name = "med_codigo")
    @Id
    private String medCodigo;

    @Column(name = "med_detalle")
    private String medDetalle;

    @Column(name = "med_conversion_libras")
    private BigDecimal medConvLibras;

    @Column(name = "med_conversion_kilos")
    private BigDecimal medConvKilos;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "med_replicar")
    private boolean medReplicar;

    public InvProductoMedidaTO() {
    }

    public InvProductoMedidaTO(String medEmpresa, String medCodigo, String medDetalle, BigDecimal medConvLibras,
            BigDecimal medConvKilos, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.medEmpresa = medEmpresa;
        this.medCodigo = medCodigo;
        this.medDetalle = medDetalle;
        this.medConvLibras = medConvLibras;
        this.medConvKilos = medConvKilos;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public BigDecimal getMedConvKilos() {
        return medConvKilos;
    }

    public void setMedConvKilos(BigDecimal medConvKilos) {
        this.medConvKilos = medConvKilos;
    }

    public BigDecimal getMedConvLibras() {
        return medConvLibras;
    }

    public void setMedConvLibras(BigDecimal medConvLibras) {
        this.medConvLibras = medConvLibras;
    }

    public String getMedCodigo() {
        return medCodigo;
    }

    public void setMedCodigo(String medCodigo) {
        this.medCodigo = medCodigo;
    }

    public String getMedDetalle() {
        return medDetalle;
    }

    public void setMedDetalle(String medDetalle) {
        this.medDetalle = medDetalle;
    }

    public String getMedEmpresa() {
        return medEmpresa;
    }

    public void setMedEmpresa(String medEmpresa) {
        this.medEmpresa = medEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public boolean isMedReplicar() {
        return medReplicar;
    }

    public void setMedReplicar(boolean medReplicar) {
        this.medReplicar = medReplicar;
    }

}
