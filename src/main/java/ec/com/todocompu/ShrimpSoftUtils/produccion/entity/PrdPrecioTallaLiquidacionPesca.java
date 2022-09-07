/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "prd_precio_talla_liquidacion_pesca", schema = "produccion")
public class PrdPrecioTallaLiquidacionPesca implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdPrecioTallaLiquidacionPescaPK prdPrecioTallaLiquidacionPescaPK;
    @Column(name = "prd_precio01")
    private BigDecimal prdPrecio01;
    @Column(name = "prd_precio02")
    private BigDecimal prdPrecio02;
    @Column(name = "prd_precio03")
    private BigDecimal prdPrecio03;
    @Column(name = "prd_precio04")
    private BigDecimal prdPrecio04;
    @Column(name = "prd_precio05")
    private BigDecimal prdPrecio05;
    @Column(name = "prd_precio06")
    private BigDecimal prdPrecio06;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;

    public PrdPrecioTallaLiquidacionPesca() {
    }

    public PrdPrecioTallaLiquidacionPesca(PrdPrecioTallaLiquidacionPescaPK prdPrecioTallaLiquidacionPescaPK, BigDecimal prdPrecio01, BigDecimal prdPrecio02, BigDecimal prdPrecio03, BigDecimal prdPrecio04, BigDecimal prdPrecio05, BigDecimal prdPrecio06, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
        this.prdPrecioTallaLiquidacionPescaPK = prdPrecioTallaLiquidacionPescaPK;
        this.prdPrecio01 = prdPrecio01;
        this.prdPrecio02 = prdPrecio02;
        this.prdPrecio03 = prdPrecio03;
        this.prdPrecio04 = prdPrecio04;
        this.prdPrecio05 = prdPrecio05;
        this.prdPrecio06 = prdPrecio06;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdPrecioTallaLiquidacionPescaPK getPrdPrecioTallaLiquidacionPescaPK() {
        return prdPrecioTallaLiquidacionPescaPK;
    }

    public void setPrdPrecioTallaLiquidacionPescaPK(PrdPrecioTallaLiquidacionPescaPK prdPrecioTallaLiquidacionPescaPK) {
        this.prdPrecioTallaLiquidacionPescaPK = prdPrecioTallaLiquidacionPescaPK;
    }

    public BigDecimal getPrdPrecio01() {
        return prdPrecio01;
    }

    public void setPrdPrecio01(BigDecimal prdPrecio01) {
        this.prdPrecio01 = prdPrecio01;
    }

    public BigDecimal getPrdPrecio02() {
        return prdPrecio02;
    }

    public void setPrdPrecio02(BigDecimal prdPrecio02) {
        this.prdPrecio02 = prdPrecio02;
    }

    public BigDecimal getPrdPrecio03() {
        return prdPrecio03;
    }

    public void setPrdPrecio03(BigDecimal prdPrecio03) {
        this.prdPrecio03 = prdPrecio03;
    }

    public BigDecimal getPrdPrecio04() {
        return prdPrecio04;
    }

    public void setPrdPrecio04(BigDecimal prdPrecio04) {
        this.prdPrecio04 = prdPrecio04;
    }

    public BigDecimal getPrdPrecio05() {
        return prdPrecio05;
    }

    public void setPrdPrecio05(BigDecimal prdPrecio05) {
        this.prdPrecio05 = prdPrecio05;
    }

    public BigDecimal getPrdPrecio06() {
        return prdPrecio06;
    }

    public void setPrdPrecio06(BigDecimal prdPrecio06) {
        this.prdPrecio06 = prdPrecio06;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

}
