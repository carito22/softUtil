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
 * @author developer2
 */
@Entity
public class InvProductoMarcaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "mar_empresa")
    String marEmpresa;

    @Column(name = "mar_codigo")
    String marCodigo;

    @Column(name = "mar_detalle")
    String marDetalle;

    @Column(name = "mar_abreviado")
    String marAbreviado;

    @Column(name = "usr_empresa")
    String usrEmpresa;

    @Column(name = "usr_codigo")
    String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    String usrFechaInserta;

    @Column(name = "mar_incluir_en_facturacion")
    private boolean marIncluirEnFacturacion;

    @Column(name = "mar_replicar")
    private boolean marReplicar;

    public InvProductoMarcaTO() {
    }

    public InvProductoMarcaTO(String marEmpresa, String marCodigo, String marDetalle, String marAbreviado,
            String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.marEmpresa = marEmpresa;
        this.marCodigo = marCodigo;
        this.marDetalle = marDetalle;
        this.marAbreviado = marAbreviado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getMarAbreviado() {
        return marAbreviado;
    }

    public void setMarAbreviado(String marAbreviado) {
        this.marAbreviado = marAbreviado;
    }

    public String getMarCodigo() {
        return marCodigo;
    }

    public void setMarCodigo(String marCodigo) {
        this.marCodigo = marCodigo;
    }

    public String getMarDetalle() {
        return marDetalle;
    }

    public void setMarDetalle(String marDetalle) {
        this.marDetalle = marDetalle;
    }

    public String getMarEmpresa() {
        return marEmpresa;
    }

    public void setMarEmpresa(String marEmpresa) {
        this.marEmpresa = marEmpresa;
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

    public boolean isMarIncluirEnFacturacion() {
        return marIncluirEnFacturacion;
    }

    public void setMarIncluirEnFacturacion(boolean marIncluirEnFacturacion) {
        this.marIncluirEnFacturacion = marIncluirEnFacturacion;
    }

    public boolean isMarReplicar() {
        return marReplicar;
    }

    public void setMarReplicar(boolean marReplicar) {
        this.marReplicar = marReplicar;
    }

}
