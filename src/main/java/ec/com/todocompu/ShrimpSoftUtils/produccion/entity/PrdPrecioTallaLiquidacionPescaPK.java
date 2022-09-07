/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author VALDIVIEZO
 */
@Embeddable
public class PrdPrecioTallaLiquidacionPescaPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "talla_empresa")
    private String tallaEmpresa;
    @Column(name = "talla_codigo")
    private String tallaCodigo;
    @Column(name = "prd_fecha")
    private Date prdFecha;

    public PrdPrecioTallaLiquidacionPescaPK() {
    }

    public PrdPrecioTallaLiquidacionPescaPK(String tallaEmpresa, String tallaCodigo, Date prdFecha) {
        this.tallaEmpresa = tallaEmpresa;
        this.tallaCodigo = tallaCodigo;
        this.prdFecha = prdFecha;
    }

    public String getTallaEmpresa() {
        return tallaEmpresa;
    }

    public void setTallaEmpresa(String tallaEmpresa) {
        this.tallaEmpresa = tallaEmpresa;
    }

    public String getTallaCodigo() {
        return tallaCodigo;
    }

    public void setTallaCodigo(String tallaCodigo) {
        this.tallaCodigo = tallaCodigo;
    }

    public Date getPrdFecha() {
        return prdFecha;
    }

    public void setPrdFecha(Date prdFecha) {
        this.prdFecha = prdFecha;
    }

}
