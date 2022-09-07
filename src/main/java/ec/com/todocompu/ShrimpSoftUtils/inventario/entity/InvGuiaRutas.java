/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "inv_guia_rutas", schema = "inventario")
public class InvGuiaRutas implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "guia_secuencial")
    private Integer guiaSecuencial;

    @Column(name = "guia_empresa")
    private String guiaEmpresa;

    @Column(name = "guia_ruta")
    private String guiaRuta;

    @Column(name = "guia_valor")
    private BigDecimal guiaValor;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;


    public InvGuiaRutas() {
    }

    public InvGuiaRutas(Integer guiaSecuencial, String guiaEmpresa, String guiaRuta, BigDecimal guiaValor, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.guiaSecuencial = guiaSecuencial;
        this.guiaEmpresa = guiaEmpresa;
        this.guiaRuta = guiaRuta;
        this.guiaValor = guiaValor;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getGuiaSecuencial() {
        return guiaSecuencial;
    }

    public void setGuiaSecuencial(Integer guiaSecuencial) {
        this.guiaSecuencial = guiaSecuencial;
    }

    public String getGuiaEmpresa() {
        return guiaEmpresa;
    }

    public void setGuiaEmpresa(String guiaEmpresa) {
        this.guiaEmpresa = guiaEmpresa;
    }

    public String getGuiaRuta() {
        return guiaRuta;
    }

    public void setGuiaRuta(String guiaRuta) {
        this.guiaRuta = guiaRuta;
    }

    public BigDecimal getGuiaValor() {
        return guiaValor;
    }

    public void setGuiaValor(BigDecimal guiaValor) {
        this.guiaValor = guiaValor;
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

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }
    
}
