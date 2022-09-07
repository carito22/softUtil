/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdLiquidacionProductoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "prod_empresa")
    private String prodEmpresa;

    @Column(name = "prod_codigo")
    private String prodCodigo;

    @Column(name = "prod_detalle")
    private String prodDetalle;

    @Column(name = "prod_tipo")
    private String prodTipo;

    @Column(name = "prod_clase")
    private char prodClase;

    @Column(name = "prod_inactivo")
    private Boolean prodInactivo;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "prod_descuento")
    private BigDecimal prodDescuento;

    public PrdLiquidacionProductoTO() {
    }

    public PrdLiquidacionProductoTO(String prdEmpresa, String prdCodigo, String prdDetalle, String prdTipo,
            char prodClase, Boolean prdInactivo, String usrCodigo, String usrFechaInserta) {
        this.prodEmpresa = prdEmpresa;
        this.prodCodigo = prdCodigo;
        this.prodDetalle = prdDetalle;
        this.prodTipo = prdTipo;
        this.prodClase = prodClase;
        this.prodInactivo = prdInactivo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(String prdCodigo) {
        this.prodCodigo = prdCodigo;
    }

    public String getProdDetalle() {
        return prodDetalle;
    }

    public void setProdDetalle(String prdDetalle) {
        this.prodDetalle = prdDetalle;
    }

    public String getProdEmpresa() {
        return prodEmpresa;
    }

    public void setProdEmpresa(String prdEmpresa) {
        this.prodEmpresa = prdEmpresa;
    }

    public Boolean getProdInactivo() {
        return prodInactivo;
    }

    public void setProdInactivo(Boolean prdInactivo) {
        this.prodInactivo = prdInactivo;
    }

    public String getProdTipo() {
        return prodTipo;
    }

    public void setProdTipo(String prdTipo) {
        this.prodTipo = prdTipo;
    }

    public char getProdClase() {
        return prodClase;
    }

    public void setProdClase(char prodClase) {
        this.prodClase = prodClase;
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

    public BigDecimal getProdDescuento() {
        return prodDescuento;
    }

    public void setProdDescuento(BigDecimal prodDescuento) {
        this.prodDescuento = prodDescuento;
    }

}
